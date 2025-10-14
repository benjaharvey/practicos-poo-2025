
/**
 * Clase abstracta ArtefactoHogar, que sera utilizada como Molde para que las clases Cocina, Heladera y Lavarropas trabajen sobre ella
 * 
 * @author      Hardoy - Harvey
 * @version     20/10/25
 */
public abstract class ArtefactoHogar
{
    private String marca;
    private float precio;
    private int stock;
    
    
    /**
     * Constructor de la clase ArtefactoHogar
     * 
     * @param   p_marca     Nombre de la marca del artefacto que se desea instanciar
     * @param   p_precio    Precio del artefacto que se desea instanciar
     * @param   p_stock     Stock del artefacto que se desea instanciar (cuantos de estos artefactos hay)
     */
    
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
    
    /**
     *  Metodo que mostrara la marca del artefacto, su precio y cuanto stock de este posee el comercio
     */
    
    public void imprimir(){
        System.out.println("Marca: " + this.getMarca() + "  -   Precio: " +  + this.getPrecio() + "  -   Stock: " + this.getStock());
    }
    
    
    /**
     * Metodo que nos permite calcular el precio final que debera pagar el comprador si decide financiar su compra en cuotas
     * 
     * @param   p_cuotas    Cantidad de cuotas que se deberan pagar
     * @param   p_interes   Interes que se debera pagar en cada cuota
     */
    
    public float cuotaCredito(int p_cuotas, float p_interes){
        float precioMasInteres = this.getPrecio() + ((this.getPrecio() * p_interes) / 100);
        return precioMasInteres / p_cuotas;
    }
    
    /**
     * Metodo abstracto que debera ser definido en las clases que le corresponden a cada artefacto
     * 
     * @param   p_cuotas    Cuotas que se deberan pagar
     * @param   p_interes   Interes que se debera pagar en cada cuota
     */
    public abstract float creditoConCondicional(int p_cuotas, float p_interes);
}