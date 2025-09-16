import java.util.Scanner;
import java.util.*;
/**
 * Una clase
 * 
 * @author Hardoy - Harvey 
 * @version 
 */
public class Carrera
{
    public static void main(String[] args){
        Curso curso = new Curso("Matematica");
        
        Alumno unAlumno = new Alumno(123, "Juan", "Perez");
        Alumno otroAlumno = new Alumno(456, "Bauti", "Baez");
        Alumno tercerAlumno = new Alumno(789, "Maria", "Velez");
        
        unAlumno.setNota1(5);
        unAlumno.setNota2(7);
        
        otroAlumno.setNota1(6);
        otroAlumno.setNota2(8);
        
        tercerAlumno.setNota1(8);
        tercerAlumno.setNota2(10);
        
        curso.agregarAlumno(unAlumno);
        curso.agregarAlumno(otroAlumno);
        curso.agregarAlumno(tercerAlumno);
        
        System.out.println("\n\n****--Cantidad de inscriptos: " + curso.cantidadDeAlumnos());
        curso.mostrarInscriptos();
        curso.quitarAlumno(123);
        System.out.println("\n****-- Se da de baja a Juan porque abandona el curso --****");
        System.out.println("Está Juan Perez inscripto ?? --> " + curso.estaInscripto(123));
        
        System.out.println("\n****--Cantidad de inscriptos: " + curso.cantidadDeAlumnos());
        curso.mostrarInscriptos();
        
        System.out.println("\n****-- Busca y muestra el alumno con numero de libreta 789 --**** ");
        curso.buscarAlumno(789).mostrar();
        
        System.out.println("\n****-- Mostrar promedio del alumno 456 --****");
        curso.imprimirPromedioDelAlumno(456);
    }
}