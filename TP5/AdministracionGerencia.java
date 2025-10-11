/**
 * Clase ejecutable AdministracionGerencia
 * 
 * @author      Hardoy - Harvey 
 * @version     13/10/2025
 */
public class AdministracionGerencia {
    
    public static void main(String[] args) {
        Gerencia gerencia = new Gerencia("Los Arroyos");
        
        Servicio internet = new Servicio("Internet", 10.0);
        Servicio lavanderia = new Servicio("Lavanderia", 15.0);
        Servicio alquilerAuto = new Servicio("Alquiler de Auto", 50.0);
        
        Hotel hotel = new Hotel("Hotel Plaza", 100.0, 7, "Single");
        hotel.agregarServicio(internet);
        hotel.agregarServicio(lavanderia);
        
        Cabania cabania = new Cabania("Cabaña del Bosque", 80.0, 5, 2);
        cabania.agregarServicio(lavanderia);
        cabania.agregarServicio(alquilerAuto);
        
        gerencia.agregarAlojamiento(hotel);
        gerencia.agregarAlojamiento(cabania);
        
        gerencia.mostrarLiquidacion();
    }
}