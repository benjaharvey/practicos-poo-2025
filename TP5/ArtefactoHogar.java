
/**
 * Write a description of class ArtefactoHogar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArtefactoHogar
{
    private String marca;
    private float precio;
    private int stock;
    
    public ArtefactoHogar(String p_marca, float p_precio, int p_stock){
        this.setMarca(p_marca);
        this.setPrecio(p_precio);
        this.setStock(p_stock);
    }
    
    private void setMarca(String p_marca){
        this.marca = p_marca;
    }
    
    private void setPrecio(float p_precio){
        this.precio = p_precio;
    }
    
    private void setStock(int p_stock){
        this.stock = p_stock;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public float getPrecio(){
        return this.precio;
    }
    
    public int getStock(){
        return this.stock;
    }
    
    
}