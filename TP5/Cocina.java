
/**
 * Clase Cocina, que nos permitira definir las caracteristicas de este objeto
 * 
 * @author      Hardoy - Harvey 
 * @version     20/10/25
 */
public class Cocina extends ArtefactoHogar
{
    private int hornallas;
    private int calorias;
    private String dimensiones;
    
    private void setHornallas(int p_hornallas){
        this.hornallas = p_hornallas;
    }
    
    private void setCalorias(int p_calorias){
        this.calorias = p_calorias;
    }
    
    private void setDimensiones(String p_dimensiones){
        this.dimensiones = p_dimensiones;
    }
    
    public int getHornallas(){
        return this.hornallas;
    }
    
    public int getCalorias(){
        return this.calorias;
    }
    
    public String getDimensiones(){
        return this.dimensiones;
    }
    
    
    /**
     * Metodo constructor de la clase Cocina
     * 
     * @param   p_marca         Marca de la cocina
     * @param   p_precio        Precio de la cocina
     * @param   p_stock         Stock (cantidad) de cocinas
     * @param   p_hornallas     Cantidad de hornallas que posee la cocina
     * @param   p_calorias      Cantidad de calorias que posee la cocina
     * @param   p_dimensiones   Dimensiones de la cocina
     */
    
    public Cocina(String p_marca, float p_precio, int p_stock, int p_hornallas, int p_calorias, String p_dimensiones){
        super(p_marca, p_precio, p_stock);
        
        this.setHornallas(p_hornallas);
        this.setCalorias(p_calorias);
        this.setDimensiones(p_dimensiones);
    }
    
    
    /**
     * Metodo que nos permite calcular el credito que debera pagar el cliente
     * 
     * @return  Cantidad de dinero que le costara al cliente financiar su compra en cuotas
     */
    
    public float creditoConCondicional(int p_cuotas, float p_interes){
        return super.cuotaCredito(p_cuotas, p_interes);
    }
    
    
    /**
     * Metodo que imprime las caracteristicas de la cocina, ademas de su Marca, Precio y Stock
     */
    
    public void imprimir(){
        System.out.println("**** COCINA ****");
        super.imprimir();
        System.out.println("Hornallas: " + this.getHornallas());
        System.out.println("Calorias: " + this.getCalorias());
        System.out.println("Dimensiones: " + this.getDimensiones());
        
        
    }
}