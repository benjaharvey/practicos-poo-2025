import java.util.Scanner;
/**
 * Una clase ejecutable que instancia objetos Paciente, Hospital y Localidad para luego utilizar sus metodos
 * 
 * @author  Hardoy - Harvey
 * @version 08/09/25
 */
public class GestionHospital
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        
        System.out.println("Ingrese la localidad de nacimiento del paciente: ");
        String nombreNacido = teclado.nextLine();
        System.out.println("Ingrese la provincia de nacimiento del paciente: ");
        String provinciaNacido = teclado.nextLine();
        
        Localidad localidadNacido = new Localidad(nombreNacido, provinciaNacido);
        
        System.out.println("Ingrese la localidad actual del paciente: ");
        String nombreVive = teclado.nextLine();
        System.out.println("Ingrese la provincia actual del paciente: ");
        String provinciaVive = teclado.nextLine();
        
        Localidad localidadVive = new Localidad(nombreVive, provinciaVive);
        
        System.out.println("Ingrese el id del historial clinico del paciente: ");
        int historiaPaciente = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el nombre y apellido del paciente: ");
        String nombrePaciente = teclado.nextLine();
        System.out.println("Ingrese el domicilio del paciente: ");
        String domicilioPaciente = teclado.nextLine();
        
        Paciente unPaciente = new Paciente(historiaPaciente, nombrePaciente, domicilioPaciente, localidadNacido, localidadVive);
        
        System.out.println("Ingrese el nombre del Hospital: ");
        String nombreHospital = teclado.nextLine();
        System.out.println("Ingrese el nombre del director del Hospital: ");
        String directorHospital = teclado.nextLine();
        
        Hospital unHospital = new Hospital(nombreHospital, directorHospital, unPaciente);
        
        unHospital.consultarDatosFiliatorios(unPaciente);
        
    }
}