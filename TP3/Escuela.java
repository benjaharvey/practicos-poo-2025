
/**
 * Una clase Escuela que emite el recibo de un docente.
 * 
 * @author  Hardoy - Harvey
 * @version
 */
public class Escuela
{
    // instance variables
    private String nombre;
    private String domicilio;
    private String director;
    private Docente docente;

    /**
     * Constructor de la clase Escuela
     * 
     * @param   p_nombre     nombre de la escuela
     * @param   p_domicilio  domicilio de la escuela
     * @param   p_director   director de la escuela
     */
    public Escuela(String p_nombre, String p_domicilio, String p_director)
    {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setDirector(p_director);
        this.docente = new Docente("", "", 0.0, 0.0);
    }
    
    //Setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    
    private void setDirector(String p_director){
        this.director = p_director;
    }
    
    public void setDocente(Docente p_docente){
        this.docente = p_docente;
    }
    
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    
    public String getDomicilio(){
        return this.domicilio;
    }
    
    public String getDirector(){
        return this.director;
    }
    
    public Docente getDocente(){
        return this.docente;
    }
    
    /**
     * Metodo que imprime el sueldo del docente
     * 
     * @param   p_docente   docente del cual se imprime el sueldo
     */
    public void imprimirRecibo(Docente p_docente){
        System.out.println("Escuela: " + this.getNombre() + "Domicilio: " + this.getDomicilio() + "Director: " + this.getDirector());
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("Docente: " + this.getDocente().getNombre());
        System.out.println("Sueldo: " + this.getDocente().calcularSueldo());
        System.out.println("Sueldo basico: " + this.getDocente().getSueldoBasico());
        System.out.println("Asignacion Familiar: " + this.getDocente().getAsignacionFamiliar());
    }
    
}