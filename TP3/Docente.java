/**
 * Una clase Docente que admite un metodo para calcular su sueldo
 * 
 * @author  Hardoy - Harvey
 * @version 08/09/25
 */
public class Docente {
    // instance variables
    private String nombre;
    private String grado;
    private double sueldoBasico;
    private double asignacionFamiliar;

    /**
     * @param   p_nombre                nombre del Docente
     * @param   p_grado                 grado donde ensenia el Docente
     * @param   p_sueldoBasico          sueldo basico del Docente
     * @param   p_asignacionFamiliar    asignacion familiar que se le da al Docente
     */
    public Docente(String p_nombre, String p_grado, double p_sueldoBasico, double p_asignacionFamiliar) {
        this.setNombre(p_nombre);
        this.setGrado(p_grado);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAsignacionFamiliar(p_asignacionFamiliar);
    }

    //Setters
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    private void setGrado(String p_grado) {
        this.grado = p_grado;
    }
    private void setSueldoBasico(double p_sueldoBasico) {
        this.sueldoBasico = p_sueldoBasico;
    }
    private void setAsignacionFamiliar(double p_asignacionFamiliar) {
        this.asignacionFamiliar = p_asignacionFamiliar;
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }
    public String getGrado() {
        return this.grado;
    }
    public double getSueldoBasico() {
        return this.sueldoBasico;
    }
    public double getAsignacionFamiliar() {
        return this.asignacionFamiliar;
    }
    
    /**
     * Metodo para calcular el sueldo del Docente en base al sueldo basico y la asignacion familiar
     * 
     * @return  devuelve el resultado de calcular el sueldo del Docente
     */
    public double calcularSueldo() {
        return this.getSueldoBasico() + this.getAsignacionFamiliar();
    }
}
