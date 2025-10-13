/**
 * Una clase Triangulo que hereda de FiguraGeometrica.
 * 
 * @author      Hardoy - Harvey
 * @version     20/10/2025 
 */
public class Triangulo extends FiguraGeometrica
{
    private double base;
    private double altura;
    
    /**
     * Constructor del objeto Triangulo
     * 
     * @param   p_origen    origen del triangulo del tipo Punto
     * @param   p_base      base del triangulo
     * @param   p_altura    altura del triangulo
     */
    public Triangulo(Punto p_origen, double p_base, double p_altura)
    {
        super(p_origen);
        this.setBase(p_base);
        this.setAltura(p_altura);
    }

    private void setBase(double p_base){
        this.base = p_base;
    }
    private void setAltura(double p_altura){
        this.altura = p_altura;
    }
    
    public double getBase(){
        return this.base;
    }
    public double getAltura(){
        return this.altura;
    }
    
    /**
     * Metodo para mostrar el nombre Triangulo
     * 
     * @return  devuelve el nombre de la figura geometrica
     */
    public String nombreFigura()
    {
       return "Triangulo";     
    }
    
    /**
     * Metodo para calcular la superficie del triangulo
     * 
     * @return  devuelve un flotante que equivale al total de la superficie del triangulo
     */
    public double superficie(){
        return this.getBase() * this.getAltura();
    }
}