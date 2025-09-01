import java.util.*;
/**
 * Una clase que tiene metodos como calcular sueldo neto, mostrar sus datos, autorizar salida, etc.
 * 
 * @author  Hardoy - Harvey
 * @version 08/09/25
 */
public class EmpleadoConJefe
{
    // instance variables
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    private EmpleadoConJefe jefe;

    /**
     * Constructor con jefe y anio de ingreso
     * 
     * @param   p_cuil      cuil del empleado
     * @param   p_apellido  apellido del empleado
     * @param   p_nombre    nombre del empleado
     * @param   p_importe   sueldo basico del empleado
     * @param   p_fecha     fecha de ingreso del empleado
     * @param   p_jefe      jefe del empleado
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre,
                           double p_importe, int p_anio, EmpleadoConJefe p_jefe) {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
        this.setJefe(p_jefe);
    }
    
    /**
     * Constructor con jefe y con anio de ingreso
     * 
     * @param   p_cuil      cuil del empleado
     * @param   p_apellido  apellido del empleado
     * @param   p_nombre    nombre del empleado
     * @param   p_importe   sueldo basico del empleado
     * @param   p_fecha     fecha de ingreso del empleado
     * @param   p_jefe      jefe del empleado
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre,
                           double p_importe, Calendar p_fecha, EmpleadoConJefe p_jefe) {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
        this.setJefe(p_jefe);
    }

    /**
     * Constructor sin jefe y con anio de ingreso
     * 
     * @param   p_cuil      cuil del empleado
     * @param   p_apellido  apellido del empleado
     * @param   p_nombre    nombre del empleado
     * @param   p_importe   sueldo basico del empleado
     * @param   p_fecha     fecha de ingreso del empleado
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre,
                           double p_importe, int p_anio) {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setAnioIngreso(p_anio);
        this.setJefe(null);
    }    
    
    /**
     * Constructor sin jefe y con fecha de ingreso
     * 
     * @param   p_cuil      cuil del empleado
     * @param   p_apellido  apellido del empleado
     * @param   p_nombre    nombre del empleado
     * @param   p_importe   sueldo basico del empleado
     * @param   p_fecha     fecha de ingreso del empleado
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre,
                           double p_importe, Calendar p_fecha) {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setFechaIngreso(p_fecha);
        this.setJefe(null);
    }

    // Setters
    private void setCuil(long p_cuil) {
        this.cuil = p_cuil;
    }
    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    private void setSueldoBasico(double p_importe) {
        this.sueldoBasico = p_importe;
    }
    private void setAnioIngreso(int p_anio){
        Calendar fechaHoy = new GregorianCalendar(p_anio, 1, 1);
        this.setFechaIngreso(fechaHoy);
    }
    private void setFechaIngreso(Calendar p_fecha) {
        this.fechaIngreso = new GregorianCalendar(p_fecha.DAY_OF_MONTH, p_fecha.MONTH, p_fecha.YEAR);
    } 
    private void setJefe(EmpleadoConJefe p_jefe) {
        this.jefe = p_jefe;
    }

    // Getters
    public long getCuil() {
        return this.cuil;
    }
    public String getApellido() {
        return this.apellido;
    }
    public String getNombre() {
        return this.nombre;
    }
    public double getSueldoBasico() {
        return this.sueldoBasico;
    }
    public int getAnioIngreso(){
        return this.fechaIngreso.YEAR;
    }
    public Calendar getFechaIngreso() {
        return this.fechaIngreso;
    }
    public EmpleadoConJefe getJefe() {
        return this.jefe;
    }
    
    /**
     * Metodo que calcula la antiguedad del empleado
     * 
     * @return  devuelve un valor entero que equivale a la antiguedad en anios
     */
     public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return this.getFechaIngreso().YEAR - anioHoy;
    }
    
    /**
     * Calcula el descuento que se realiza al salario basico percibido por el empleado, descontando el 2% del sueldo en concepto de obra social 
     * y sumando 1500 en concepto de seguro de vida
     * 
     * @return  devuelve el decremento salarial
     */
    
    private double descuento(){
        return (this.getSueldoBasico() * 0.02) + 1500;
    }
    
    /**
     * Calcula el incremento salarial que le corresponde a los empleados por su tiempo en la empresa, 
     * es de 2% si la antigüedad es menor de 2 años, de 4% si es de entre 2 a 10 años y si es de 10 años o mas es del 6%
     *  
     * @return  devuelve el incremento salarial
     */
    
    private double adicional(){
        double plusAntiguedad = 0;
        
        if(this.antiguedad() < 2){
            plusAntiguedad = (getSueldoBasico() * 0.02);
        }
        
        if(this.antiguedad() >= 2 && this.antiguedad() < 10){
            plusAntiguedad = (getSueldoBasico() * 0.04);
        }
        
        if(this.antiguedad() >= 10) {
            plusAntiguedad = (getSueldoBasico() * 0.06);
        }
        
        return plusAntiguedad;
    }
    
    /**
     * Calcula el sueldo neto, haciendo una operacion sencilla tomando el sueldo basico, sumandole el incremento por antigüedad
     * y restando el descuento por obra social y seguro de vida
     * 
     * @return double
     */
    
    public double sueldoNeto(){
        return getSueldoBasico() + this.adicional() - this.descuento();
    }
    
    /**
     * Metodo para juntar el nombre y apellido del empleado
     * 
     * @return  devuelve una cadena formada por nombre y apellido
     */
    public String nomYape(){
        return this.getNombre() + this.getApellido();
    }

    /**
     * Metodo para juntar el nombre y apellido del empleado
     * 
     * @return  devuelve una cadena formada por apellido y nombre
     */
    public String apeYnom(){
        return this.getApellido() + this.getNombre();
    }
    
    /**
     * Metodo para mostrar por pantalla los datos del empleado
     */
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + this.nomYape());
        System.out.println("CUIL: " + this.getCuil());
        System.out.println("Sueldo Neto: $" + this.getSueldoBasico());
        System.out.println("Responde a: ");
    }
    
    /**
     * Metodo para determinar si puede salir una hora antes
     * 
     * @return  devuelve true si es el aniversario o false si no es
     */
    public boolean esAniversario(){
        Calendar fechaHoy = new GregorianCalendar();
        return this.getFechaIngreso() == fechaHoy;
    }
    
    /**
     * Concatena el CUIL, el apellido y el nombre y el sueldo neto, ademas de darle formato
     * 
     * @return  devuelve una cadena con la informacion del empleado
     */
    
    public String mostrarLinea(){
        return this.getCuil() + " " + this.apeYnom() + " ..............." + this.sueldoNeto();
    }
    
    /**
     * Metodo para mostrar...
     * 
     * @return  devuelve una cadena que representa la autorizacion del jefe para la salida
     */
    public String autorizarSalida(){
        if(this.esAniversario() == true){
            return "Salida autorizada";
        }
        else{
            return "Salida NO autorizada... vuelva a trabajar";
        }
    }
}

