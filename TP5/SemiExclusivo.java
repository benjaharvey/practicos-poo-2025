/**
 * Una clase SemiExclusivo que representa un tipo de cargo
 * 
 * @author      Hardoy - Harvey 
 * @version     13/10/2025
 */
public class SemiExclusivo extends Cargo
{
    private int horasDeInvestigacion;

    /**
     * Constructor de la clase SemiExclusivo
     * 
     * @param   p_nombreCargo           nombre del cargo
     * @param   p_sueldoBasico          sueldo basico asociado al cargo
     * @param   p_anioIngreso           anio de ingreso en el cargo
     * @param   p_horasDocencia         horas de docencia en el cargo
     * @param   p_horasInvestigacion    horas de investigacion en el cargo
     */
    public SemiExclusivo(String p_nombreCargo, double p_sueldoBasico, int p_anioIngreso, int p_horasDocencia, int p_horasInvestigacion)
    {
        super(p_nombreCargo, p_sueldoBasico, p_anioIngreso, p_horasDocencia);
        this.setHorasInvestigacion(p_horasInvestigacion);
    }

    private void setHorasInvestigacion(int p_horasInvestigacion){
        this.horasDeInvestigacion = p_horasInvestigacion;   
    }    
    public int getHorasInvestigacion(){
        return this.horasDeInvestigacion;
    }
    
    /**
     * Metodo para mostrar datos del cargo y las horas de investigacion del semiexclusivo
     */
    public void mostrarCargo(){
        super.mostrarCargo();
        System.out.println("----Cargo de caracter SemiExclusivo----");
        System.out.println("Horas de investigacion: " + this.getHorasInvestigacion());
    }    
}