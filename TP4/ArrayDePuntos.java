import java.util.Scanner;
/**
 * Una clase ejecutable que crea un array de puntos, muestra sus coordenadas y compara sus distancias.
 * 
 * @author  Hardoy - Harvey
 * @
 */
public class ArrayDePuntos
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Punto[] unPunto = new Punto[6];
        
        for(int i = 0; i < unPunto.length; i++){
            System.out.println("Ingrese el valor de x: ");
            int x = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Ingrese el valor de y: ");
            int y = teclado.nextInt();
            
            unPunto[i] = new Punto(x, y);
        }
        
        for(Punto punto: unPunto){
            System.out.println(punto.coordenadas());
        }
        
        for(int i = 0; i < (unPunto.length - 1); i++){
            System.out.println("Distancia entre punto " + (i+1) + " y punto " + (i+2) + ": " + unPunto[i].distanciaA(unPunto[i+1]));
        }
    }
}