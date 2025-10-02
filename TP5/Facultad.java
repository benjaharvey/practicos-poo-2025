import java.util.*;
/**
 * Una clase Facultad que tiene una nomina de profesores a los cuales puede listar y saber cuanto pagar a la totalidad de ellos
 * 
 * @author      Hardoy - Harvey
 * @version     13/10/2025
 */
public class Facultad
{
    private String nombre;
    private ArrayList<Profesor> profesores;

    /**
     * Constructor de la clase Facultad con un solo profesor
     * 
     * @param   p_nombre    nombre de la facultad
     * @param   p_profesor  un profesor de la facultad
     */
    public Facultad(String p_nombre, Profesor p_profesor)
    {
        this.setNombre(p_nombre);
        this.setProfesores(new ArrayList());
        this.agregarProfesor(p_profesor);
    }

    /**
     * Constructor de la clase Facultad con un solo profesor
     * 
     * @param   p_nombre    nombre de la facultad
     * @param   p_profesor  profesores de la facultad
     */
    public Facultad(String p_nombre, ArrayList<Profesor> p_profesores)
    {
        this.setNombre(p_nombre);
        this.setProfesores(p_profesores);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setProfesores(ArrayList<Profesor> p_profesores){
        this.profesores = p_profesores;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public ArrayList<Profesor> getProfesores(){
        return this.profesores;
    }
    
    /**
     * Metodo para agregar un profesor a la lista de profesores
     * 
     * @return  devuelve true or false dependiendo si se agrego el profesor a la lista
     */
    public boolean agregarProfesor(Profesor p_profesor){
        return this.getProfesores().add(p_profesor);
    }
    
    /**
     * Metodo para quitar un profesor de la lista de profesores
     * 
     * @return  devuelve true or false dependiendo si se quito el profesor de la lista
     */
    public boolean quitarProfesor(Profesor p_profesor){
        return this.getProfesores().remove(p_profesor);
    }
    
    /**
     * 
     */
    public void nominaProfesores(){
        System.out.println("\n\n************Nomina Facultad: " + this.getNombre());
        System.out.println("----------------------------------------");
        this.mostrarLineaProfesores();
        System.out.println("----------------------------------------");
        System.out.println("Total a pagar: $" + this.totalAPagar());
    }

    /**
     * Metodo para mostrar el total a pagar a todos los profesores de la facultad
     * 
     * @return  se devuelve el total que se tiene que pagar a los profesores
     */
    public double totalAPagar(){
        double total = 0;
        for(Profesor profesor: profesores){
            total += profesor.sueldoTotal(); 
        }
        
        return total;    
    }
    
    /**
     * Metodo para mostrar los datos del profesor en una linea
     */    
    public void mostrarLineaProfesores(){
        for(Profesor profesor: profesores){
            System.out.println(profesor.mostrarLinea());
        }
    }
    
    /**
     * Metodo para mostrar los datos personales, cargos y sueldo a pagar de cada profesor. Tambien cuantos profesores en total tiene la facultad.
     */
    public void listarProfesorCargos(){
        int contador = 0;
        System.out.println("**** Detalle de profesores y cargos de Facultad: FaCENA ****");
        for(Profesor profesor: profesores){
            profesor.mostrar();
            contador ++;
        }
        System.out.println("\nTotal de profesores: " + contador);
    }
}
