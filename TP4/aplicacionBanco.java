
/**
 * Clase ejecutable que nos permite instanciar las respectivos objetos de las clases y probar sus metodos.
 * 
 * @author      Hardoy - Harvey
 * @version     22/09/25
 */
public class aplicacionBanco
{
    public static void main(String[] args){
        Localidad localidadBanco = new Localidad("Mercedes", "Corrientes");
        Empleado primerEmpleado = new Empleado(1234, "Perez", "Juan", 815000, 2024);
        
        Banco unBanco = new Banco("Galicia", localidadBanco, 4, primerEmpleado);
        
        unBanco.listarSueldos();
        
        Empleado segundoEmpleado = new Empleado(5678, "Escalante", "Jose", 650000, 2025);
        Empleado tercerEmpleado = new Empleado(9876, "Mendiondo", "Luana", 1200000, 2018);
       
        unBanco.agregarEmpleado(segundoEmpleado);
        unBanco.agregarEmpleado(tercerEmpleado);
        
        unBanco.mostrar();
        
        unBanco.quitarEmpleado(primerEmpleado);
        
        unBanco.mostrar();
    }
}