import java.util.*;
/**
 * Clase abstracta Alojamiento que representa un alojamiento genérico
 * 
 * @author      Hardoy - Harvey 
 * @version     20/11/2025
 */
public abstract class Alojamiento {
    private String nombre;
    private double precioBase;
    private int diasAlquiler;
    private ArrayList<Servicio> servicios;

    /**
     * Constructor de la clase abstracta Alojamiento
     * 
     * @param   p_nombre        nombre del alojamiento
     * @param   p_precioBase    precio base del alojamiento
     * @param   p_diasAlquiler  días de alquiler del alojamiento
     */
    public Alojamiento(String p_nombre, double p_precioBase, int p_diasAlquiler) {
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precioBase);
        this.setDiasAlquiler(p_diasAlquiler);
        this.setServicios(new ArrayList<Servicio>());
    }

    /**
     * Establece el nombre del alojamiento
     * 
     * @param   p_nombre    nombre del alojamiento
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
     * Establece el precio base del alojamiento
     * 
     * @param   p_precioBase    precio base del alojamiento
     */
    private void setPrecioBase(double p_precioBase) {
        this.precioBase = p_precioBase;
    }

    /**
     * Establece los días de alquiler del alojamiento
     * 
     * @param   p_diasAlquiler  días de alquiler del alojamiento
     */
    private void setDiasAlquiler(int p_diasAlquiler) {
        this.diasAlquiler = p_diasAlquiler;
    }

    /**
     * Establece la lista de servicios del alojamiento
     * 
     * @param   p_servicios  lista de servicios del alojamiento
     */
    private void setServicios(ArrayList<Servicio> p_servicios) {
        this.servicios = p_servicios;
    }

    /**
     * Obtiene el nombre del alojamiento
     * 
     * @return  nombre del alojamiento
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Obtiene el precio base del alojamiento
     * 
     * @return  precio base del alojamiento
     */
    public double getPrecioBase() {
        return this.precioBase;
    }

    /**
     * Obtiene los días de alquiler del alojamiento
     * 
     * @return  días de alquiler del alojamiento
     */
    public int getDiasAlquiler() {
        return this.diasAlquiler;
    }

    /**
     * Obtiene la lista de servicios del alojamiento
     * 
     * @return  lista de servicios del alojamiento
     */
    public ArrayList<Servicio> getServicios() {
        return this.servicios;
    }
    
    /**
     * Agregar un servicio a la lista de servicios
     * 
     * @return  true o false dependiendo de si se agrego o no
     */
    public boolean agregarServicio(Servicio p_servicio){
        return this.getServicios().add(p_servicio);
    }
    
    /**
     * Quitar un servicio de la lista de servicios
     * 
     * @return  true o false dependiendo de si se quito o no
     */
    public boolean quitarServicio(Servicio p_servicio){
        return this.getServicios().remove(p_servicio);
    }
    
    /**
     * Metodo abstracto para que las clases hijas implementen el metodo contar
     * 
     * @return  cuenta segun el alojamiento
     */
    public abstract int contar(String p_alojamiento);
    
    /**
     * Calcula el costo del alojamiento generico
     * 
     * @return  devuelve el costo total del alojamiento generico
     */
    public double costo(){
        return (this.getDiasAlquiler() * this.getPrecioBase()) + this.costoServicios();
    }
    
    /**
     * Lista los servicios utilizados
     */
    public void listarServicios(){
        for(Servicio servicio: this.getServicios()){
            System.out.println(servicio.getDescripcion() + ": " + servicio.getPrecio());
        }
    }
    
    /**
     * Calcula el costo de los servicios
     * 
     * @return  devuelve el costo total de los servicios
     */
    public double costoServicios(){
        double costoServicios = 0;
        for(Servicio servicio: servicios){
            costoServicios += servicio.getPrecio();
        }
        return costoServicios;
    }
    
    /**
     * Liquidar alojamiento y servicios por alojamiento
     */
    public void liquidar(){
        System.out.println("\nAlojamiento: " + this.getNombre());
        System.out.println("Costo por " + this.getDiasAlquiler() + " dias: $" + this.costo());
        this.listarServicios();
    }
}