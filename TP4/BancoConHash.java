import java.util.*;
/**
 * Write a description of class BancoConHash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BancoConHash
{
    private String nombre;
    private int nroSucursal;
    
    private Localidad localidad;
    private ArrayList <CuentaBancaria> cuentasBancarias;
    
    private ArrayList <Empleado> empleados;
    
    public BancoConHash(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleado){
        
    }
    
    public BancoConHash(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList <Empleado> p_empleados){
        
    }
    
    public BancoConHash(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList <Empleado> p_empleados, ArrayList <CuentaBancaria> p_cuentas){
        
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setNroSucursal(int p_nroSucursal){
        this.nroSucursal = p_nroSucursal;
    }
    
    private void setLocalidad(Localidad p_localidad){
        this.localidad = p_localidad;
    }
    
    private void setCuentasBancarias(ArrayList <CuentaBancaria> p_cuentasBancarias){
        this.cuentasBancarias = p_cuentasBancarias;
    }
    
    private void setEmpleados(ArrayList <Empleado> p_empleados){
        this.empleados = p_empleados;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getNroSucursal(){
        return this.nroSucursal;
    }
    
    public Localidad getLocalidad(){
        return this.localidad;
    }
    
    public ArrayList <Empleado> getEmpleados(){
        return this.empleados;
    }
    
    public ArrayList <CuentaBancaria> getCuentasBancarias(){
        return this.cuentasBancarias;
    }
    
    public boolean agregarEmpleado(Empleado p_empleado){
        return this.getEmpleados().add(p_empleado);
    }
    
    public boolean quitarEmpleado(Empleado p_empleado){
        if(this.getEmpleados().size() > 1){
            return this.getEmpleados().remove(p_empleado);
        } else {
            return false;
        }
    }
    
    
}