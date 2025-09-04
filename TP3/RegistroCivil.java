import java.util.Scanner;
/**
 * Un clase ejecutable RegistroCivil para instanciar los objetos Hombre y Mujer, para luego probar sus metodos
 * 
 * @author  Hardoy - Harvey
 * @version 08/09/25
 */
public class RegistroCivil
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la mujer: ");
        String nombreMujer = teclado.nextLine();
        System.out.println("Ingrese el apellido de la mujer: ");
        String apellidoMujer = teclado.nextLine();
        System.out.println("Ingrese la edad de la mujer: ");
        int edadMujer = teclado.nextInt();
        Mujer unaMujer = new Mujer(nombreMujer, apellidoMujer, edadMujer);
        
        teclado.nextLine();
        System.out.println("Ingrese el nombre del hombre: ");
        String nombreHombre = teclado.nextLine();
        System.out.println("Ingrese el apellido del hombre: ");
        String apellidoHombre = teclado.nextLine();
        System.out.println("Ingrese la edad del hombre: ");
        int edadHombre = teclado.nextInt();
        Hombre unHombre = new Hombre(nombreHombre, apellidoHombre, edadHombre);
        
        unaMujer.mostrarEstadoCivil();
        unHombre.mostrarEstadoCivil();
        
        unaMujer.casarseCon(unHombre);
        
        unaMujer.casadaCon();
        unHombre.casadoCon();
        
        unHombre.divorcio();
        
        unaMujer.mostrarEstadoCivil();
        unHombre.mostrarEstadoCivil();
        
    }
}