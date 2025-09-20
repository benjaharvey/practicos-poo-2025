import java.util.Scanner;
/**
 * Una clase producto que permite calcular precios, ajusta stock, mostrar datos del producto y del laboratorio del mismo, etc.
 * 
 * @author  Hardoy - Harvey
 * @version 08/09/25
*/
public class Producto
{
    // instance variables
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio;
    

    /**
     * Constructor de la clase Producto
     * 
     * @param   p_codigo        codigo del producto
     * @param   p_rubro         rubro del producto
     * @param   p_descripcion   descripcion del producto
     * @param   p_costo         costo del producto
     * @param   p_stock         stock del producto
     * @param   p_porcPtoRepo   porcentajde de reposicion del producto
     * @param   p_existMinima   existencia minima del producto
     * @param   p_laboratorio   Laboratorio al que pertenece el producto
     */
    Producto(int p_codigo, String p_rubro, String p_descripcion, double p_costo, int p_stock,
                    double p_porcPtoRepo, int p_existMinima, Laboratorio p_laboratorio)
    {
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_descripcion);
        this.setCosto(p_costo);
        this.setStock(p_stock);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_existMinima);
        this.setLaboratorio(p_laboratorio);
    }
    /**
     * Constructor de la clase Producto
     * 
     * @param   p_codigo        codigo del producto
     * @param   p_rubro         rubro del producto
     * @param   p_descripcion   descripcion del producto
     * @param   p_costo         costo del producto
     * @param   p_laboratorio   Laboratorio al que pertenece el producto 
     */
    public Producto(int p_codigo, String p_rubro, String p_descripcion, double p_costo, Laboratorio p_laboratorio)
    {
        // initialise instance variables
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_descripcion);
        this.setCosto(p_costo);
        this.setStock(0);
        this.setPorcPtoRepo(0.0);
        this.setExistMinima(0);
        this.setLaboratorio(p_laboratorio);
    }
    
    //setters
    private void setCodigo(int p_codigo)
    {
        this.codigo = p_codigo;
    }
    private void setRubro(String p_rubro){
        this.rubro = p_rubro;
    }
    private void setDescripcion(String p_descripcion){
        this.descripcion = p_descripcion;
    }
    private void setCosto(double p_costo){
        this.costo = p_costo;
    }
    private void setStock(int p_stock){
        this.stock = p_stock;
    }
    private void setPorcPtoRepo(double p_porcPtoRepo){
        this.porcPtoRepo = p_porcPtoRepo;
    }
    private void setExistMinima(int p_existMinima){
        this.existMinima = p_existMinima;
    }
    private void setLaboratorio(Laboratorio p_laboratorio){
        this.laboratorio = p_laboratorio;
    }
    
    //getters
    public int getCodigo(){
        return this.codigo;
    }
    public String getRubro(){
        return this.rubro;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public double getCosto(){
        return this.costo;
    }
    public int getStock(){
        return this.stock;
    }
    public double getPorcPtoRepo(){
        return this.porcPtoRepo;
    }
    public int getExistMinima(){
        return this.existMinima;
    }
    public Laboratorio getLaboratorio(){
        return this.laboratorio;
    }
    
    /**
     * Metodo para ajustar el stock
     * 
     * @param   p_cantidad  cantidad a agregar/quitar del stock
     */
    public void ajuste(int p_cantidad){
        this.setStock(this.getStock() + p_cantidad);
    }
    /**
     * Metodo para calcular el precio de lista de un producto
     * 
     * @return      devuelve el precio de lista de un producto
     */
    public double precioLista(){
        return (this.getCosto() + (this.getCosto() * 0.12));  
    }
    /**
     * Metodo para calcular el precio al contado de un producto
     * 
     * @return      devuelve el precio al contado de un producto
     */
    public double precioContado(){
        return (this.precioLista() - (this.precioLista() * 0.05));
    }
    /** 
     * Metodo para ajustar el porcentaje de reposicion
     * 
     * @param   p_porce     porcentaje al que se ajusta
     */
    public void ajustarPtoRepo(double p_porce){
        this.setPorcPtoRepo(p_porce);
     }
    /**
    * Metodo para ajustar las existencias minimas de un producto 
    * 
    * @param    p_cantidad  cantidad minima a la que se ajusta
    */
    public void ajustarExistMin(int p_cantidad){
         this.setExistMinima(p_cantidad);
     }
    /**
    * Metodo para calcular el stock valorizado de un producto
    * 
    * @return       devuelve el stock valorizado de un producto
    */
    public double stockValorizado(){
        return (this.getStock() * this.getCosto()) * 1.12;
    }
    /**
    * Metodo para mostrar descripcion, precio de lista y al contado de un producto
    * @return       devuelve una cadena con ciertos datos del producto
    */
    public String mostrarLinea(){
        return this.getDescripcion() + " " + this.precioLista() + " " + this.precioContado() + " ";
    }   
    /** 
    * Metodo para mostrar los datos del laboratorio y del producto
    */
    public void mostrar(){
        System.out.println("");
       System.out.println("Laboratorio: "+ this.getLaboratorio().getNombre());
       System.out.println("Domicilio: "+ this.getLaboratorio().getDomicilio() + " -Telefono: " + this.getLaboratorio().getTelefono());
       System.out.println("");
       System.out.println("Rubro: " + this.getRubro());
       System.out.println("Descripcion: " + this.getDescripcion());
       System.out.println("Precio Costo: " + this.getCosto());
       System.out.println("Stock: " + this.getStock() + "- Stock Valorizado: " + this.stockValorizado());
     }
}
