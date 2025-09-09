
/**
 * Una clase Localidad que muestra su nombre y su provincia 
 * 
 * @author      Hardoy - Harvey 
 * @version     22/09/25
 */
public class Localidad
{
    // instance variables
    private String nombre;
    private String provincia;

    /**
     * Constructor de la clase Localidad
     * 
     * @param   p_nombre        nombre de la localidad
     * @param   p_provincia     provincia a la que pertenece la localidad
     */
    Localidad(String p_nombre, String p_provincia)
    {
        this.setNombre(p_nombre);
        this.setProvincia(p_provincia);
    }

    // Setters
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    private void setProvincia(String p_provincia) {
        this.provincia = p_provincia;
    }

    // Getters
    public String getNombre() {
        return this.nombre;
    }
    public String getProvincia() {
        return this.provincia;
    }
    
    
    /**
     * Un metodo que nos muestra nombre y provincia de la localidad
     * 
     * @return      una cadena del nombre y provincia 
     */
    public String mostrar()
    {
        return "Localidad: " + this.getNombre() + "\tProvincia: " + this.getProvincia(); 
    }
}