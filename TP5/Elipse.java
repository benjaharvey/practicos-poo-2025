
/**
 * Una clase Elipse, que nos permitira instanciar un objeto Elipse, asignarle tamaño, calcular su superficie, mostrar sus caracteristicas etc.
 * 
 * @author      Hardoy - Harvey
 * @version     20/10/25
 */
public class Elipse extends FiguraGeometrica
{
    private double sEjeMenor;
    private double sEjeMayor;
    private Punto centro;
    
    /**
     * Constructor de la clase Elipse
     * 
     * @param   p_ejeMenor      Eje menor de la elipse
     * @param   p_ejeMayor      Eje mayor de la elipse
     * @param   p_centro        Centro de la  elipse
     */
    
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
    
    /**
     * Metodo que retornara si el objeto instanciado es una elipse o un circulo
     * 
     * @return  Si el eje mayor es igual al eje menor, retornara circulo, caso contrario retornara elipse
     */
    
    public String nombreFigura(){
        if(this.getEjeMayor() == this.getEjeMenor()){
            return "CIRCULO";
        } else {
            return "ELIPSE";
        }
    }
    
    /**
     * Metodo que imprimira las caracteristicas del objeto
     */
    
    public void caracteristicas(){
        System.out.println("***** " + this.nombreFigura() + " *****");
        
        System.out.println("Centro: (" + this.getCentro() + ") - Semieje Mayor: " + this.getEjeMayor() + "- Semieje Menor: " + this.getEjeMenor());
        
        System.out.println("Superficie: " + superficie());
    }
    
    /**
     * Metodo que calculara la superficie de la elipse
     * 
     * @return  Superficie de la elipse
     */
    
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