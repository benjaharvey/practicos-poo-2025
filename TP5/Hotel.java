
/**
 * Clase Hotel que representa un tipo específico de alojamiento
 * 
 * @author      Hardoy - Harvey 
 * @version     20/11/2025
 */
public class Hotel extends Alojamiento {
    private String tipoHabitacion;

    /**
     * Constructor de la clase Hotel
     * 
     * @param   p_nombre            nombre del hotel
     * @param   p_precioBase        precio base del hotel
     * @param   p_diasAlquiler      días de alquiler del hotel
     * @param   p_tipoHabitacion    tipo de habitacion (single/double)
     */
    public Hotel(String p_nombre, double p_precioBase, int p_diasAlquiler, String p_tipoHabitacion) {
        super(p_nombre, p_precioBase, p_diasAlquiler);
        this.setTipoHabitacion(p_tipoHabitacion);
    }

    /**
     * Establece el tipo de habitacion
     */
    private void setTipoHabitacion(String p_tipoHabitacion) {
        this.tipoHabitacion = p_tipoHabitacion;
    }

    /**
     * Obtiene el tipo de habitacion del hotel
     * 
     * @return  tipo de habitacion del hotel
     */
    public String getTipoHabitacion() {
        return this.tipoHabitacion;
    }

    /**
     * Calculo para saber el costo base + adicionales del hotel
     * 
     * @return  devuelve el costo total del hotel
     */
    public double costo(){
        if(this.getTipoHabitacion().equals("Single")){
            return super.costo() + 20;
        }
        else{
            return super.costo() + 35;
        }
    }
    
    /**
     * Permite contar este tipo de alojamiento
     * 
     * @return  devuelve 1 para sumar a un contador
     */
    public int contar(String p_alojamiento){
        if(p_alojamiento.equals("Hotel")){
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
        System.out.println("Habitacion " + this.getTipoHabitacion());
        System.out.println("\nTOTAL: -------> $" + this.costo());
    }
}