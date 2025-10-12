import java.util.*;
/**
 * Write a description of class Delegacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Delegacion extends Visitante{
    
    private HashSet <Individuo> integrantes;
    
    public Delegacion(Calendar p_fecha, String p_nombre){
        super(p_nombre, p_fecha);
        this.setIntegrantes(new HashSet<>());
    }
    
    private void setIntegrantes(HashSet <Individuo> p_integrantes){
        this.integrantes = p_integrantes;
    }
    
    public HashSet <Individuo> getIntegrantes(){
        return this.integrantes;
    }
    
    public String tipoVisitante(){
        return "Delegacion";
    }
    
    public void inscribirIndividuo(Individuo p_individuo){
        this.getIntegrantes().add(p_individuo);
    }
    
    public boolean quitarIntegrante(Individuo p_individuo){
        return this.getIntegrantes().remove(p_individuo);
    }
    
    public int cantidadIntegrantes(){
        return this.getIntegrantes().size();
    }
    
    public double entrada() {
        double total = 0;
            for (Individuo i : this.getIntegrantes()) {
                total += i.entrada();
            }
            
        return total * 0.9;
    }
    
    public void mostrar() {
        System.out.println("-------------------------------------------------------------");
        System.out.println("Delegación: " + this.getNombre());
        System.out.println("Integrantes:");
        for (Individuo i : this.getIntegrantes()) {
            i.mostrar();
        }
        System.out.println("Cantidad de Integrantes: " + this.cantidadIntegrantes());
        System.out.println("-------------------------------------------------------------");
    }
    
    public void listarPorFecha(Calendar p_fecha, String p_visitante) {
        if (this.getFechaVisita().equals(p_fecha) && this.tipoVisitante().equals(p_visitante)) {
            this.mostrar();
        }
    }

    public HashSet<Persona> listarPersonas() {
        HashSet<Persona> personas = new HashSet<>();
        for (Individuo i : this.getIntegrantes()) {
            personas.addAll(i.listarPersonas());
        }
        return personas;
    }
}