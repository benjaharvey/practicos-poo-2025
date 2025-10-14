import java.util.*;

/**
 * Clase abstracta Visitante, que sera utilizada como "Molde" para que las clases Individuo y Delegacion trabajen sobre ella
 * 
 * @author      Hardoy - Harvey 
 * @version     20/10/25
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
    
    /**
     * Metodo constructor de la clase Visitante
     * 
     * @param   p_fecha     Fecha en la que visito el zoologico
     * @param   p_nombre    Nombre del visitante
     */
    
    
    public Visitante(String p_nombre, Calendar p_fecha){
        this.setNombre(p_nombre);
        this.setFechaVisita(p_fecha);
    }
    
    /**
     * Metodos abstractos que deberan ser definidos en las clases Individuo y Delegaci+on
     */
    
    public abstract void mostrar();
    public abstract double entrada();
    public abstract void listarPorFecha(Calendar p_fecha, String p_visitante);
    public abstract String tipoVisitante();
    public abstract HashSet <Persona> listarPersonas();
}