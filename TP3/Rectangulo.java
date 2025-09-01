
/**
 * Una clase Rectangulo que tiene caracteristicas, se desplaza, se compara y se mide su distancia en base a otro rectangulo.
 * 
 * @author  Hardoy - Harvey
 * @version 08/09/25
 */
public class Rectangulo
{
    // instance variables
    private Punto origen;
    private double ancho;
    private double alto;
    /** 
     * Constructor de la clase Rectangulo
     * 
     * @param   p_origen    punto(x,y) origen del rectangulo
     * @param   p_ancho     ancho del rectangulo
     * @param   p_alto      alto del rectangulo
     */
    public Rectangulo(Punto p_origen, double p_ancho, double p_alto)
    {
        this.setOrigen(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    
    /** 
     * Constructor de la clase Rectangulo
     * 
     * @param   p_ancho     ancho del rectangulo
     * @param   p_alto      alto del rectangulo
     */
    public Rectangulo(double p_ancho, double p_alto)
    {
        this.setOrigen(new Punto(0.0, 0.0));
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }

    //Setters
    private void setOrigen(Punto p_origen) {
        this.origen = p_origen;
    }
    private void setAncho(double p_ancho) {
        this.ancho = p_ancho;
    }
    private void setAlto(double p_alto) {
        this.alto = p_alto;
    }

    //Getters
    public Punto getOrigen() {
        return this.origen;
    }
    public double getAncho() {
        return this.ancho;
    }
    public double getAlto() {
        return this.alto;
    }

    /**
     * Metodo para desplazar el origen del rectangulo
     * 
     * @param   p_dx    a donde se desplaza x
     * @param   p_dy    a donde se desplaza y
     */
    public void desplazar(double p_dx, double p_dy) {
        this.getOrigen().desplazar(p_dx, p_dy);
    }
    
    /**
     * Metodo para calcular el perimetro del rectangulo
     * 
     * @return  devuelve el perimetro del rectangulo
     */
    public double perimetro(){
        return 2 * (this.getAncho() + this.getAlto());
    }
    
    /**
     * Metodo para calcular la superficie del rectangulo
     * 
     * @return  devuelve la superficie del rectangulo
     */
    public double superficie(){
        return 2 * (this.getAncho() + this.getAlto());
    }
    
    /**
     * Metodo para mostrar las caracteristicas del rectangulo
     */
    public void caracteristicas() {
        System.out.println("Origen: " + this.getOrigen().coordenadas() + " - Alto: " + this.getAlto() + " - Ancho: " + this.getAncho());
        System.out.println("Superficie: " + this.superficie() + " - Perímetro: " + this.perimetro());
    }
    
    /**
     * Metodo para calcular la distancia entre dos rectangulos en base a su origen
     * 
     * @param   otroRectangulo  otro rectangulo que se utiliza para calcular la distancia
     * @return  devuelve la distancia que hay entre el rectangulo y otro rectangulo
     */
    public double distanciaA(Rectangulo otroRectangulo){
        double pitagoras = Math.pow(this.getOrigen().getX() - otroRectangulo.getOrigen().getX(), 2) 
                     + Math.pow(this.getOrigen().getY() - otroRectangulo.getOrigen().getY(), 2);
        return Math.sqrt(pitagoras);
    }
    
    /**
     * Metodo para saber que rectangulo es mayor en base a la superficie
     * 
     * @param   otroRectangulo  otro rectangulo que se utiliza para calcular cual es mayor
     * @return  devuelve el objeto Rectangulo que es mayor en superficie
     */
    public Rectangulo elMayor(Rectangulo otroRectangulo){
        if(this.superficie() > otroRectangulo.superficie()){
            return this;
        }
        else{
            return otroRectangulo;
        }
    }
    
}