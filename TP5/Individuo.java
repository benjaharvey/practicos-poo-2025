import java.util.*;
/**
 * Una clase Individuo, que nos permitira definir las operaciones necesarias para luego trabajar con la clase Zoologico
 * 
 * @author      Hardoy - Harvey
 * @version     20/10/25
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
    
    /**
     * Metodo constructor de la clase Individuo
     * 
     * @param   p_fecha     Fecha en la que el individuo visitara el zoologico
     * @param   p_persona   Instancia de la clase Persona, que contendra los datos del individuo que visita el zoologico
     */
    
    public Individuo(Calendar p_fecha, Persona p_persona){
        super(p_persona.getNombre(), p_fecha);
        this.setPersona(p_persona);
    }
    
    /**
     * Metodo que devuelve que tipo de visitante ingreso al zoologico
     * 
     * @return  Devuelve el tipo de visitante que ingreso al zoologico, en este caso un individuo
     */
    
    
    public String tipoVisitante(){
        return "Individuo";
    }
    
    /**
     * Metodo que devuelve el costo de la entrada al zoologico
     * 
     * @return  Costo de la entrada al zoologico
     */
    
    public double entrada(){
        return 10;
    }
    
    /**
     * Metodo que muestra los datos del individuo
     */
    
    public void mostrar(){
        this.getPersona().mostrar();
    }
    
    /**
     * Metodo que listara los individuos que visitaron el zoologico en una fecha determinada
     * 
     * @param   p_fecha         Fecha en la cual se desea saber que individuos visitaron el zoologico
     * @param   p_visitante     Tipo de visitante, en este caso individuo
     */
    
    public void listarPorFecha(Calendar p_fecha, String p_visitante){
        if((this.getFechaVisita() == p_fecha) && (this.tipoVisitante() == p_visitante)){
            this.mostrar();
        }
    }
    
    /**
     * Metodo que nos permite listar todos los individuos que visitaron el zoologico 
     * 
     * @return  devolvera un HashSet que contendra todos los individuos que visitaron el zoologico
     */
    
    public HashSet <Persona> listarPersonas(){
        HashSet<Persona> lista = new HashSet<>();
        lista.add(this.persona);
        return lista;
        
    }
}