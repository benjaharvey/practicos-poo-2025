import java.util.*;

/**
 * Clase probarEmpleado, que permite instanciar y probar los metodos del objeto Empleado
 * 
 * @author      Hardoy - Harvey 
 * @version     20/10/25
 */
public class probarEmpleado
{
    public static void main(String [] args){
        Calendar fechaNacimiento = new GregorianCalendar(2003, 11, 26);
        
        Empleado nuevoEmpleado = new Empleado(2045526737, "Harvey", "Benjamin", 500000, 2010, 45526737, fechaNacimiento);
        
        nuevoEmpleado.mostrarPantalla();
    }
}