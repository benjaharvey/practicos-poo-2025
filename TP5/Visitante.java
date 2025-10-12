import java.util.*;

/**
 * Write a description of class Visitante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Visitante
{
    private String nombre;
    private Calendar fechaVisita;
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setFechaVisita(Calendar p_fecha){
        this.fechaVisita = p_fecha;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public Calendar getFechaVisita(){
        return this.fechaVisita;
    }
    
    public Visitante(String p_nombre, Calendar p_fecha){
        this.setNombre(p_nombre);
        this.setFechaVisita(p_fecha);
    }
    
    public abstract void mostrar();
    public abstract double entrada();
    public abstract void listarPorFecha(Calendar p_fecha, String p_visitante);
    public abstract String tipoVisitante();
    public abstract HashSet <Persona> listarPersonas();
}