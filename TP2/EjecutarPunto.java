import java.util.Scanner;

public class EjecutarPunto
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese una posicion para la absica X: ");
        int x = teclado.nextInt();
        System.out.print("Ingrese una posicion para la ordenada Y: ");
        int y = teclado.nextInt();
    
        Punto unPunto = new Punto(x, y);
        System.out.println("Coordenadas: " + unPunto.coordenadas());
        
        System.out.print("Ingrese una posicion para desplazar a X: ");
        int des_x = teclado.nextInt();
        System.out.print("Ingrese una posicion para desplazar a Y: ");
        int des_y = teclado.nextInt();
        unPunto.desplazar(des_x, des_y);
        unPunto.mostrar();
        
    }
}