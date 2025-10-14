
/**
 * Clase Lavarropas, que nos permitira definir el objeto junto con sus caracteristicas principales.
 * 
 * @author      Hardoy - Harvey 
 * @version     20/10/25
 */
public class Lavarropas extends ArtefactoHogar
{
    private int programas;
    private float kilos;
    private boolean automatico;
    
    
    /**
     * Metodo constructor de la clase Lavarropas
     * 
     * @param   p_marca         Marca del lavarropas
     * @param   p_precio        Precio del lavarropas
     * @param   p_stock         Stock (cantidad) de lavarropas
     * @param   p_programas     Cantidad de programas de lavado que posee el lavarropas
     * @param   p_kilos         Kilos de ropa que puede lavar el lavarropas
     * @param   p_automatico    Posee o no la opcion de lavado automatico
     */
    
    public Lavarropas(String p_marca, float p_precio, int p_stock, int p_programas, float p_kilos, boolean p_automatico){
        super(p_marca, p_precio, p_stock);
        
        this.setProgramas(p_programas);
        this.setKilos(p_kilos);
        this.setAutomatico(p_automatico);
    }
    
    private void setProgramas(int p_programas){
        this.programas = p_programas;
    }
    
    private void setKilos(float p_kilos){
        this.kilos = p_kilos;
    }
    
    private void setAutomatico(boolean p_automatico){
        this.automatico = p_automatico;
    }
    
    public int getProgramas(){
        return this.programas;
    }
    
    public float getKilos(){
        return this.kilos;
    }
    
    public boolean getAutomatico(){
        return this.automatico;
    }
    
    
    /**
     * Metodo que nos permite calcular el credito que debera pagar el cliente
     * 
     * @return  Cantidad de dinero que le costara al cliente financiar su compra en cuotas
     */
    
    public float creditoConCondicional(int p_cuotas, float p_interes){
        float cuotaBase = super.cuotaCredito(p_cuotas, p_interes);
        
        if(this.getAutomatico() == false){
            return cuotaBase - (cuotaBase * 0.02f);
        } else {
            return cuotaBase;
        }
    }
    
    
    /**
     * Metodo que imprime las caracteristicas del lavarropas, ademas de su Marca, Precio y Stock
     */
    
    public void imprimir(){
        System.out.println("**** LAVARROPAS ****");
        super.imprimir();
        System.out.println("Programas: " + this.getProgramas());
        System.out.println("Kilos: " + this.getKilos());
        
        if(this.getAutomatico()){
            System.out.println("Automatico: Si");
        } else {
            System.out.println("Automatico: No");
        }
    }
}