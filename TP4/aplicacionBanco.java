import java.util.Scanner;
/**
 * Clase ejecutable que nos permite instanciar las respectivos objetos de las clases y probar sus metodos.
 * 
 * @author      Hardoy - Harvey
 * @version     22/09/25
 */
public class aplicacionBanco
{
    public static void main(String[] args){        
        Scanner ingreso = new Scanner(System.in);
        int opcion;
        
        Empleado nuevoEmp = null;
        
        Banco banco = null;

        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Crear Banco");
            System.out.println("2. Agregar empleado a Banco");
            System.out.println("3. Quitar empleado a Banco");
            System.out.println("4. Mostrar datos del Banco");
            System.out.println("5. Listar sueldo de los empleados del Banco");
            System.out.println("0. Salir");
            System.out.println("Seleccione una opción: ");

            opcion = ingreso.nextInt();

            switch (opcion) {
                case 1:
                    ingreso.nextLine();
                    System.out.println("Ingrese el nombre del banco: ");
                    String nombreBanco = ingreso.nextLine();
                    System.out.println("Ingrese la localidad del banco: ");
                    String localidad = ingreso.nextLine();
                    System.out.println("Ingrese la provincia del banco: ");
                    String provincia = ingreso.nextLine();
                    System.out.println("Ingrese el nro de sucursal del banco: ");
                    int nroSucursal = ingreso.nextInt();
                    ingreso.nextLine();
                    
                    System.out.println("Ingrese el CUIL del gerente: ");
                    long cuil = ingreso.nextLong();
                    ingreso.nextLine();
                    System.out.println("Ingrese el apellido del gerente: ");
                    String apellido = ingreso.nextLine();
                    System.out.println("Ingrese el nombre del gerente: ");
                    String nombre = ingreso.nextLine();
                    System.out.println("Ingrese el sueldo basico que cobra el gerente: ");
                    double importe = ingreso.nextDouble();
                    ingreso.nextLine();
                    System.out.println("Ingrese el anio de ingreso del gerente: ");
                    int anioIngreso = ingreso.nextInt();
                    ingreso.nextLine();
                    
                    Localidad locBanco = new Localidad(localidad, provincia);
                    
                    Empleado gerente = new Empleado(cuil, apellido, nombre, importe, anioIngreso);
                    
                    banco = new Banco(nombreBanco, locBanco, nroSucursal, gerente);
                    
                    break;
                case 2:
                    if (banco == null){
                        System.out.println("ERROR: Primero debe crear un banco (opción 1)");
                    break;
                    }
                    
                    System.out.println("Ingrese el CUIL del empleado: ");
                    cuil = ingreso.nextLong();
                    ingreso.nextLine();
                    
                    System.out.println("Ingrese el apellido del empleado: ");
                    apellido = ingreso.nextLine();
                    
                    System.out.println("Ingrese el nombre del empleado: ");
                    nombre = ingreso.nextLine();
                    
                    System.out.println("Ingrese el sueldo basico que cobra el empleado: ");
                    importe = ingreso.nextDouble();
                    ingreso.nextLine();
                    
                    System.out.println("Ingrese el anio de ingreso del empleado: ");
                    anioIngreso = ingreso.nextInt();
                    ingreso.nextLine();
                    
                    nuevoEmp = new Empleado(cuil, apellido, nombre, importe, anioIngreso);
                    banco.agregarEmpleado(nuevoEmp);
                    
                    break;
                case 3:
                    if (banco == null){
                        System.out.println("ERROR: Primero debe crear un banco (opción 1)");
                    break;
                    }
                     
                    System.out.println("Ingrese la posicion del empleado a eliminar: ");
                    int posicion = ingreso.nextInt();
                    ingreso.nextLine();
                    
                    if(banco.quitarEmpleado(banco.buscarEmpleado(posicion))){
                        System.out.println("Empleado eliminado del banco");
                    }
                    else{
                        System.out.println("No se puede eliminar al empleado"); 
                    }
                    
                    break;
                case 4:
                    if (banco == null){
                        System.out.println("ERROR: Primero debe crear un banco (opción 1)");
                    break;
                    }
                    
                    banco.mostrar();
                    break;
                case 5:
                    if (banco == null){
                        System.out.println("ERROR: Primero debe crear un banco (opción 1)");
                    break;
                    }
                    
                    banco.listarSueldos();
                    
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