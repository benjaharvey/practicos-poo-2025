
/**
 * Una clase Hospital que tiene un metodo para consultar datos afiliatorios
 * 
 * @author Hardoy - Harvey 
 * @version 08/09/25
 */
public class Hospital
{
    private String nombreHospital;
    private String nombreDirector;
    private Paciente paciente;

    /**
     * Constructor de la clase Hospital
     * 
     * @param   p_nombreHospital
     * @param   p_nombreDirector
     * @param   p_paciente
     */
    public Hospital(String p_nombreHospital, String p_nombreDirector, Paciente p_paciente)
    {
        this.setNombreHospital(p_nombreHospital);
        this.setNombreDirector(p_nombreDirector);
        this.setPaciente(p_paciente);
    }

    // Setters
    private void setNombreHospital(String p_nombreHospital) {
        this.nombreHospital = p_nombreHospital;
    }
    private void setNombreDirector(String p_nombreDirector) {
        this.nombreDirector = p_nombreDirector;
    }
    private void setPaciente(Paciente p_paciente) {
        this.paciente = p_paciente;
    }

    // Getters
    public String getNombreHospital() {
        return this.nombreHospital;
    }
    public String getNombreDirector() {
        return this.nombreDirector;
    }
    public Paciente getPaciente() {
        return this.paciente;
    }    
    
    /**
     * Un metodo para consultar los datos afiliatorios de un paciente en el Hospital
     * 
     * @param   p_paciente  un paciente del Hospital 
     */
    public void consultarDatosFiliatorios(Paciente p_paciente)
    {
        System.out.println("\nHospital: " + this.getNombreHospital() + "\t\tDirector: " + this.getNombreDirector());
        System.out.println("------------------------------------------------------------------------");
        this.getPaciente().mostrarDatosPantalla();
    }
}