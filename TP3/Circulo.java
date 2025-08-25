
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circulo
{
    private double radio;
    private Punto centro;
    
    public Circulo(double p_radio, Punto p_centro){
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }
    
    public Circulo(){
        this.setRadio(0);
        this.setCentro(new Punto(0,0));
    }
    
    private void setRadio(double p_radio){
        this.radio = p_radio;
    }
    
    private void setCentro(Punto p_centro){
        this.centro = p_centro;
    }
    
    public double getRadio(){
        return this.radio;
    }
    
    public Punto getCentro(){
        return this.centro;
    }
    
    public void desplazar(double p_dx, double p_dy){
        this.getCentro().desplazar(p_dx, p_dy);
    }
    
    public void caracteristicas(){
        System.out.println("***** CIRCULO *****");
        System.out.println("Centro: (" + getCentro() + ")   - Radio: " + getRadio());
        System.out.println("Superficie: " + superficie() + "Perimetro: " + perimetro() );
    }
    
    public double perimetro(){
        return 2*Math.PI*getRadio();
    }
    
    public double superficie(){
        return Math.PI * Math.pow(getRadio(), 2);
    }
    
    
    public double distanciaA(Circulo otroCirculo){
        
    }
    
}