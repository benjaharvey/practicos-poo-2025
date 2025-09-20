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
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(new ArrayList());
        this.agregarEmpleado(p_empleado);
    }
    
    public BancoConHash(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList <Empleado> p_empleados){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
    }
    
    public BancoConHash(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList <Empleado> p_empleados, ArrayList <CuentaBancaria> p_cuentas){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuentasBancarias(p_cuentas);
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
    
    public void listarSueldos(){
        for(int i = 0; i < this.getEmpleados().size(); i++){
            System.out.println(((Empleado)this.getEmpleados().get(i)).mostrarLinea());
        }
    }
    
    public double sueldosAPagar(){
        double sueldoAPagar = 0;
        
        for(int i = 0; i < this.getEmpleados().size(); i++){
            sueldoAPagar += ((Empleado)this.getEmpleados().get(i)).sueldoNeto();
        }
        
        return sueldoAPagar;
    }
    
    public void mostrar(){
        System.out.println("Banco: " + this.getNombre() + "    Sucursal: " + this.getNroSucursal());
        System.out.println("Localidad: " + this.getLocalidad().getNombre() + "    Provincia: " + this.getLocalidad().getProvincia());
    }
    
    public boolean agregarCuentaBancaria(CuentaBancaria p_cuenta){
        return this.getCuentasBancarias().add(p_cuenta);
    }
    
    public boolean quitarCuentaBancaria(CuentaBancaria p_cuenta){
        if(this.getCuentasBancarias().size() >= 0){
            return this.getCuentasBancarias().remove(p_cuenta);
        } else {
            return false;
        }
    }
    
    public void listarCuentasConSaldoCero(){
        for(int i = 0; i < this.getCuentasBancarias().size(); i++){
            if(((CuentaBancaria)this.getCuentasBancarias().get(i)).getSaldo() == 0){
                System.out.println(((CuentaBancaria) this.getCuentasBancarias().get(i)).toStrinf());
            }
        }
    }
    
    public HashSet<Persona> listaDeTitulares() {
        HashSet<Persona> titulares = new HashSet<>();

            if (cuentasBancarias != null) {
                for (CuentaBancaria cuenta : cuentasBancarias) {
                    if (cuenta != null && cuenta.getTitular() != null) {
                        titulares.add(cuenta.getTitular());
                    }
                }
            }

            return titulares;
    }

    
    private int cuentasSaldoActivo(){
        int cantidad = 0;
        
        if(this.getCuentasBancarias() != null){
            for(CuentaBancaria cuenta : this.getCuentasBancarias()){
                if(cuenta.getSaldo() > 0){
                    cantidad++;
                }
            }
        }
        
        return cantidad;
    }
    
    public void mostrarResumen(){
        mostrar();
        System.out.println("************************************** \n" + "  RESUMEN DE CUENTAS BANCARIAS  \n" + "************************************** ");
        
        System.out.println("Numero total de Cuentas Bancarias: " + this.getCuentasBancarias().size());
        System.out.println("Cuentas Activas: " + cuentasSaldoActivo());
        System.out.println("Cuentas Saldo Cero: " + listarCuentasConSaldoCero());
    }
}