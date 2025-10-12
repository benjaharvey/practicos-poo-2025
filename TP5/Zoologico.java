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
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public Zoologico(String p_nombre){
        this.setNombre(p_nombre);
    }
    
    public void nuevoVisitante(Visitante p_visitante){
        
    }
    
    public boolean quitarVisitante(Visitante p_visitante){
        return true;
    }
    
    public void listarTipoVisitantePorFecha(Calendar p_fecha, String p_tipoVisitante){
        
    }
    
    public void listarVisitantePorFecha(Calendar p_fecha){
        
    }
    
    public double recaudacion(Calendar p_fechaDesde, Calendar p_fechaHasr){
        return 0;
    }
    
    public HashSet <Persona> listarPersonasQueVisitaronElZoo(){
        return ;
    }
}