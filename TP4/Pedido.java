import java.util.*;
/**
 * Una clase que tiene fecha, cliente, productos y un laboratorio.
 * 
 * @author      Hardoy - Harvey
 * @version     22/9/25
 */
public class Pedido
{
    private Calendar fecha;
    private Cliente cliente;;
    private Laboratorio laboratorio;
    
    private ArrayList <Producto> productos;
    
    /**
     * Constructor de la clase Pedido para varios pedidos
     */
    
    public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList p_productos){
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(p_productos);
    }
    
    /**
     * Constructor de la clase Pedido para un solo pedido
     */
    
    public Pedido(Calendar p_fecha, Cliente p_cliente, Producto p_productos){
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(new ArrayList());
        this.agregarProducto(p_productos);
    }
    
    private void setFecha(Calendar p_fecha){
        this.fecha = p_fecha;
    }
    
    private void setCliente(Cliente p_cliente){
        this.cliente = p_cliente;
    }
    
    private void setLaboratorio(Laboratorio p_laboratorio){
        this.laboratorio = p_laboratorio;
    }
    
    private void setProductos(ArrayList <Producto> p_productos){
        this.productos = p_productos;
    }
    
    public Calendar getFecha(){
       return this.fecha;
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }
    
    public Laboratorio getLaboratorio(){
        return this.laboratorio;
    }
    
    public ArrayList <Producto> getProductos(){
        return this.productos;
    }
    
    /**
     * Metodo que permite agregar un producto a la coleccion
     * 
     * @param   p_producto  objeto que se agregara a la colección
     * @return  devolvera true si pudo insertar el objeto, false en caso contrario
     */
    
    public boolean agregarProducto(Producto p_producto){
        return this.getProductos().add(p_producto);
    }
    
    
    /**
     * Metodo que permite quitar un producto de la coleccion
     * 
     * @param   p_producto  objeto que se eliminara de la colección
     * @return  devolvera true si pudo eliminar el objeto, false en caso contrario
     */
    
    public boolean quitarProducto(Producto p_producto){
        if(this.getProductos().size() > 1){
            return this.getProductos().remove(p_producto);
        } else {
            return false;
        }
    }
    
    
    /**
     * Metodo que recorre toda la coleccion, sumando el precio contado de todos los pedidos dentro de la coleccion
     * 
     * @return  precio total al contado de todos los pedidos de la coleccion
     */
    
    public double totalAlContado(){
        double total = 0;
        
        for(int i = 0; i < this.getProductos().size(); i++){
            total += ((this.getProductos().get(i)).precioContado());
        }
        
        return total;
    }
    
    
    /**
     * Metodo que recorre toda la coleccion, sumando el precio financiado de todos los pedidos dentro de la coleccion
     * 
     * @return  precio total financiado de todos los pedidos de la coleccion
     */
    
    public double totalFinanciado(){
        double total = 0;
        
        for(int i = 0; i < this.getProductos().size(); i++){
            total += ((this.getProductos().get(i)).precioLista());
        }
        
        return total;
    }
    
    
    /**
     * Metodo que permite visualizar los pedidos almacenados dentro de la coleccion
     */
    
    public void mostrarPedido(){
        for(int i = 0; i < this.getProductos().size(); i++){
            ((Producto)this.getProductos().get(i)).mostrar();

        }
    }
}