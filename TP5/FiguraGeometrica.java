
/**
 * Una clase abstracta de una figura geometrica
 * 
 * @author      Hardoy - Harvey 
 * @version     20/10/2025
 */
public abstract class FiguraGeometrica
{
    private Punto origen;

    /**
     * Constructor de la clase FiguraGeometrica
     */
    public FiguraGeometrica(Punto p_origen)
    {
        this.setOrigen(p_origen);
    }

    private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    }
    public Punto getOrigen(){
        return this.origen;
    }
    
    public abstract String nombreFigura();
    
    public abstract double superficie();
    
    /**
     * Metodo para mostrar el total de superficie de la figura
     */
    public void mostrarSuperficie(){
        System.out.println("***" + this.nombreFigura() + "***");
        System.out.println("Superficie: " + this.superficie());
    }
}