import java.util.*;
/**
 * Write a description of class Zoologico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zoologico
{
    private String nombre;
    private HashSet <Visitante> visitantes;
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setVisitantes(HashSet <Visitante> p_visitantes){
        this.visitantes = p_visitantes;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public HashSet <Visitante> getVisitantes(){
        return this.visitantes;
    }
    
    public Zoologico(String p_nombre){
        this.setNombre(p_nombre);
        this.setVisitantes(new HashSet <>());
    }
    
    public void nuevoVisitante(Visitante p_visitante){
        this.getVisitantes().add(p_visitante);
    }
    
    public boolean quitarVisitante(Visitante p_visitante){
        return this.getVisitantes().remove(p_visitante);
    }
    
    public void listarTipoVisitantePorFecha(Calendar p_fecha, String p_tipoVisitante){
        System.out.println("Visitantes del tipo: " + p_tipoVisitante + "En la fecha: " + p_fecha.getTime());
        
        for(Visitante p_visitante : this.getVisitantes()){
            p_visitante.listarPorFecha(p_fecha, p_tipoVisitante);
        }
    }
    
    public void listarVisitantePorFecha(Calendar p_fecha){
        System.out.println("Visitantes en la fecha: " + p_fecha.getTime());
        
        for(Visitante p_visitante : this.getVisitantes()){
            p_visitante.listarPorFecha(p_fecha, "-");
        }
    }
    
    public double recaudacion(Calendar p_fechaDesde, Calendar p_fechaHasr){
        return 0;
    }
    
    public HashSet <Persona> listarPersonasQueVisitaronElZoo(){
        
    }
}