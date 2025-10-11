
/**
 * Una clase Administracion que implementa jardin y las demas clases
 * 
 * @author      Hardoy - Harvey
 * @version     20/10/2025
 */
public class Administracion
{
    public static void main(String[] args){
        Punto punto = new Punto(2, 2);
        
        FiguraGeometrica cuadrado = new Cuadrado(punto, 8);
        FiguraGeometrica triangulo = new Triangulo(punto, 4, 5);
        FiguraGeometrica circulo = new Circulo(punto, 7);
        FiguraGeometrica elipse = new Elipse(punto, 6, 3);
        
        Jardin jardin = new Jardin("Bichito de Luz");
        jardin.agregarFigura(cuadrado);
        jardin.agregarFigura(triangulo);
        jardin.agregarFigura(circulo);
        jardin.agregarFigura(elipse);
        
        jardin.detalleFiguras();
    }
}