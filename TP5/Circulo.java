
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
    
    
    /**
     * Constructor de la clase Circulo
     * 
     * @param   pRadio      Radio del circulo
     * @param   pCentro     Punto central del circulo
     */
    public Circulo(double pRadio, Punto pCentro){
        super(pRadio, pRadio, pCentro);
    }
    
    /**
     * Metodo que retorna el nombre de la figura, en este caso Circulo
     * 
     * @return  String
     */
    public String nombreFigura(){
        return "CIRCULO";
    }
    
}