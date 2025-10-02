
/**
 * Una clase ejecutable Escuela para instanciar Personas y Alumnos.
 * 
 * @author  Hardoy - Harvey
 * @version 
 */
public class Escuela
{
    public static void main(String[] args){
        Persona unaPersona = new Persona(123, "Juan", "Perez", 2003);
        
        Alumno unAlumno = new Alumno(111, "Pedro", "Gonzalez", 456, 2001);
        Alumno otroAlumno = new Alumno(222, "Matias", "Almada", 789, 1998);
        
        unAlumno.setNotaUno(10);
        unAlumno.setNotaDos(7);
        
        unaPersona.mostrar();
        unAlumno.mostrar();
        otroAlumno.mostrar();
    }
}