
/**
 * Write a description of class Elipse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elipse extends FiguraGeometrica
{
    private double sEjeMenor;
    private double sEjeMayor;
    private Punto centro;

    public Elipse(double p_ejeMenor, double p_ejeMayor, Punto p_centro){
        super(p_centro);
        this.setEjeMayor(p_ejeMayor);
        this.setEjeMenor(p_ejeMenor);

    }
    
    private void setEjeMayor(double p_ejeMayor){
        this.sEjeMayor = p_ejeMayor;
    }
    
    private void setEjeMenor(double p_ejeMenor){
        this.sEjeMenor = p_ejeMenor;
    }
    
    private void setCentro(Punto p_centro){
        this.centro = p_centro;
    }
    
    public double getEjeMayor(){
        return this.sEjeMayor;
    }
    
    public double getEjeMenor(){
        return this.sEjeMenor;
    }
    
    public Punto getCentro(){
        return this.centro;
    }
    
    public String nombreFigura(){
        if(this.getEjeMayor() == this.getEjeMenor()){
            return "CIRCULO";
        } else {
            return "ELIPSE";
        }
    }
    
    public void caracteristicas(){
        System.out.println("***** " + this.nombreFigura() + " *****");
        
        System.out.println("Centro: (" + this.getCentro() + ") - Semieje Mayor: " + this.getEjeMayor() + "- Semieje Menor: " + this.getEjeMenor());
        
        System.out.println("Superficie: " + superficie());
    }
    
    public double superficie(){
        return Math.PI * this.getEjeMayor() * this.getEjeMenor();
    }
    
    public void desplazar(double p_dx, double p_dy){
        this.getCentro().desplazar(p_dx, p_dy);
    }
    
    public double distanciaA(Elipse otroElipse){
        return this.getCentro().distanciaA(otroElipse.getCentro());
    }
    
    public Elipse elMayor(Elipse otroElipse){
        if(this.superficie() >= otroElipse.superficie()){
            return this;
        } else {
            return otroElipse;
        }
    }
}