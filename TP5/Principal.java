
/**
 * Clase que nos permite instanciar la clase Zoologico y probar sus metodos
 * 
 * @author      Hardoy - Harvey 
 * @version     20/10/25
 */
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        
        Zoologico zoo = new Zoologico("El Caribú");

        Calendar fechaVisita = Calendar.getInstance();
        fechaVisita.set(2024, Calendar.SEPTEMBER, 22);

        Persona p1 = new Persona(14528796, "María", "Perez", 56);
        Persona p2 = new Persona(24875785, "Carlos", "López" , 47);
        Persona p3 = new Persona(27875002, "Juan", "Perez" , 45);

        Individuo ind1 = new Individuo(fechaVisita ,p1); 
        Individuo ind2 = new Individuo(fechaVisita, p2); 
        Individuo ind3 = new Individuo(fechaVisita ,p3); 

        Delegacion pami = new Delegacion(fechaVisita, "PAMI");
        pami.inscribirIndividuo(ind2);
        pami.inscribirIndividuo(ind3);

        zoo.nuevoVisitante(ind1); 
        zoo.nuevoVisitante(pami); 

        System.out.println("--------------------------------------");
        System.out.println("VISITANTES DEL 22/09/2024");
        System.out.println("-------------------------------------");
        zoo.listarVisitantePorFecha(fechaVisita);

        System.out.println("\n-------------------------------------");
        System.out.println("DELEGACIONES DEL 22/09/2024");
        System.out.println("-------------------------------------");
        zoo.listarTipoVisitantePorFecha(fechaVisita, "Delegacion");

        System.out.println("\n-------------------------------------");
        System.out.println("RECAUDACIÓN DEL ÚLTIMO MES");
        System.out.println("-------------------------------------");
        Calendar desde = Calendar.getInstance();
        desde.set(2024, Calendar.SEPTEMBER, 1);
        Calendar hasta = Calendar.getInstance();
        hasta.set(2024, Calendar.SEPTEMBER, 30);
        System.out.println("Total recaudado: $" + zoo.recaudacion(desde, hasta));

        System.out.println("\n-------------------------------------");
        System.out.println("PERSONAS QUE VISITARON EL ZOO");
        System.out.println("-------------------------------------");
        
        for (Persona p : zoo.listarPersonasQueVisitaronElZoo()) {
            p.mostrar();
        }
    }
}