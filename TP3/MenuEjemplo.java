import java.util.Scanner;
import java.util.*;
/**
 * Esta clase nos permite instanciar la clase Empleado, haciendo las operaciones a traves de un menu visual básico
 * 
 * @author      Hardoy - Harvey 
 * @version     8/9/2025
 */

public class MenuEjemplo {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int opcion;
        
        Empleado nuevoEmpleado = null;

        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Crear Empleado");
            System.out.println("2. Mostrar Empleado");
            System.out.println("3. Puede salir antes?");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = ingreso.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el CUIL del empleado: ");
                    long cuil = ingreso.nextLong();
                    ingreso.nextLine();
                    
                    System.out.println("Ingrese el nombre del empleado: ");
                    String nombre = ingreso.nextLine();
                    
                    System.out.println("Ingrese el apellido del empleado: ");
                    String apellido = ingreso.nextLine();
                    
                    System.out.println("Ingrese el sueldo basico que cobra el empleado: ");
                    double importe = ingreso.nextDouble();
                    ingreso.nextLine();
                    
                    System.out.println("Ingrese la fecha de ingreso del empleado (el mes debe ser ingresado con un numero del 1 al 12): ");
                    
                    System.out.print("Año: ");
                    int anioIngreso = ingreso.nextInt();
                    
                    System.out.print("Mes: ");
                    int mesIngreso = ingreso.nextInt();
                    
                    System.out.print("Dia: ");
                    int diaIngreso = ingreso.nextInt();
                    
                    Calendar fechaIngreso = new GregorianCalendar(anioIngreso, mesIngreso-1, diaIngreso);
                    
                    nuevoEmpleado = new Empleado(cuil, apellido, nombre, importe, fechaIngreso);
                    
                    break;
                case 2:
                    if (nuevoEmpleado != null) {
                        System.out.println("***- DATOS DEL EMPLEADO -***");
                        nuevoEmpleado.mostrarPantalla();
                    } else {
                        System.out.println("ERROR, todavia no se instanció ningun empleado");
                    }
                    break;
                case 3:
                    System.out.println("Es hoy su aniversario en la empresa?: " + (nuevoEmpleado.esAniversario() ? "Sí, puede salir 1 hora antes!" : "No :("));
                    break;
                case 0:
                    System.out.println("Gracias por usar nuestro programa :)");
                    break;
                default:
                    System.out.println("ERROR, ingrese nuevamente");
            }
        } while (opcion != 0);

        ingreso.close();
    }
}
