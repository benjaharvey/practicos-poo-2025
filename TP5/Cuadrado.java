/**
 * Una clase Cuadrado que es subclase de Rectangulo.
 * 
 * @author      Hardoy - Harvey
 * @version     20/10/2025 
 */
public class Cuadrado extends Rectangulo
{
    /**
     * Constructor de la clase Rectangulo
     * 
     * @param   p_origen    una clase Punto que representa el origen del Cuadrado
     * @param   p_lado      longitud del lado del Cuadrado
     */
    public Cuadrado(Punto p_origen, double p_lado)
    {
        super(p_origen, p_lado, p_lado);
    }
    
    /**
     * Metodo para nombrar el tipo de figura del Objeto
     * 
     * @return  devuelve una cadena que es el tipo de figura
     */
    public String nombreFigura()
    {
        return "Cuadrado";
    }
    
    /**
     * Metodo para mostrar las caracteristicas del cuadrado
     */
    public void caracteristicas() {
        System.out.println("\n" + this.nombreFigura());
        System.out.println("Origen: " + this.getOrigen().coordenadas() + " - Lado: " + this.getAncho());
        System.out.println("Superficie: " + this.superficie() + " - Perímetro: " + this.perimetro());
    }

}











