
/**
 * Write a description of class Lavarropas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lavarropas extends ArtefactoHogar
{
    private int programas;
    private float kilos;
    private boolean automatico;
    
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

    public float creditoConCondicional(int p_cuotas, float p_interes){
        float cuotaBase = super.cuotaCredito(p_cuotas, p_interes);
        
        if(this.getAutomatico() == false){
            return cuotaBase - (cuotaBase * 0.02f);
        } else {
            return cuotaBase;
        }
    }
    
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