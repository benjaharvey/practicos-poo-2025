
/**
 * Clase Servicio que representa un servicio adicional para alojamientos
 * 
 * @author      Hardoy - Harvey 
 * @version     13/10/2025
 */
public class Servicio {
    private String descripcion;
    private double precio;

    /**
     * Constructor de la clase Servicio
     * 
     * @param   p_descripcion   descripción del servicio
     * @param   p_precio        precio del servicio
     */
    public Servicio(String p_descripcion, double p_precio) {
        this.setDescripcion(p_descripcion);
        this.setPrecio(p_precio);
    }

    private void setDescripcion(String p_descripcion) {
        this.descripcion = p_descripcion;
    }
    
    private void setPrecio(double p_precio) {
        this.precio = p_precio;
    }
    
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public double getPrecio() {
        return this.precio;
    }
}