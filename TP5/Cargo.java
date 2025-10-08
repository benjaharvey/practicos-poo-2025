import java.util.*;
/**
 * Una clase Cargo que representa un cargo general
 * 
 * @author      Hardoy - Harvey 
 * @version     13/10/2025
 */
public class Cargo
{
    private String nombreCargo;
    private double sueldoBasico;
    private int anioIngreso;
    private int horasDeDocencia;

    /**
     * Constructor de la clase Cargo
     * 
     * @param   p_nombreCargo           nombre del cargo
     * @param   p_sueldoBasico          sueldo basico asociado al cargo
     * @param   p_anioIngreso           anio de ingreso en el cargo
     * @param   p_horasDocencia         horas de docencia en el cargo
     */
    public Cargo(String p_nombreCargo, double p_sueldoBasico, int p_anioIngreso, int p_horasDocencia)
    {
        this.setNombreCargo(p_nombreCargo);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAnioIngreso(p_anioIngreso);
        this.setHorasDocencia(p_horasDocencia);
    }
    
    public void setNombreCargo(String p_nombreCargo){
        this.nombreCargo = p_nombreCargo;
    }
    public void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico = p_sueldoBasico;
    }
    public void setAnioIngreso(int p_anioIngreso){
        this.anioIngreso = p_anioIngreso;
    }
    public void setHorasDocencia(int p_horasDocencia){
        this.horasDeDocencia = p_horasDocencia;
    }
    
    public String getNombreCargo(){
        return this.nombreCargo;
    }
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    public int getAnioIngreso(){
        return this.anioIngreso;
    }
    public int getHorasDocencia(){
        return this.horasDeDocencia;
    }

    /**
     * Metodo para saber la antiguedad del profesor en el cargo
     * 
     * @return  devuelve un entero que equivale a los anios de antiguedad
     */
    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - this.getAnioIngreso();
    }

    /**
     * Metodo para calcular el adicional en su sueldo segun los anios de antiguedad
     * 
     * @return  devuelve un double que representa cuanto debe adicionar al sueldo
     */
    public double adicionalXAntiguedad(){
        return this.antiguedad() * 0.01;
    }
    
    /**
     * Metodo para obtener el sueldo segun el sueldo basico + el adicional por la antiguedad en el cargo
     * 
     * @return  devuelve un double que representa el sueldo segun el cargo
     */
    public double sueldoDelCargo(){
        return this.getSueldoBasico() * this.adicionalXAntiguedad();
    }
    
    /**
     * Metodo para mostrar los datos del cargo del profesor
     */
    public void mostrarCargo(){
        System.out.println(this.getNombreCargo() + " - Sueldo Basico: " + this.getSueldoBasico() + " - Sueldo Cargo: " + this.sueldoDelCargo()
                            + " - Antiguedad: " + this.antiguedad() + " - Horas Docencia: " + this.getHorasDocencia());
    }
}