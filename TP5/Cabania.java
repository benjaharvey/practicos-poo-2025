
/**
 * Clase Cabania que representa un tipo específico de alojamiento
 * 
 * @author      Hardoy - Harvey 
 * @version     20/11/2025
 */
public class Cabania extends Alojamiento {
    private int nroHabitaciones;

    /**
     * Constructor de la clase Cabania
     * 
     * @param   p_nombre                    nombre de la cabaña
     * @param   p_precioBase                precio base de la cabaña
     * @param   p_diasAlquiler              días de alquiler de la cabaña
     * @param   p_nroHabitaciones           número de habitaciones de la cabaña
     */
    public Cabania(String p_nombre, double p_precioBase, int p_diasAlquiler, 
                   int p_nroHabitaciones) {
        super(p_nombre, p_precioBase, p_diasAlquiler);
        this.setNroHabitaciones(p_nroHabitaciones);
    }

    /**
     * Establece el número de habitaciones de la cabaña
     * 
     * @param   p_habitaciones  número de habitaciones
     */
    private void setNroHabitaciones(int p_nroHabitaciones) {
        this.nroHabitaciones = p_nroHabitaciones;
    }

    /**
     * Obtiene el número de habitaciones de la cabaña
     * 
     * @return  número de habitaciones
     */
    public int getNroHabitaciones() {
        return this.nroHabitaciones;
    }
    
    /**
     * Calculo para saber el costo base + adicionales de la cabania
     * 
     * @return  devuelve el costo total de la cabania
     */
    public double costo(){
        return super.costo() + (this.getNroHabitaciones() * this.getDiasAlquiler()) * 30;
    }
    
    /**
     * Permite contar este tipo de alojamiento
     * 
     * @return  devuelve 1 para sumar a un contador
     */
    public int contar(String p_alojamiento){
        if(p_alojamiento.equals("Cabania")){
            return 1;
        }
        else{
            return 0;
        }
    }
    
    /**
     * Liquidar alojamiento y servicios por alojamiento
     */
    public void liquidar(){
        super.liquidar();
        System.out.println("Cabania con " + this.getNroHabitaciones() + " habitaciones");
        System.out.println("\nTOTAL: ------> $" + this.costo());
    }
}