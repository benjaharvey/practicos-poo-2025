 
/**
 * Esta es una clase llamada Laboratorio que nos permite cargar los datos del establecimiento para luego mostrarlos en pantalla
 * 
 * @author          Hardoy-Harvey
 * @version         25/08/25
 */
public class Laboratorio
{
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;
    
    /**
     * Primer constructor de la clase Laboratorio
     * 
     * @param   p_nombre        Nombre del laboratorio
     * @param   p_domicilio     Domicilio del laboratorio
     * @param   p_telefono      Telefono del laboratorio
     * @param   p_compra        Compra minima que se puede hacer al laboratorio
     * @param   p_dia           Dia aproximado en el que el laboratorio entrega sus productos
     */
    
    Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compra, int p_dia){
        setNombre(p_nombre);
        setDomicilio(p_domicilio);
        setTelefono(p_telefono);
        setCompraMin(p_compra);
        setDiaEntrega(p_dia);
    }
    
    /**
     * Segundo constructor de la clase Laboratorio, existe por si el laboratorio desease cambiar los datos usados como parametro sin modificar
     * el de compra minima y el de entrega
     * 
     * @param   p_nombre      Nombre del laboratorio
     * @param   p_domicilio   Domicilio del laboratorio
     * @param   p_telefono    Telefono del laboratorio
     */
    
        Laboratorio(String p_nombre, String p_domicilio, String p_telefono){
        setNombre(p_nombre);
        setDomicilio(p_domicilio);
        setTelefono(p_telefono);
    }
    
    private void setNombre(String p_nombre){
        nombre = p_nombre;
    }
    
    private void setDomicilio(String p_domicilio){
        domicilio = p_domicilio;
    }
    
    private void setTelefono(String p_telefono){
        telefono = p_telefono;
    }
    
    private void setCompraMin(int p_compraMin){
        compraMinima = p_compraMin;
    }
    
    private void setDiaEntrega(int p_diaEntrega){
        diaEntrega = p_diaEntrega;
    }
    
    public int getDiaEntrega(){
        return diaEntrega;
    }
    
    public int getCompraMinima(){
        return compraMinima;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public String getDomicilio(){
        return domicilio;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    /**
     * Permite asignar un nuevo monto de compra minima
     * 
     * @param   pCompraMin    Recibe el nuevo monto que se asignara como el minimo de compra para el laboratorio
     */
    
    public void nuevaCompraMinima(int pCompraMin){
        setCompraMin(pCompraMin);
    }
    
    /**
     * Permite asignar un nuevo dia de entrega aproximado
     * 
     * @param   pDiaEntrega    Recibe el numero del dia que sera utilizado como referencia para la entrega del laboratorio
     */
    
    public void nuevoDiaEntrea(int pDiaEntrega){
        setDiaEntrega(pDiaEntrega);
    }
    
    /**
     * Muestra los datos del laboratorio que fueron previamente cargados
     */
    
    public void mostrar(){
        System.out.println("Laboratorio: " + getNombre());
        System.out.print("Domicilio: " + getDomicilio());
        System.out.print("    Telefono: " + getTelefono());
        System.out.println("");
    }
} 