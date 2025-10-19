
/**
 * Clase probarCirculo, que permite instanciar y probar los metodos del objeto Circulo
 * 
 * @author          Hardoy - Harvey 
 * @version         20/10/25
 */
public class probarCirculo
{
    public static void main(String[] args){
        Punto punto1 = new Punto(33.25, 68.88);
        
        Elipse elipse1 = new Elipse(20.65, 10.40, punto1);
        
        Punto punto2 = new Punto(45.5, 12);
        
        Circulo circulo1 = new Circulo(50, punto2);
        
        System.out.println("Distancia entre elipse y circulo: " + elipse1.distanciaA(circulo1));
        
        circulo1.desplazar(20.65, 10.40);
        
        System.out.println("Distancia entre elipse y circulo: " + elipse1.distanciaA(circulo1));
        
        circulo1.superficie();
    }
}