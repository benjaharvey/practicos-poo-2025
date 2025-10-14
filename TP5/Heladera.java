
/**
 * Clase Heladera, que nos permitira definir el objeto junto con sus caracteristicas principales.
 * 
 * @author      Hardoy - Harvey 
 * @version     20/10/25
 */
public class Heladera extends ArtefactoHogar
{
    private int pies;
    private int puertas;
    private boolean compresor;
    
    
    /**
     * Metodo constructor de la clase Heladera
     * 
     * @param   p_marca     Marca de la heladera
     * @param   p_precio    Precio individual de la heladera
     * @param   p_stock     Stock (cantidad) de heladeras
     * @param   p_pies      Cantidad de pies que posee la heladera
     * @param   p_puertas   Cantidad de puertas que posee la heladera
     * @param   p_compresor Si la heladera posee o no un compresor
     */
    
    
    public Heladera(String p_marca, float p_precio, int p_stock, int p_pies, int p_puertas, boolean p_compresor){
        super(p_marca, p_precio, p_stock);
        
        this.setPies(p_pies);
        this.setPuertas(p_puertas);
        this.setCompresor(p_compresor);
    }
    
    private void setPies(int p_pies){
        this.pies = p_pies;
    }
    
    private void setPuertas(int p_puertas){
        this.puertas = p_puertas;
    }
    
    private void setCompresor(boolean p_compresor){
        this.compresor = p_compresor;
    }
    
    public int getPies(){
        return this.pies;
    }
    
    public int getPuertas(){
        return this.puertas;
    }
    
    public boolean getCompresor(){
        return this.compresor;
    }
    
    
    /**
     * Metodo que nos permite calcular el credito que debera pagar el cliente
     * 
     * @return  Cantidad de dinero que le costara al cliente financiar su compra en cuotas
     */
    
    public float creditoConCondicional(int p_cuotas, float p_interes){
        float cuotaBase = super.cuotaCredito(p_cuotas, p_interes);
        
        if(this.getCompresor() == true){
            return cuotaBase + 50;
        } else {
            return cuotaBase;
        }
    }
    
    
    /**
     * Metodo que imprime las caracteristicas de la heladera, ademas de su Marca, Precio y Stock
     */
    
    public void imprimir(){
        System.out.println("**** HELADERA ****");
        super.imprimir();
        System.out.println("Pies: " + this.getPies());
        System.out.println("Puertas: " + this.getPuertas());
        
        if(this.getCompresor()){
            System.out.println("Compresor: Si");
        } else {
            System.out.println("Compresor: No");
        }
    }
}