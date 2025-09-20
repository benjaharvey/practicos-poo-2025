import java.util.*;
/**
 * Una clase Banco que tiene empleados, una localidad y mas datos.
 * 
 * @author      Hardoy - Harvey
 * @version     22/09/25
 */
public class Banco
{
    private String nombre;
    private int nroSucursal;
    private Localidad localidad;
    private ArrayList <Empleado> empleados;
    private ArrayList <CuentaBancaria> cuentasBancarias;

    /**
     * Constructor de la clase Banco para un empleado
     * 
     * @param   p_nombre        nombree del banco
     * @param   p_localidad     localidad del banco
     * @param   p_nroSucursal   numero de sucursal del banco
     * @param   p_empleado      empleado del banco
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleado){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(new ArrayList());
        this.agregarEmpleado(p_empleado);
        this.setCuentasBancarias(new ArrayList());
    }

    /**
     * Constructor de la clase Banco para varios empleados
     * 
     * @param   p_nombre        nombree del banco
     * @param   p_localidad     localidad del banco
     * @param   p_nroSucursal   numero de sucursal del banco
     * @param   p_empleados     empleados del banco
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList <Empleado> p_empleados){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuentasBancarias(new ArrayList());
    }
    
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList <Empleado> p_empleados, ArrayList <CuentaBancaria> p_cuentas){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuentasBancarias(p_cuentas);
    }
    
    //Setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setLocalidad(Localidad p_localidad){
        this.localidad = p_localidad;
    }
    private void setNroSucursal(int p_nroSucursal){
        this.nroSucursal = p_nroSucursal;
    }
    private void setEmpleados(ArrayList <Empleado> p_empleados){
        this.empleados = p_empleados;
    }
    private void setCuentasBancarias(ArrayList <CuentaBancaria> p_cuentasBancarias){
        this.cuentasBancarias = p_cuentasBancarias;
    }
    
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public Localidad getLocalidad(){
        return this.localidad;
    }
    public int getNroSucursal(){
        return this.nroSucursal;
    }
    public ArrayList <Empleado> getEmpleados(){
        return this.empleados;
    }
    public ArrayList <CuentaBancaria> getCuentasBancarias(){
        return this.cuentasBancarias;
    }
    
    /**
     * Metodo para agregar un empleado a la coleccion
     * 
     * @param   p_empleado  objeto empleado que se quiere agregar
     * 
     * @return devuelve true o false dependiendo de si se agrego o no
     */
    public boolean agregarEmpleado(Empleado p_empleado){
        return this.getEmpleados().add(p_empleado);
    }
    
    /**
     * Metodo para quitar un empleado de la coleccion
     * 
     * @param   p_empleado  objeto empleado que se quiere quitar
     * 
     * @return  devuelve true o false dependiendo de si se quito o no
     */
    public boolean quitarEmpleado(Empleado p_empleado){
        if(this.getEmpleados().size() > 1){
            return this.getEmpleados().remove(p_empleado);
        }
        else{
            return false;
        }
    }
    
    /**
     * Metodo para buscar un empleado por medio de su posicion
     * 
     * @param   p_cuil  cuil del empleado
     * @return  devuelve el objeto Empleado
     */
    public Empleado buscarEmpleado(int p_pos){
        return (Empleado)this.getEmpleados().get(new Integer(p_pos - 1));
    }
    
    /**
     * Metodo para listar los sueldos de los empleados.
     */
    public void listarSueldos(){
        for(int i = 0; i<this.getEmpleados().size(); i++){
            System.out.println(((Empleado)this.getEmpleados().get(i)).mostrarLinea());
        }
    }
    
    /**
     * Metodo para calcular el total a pagar en base a la suma de los sueldos.
     * 
     * @return  devuelve un flotante que equivale a la suma de los sueldos de los empleados
     */
    public double sueldosAPagar(){
        double sueldoAPagar = 0;
        for(int i = 0; i < this.getEmpleados().size(); i++){
            sueldoAPagar += ((Empleado)this.getEmpleados().get(i)).sueldoNeto();
        }
        return sueldoAPagar;
    }
    
    /**
     * Metodo que muestra informacion del banco, de los empleados y del total a pagarle a los mismos.
     */
    public void mostrar(){
        System.out.println("\nBanco: " + this.getNombre() + "\t\tSucursal: " + this.getNroSucursal());
        System.out.println("Localidad: " + this.getLocalidad().getNombre() + "\tProvincia: " + this.getLocalidad().getProvincia());
        this.listarSueldos();
        System.out.println("\nTOTAL A PAGAR: -------------------------------------------- $" + this.sueldosAPagar());
    }   
    
    /**
     * 
     */
        public boolean agregarCuentaBancaria(CuentaBancaria p_cuenta){
        return this.getCuentasBancarias().add(p_cuenta);
    }
    
    /**
     * 
     */
    public boolean quitarCuentaBancaria(CuentaBancaria p_cuenta){
        if(this.getCuentasBancarias().size() > 0){
            return this.getCuentasBancarias().remove(p_cuenta);
        } else {
            return false;
        }
    }
    
    /**
     * 
     */
    public void listarCuentasConSaldoCero(){
        int contador = 0;
        System.out.print("Cuentas saldo cero: ");
        for(CuentaBancaria cuenta: cuentasBancarias){
            if(cuenta.getSaldo() == 0){
                contador++;
                cuenta.mostrar(); //Este o el contador tiene que ir en otra funcion
            }
        }
        System.out.print(contador);
    }
    
    /**
     * 
     */
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

    /**
     * 
     */
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
    
    /**
     * 
     */
    public void mostrarResumen(){
        HashSet<Persona> titulares = listaDeTitulares();
        
        mostrar();
        System.out.println("************************************** \n" + "  RESUMEN DE CUENTAS BANCARIAS  \n" + "************************************** ");
        
        System.out.println("Numero total de Cuentas Bancarias: " + this.getCuentasBancarias().size());
        System.out.println("Cuentas Activas: " + cuentasSaldoActivo());
        listarCuentasConSaldoCero();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.print("Listado de clientes: ");
        for(Persona titular: titulares){
            System.out.print(titular.nomYApe()+ ", ");
        }
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
    }
    
}