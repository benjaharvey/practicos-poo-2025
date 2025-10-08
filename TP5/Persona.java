import java.util.*;
/** Una clase Persona que nos permite ingresar y obtener la informacion personal de esta, modificada para cumplir con lo requerido en el TP3
 *
 * @author      Hardoy - Harvey 
 * @version     8/9/2025
 */
public class Persona
{
    // instance variables
    private int nroDni;
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento;

    /** primer constructor de la clase Persona
     * @param   p_dni       DNI de la persona
     * @param   p_nombre    nombre de la persona
     * @param   p_apellido  apellido de la persona
     * @param   p_anio      anio de nacimiento de la persona
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio)
    {
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }
    
     /** primer constructor de la clase Persona
     * @param   p_dni       DNI de la persona
     * @param   p_nombre    nombre de la persona
     * @param   p_apellido  apellido de la persona
     * @param   p_fecha     fecha de nacimiento de la persona
     */
    
    public Persona(int p_dni, String p_nombre, String p_apellido, Calendar p_fecha){
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(p_fecha);
    }
    
    //Setters
    private void setDNI(int p_dni){
        this.nroDni = p_dni;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    private void setAnioNacimiento(int p_anio){
        Calendar fechaHoy = new GregorianCalendar(p_anio, 0, 1);
        this.setFechaNacimiento(fechaHoy);
    }
    
    private void setFechaNacimiento(Calendar p_fecha){
        this.fechaNacimiento = p_fecha;
    }
    
    //Getters
    public int getDNI(){
        return this.nroDni;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public int getAnioNacimiento(){
        return this.getFechaNacimiento().get(Calendar.YEAR);
    }
    
    public Calendar getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
    /** Metodo para calcular la edad de la persona, funciona calculando la diferencia entre el año actual y el año ingresado en fecha de nacimiento
     * @return  int
     */
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - this.getAnioNacimiento();
    }

    /** Metodo para concatenar nombre y apellido
     * @return String
     */
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido(); 
    }
    
    /** Metodo para concatenar apellido y nombre
     * @return String
     */
    public String apeYNom(){
         return this.getApellido() + " " + this.getNombre();   
    }    
    
    /**
     * Metodo para determinar si el dia y mes actuales coinciden con los ingresados por el operador, en caso de coincidir retorna true, y false en caso contrario
     * 
     * @return boolean
     */
    public boolean esCumpleaños(){ 
         Calendar fechaHoy = new GregorianCalendar(); 
         return ( (fechaHoy.get(Calendar.DATE) == fechaNacimiento.get(Calendar.DATE)) && ((fechaHoy.get(Calendar.MONTH) + 1) == (fechaNacimiento.get(Calendar.MONTH) + 1)) ); 
    }
    
    
    /** Metodo para mostrar los datos de la persona
     * 
     */
    public void mostrar(){
        System.out.println("----------------------------------------");
        System.out.println("\nNombre y Apellido: "+ this.nomYApe());
        System.out.println("DNI: "+ this.getDNI() + " Edad: " + this.edad() + " anios");
    }
}