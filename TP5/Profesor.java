import java.util.*;
/**
 * Una clase Profesor que tiene cargos y sueldo.
 * 
 * @author      Hardoy - Harvey
 * @version     13/10/2025
 */
public class Profesor extends Persona
{
    private String titulo;
    private ArrayList<Cargo> cargos;

    /**
     * Constructor de la clase Profesor con un solo cargo
     * 
     * @param   p_dni       dni del profesor
     * @param   p_nombre    nombre del profesor
     * @param   p_apellido  apellido del profesor
     * @param   p_anio      anio de nacimiento del profesor
     * @param   p_titulo    titulo del profesor
     * @param   p_cargo     cargo del profesor
     */
    public Profesor(int p_dni, String p_nombre, String p_apellido, int p_anio, String p_titulo, Cargo p_cargo)
    {
        super(p_dni, p_nombre, p_apellido, p_anio);
        this.setTitulo(p_titulo);
        this.setCargos(new ArrayList());
        this.agregarCargo(p_cargo);
    }
    
    /**
     * Constructor de la clase Profesor con un solo cargo
     * 
     * @param   p_dni       dni del profesor
     * @param   p_nombre    nombre del profesor
     * @param   p_apellido  apellido del profesor
     * @param   p_anio      anio de nacimiento del profesor
     * @param   p_titulo    titulo del profesor
     * @param   p_cargos     cargos del profesor
     */
    public Profesor(int p_dni, String p_nombre, String p_apellido, int p_anio, String p_titulo, ArrayList<Cargo> p_cargos)
    {
        super(p_dni, p_nombre, p_apellido, p_anio);
        this.setTitulo(p_titulo);
        if(p_cargos.size() > 3){
            System.out.println("El profesor no puede tener mas de 3 cargos");
        }
        else{
            this.setCargos(p_cargos);
        }
    }

    private void setTitulo(String p_titulo){
        this.titulo = p_titulo;
    }
    private void setCargos(ArrayList<Cargo> p_cargos){
        this.cargos = p_cargos;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    public ArrayList<Cargo> getCargos(){
        return this.cargos;
    }
    
    /**
     * Metodo para agregar un cargo al profesor
     * 
     * @return  devuelve true or false dependiendo si se agrego el cargo a la lista
     */
    public boolean agregarCargo(Cargo p_cargo){
        if(this.getCargos().size() >= 3){
            return false;
        }
        return this.getCargos().add(p_cargo);
    }
    /**
     * Metodo para quitar un cargo al profesor
     * 
     * @return  devuelve true or false dependiendo si se quito el cargo de la lista
     */
    public boolean quitarCargo(Cargo p_cargo){
        return this.getCargos().remove(p_cargo);
    }
    
    /**
     * Metodo para listar los cargos del profesor
     */
    public void listarCargos(){
        System.out.println("\n****Cargos Asignados****");
        System.out.println("------------------------");
        for(Cargo cargo: cargos){
            cargo.mostrarCargo();
        }
    }
    
    /**
     * Metodo para calcular el sueldo total del Profesor en base a sus distintos cargos
     * 
     * @return  devuelve un double que corresponde al sueldo del profesor
     */
    public double sueldoTotal(){
        double sueldoTot = 0;
        for(Cargo cargo: cargos){
            sueldoTot += cargo.sueldoDelCargo();
        }
        return sueldoTot;
    }
    
    /**
     * Metodo para mostrar los datos del Profesor, sus cargos y su sueldo total
     */
    public void mostrar(){
        super.mostrar();
        System.out.println("Titulo: " + this.getTitulo());
        this.listarCargos();
        System.out.println("Sueldo Total: " + this.sueldoTotal());
    }
    
    /**
     * Metodo para mostrar en una linea los datos del Profesor
     */
    public String mostrarLinea(){
        return "DNI: " + this.getDNI() + " Nombre: " + this.nomYApe() + " -Sueldo Total: " + this.sueldoTotal();
    }
}