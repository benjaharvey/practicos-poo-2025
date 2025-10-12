import java.util.*;
/**
 * Write a description of class Individuo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Individuo extends Visitante
{
    private Persona persona;
    
    private void setPersona(Persona p_persona){
        this.persona = p_persona;
    }
    
    public Persona getPersona(){
        return this.persona;
    }
    
    public Individuo(Calendar p_fecha, Persona p_persona){
        super(p_persona.getNombre(), p_fecha);
        this.setPersona(p_persona);
    }
    
    public String tipoVisitante(){
        return "Individuo";
    }
    
    public double entrada(){
        return 10;
    }
    
    public void mostrar(){
        this.getPersona().mostrar();
    }
    
    public void listarPorFecha(Calendar p_fecha, String p_visitante){
        if((this.getFechaVisita() == p_fecha) && (this.tipoVisitante() == p_visitante)){
            this.mostrar();
        }
    }
    
    public HashSet <Persona> listarPersonas(){
        HashSet<Persona> lista = new HashSet<>();
        lista.add(this.persona);
        return lista;
        
    }
}