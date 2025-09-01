/**
 * Una clase Paciente que tiene metodos para
 * 
 * @author  Hardoy - Harvey 
 * @version 08/09/25
 */
public class Paciente
{
    // instance variables
    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad localidadNacido;
    private Localidad localidadVive;

    /**
     * Constructor de la clase Paciente
     * 
     * @param   p_historia          id de la historia clinica del Paciente
     * @param   p_nombre            nombre del Paciente
     * @param   p_domicilio         domicilio del Paciente
     * @param   p_localidadNacido   localidad donde nacio el Paciente
     * @param   p_localidadVive     localidad donde vive el Paciente
     */
    Paciente(int p_historia, String p_nombre, String p_domicilio, Localidad p_localidadNacido, Localidad p_localidadVive)
    {
        this.setHistoria(p_historia);
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setLocalidadNacido(p_localidadNacido);
        this.setLocalidadVive(p_localidadVive);
    }
    
    // Setters
    private void setHistoria(int p_historiaClinica) {
        this.historiaClinica = p_historiaClinica;
    }
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    private void setDomicilio(String p_domicilio) {
        this.domicilio = p_domicilio;
    }
    private void setLocalidadNacido(Localidad p_localidadNacido) {
        this.localidadNacido = p_localidadNacido;
    }
    private void setLocalidadVive(Localidad p_localidadVive) {
        this.localidadVive = p_localidadVive;
    }

    // Getters
    public int getHistoria() {
        return this.historiaClinica;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getDomicilio() {
        return this.domicilio;
    }
    public Localidad getLocalidadNacido() {
        return this.localidadNacido;
    }
    public Localidad getLocalidadVive() {
        return this.localidadVive;
    }
    
    /**
     * Metodo que muestra los datos del Paciente por pantalla
     */
    public void mostrarDatosPantalla()
    {
        System.out.println("Paciente: " + this.getNombre() + "\tHistoria Clinica: " + this.getHistoria() + "\tDomicilio: " + this.getDomicilio());
        System.out.println(this.getLocalidadVive().mostrar());
    }
    
    /**
     * Metodo para devolver una cadena con los mismos datos de mostrarDatosPantalla()
     * 
     * @return      devuelve una cadena de los datos del paciente
     */
    public String cadenaDeDatos(){
        return this.getNombre() + "....." + this.getHistoria() + "....." + this.getDomicilio() 
        + " - " + this.getLocalidadVive().mostrar(); 
    }
}