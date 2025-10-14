
/**
 * Una clase Renglon
 * 
 * @author      Hardoy - Harvey 
 * @version     20/10/2025
 */
public class Renglon
{
    private int cantidad;
    private double importe;
    private Etiqueta item;
    
    /**
     * Constructor de la clase Renglon
     * 
     * @param   p_cantidad  la cantidad de renglones
     * @param   p_item      la etiqueta del renglon
     */
    public Renglon(int p_cantidad, Etiqueta p_item)
    {
        this.setCantidad(p_cantidad);
        this.setImporte(p_item.precio(p_cantidad));
        this.setItem(p_item);
    }
    
    private void setCantidad(int p_cantidad){
        this.cantidad = p_cantidad;
    }
    private void setImporte(double p_importe){
        this.importe = p_importe;
    }
    private void setItem(Etiqueta p_item){
        this.item = p_item;
    }
    
    public int getCantidad(){
        return this.cantidad;
    }
    public double getImporte(){
        return this.importe;
    }
    public Etiqueta getItem(){
        return this.item;
    }
    
    
    /**
     * Metodo para mostrar en un renglon las etiquetas y su costo
     */
    public void mostrar(){
        System.out.println(this.getCantidad() + " Etiquetas de " + this.getItem().toString());
    }
}