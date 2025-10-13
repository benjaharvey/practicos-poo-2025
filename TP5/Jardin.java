import java.util.*;
/**
 * Una clase Jardin que representa el jardin de infantes y las figuras que se pueden pintar
 * 
 * @author      Hardoy - Harvey 
 * @version     20/10/2025
 */
public class Jardin
{
    private String nombre;
    private ArrayList<FiguraGeometrica> figuras;
    
    /**
     * Constructor de la clase Jardin con figuras
     * 
     * @param   p_nombre    nombre del jardin de infantes
     * @param   p_figuras  lista de figuras que tiene el jardin para pintar
     */
    public Jardin(String p_nombre, ArrayList<FiguraGeometrica> p_figuras)
    {
        this.setNombre(p_nombre);
        this.setFiguras(p_figuras);
    }
    
    /**
     * Constructor de la clase Jardin sin figura
     * 
     * @param   p_nombre    nombre del jardin de infantes
     * @param   p_figuras  lista de figuras que tiene el jardin para pintar
     */
    public Jardin(String p_nombre)
    {
        this.setNombre(p_nombre);
        this.setFiguras(new ArrayList());
    }

    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setFiguras(ArrayList<FiguraGeometrica> p_figuras){
        this.figuras = p_figuras;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public ArrayList<FiguraGeometrica> getFiguras(){
        return this.figuras;
    }
    
    public boolean agregarFigura(FiguraGeometrica p_figura){
        return this.getFiguras().add(p_figura);
    }
    public boolean eliminarFigura(FiguraGeometrica p_figura){
        return this.getFiguras().remove(p_figura);
    }
    
    /**
     * Metodo para calcular cuantos litros de pintura se necesitan
     * 
     * @return  devuelve el numero de litros necesarios para pintar las figuras
     */
    public double cuantosLitros(){
        return this.cuantosMetros() * 0.2;
    }
    
    /**
     * Metodo para calcular cuantas latas de pintura se necesitan
     * 
     * @return  devuelve el numero de latas necesarios para cubrir los litros de pintura
     */
    public int cuantasLatas(){
        double latas = Math.round(this.cuantosLitros() / 4);
        return (int)latas;
    }
    
    /**
     * Metodo para calcular cuantos metros se van a cubrir con las figuras
     * 
     * @return  devuelve un numero que corresponde a los metros cubiertos por las figuras
     */
    public double cuantosMetros(){
        double superficie = 0;
        for(FiguraGeometrica figura: figuras){
            superficie += figura.superficie();
        }
        return superficie;
    }
    
    /**
     * Metodo para listar todas las figuras que se pintaran el total de superficie a cubrir y la cantidad de latas que se necesita comprar
     */
    public void detalleFiguras(){
        System.out.println("Presupuesto: " + this.getNombre());
        System.out.println("\n");
        for(FiguraGeometrica figura: figuras){
            figura.mostrarSuperficie();
        }
        System.out.println("\n-------------------------");
        System.out.println("Total a cubrir: " + this.cuantosMetros());
        System.out.println("Comprar " + this.cuantasLatas() + " latas");
    }
    
}