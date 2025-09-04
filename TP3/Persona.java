import java.util.*;
/** Una clase Persona que nos permite ingresar y obtener la informacion personal de esta
 *
 * @author      Hardoy - Harvey 
 * @version     24/08/2025
 */
public class Persona
{
    // instance variables
    private int nroDni;
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento;

    /** Constructor de la clase Persona
     * @param   p_dni       DNI de la persona
     * @param   p_nombre    nombre de la persona
     * @param   p_apellido  apellido de la persona
     * @param   p_anio      anio de nacimiento de la persona
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio)
    {
        setDNI(p_dni);
        setNombre(p_nombre);
        setApellido(p_apellido);
        setAnioNacimiento(p_anio);
    }
    
    public Persona(int p_dni, String p_nombre, String p_apellido, Calendar p_fecha){
        setDNI(p_dni);
        setNombre(p_nombre);
        setApellido(p_apellido);
        setFechaNacimiento(p_fecha);
    }
    
    //Setters
    private void setDNI(int p_dni){
        nroDni = p_dni;
    }
    
    private void setNombre(String p_nombre){
        nombre = p_nombre;
    }
    
    private void setApellido(String p_apellido){
        apellido = p_apellido;
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
        return nroDni;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public int getAnioNacimiento(){
        return this.getFechaNacimiento().get(Calendar.YEAR);
    }
    
    public Calendar getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
    /** Metodo para calcular la edad de la persona en base a su anio de nacimiento
     * @return  int
     */
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - getAnioNacimiento();
    }

    /** Metodo para concatenar nombre y apellido
     * @return String
     */
    public String nomYApe(){
        return getNombre() + " " + getApellido(); 
    }
    
    /** Metodo para concatenar apellido y nombre
     * @return String
     */
    public String apeYNom(){
         return getApellido() + " " + getNombre();   
    }    
    
    
    public boolean esCumpleaños(){ 
         Calendar fechaHoy = new GregorianCalendar(); 
         return ( (fechaHoy.get(Calendar.DATE) == fechaNacimiento.get(Calendar.DATE)) && ((fechaHoy.get(Calendar.MONTH) + 1) == (fechaNacimiento.get(Calendar.MONTH) + 1)) ); 
    }
    
    
    /** Metodo para mostrar los datos de la persona
     * 
     */
    public void mostrar(){
        System.out.println("Nombre y Apellido: "+ nomYApe());
        System.out.println("DNI: "+ getDNI() + "\t" + "Edad: " + edad() + " anios");
    }
}