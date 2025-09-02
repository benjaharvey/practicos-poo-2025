import java.util.*;
/**
 * Una clase para probar los metodos de la clase EmpleadoConJefe
 * 
 * @author Hardoy - Harvey 
 * @version 08/09/25
 */
public class Empresa
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el CUIL del empleado: ");
        long cuilEmpleado = teclado.nextLong();
        teclado.nextLine();
        System.out.println("Ingrese el Nombre del empleado: ");
        String nombreEmpleado = teclado.nextLine();
        System.out.println("Ingrese el Apellido del empleado");
        String apellidoEmpleado = teclado.nextLine();
        System.out.println("Ingrese el sueldo basico del empleado: $");
        double sueldoEmpleado = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Ingrese el dia de ingreso del empleado): ");
        int diaEmpleado = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el mes de ingreso del empleado): ");
        int mesEmpleado = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el anio de ingreso del empleado): ");
        int anioEmpleado = teclado.nextInt();
        teclado.nextLine();
        
        Calendar fechaIngresoEmpleado = new GregorianCalendar(diaEmpleado, mesEmpleado, anioEmpleado);
        
        System.out.println("Ingrese el CUIL del Jefe: ");
        long cuilJefe = teclado.nextLong();
        teclado.nextLine();
        System.out.println("Ingrese el Nombre del Jefe: ");
        String nombreJefe = teclado.nextLine();
        System.out.println("Ingrese el Apellido del Jefe");
        String apellidoJefe = teclado.nextLine();
        System.out.println("Ingrese el sueldo basico del Jefe: $");
        double sueldoJefe = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Ingrese el dia de ingreso del Jefe): ");
        int diaJefe = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el mes de ingreso del Jefe): ");
        int mesJefe = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el anio de ingreso del Jefe): ");
        int anioJefe = teclado.nextInt();
        teclado.nextLine();
        
        Calendar fechaIngresoJefe = new GregorianCalendar(diaJefe, mesJefe, anioJefe);
        EmpleadoConJefe unJefe = new EmpleadoConJefe(cuilJefe, apellidoJefe, nombreJefe, sueldoJefe, fechaIngresoJefe);
        
        EmpleadoConJefe unEmpleado = new EmpleadoConJefe(cuilEmpleado, apellidoEmpleado, nombreEmpleado, sueldoEmpleado, fechaIngresoEmpleado, unJefe);
        
        unEmpleado.mostrarPantalla();
        System.out.println(unEmpleado.autorizarSalida());
    }
}