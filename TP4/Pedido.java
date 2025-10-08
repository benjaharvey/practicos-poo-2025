import java.util.*;
/**
 * Write a description of class Pedido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pedido
{
    private Calendar fecha;
    private Cliente cliente;;
    private Laboratorio laboratorio;
    
    private ArrayList <Producto> productos;
    /**
     * 
     */
    
    public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList p_productos){
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(p_productos);
    }
    
    /**
     * 
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
    
    public boolean agregarProducto(Producto p_producto){
        return this.getProductos().add(p_producto);
    }
    
    public boolean quitarProducto(Producto p_producto){
        if(this.getProductos().size() > 1){
            return this.getProductos().remove(p_producto);
        } else {
            return false;
        }
    }
    
    public double totalAlContado(){
        double total = 0;
        
        for(int i = 0; i < this.getProductos().size(); i++){
            total += ((this.getProductos().get(i)).precioContado());
        }
        
        return total;
    }
    
    public double totalFinanciado(){
        double total = 0;
        
        for(int i = 0; i < this.getProductos().size(); i++){
            total += ((this.getProductos().get(i)).precioLista());
        }
        
        return total;
    }
    
    public void mostrarPedido(){
        for(int i = 0; i < this.getProductos().size(); i++){
            ((Producto)this.getProductos().get(i)).mostrar();

        }
    }
}