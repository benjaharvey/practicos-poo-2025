import java.util.*;

/**
 * Write a description of class probarEmpleado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class probarEmpleado
{
    public static void main(String [] args){
        Calendar fechaNacimiento = new GregorianCalendar(2003, 11, 26);
        
        Empleado nuevoEmpleado = new Empleado(2045526737, "Harvey", "Benjamin", 500000, 2010, 45526737, fechaNacimiento);
        
        nuevoEmpleado.mostrarPantalla();
    }
}