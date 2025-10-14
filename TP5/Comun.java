
/**
 * Una clase Comun que es un tipo de etiqueta
 * 
 * @author      Hardoy - Harvey
 * @version     20/10/2025
 */
public class Comun extends Etiqueta
{
    private double plus;
    
    /**
     * Constructor de la clase Comun
     * 
     * @param   p_costo     costo de la etiqueta
     * @param   p_plus      plus por el disenio de la etiqueta
     */
    public Comun(double p_costo, double p_plus){
        super(p_costo);
        this.setPlus(p_plus);
    }
    
    private void setPlus(double p_plus){
        this.plus = p_plus;
    }
    public double getPlus(){
        return this.plus;
    }
    
    /**
     * Calcula el precio en base a un precio base que es 100 y el numero de unidades compradas
     * 
     * @param   q   cantidad de etiquetas
     * @return  devuelve el precio total de las etiquetas
     */
    public double precio(int q){
        double precioUnidad =  this.getCosto();
        System.out.println(precioUnidad);
        double subTotal = (q * precioUnidad) + this.getPlus();
        System.out.println(subTotal);
        double descuento = subTotal * this.descuento(q);
        System.out.println(descuento);
        return subTotal - descuento;
    }
    
    /**
     * Calcula el descuento en base a la cantidad de unidades compradas
     * 
     * @param   q   cantidad  de etiquetas
     * @return  devuelve el valor del descuento a hacer
     */
    private double descuento(int q){
        if(q > 10 && q < 51){
            return 0.02;
        }
        else if(q > 50 && q < 101){
            return 0.05;
        }
        else if(q > 100){
            int cont = 0;
            cont = q / 10;
            return cont * 0.01;
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
        return "tipo Comun";
    }
    
    /**
    * Metodo para mostrar una cadena con el tipo de etiqueta y su informacion
    * 
    * @return   devuelve una cadena con la informacion del objeto
    */
   public String toString(){
       return super.toString() + " - Disenio: $" + this.getPlus();
   }
}