
public class EjecutarAlumno
{
    public static void main(String[] args){
        int lu = Integer.valueOf(args[0]);
        String nombre = String.valueOf(args[1]);
        String apellido = String.valueOf(args[2]);
        Alumno unAlumno = new Alumno(lu, nombre, apellido);
        double nota1 = Double.valueOf(args[3]);
        double nota2 = Double.valueOf(args[4]);
        unAlumno.setNota1(nota1);
        unAlumno.setNota2(nota2);
        unAlumno.mostrar();
        
    }
}