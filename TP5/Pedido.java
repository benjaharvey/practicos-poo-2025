import java.util.*;
/**
 * Una clase Pedido que tiene varios renglones
 * 
 * @author      Hardoy - Harvey
 * @version     20/10/2025
 */
public class Pedido
{
    private ArrayList <Renglon> renglones;
    
    /**
     * Constructor de la clase Pedido
     */
    public Pedido(ArrayList<Renglon> p_renglones)
    {
        this.setRenglones(p_renglones);
    }
    
    /**
     * Constructor de la clase Pedido con un renglon
     * 
     * @param   p_renglon   un renglon del pedido
     */
    public Pedido(Renglon p_renglon)
    {
        this.setRenglones(new ArrayList());
        this.agregarRenglon(p_renglon);
    }
    
    private void setRenglones(ArrayList <Renglon> p_renglones){
        this.renglones = p_renglones;
    }
    public ArrayList <Renglon> getRenglones(){
        return this.renglones;
    }
    
    /**
     * Metodo para agregar un renglon a la lista
     */
    public void agregarRenglon(Renglon p_renglon){
        this.getRenglones().add(p_renglon);
    }
    
    /**
     * Metodo para quitar un renglon de la lista
     */
    public void eliminarRenglon(Renglon p_renglon){
        if(this.getRenglones().size() > 0){
            this.getRenglones().remove(p_renglon);
        }
        else{
            System.out.println("No tiene mas elementos");
        }
    }
    
    /**
     * Metodo para mostrar todos los renglones
     */
    public void mostrar(){
        int totalEtiquetas = 0;
        double importeTotal = 0;
        
        System.out.println("\nPedido:");
        System.out.println("Cantidad de items: " + this.getRenglones().size());
        for(int i = 0; i < this.getRenglones().size(); i++){
            int cantidadItem = this.getRenglones().get(i).getCantidad();
            totalEtiquetas += cantidadItem;
            
            double precioItem = this.getRenglones().get(i).getImporte();
            importeTotal += precioItem;
            
            System.out.print("\nItem " + (i+1) + ": ");
            this.getRenglones().get(i).mostrar();
            System.out.print("Precio: " + precioItem);
        }
        System.out.print("\n\n--- Total pedido: " + totalEtiquetas + " Etiquetas por un importe total de: $ " + importeTotal);
    }
}