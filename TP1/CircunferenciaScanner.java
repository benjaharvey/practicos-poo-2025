import java.util.Scanner;
public class CircunferenciaScanner
{
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escriba el radio a calcular(0 para salir): ");
        int radio = teclado.nextInt();
        while(radio != 0){
            System.out.println("Perimetro de la circ.: " + calcularPerimetro(radio));
            
            System.out.print("Ingresa el siguiente radio a calcular: ");
            radio = teclado.nextInt();
        }
    }
    public static int calcularPerimetro(int p_radio) {
        return (int) (2 * Math.PI * p_radio);
    }
}