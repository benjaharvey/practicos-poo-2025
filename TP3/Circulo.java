
/**
 * Una clase Circulo que nos permite crear un circulo, calcular la distancia que existe entre 2 circulos y determinar cual de los 2 circulos es el mayor
 * 
 * @author      Hardoy - Harvey
 * @version     8/9/25
 */
public class Circulo
{
    private double radio;
    private Punto centro;
    
    /**
     * @param   p_radio         Radio del circulo           
     * @param   p_centro        Origen del circulo
     * 
     * Primer constructor de la clase Circulo
     */
    
    public Circulo(double p_radio, Punto p_centro){
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }
    
    
    /**
     * Segundo constructor de la clase Circulo 
     */
    
    public Circulo(){
        this.setRadio(0);
        this.setCentro(new Punto(0,0));
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
    
    
    /**
     * Permite desplazar el punto central del circulo a una dirección que se especifica por medio de los parametros p_dx y p_dy
     *
     * @param   p_dx    Punto en el eje X
     * @param   p_dy    Punto en el eje Y
     */
    
    public void desplazar(double p_dx, double p_dy){
        this.getCentro().desplazar(p_dx, p_dy);
    }
    
    
    /**
     * Muestra el radio del circulo y en que ubicacion (x,y) se encuentra 
     */
    
    public void caracteristicas(){
        System.out.println("***** CIRCULO *****");
        System.out.println("Centro: " + getCentro().coordenadas() + " - Radio: " + getRadio());
        System.out.println("Superficie: " + superficie() + "  Perimetro: " + perimetro() );
    }
    
    
    /**
     * Calcula el perimetro del circulo
     * 
     * @return double
     */
    
    public double perimetro(){
        return 2*Math.PI*getRadio();
    }
    
    
    /**
     * Calcula la superficie del circulo
     *
     * @return double
     */
    
    
    public double superficie(){
        return Math.PI * Math.pow(getRadio(), 2);
    }
    
    /**
     * Calcula mediante el teorema de pitagoras la distancia entre los dos puntos centrales de los ciruclos
     *
     * @return double
     */
    
    public double distanciaA(Circulo otroCirculo){
        return this.getCentro().distanciaA(otroCirculo.getCentro());
    }
    
    /**
     * Compara la superficie de los 2 circulos y retorna el de mayor valor
     *
     * @return Circulo
     */
    
    public Circulo elMayor(Circulo otroCirculo){
        if(this.superficie() >= otroCirculo.superficie()){
            return this;
        } else {
            return otroCirculo;
        }
    }
}