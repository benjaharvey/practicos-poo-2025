import java.util.*;
/**
 * Una clase que nos permite instanciar el objeto Pedido, para asi poder probar que sus metodos funcionen correctamente
 * 
 * @author      Hardoy - Harvey
 * @version     22/9/2025
 */
public class ProbarPedido
{
    public static void main(String[] args){
        Calendar fecha1 = new GregorianCalendar(2024, 7, 25);
        Cliente cliente1 = new Cliente(45526737, "Benjamin", "Harvey", 45000);
        Laboratorio labo1 = new Laboratorio("Colgate D'Esta S.A.", "Rivadavia 1324", "12345");
        
        Producto produ1 = new Producto(2612, "Higiene", "Pasta Dental Anticaries", 7800, labo1);
        
        Pedido nuevoPedido = new Pedido(fecha1, cliente1, produ1);
        
        Producto produ2 = new Producto(2109, "Higiene", "Jabon Antibacteriano", 10500, labo1);
        
        nuevoPedido.agregarProducto(produ2);
        
        Producto produ3 = new Producto(99021, "Medicina", "Ibuprofeno Adultos", 4500, labo1);
        
        nuevoPedido.agregarProducto(produ3);
        
        
        nuevoPedido.mostrarPedido();
        
        System.out.println("Total al contado: " + nuevoPedido.totalAlContado());
        System.out.println("Total financiado: " + nuevoPedido.totalFinanciado());
        
        nuevoPedido.quitarProducto(produ2);
        
        nuevoPedido.mostrarPedido();
    }
}