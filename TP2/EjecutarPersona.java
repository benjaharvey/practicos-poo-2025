
public class EjecutarPersona
{
    public static void main(String[] args){
        Persona unaPersona = new Persona(42994518, "Segundo", "Hardoy", 2000);
        System.out.println("Probando getter del nombre: " + unaPersona.getNombre());
        System.out.println("Edad: " + unaPersona.edad());
        System.out.println("Nombre y apellido: " + unaPersona.nomYApe());
        System.out.println("Apellido y nombre: " + unaPersona.apeYNom());
        unaPersona.mostrar();
        Persona otraPersona = new Persona(389231, "Victoria", "Ortiz", 2004);
        System.out.println("Edad: " + otraPersona.edad());
        System.out.println("Nombre y apellido: " + otraPersona.nomYApe());
        System.out.println("Apellido y nombre: " + otraPersona.apeYNom());
        otraPersona.mostrar();
    }
}