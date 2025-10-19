import java.util.*;
/**
 * Una clase Delegacion, que nos permitira definir las operaciones necesarias para luego trabajar con la clase Zoologico
 * 
 * @author      Hardoy - Harvey 
 * @version     20/10/25
 */
public class Delegacion extends Visitante{
    
    private HashSet <Individuo> integrantes;
    
    /**
     * Constructor de la clase Delegacion
     * 
     * @param   p_nombre    Nombre de la delegación
     * @param   p_fecha     Fecha en la que la delegación visitó el zoologico
     */
    
    
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
    
    
    /**
     * Metodo que permite inscribir a un individuo en la delegación
     * 
     * @param   p_individuo     Datos del individuo que sera inscripto a la delegación
     */
    
    public void inscribirIndividuo(Individuo p_individuo){
        this.getIntegrantes().add(p_individuo);
    }
    
    
    /**
     * Metodo que permite quitar a un integrante de la delegación
     * 
     * @param   p_individuo     Datos del individuo que sera removido de la delegación
     * 
     * @return  True si la operación fue realizada con exito, False en caso contrario
     */
    
    public boolean quitarIntegrante(Individuo p_individuo){
        return this.getIntegrantes().remove(p_individuo);
    }
    
    
    /**
     * Metodo que nos permitira saber cuantos integrantes hay en la delegación que visitara el zoologico
     *
     * @return  Cantidad de integrantes que hay en la delegación
     */
    
    public int cantidadIntegrantes(){
        return this.getIntegrantes().size();
    }
    
    
    /**
     * Metodo que calcula el valor de la entrada para la delegacion (posee 10% de descuento)
     * 
     * @return  Precio de la entrada
     */
    
    public double entrada() {
        double total = 0;
            for (Individuo i : this.getIntegrantes()) {
                total += i.entrada();
            }
            
        return total * 0.9;
    }
    
    
    /**
     * Metodo que muestra los detalles de la delegación que visitara el zoologico
     */
    
    public void mostrar() {
        System.out.println("*** ------------------------------------------------------------- ***");
        System.out.println("Delegación: " + this.getNombre());
        System.out.println("Integrantes:");
        for (Individuo i : this.getIntegrantes()) {
            i.mostrar();
        }
        System.out.println("Cantidad de Integrantes: " + this.cantidadIntegrantes()); 
        System.out.println("*** ------------------------------------------------------------- ***");
    }
    
    
    /**
     * Metodo que listara las delegaciones que visitaron el zoologico en una fecha determinada
     * 
     * @param   p_fecha         Fecha en la cual se desea saber que delegaciones visitaron el zoologico
     * @param   p_visitante     Tipo de visitante, en este caso delegacion
     */
    
    public void listarPorFecha(Calendar p_fecha, String p_visitante) {
        if ((this.getFechaVisita() == p_fecha) && (this.tipoVisitante() == p_visitante)) {
            this.mostrar();
        }
    }

    
    /**
     * Metodo que nos permite listar todas las delegaciones que visitaron el zoologico
     * 
     * @return  Un HashSet que contendra a las delegaciones que visitaron el zoologico
     */
    
    public HashSet<Persona> listarPersonas() {
        HashSet<Persona> personas = new HashSet<>();
        for (Individuo i : this.getIntegrantes()) {
            personas.addAll(i.listarPersonas());
        }
        return personas;
    }
}