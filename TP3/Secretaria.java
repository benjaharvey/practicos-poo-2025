import java.util.Scanner;
/**
 * Una clase que utilizamos para instanciar los objetos Escuela y Docente, para luego probar sus metodos
 */
public class Secretaria
{
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        
        System.out.print("Ingrese el nombre de la escuela: ");
        String nombre = teclado.nextLine();
        System.out.print("Ingrese el domicilio de la escuela: ");
        String domicilio = teclado.nextLine();
        System.out.print("Ingrese el director de la escuela: ");
        String director = teclado.nextLine();
        
        Escuela unaEscuela = new Escuela(nombre, domicilio, director);
        
        System.out.print("Ingrese el nombre del docente: ");
        String nombreDocente = teclado.nextLine();
        System.out.print("Ingrese el grado del docente: ");
        String grado = teclado.nextLine();
        System.out.print("Ingrese el sueldo base del docente: ");
        double sueldoBasico = teclado.nextDouble();
        System.out.print("Ingrese la asignacion familiar del docente: ");
        double asignacionFamiliar = teclado.nextDouble();
        
        Docente unDocente = new Docente(nombreDocente, grado, sueldoBasico, asignacionFamiliar);
        
        unaEscuela.imprimirRecibo(unDocente);
    }
}