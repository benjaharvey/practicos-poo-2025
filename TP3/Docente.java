/**
 * 
 */
public class Docente {
    // instance variables
    private String nombre;
    private String grado;
    private double sueldoBasico;
    private double asignacionFamiliar;

    /**
     * 
     */
    public Docente(String p_nombre, String p_grado, double p_sueldoBasico, double p_asignacionFamiliar) {
        this.setNombre(p_nombre);
        this.setGrado(p_grado);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAsignacionFamiliar(p_asignacionFamiliar);
    }

    //Setters
    private void setNombre(String p_nombre) {
        nombre = p_nombre;
    }

    private void setGrado(String p_grado) {
        grado = p_grado;
    }

    private void setSueldoBasico(double p_sueldoBasico) {
        sueldoBasico = p_sueldoBasico;
    }

    private void setAsignacionFamiliar(double p_asignacionFamiliar) {
        asignacionFamiliar = p_asignacionFamiliar;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getGrado() {
        return grado;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public double getAsignacionFamiliar() {
        return asignacionFamiliar;
    }
    
    /**
     * 
     */
    public double calcularSueldo() {
        return this.getSueldoBasico() + this.getAsignacionFamiliar();
    }
}
