import java.util.*;

/**
 * Write a description of class Comercio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comercio
{
    private String nombre;
    private HashMap<Long, Empleado> empleados;
    
    public Comercio(String p_nombre){
        this.setNombre(p_nombre);
        this.setEmpleados(new HashMap<Long, Empleado>());
    }
    
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
    
    public void altaEmpleado(Empleado p_empleado){
        this.getEmpleados().put(p_empleado.getCuil(), p_empleado);
    }
    
    public Empleado bajaEmpleado(long p_cuil){
        return (Empleado)this.getEmpleados().remove(p_cuil);
    }
    
    public int cantidadDeEmpleados(){
        int contador = 0;
        
        for(int i = 0; i < getEmpleados().size(); i++){
            contador++;
        }
        
        return contador;
    }
    
    public boolean esEmpleado(long p_cuil){
        return this.getEmpleados().containsKey(p_cuil);
    }
    
    public Empleado buscarEmpleado(long p_cuil){
        return (Empleado)this.getEmpleados().get(p_cuil);
    }
    
    public void sueldoNeto(long p_cuil){
        this.buscarEmpleado(p_cuil).sueldoNeto();
    }
    
    public void nomina(){
        System.out.println("**** Nomina de empleados de Avanti SRL ****");
        
        for(Empleado empleado: this.getEmpleados().values()){
            System.out.println(empleado.getCuil() + empleado.apeYnom() + empleado.sueldoNeto());
        }
    }
}