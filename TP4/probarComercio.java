import java.util.*;
/**
 * Clase que nos permite instanciar un objeto Comercio, para asi probar que sus metodos funcionen de la forma esperada.
 * 
 * @author      Hardoy - Harvey 
 * @version     22/9/25
 */
public class probarComercio
{
    public static void main(String[] args){
        Empleado emplea1 = new Empleado(12345, "Harvey", "Benjamin", 500000, 2005);
        Empleado emplea2 = new Empleado(99831, "Navarro", "Juan Manuel", 400000, 2010);
        Empleado emplea3 = new Empleado(54213, "Hardoy", "Juan Segundo", 700000, 2012);
        
        Comercio nuevoComercio = new Comercio("Avanti SRL");
        
        nuevoComercio.altaEmpleado(emplea1);
        nuevoComercio.altaEmpleado(emplea2);
        nuevoComercio.altaEmpleado(emplea3);
        
        nuevoComercio.nomina();
        
        Empleado emplea4 = new Empleado(54223, "Cesar", "Cayo Julio", 745000, 2005);
        Empleado emplea5 = new Empleado(54223, "Magno", "Alejandro", 960100, 2022);
        
        nuevoComercio.altaEmpleado(emplea4);
        nuevoComercio.altaEmpleado(emplea5);
        
        nuevoComercio.nomina();
        
        System.out.println("Cantidad de empleados: " + nuevoComercio.cantidadDeEmpleados());
        System.out.println("El CUIL 12345 es empleado?: " + nuevoComercio.esEmpleado(12345));
        System.out.println("quien es el CUIL 12345?: " + nuevoComercio.buscarEmpleado(12345).apeYnom());
    }
}