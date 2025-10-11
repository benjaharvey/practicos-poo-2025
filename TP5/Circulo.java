
/**
 * Una clase Circulo que nos permite crear un circulo, calcular la distancia que existe entre 2 circulos y determinar cual de los 2 circulos es el mayor
 * 
 * @author      Hardoy - Harvey
 * @version     8/9/25
 */
public class Circulo extends Elipse
{
    private double radio;
    
    private Punto centro;
    
    public Circulo(Punto pCentro, double pRadio){
        super(pCentro, pRadio, pRadio);
    }
    
    
    
    public String nombreFigura(){
        return "CIRCULO";
    }
    
}