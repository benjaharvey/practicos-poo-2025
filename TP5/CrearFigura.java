
/**
 * Una clase ejecutable para instanciar las clases Rectangulo y Cuadrado
 * 
 * @author Hardoy - Harvey 
 * @version 
 */
public class CrearFigura
{
    public static void main(String[] args){
        Punto unPunto = new Punto(5.0, 3.0);
        
        Rectangulo unRec = new Rectangulo(unPunto, 3.6, 7.1);
        
        Cuadrado unCuad = new Cuadrado(unPunto, 5.1);
        
        unRec.caracteristicas();
        unCuad.caracteristicas();
    }
}