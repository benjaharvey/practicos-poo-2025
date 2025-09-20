/** Una clase Cliente que nos permite ingresar sus datos y manejar su saldo
 *
 * @author      Hardoy - Harvey 
 * @version     24/08/2025
 */
public class Cliente
{
    // instance variables
    private int nroDni;
    private String apellido;
    private String nombre;
    private double saldo;

    /**
     * @param   p_dni       DNI del cliente
     * @param   p_apellido  apellido del cliente
     * @param   p_nombre    nombre del cliente
     * @param   p_saldo     saldo del cliente
     */
    Cliente(int p_dni, String p_apellido, String p_nombre, double p_saldo)
    {
        setDNI(p_dni);
        setApellido(p_apellido);
        setNombre(p_nombre);
        setSaldo(p_saldo);
    }
    
    //Setters
    private void setDNI(int p_dni){
        nroDni = p_dni;
    }
    
    private void setApellido(String p_apellido){
        apellido = p_apellido;
    }
    
        private void setNombre(String p_nombre){
        nombre = p_nombre;
    }
    
    private void setSaldo(double p_saldo){
        saldo = p_saldo;
    }
    
    //Getters
    public int getDNI(){
        return nroDni;
    }
    
    public String getApellido(){
        return apellido;
    }
    
        public String getNombre(){
        return nombre;
    }
    
    public double getSaldo(){
        return saldo;    
    }
    
    /** Metodo que reemplaza al saldo actual con dinero ingresado
     * @param   p_importe   importe para reemplazar al saldo actual
     * @return  double
     */
    public double nuevoSaldo(double p_importe){
        setSaldo(p_importe);

        return saldo;
    }
    
    /** Metodo que agrega el dinero ingresado al saldo actual
     * @param   p_importe   importe para agregar al saldo actual
     * @return  double
     */
    public double agregarSaldo(double p_importe){
        setSaldo(getSaldo() + p_importe);
        return saldo;
    }
    
    /** Metodo para concatenar apellido y nombre
    * @return String
    */
    public String apeYNom(){
         return getApellido() + " " + getNombre();   
    }
    
    /** Metodo para concatenar nombre y apellido
     * @return String
     */    
    public String nomYApe(){
        return getNombre() + " " + getApellido(); 
    }        
    
    /** Metodo para mostrar datos del cliente + su saldo actual
     * 
     */
    public void mostrar(){
        System.out.println("-Cliente-");
        System.out.println("Nombre y Apellido: " + nomYApe() + "(" + getDNI() + ")");
        System.out.println("$" + getSaldo());
    }
    
}