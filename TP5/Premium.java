
/**
 * Una clase Comun que es un tipo de etiqueta
 * 
 * @author      Hardoy - Harvey
 * @version     20/10/2025
 */
public class Premium extends Etiqueta
{
    private int colores;
    
    /**
     * Constructor de la clase Premium
     * 
     * @param   p_costo     costo de la etiqueta
     * @param   p_colores   cantidad de colores de la etiqueta
     */
    public Premium(double p_costo, int p_colores){
        super(p_costo);
        this.setColores(p_colores);
    }
    
    private void setColores(int p_colores){
        this.colores = p_colores;
    }
    public int getColores(){
        return this.colores;
    }
    
    /**
     * Calcula el precio en base a un precio base que es variable y el numero de colores que se le agrega
     * 
     * @param   q   cantidad de etiquetas
     * @return  devuelve el precio total de las etiquetas
     */
    public double precio(int q){
        double subtotal = q * this.getCosto();
        double adicional = subtotal * this.adicional();
        return subtotal + adicional;
    }
    
    /**
     * Calcula el adicional en base a la cantidad de colores usados
     * 
     * @return  devuelve el valor del adicional a aniadir al costo
     */
    private double adicional(){
        int colores = this.getColores();
        if(colores == 2){
            return 0.05;
        }
        else if(colores == 3){
            return 0.07;
        }
        else if(colores > 3){
            return 0.03 * colores;
        }
        else{
            return 1;
        }
    }
    
    /**
     * Metodo para saber que se trata de una etiqueta comun
     * 
     * @return      devuelve una cadena que dice comun
     */
    protected String tipo(){
        return "tipo Premium";
    }
    
    /**
    * Metodo para mostrar una cadena con el tipo de etiqueta y su informacion
    * 
    * @return   devuelve una cadena con la informacion del objeto
    */
   public String toString(){
       return super.toString() + " - Colores: " +this.getColores();
   }
}