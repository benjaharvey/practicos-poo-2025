import java.util.*;
/**
 * Una clase Curso que 
 * 
 * @author  Hardoy - Harvey 
 * @version 
 */
public class Curso
{
    private String nombre;
    private HashMap alumnos;
    
    /**
     * Constructor de la clase Curso sin alumnos.
     */
    public Curso(String p_nombre)
    {
        this.setNombre(p_nombre);
        this.setAlumnos(new HashMap());
    }
    
    /**
     * Constructor de la clase Curso sin alumnos.
     */
    public Curso(String p_nombre, HashMap p_alumnos)
    {
        this.setNombre(p_nombre);
        this.setAlumnos(p_alumnos);
    }

    //Setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setAlumnos(HashMap p_alumnos)
    {
        this.alumnos = p_alumnos;
    }
    
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public HashMap getAlumnos(){
        return this.alumnos;
    }
    
    /**
     * Metodo para ingresar un alumno a la coleccion de alumnos.
     * 
     * @param   p_alumno    el alumno a ingresar
     */
    public void agregarAlumno(Alumno p_alumno){
        this.getAlumnos().put(new Integer(p_alumno.getLU()), p_alumno);
    }
    
    /**
     * Metodo para quitar un alumno de la coleccion de alumnos.
     * 
     * @param   p_lu    libreta universitaria del alumno
     * @return  devuelve el alumno que se quito
     */
    public Alumno quitarAlumno(int p_lu){
        return (Alumno)this.getAlumnos().remove(new Integer(p_lu));
    }
    
    /**
     * Metodo para determinar la cantidad de alumnos en la coleccion.
     * 
     * @return  devuelve un entero que es el total de alumnos
     */
    public int cantidadDeAlumnos(){
        int contador = 0;
        for(int i = 0; i < this.getAlumnos().size(); i++){
            contador ++;
        }
        return contador;
    }
    
    /**
     * 
     */
    public boolean estaInscripto(int p_lu){
        return this.getAlumnos().containsKey(new Integer (p_lu));
    }
    
    /**
     * 
     */
    public boolean estaInscripto(Alumno p_alumno){
        return this.getAlumnos().containsValue(p_alumno);
    }
    
    /**
     * 
     */
    public Alumno buscarAlumno(int p_lu){
        return (Alumno)this.getAlumnos().get(new Integer(p_lu));
    }
    
    /**
     * 
     */
    public void imprimirPromedioDelAlumno(int p_lu){
        System.out.println("Promedio del alumno con LU " + p_lu + ": " + this.buscarAlumno(p_lu).promedio());
    }
    
    /**
     * 
     */
    public void mostrarInscriptos(){
        for(int i = 0; i < this.getAlumnos().size(); i++){
            System.out.println(this.getAlumnos().)
        }
    }
    
}