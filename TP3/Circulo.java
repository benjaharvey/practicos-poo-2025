
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
        this.radio = 0;
        this.centro = new Punto(0,0);
    }
    
    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Punto getCentro() {
        return this.centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }
    
    public void desplazar(double p_dx, double p_dy){
        
    }
}