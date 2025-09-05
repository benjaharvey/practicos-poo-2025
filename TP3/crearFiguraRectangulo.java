import java.util.Scanner;
/**
 * Una clase que utilizamos para instanciar el objeto Rectangulo y probar sus metodos
 */
public class crearFiguraRectangulo
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        double ancho = Math.random();
        double alto = Math.random();
        Rectangulo unRectangulo = new Rectangulo(alto, ancho);
        unRectangulo.desplazar(40, -20);
        unRectangulo.caracteristicas();
        
        System.out.print("Ingrese un valor de X: ");
        double x = teclado.nextDouble();
        System.out.print("Ingrese un valor de Y: ");
        double y = teclado.nextDouble();
        Punto unPunto = new Punto(x, y);
        
        ancho = Math.random();
        alto = Math.random();
        Rectangulo otroRectangulo = new Rectangulo(unPunto, alto, ancho);
        
        unRectangulo.elMayor(otroRectangulo).caracteristicas();
        System.out.println("Distancia entre un rectangulo y otro: " + unRectangulo.distanciaA(otroRectangulo));

    }
}