import java.util.*;
/**
 * Clase Zoologico que nos permote instanciar un zoologico y gestionar sus operaciones diarias.
 * 
 * @author      Hardoy - Harvey
 * @version     20/10/25
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
    
    /**
     * Constructor de la clase zoologico
     * 
     * @param   p_nombre    Nombre del zoologico
     */
    
    public Zoologico(String p_nombre){
        this.setNombre(p_nombre);
        this.setVisitantes(new HashSet <>());
    }
    
    
    /**
     * Metodo que nos permite agregar un nuevo visitante al HashSet
     * 
     * @param   p_visitante     Instancia del objeto visitante
     */
    
    public void nuevoVisitante(Visitante p_visitante){
        this.getVisitantes().add(p_visitante);
    }
    
    /**
     * Metodo que nos permite eliminar un visitante del HashSet 
     * 
     * @param   p_visitante     Instancia del objeto visitante
     * 
     * @return True si pudo quitar el visitante deseado, False en caso contrario
     */
    
    public boolean quitarVisitante(Visitante p_visitante){
        return this.getVisitantes().remove(p_visitante);
    }
    
    
    /**
     * Metodo que permitira visualizar que tipo de visitante visito el zoologico en una fecha determinada
     *
     * @param   p_fecha         Fecha que se desea visualizar
     * @param   p_tipoVisitante Tipo de visitante que se desea visualizar (individuo/delegacion)
     */
    
    
    public void listarTipoVisitantePorFecha(Calendar p_fecha, String p_tipoVisitante){
        System.out.println("Visitantes del tipo: " + p_tipoVisitante + "En la fecha: " + p_fecha.getTime());
        
        for(Visitante p_visitante : this.getVisitantes()){
            p_visitante.listarPorFecha(p_fecha, p_tipoVisitante);
        }
    }
    
    /**
     * Metodo que permite visualizar los visitantes que entraron al zoologico en una fecha determinada
     *
     * @param   p_fecha     Fecha para la cual se desean visualizar los visitantes
     */
    
    
    
    public void listarVisitantePorFecha(Calendar p_fecha){
        System.out.println("Visitantes en la fecha: " + p_fecha.getTime());
        
        for(Visitante p_visitante : this.getVisitantes()){
            if(p_visitante.getFechaVisita() == p_fecha){
                p_visitante.mostrar();
            }
        }
    }
    
    
    /**
     * Metodo que permite calcular la recaudación de las entradas en un intervalo de tiempo especifico
     *
     * @param   p_fechaDesde    Fecha desde la que se desea calcular la recaudación    
     * @param   p_fechaHasta    Fecha en la que se termina de calcular la recaudación
     * 
     * @return  Recaudación total entre esas 2 fechas
     */
    
    public double recaudacion(Calendar p_fechaDesde, Calendar p_fechaHasta){
        double total = 0;
        System.out.println("Recaudacion desde la fecha: " + p_fechaDesde.getTime() + "hasta la fecha: " + p_fechaHasta.getTime());
        
            for(Visitante p_visitante : this.getVisitantes()){
                Calendar fecha = p_visitante.getFechaVisita();
            if(!fecha.before(p_fechaDesde) && !fecha.after(p_fechaHasta)){
                total += p_visitante.entrada();
            }
        }
        
        return total;
    }
    
    
    /**
     * Metodo que muestra todas las personas que visitaron el zoologico
     * 
     * @return  Retornara un HashSet que tendra en su interior todas las personas que visitaron el zoologic
     */
    
    public HashSet <Persona> listarPersonasQueVisitaronElZoo(){
        HashSet<Persona> personas = new HashSet<>();
        
        for (Visitante v : this.getVisitantes()) {
            personas.addAll(v.listarPersonas());
        }
        
        return personas;
    }
}