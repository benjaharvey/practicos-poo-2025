import java.util.ArrayList;
/**
 * Clase Gerencia que gestiona una colección de alojamientos
 * 
 * @author      Hardoy - Harvey 
 * @version     20/11/2025
 */

public class Gerencia {
    private String nombre;
    private ArrayList<Alojamiento> alojamientosAlquilados;

    /**
     * Constructor de la clase Gerencia
     * 
     * @param   p_nombre    nombre de la gerencia
     */
    public Gerencia(String p_nombre) {
        this.setNombre(p_nombre);
        this.setAlojamientosAlquilados(new ArrayList<Alojamiento>());
    }

    /**
     * Establece el nombre de la gerencia
     * 
     * @param   p_nombre    nombre de la gerencia
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
     * Establece la lista de alojamientos alquilados
     * 
     * @param   p_alojamientosAlquilados   lista de alojamientos
     */
    private void setAlojamientosAlquilados(ArrayList<Alojamiento> p_alojamientosAlquilados) {
        this.alojamientosAlquilados = p_alojamientosAlquilados;
    }

    /**
     * Obtiene el nombre de la gerencia
     * 
     * @return  nombre de la gerencia
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Obtiene la lista de alojamientos alquilados
     * 
     * @return  lista de alojamientos alquilados
     */
    public ArrayList<Alojamiento> getAlojamientosAlquilados() {
        return this.alojamientosAlquilados;
    }
    
        /**
     * Agregar un servicio a la lista de servicios
     * 
     * @return  true o false dependiendo de si se agrego o no
     */
    public boolean agregarAlojamiento(Alojamiento p_alojamiento){
        return this.getAlojamientosAlquilados().add(p_alojamiento);
    }
    
    /**
     * Quitar un servicio de la lista de servicios
     * 
     * @return  true o false dependiendo de si se quito o no
     */
    public boolean quitarAlojamiento(Alojamiento p_alojamiento){
        return this.getAlojamientosAlquilados().remove(p_alojamiento);
    }
    
    /**
     * Cuenta el total de alojamientos de un tipo específico
     * 
     * @param   p_tipoAlojamiento   tipo de alojamiento a contar ("cabania" u "hotel")
     * @return  total de alojamientos del tipo especificado
     */
    public int contarAlojamientos(String p_tipoAlojamiento) {
        int total = 0;
        for (Alojamiento alojamiento : this.getAlojamientosAlquilados()) {
            total += alojamiento.contar(p_tipoAlojamiento);
        }
        return total;
    }
    
    /**
     * Metodo para llevar un registro de los alojamientos alquilados
     */
    public void liquidar(){
        System.out.println("\nAlojamiento tipo cabania -----> " + this.contarAlojamientos("Cabania"));
        System.out.println("Alojamiento tipo hotel -----> " + this.contarAlojamientos("Hotel"));
    }
    
    /**
     * Metodo para liquidar todos los alojamientos alquilados
     */
    public void mostrarLiquidacion(){
        System.out.println("\nGerencia " + this.getNombre());
        System.out.println("Liquidacion-----------------");
        for (Alojamiento alojamiento : this.getAlojamientosAlquilados()) {
            alojamiento.liquidar();
        }
        this.liquidar();
    }
}