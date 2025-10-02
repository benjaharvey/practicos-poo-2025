import java.util.*;

/**
 * Una clase Comercio que tiene nombre y varios empleados.
 * 
 * @author      Hardoy - Harvey
 * @version     22/9/25
 */
public class Comercio
{
    private String nombre;
    private HashMap<Long, Empleado> empleados;
    
    /**
     * Constructor de la clase Comercio sin empleados
     * 
     * @param   p_nombre        nombre del comercio    
     */
    
    public Comercio(String p_nombre){
        this.setNombre(p_nombre);
        this.setEmpleados(new HashMap<Long, Empleado>());
    }
    
    
    /**
     * Constructor de la clase Comercio para varios empleados
     * 
     * @param   p_nombre        nombre del comercio
     * @param   p_empleados     empleados del comercio
     * 
     */
    public Comercio(String p_nombre, HashMap<Long, Empleado> p_empleados){
        this.setNombre(p_nombre);
        this.setEmpleados(p_empleados);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setEmpleados(HashMap<Long, Empleado> p_empleados){
        this.empleados = p_empleados;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public HashMap<Long, Empleado> getEmpleados(){
        return this.empleados;
    }
    
    /**
     * Metodo que inserta un nuevo empleado dentro del HashMap
     * 
     * @param   p_empleado  El empleado que sera ingresado    
     */
    
    
    public void altaEmpleado(Empleado p_empleado){
        this.getEmpleados().put(p_empleado.getCuil(), p_empleado);
    }
    
    /**
     * Metodo que elimina un empleado del HashMap
     * 
     * @param   p_cuil  El cuil del empleado que sera eliminado    
     */
     
    public Empleado bajaEmpleado(long p_cuil){
        return (Empleado)this.getEmpleados().remove(p_cuil);
    }
    
    
    /**
     * Metodo que recorre el HashMap y cuenta cuantos elementos (empleados) existen
     * 
     * @return  devuelve un int que sera la cantidad de empleados dentro del HashMap
     */
    
    public int cantidadDeEmpleados(){
        int contador = 0;
        
        for(int i = 0; i < getEmpleados().size(); i++){
            contador++;
        }
        
        return contador;
    }
    
    /**
     * Metodo que buscara dentro del HashMap si el CUIL ingresado como parametro corresponde a algun empleado dentro de este
     * 
     * @param   p_cuil      El cuil del supuesto empleado
     * @return  devolvera verdadero si es empleado, falso en caso contrario    
     */
    
    public boolean esEmpleado(long p_cuil){
        return this.getEmpleados().containsKey(p_cuil);
    }
    
    
    /**
     * Metodo que buscara dentro del HashMap si el CUIL ingresado como parametro corresponde a algun empleado dentro de este
     * 
     * @param   p_cuil      El cuil del empleado a biscar
     * @return  retornara el empleado (value) que este emparejado con el cuil (key)    
     */
    
    public Empleado buscarEmpleado(long p_cuil){
        return (Empleado)this.getEmpleados().get(p_cuil);
    }
    
    /**
     * Metodo que buscara el sueldo neto del empleado indicado
     * 
     * @param   p_cuil      El cuil del supuesto empleado
     */
    
    public void sueldoNeto(long p_cuil){
        this.buscarEmpleado(p_cuil).sueldoNeto();
    }
    
    
    /**
     * Metodo que mostrara los empleados que esten almacenados dentro del HashMap
     */
    
    public void nomina(){
        System.out.println("**** Nomina de empleados de Avanti SRL ****");
        
        for(Empleado empleado: this.getEmpleados().values()){
            System.out.println(empleado.getCuil() + "    " + empleado.apeYnom() + "     " + empleado.sueldoNeto());
        }
    }
}