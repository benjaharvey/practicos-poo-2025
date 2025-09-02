import java.util.Random;
/**
 * Una clase que nos permite probar los metodos que definimos en la clase Circulo.
 * 
 * @author      Hardoy - Harvey 
 * @version     8/9/25
 */
public class CreaFiguraCirculo
{
    public static void main(String[] args){
        Random unNumero = new Random();
        double radio = unNumero.nextDouble() * 100.0;
        
        double radio2 = unNumero.nextDouble() * 100.0;
        
        Circulo nuevoCirculo = new Circulo(radio, new Punto(0, 0));
        
        nuevoCirculo.desplazar(-240, -230);
        
        nuevoCirculo.caracteristicas();
        
        Circulo otroCirculo = new Circulo(radio2, new Punto(5.2, 0.5));
        
        otroCirculo.caracteristicas();
        
        System.out.println("Cual es el mayor de los circulos: ");
        nuevoCirculo.elMayor(otroCirculo).caracteristicas();
        
        System.out.println("Distancia entre los 2 circulos: " + nuevoCirculo.distanciaA(otroCirculo));
        
        
    }
}