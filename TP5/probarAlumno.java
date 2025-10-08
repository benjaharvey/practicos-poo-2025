
/**
 * Write a description of class probarAlumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class probarAlumno
{
    public static void main(String[] args){
        
        Alumno nuevoAlumno = new Alumno(123, "Harvey", "Benjamin", 45526737, 2003);
        
        nuevoAlumno.setNota1(8);
        nuevoAlumno.setNota2(5);
        
        nuevoAlumno.mostrar();  
    }
}