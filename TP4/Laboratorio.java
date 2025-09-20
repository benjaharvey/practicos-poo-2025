/**
 * Una clase laboratorio que tiene ciertos atributos y admite metodos para mostrar sus datos, actualizar, etc
 * 
 * @author  Hardoy - Harvey
 */
public class Laboratorio
{
    // instance variables
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;

    //Constructor
    Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMinima, int p_diaEntrega)
    {
        setNombre(p_nombre);
        setDomicilio(p_domicilio);
        setTelefono(p_telefono);
        setCompraMinima(p_compraMinima);
        setDiaEntrega(p_diaEntrega);
    }
    
    Laboratorio(String p_nombre, String p_domicilio, String p_telefono)
    {
        setNombre(p_nombre);
        setDomicilio(p_domicilio);
        setTelefono(p_telefono);
        setCompraMinima(0);
        setDiaEntrega(0);
    }
    
    //Setters
    private void setNombre(String p_nombre)
    {
        nombre = p_nombre;
    }
    private void setDomicilio(String p_domicilio)
    {
        domicilio = p_domicilio;
    }
    private void setTelefono(String p_telefono)
    {
        telefono = p_telefono;
    }
    private void setCompraMinima(int p_compraMinima)
    {
        compraMinima = p_compraMinima;
    }
    private void setDiaEntrega(int p_diaEntrega)
    {
        diaEntrega = p_diaEntrega;
    }
    
    //Getters
    public String getNombre()
    {
        return nombre;        
    }
    public String getDomicilio()
    {
        return domicilio;        
    }
    public String getTelefono()
    {
        return telefono;        
    }
    public int getCompraMinima()
    {
        return compraMinima;        
    }
    public int getDiaEntrega()
    {
        return diaEntrega;        
    }
    
    //Methods
    /**
     * Metodo que permite actualizar el atributo de compraMinima
     */
    public void nuevaCompraMinima(int p_compraMinima){
        compraMinima = p_compraMinima;   
    }

    /**
     * Metodo que permite actualizar el atributo de diaEntrega
     */    
    public void nuevoDiaEntrega(int p_diaEnt){
        diaEntrega = p_diaEnt;
    }
    
    /**
     * Metodo para mostrar los datos del objeto Laboratorio
     */
    public void mostrar(){
        System.out.println("Laboratorio: "+ getNombre());
        System.out.println("Domicilio: "+ getDomicilio() + "\t" + "- Telefono: "+ getTelefono());
    }    
        
}