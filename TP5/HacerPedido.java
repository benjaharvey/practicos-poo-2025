import java.util.*;
/**
 * Una clase ejecutable para instanciar Pedido
 * 
 * @author      Hardoy - Harvey 
 * @version     20/10/2025
 */
public class HacerPedido
{
    public static void main(String[] args){
        Etiqueta etiqueta1 = new Premium(200.0, 10);
        Etiqueta etiqueta2 = new Comun(100.0, 100.0);
        Etiqueta etiqueta3 = new Premium(200.0, 7);
        
        Renglon renglon1 = new Renglon(7, etiqueta1);
        Renglon renglon2 = new Renglon(57, etiqueta2);
        Renglon renglon3 = new Renglon(94, etiqueta3);
    
        Pedido unPedido = new Pedido(renglon1);
        unPedido.agregarRenglon(renglon2);
        unPedido.agregarRenglon(renglon3);
        
        unPedido.mostrar();
    }
}