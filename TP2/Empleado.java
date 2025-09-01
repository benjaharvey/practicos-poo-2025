
/**
 * Esta es una clase llamada Empleado que nos permite calcular la liquidación salarial de los empleados en una empresa, especificamente los descuentos y bonos salariales para asi obtener el salario neto  
 * 
 * @author          Hardoy-Harvey
 * @version         25/08/25
 */

/**
 * Se importa la librea java.util.* para poder hacer uso de la funcion Calendar, que nos sera util para calcular la antigüedad
 */
import java.util.*;

public class Empleado
{
    private long cuil;
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private int anioIngreso;
    
    /** Constructor de la clase Empleado
     * @param   p_cuil      CUIL del empleado
     * @param   p_nombre    Nombre del empleado
     * @param   p_apellido  Apellido del empleado
     * @param   p_importe   Salario basico que percibe el empleado
     * @param   p_anio      Año de ingreso del empleado a la empresa
     */
    
    public Empleado(long p_cuil, String p_nombre, String p_apellido, double p_importe, int p_anio){
        setCuil(p_cuil);
        setNombre(p_nombre);
        setApellido(p_apellido);
        setImporte(p_importe);
        setAnio(p_anio);
    }
    
    public long getCuil(){
        return cuil;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public double getSueldoBasico(){
        return sueldoBasico;
    }
    
    public int getAnioIngreso(){
        return anioIngreso;
    }
    
    private void setCuil(long p_cuil){
        cuil = p_cuil;
    }
    
    private void setNombre(String p_nombre){
        nombre = p_nombre;
    }
    
    private void setApellido(String p_apellido){
        apellido = p_apellido;
    }
    
    private void setImporte(double p_importe){
        sueldoBasico = p_importe;
    }
    
    private void setAnio(int p_anio){
        anioIngreso = p_anio;
    }
    
    /**
     * Calcula la antigüedad del empleado haciendo la diferencia entre el año actual, que se obtiene usando la función Calendar, con el año ingresado por el usuario
     * @return  int
     */
    
    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        
        return anioHoy - getAnioIngreso();
    }
    
    /**
     * Calcula el descuento que se realiza al salario basico percibido por el empleado, descontando el 2% del sueldo en concepto de obra social y sumando 1500 
     * en concepto de seguro de vida
     * 
     * @return  double
     */
    
    private double descuento(){
        return (getSueldoBasico() * 0.02) + 1500;
    }
    
    /**
     *  Calcula el incremento salarial que le corresponde a los empleados por su tiempo en la empresa, es de 2% si la antigüedad es menor de 2 años, de 4% si es 
     *  de entre 2 a 10 años y si es de 10 años o mas es del 6%
     *  
     * @return  double
     */
    
    private double adicional(){
        double plusAntiguedad = 0;
        
        if(antiguedad() < 2){
            plusAntiguedad = (getSueldoBasico() * 0.02);
        }
        
        if(antiguedad() >= 2 && antiguedad() < 10){
            plusAntiguedad = (getSueldoBasico() * 0.04);
        }
        
        if(antiguedad() >= 10) {
            plusAntiguedad = (getSueldoBasico() * 0.06);
        }
        
        return plusAntiguedad;
    }
    
    /**
     * Calcula el sueldo neto, haciendo una operacion sencilla tomando el sueldo basico, sumandole el incremento por antigüedad y restando el descuento por obra social
     * y seguro de vida
     * 
     * @return double
     */
    
    public double sueldoNeto(){
        return getSueldoBasico() + adicional() - descuento();
    }
    
    /**
     * Concatena el apellido y el nombre para returnar las dos cadenas juntas
     * 
     * @return  String
     */
    
    public String apeYnom(){
        return getApellido() + " " + getNombre();
    }
    
    /**
     * Concatena el nombre y el apellido para returnar las dos cadenas juntas
     * 
     * @return  String
     */
    
    public String nomYape(){
        return getNombre() + " " + getApellido();
    }
    
    /**
     * Concatena el CUIL, el apellido y el nombre y el sueldo neto, ademas de darle formato
     * 
     * @return String
     */
    
    public String mostrarLinea(){
        return getCuil() + " " + apeYnom() + " ..............." + sueldoNeto();
    }
    
    /**
     * Se muestra en formato los datos calculados por el programa
     */
    
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + nomYape());
        System.out.print("CUIL: " + getCuil() + " ");
        System.out.println("Antiguedad: " + antiguedad() + " Anios de servicio "); 
        System.out.println("Sueldo Neto: $" + sueldoNeto());
        
        System.out.println(mostrarLinea());
    }
}