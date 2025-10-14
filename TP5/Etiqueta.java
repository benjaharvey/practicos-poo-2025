
/**
 * Una clase etiqueta que tiene un costo
 * 
 * @author      Hardoy - Harvey 
 * @version     20/10/2025
 */
public abstract class Etiqueta
{
   private double costo;
   
   /**
    * Constructor de la clase Etiqueta
    * 
    * @param    p_costo     costo de la etiqueta
    */
   public Etiqueta(double p_costo){
       this.setCosto(p_costo);
   }
   
   private void setCosto(double p_costo){
       this.costo = p_costo;
   }
   public double getCosto(){
       return this.costo;
   }
   
   /**
    * Metodo abstracto para implementar en las hijas el metodo precio
    * 
    * @param    q   cantidad de etiquetas
    * @return   devuelve un valor que es el precio total de las etiquetas
    */
   public abstract double precio(int q);
   
    /**
    * Metodo abstracto para implementar en las hijas el metodo tipo
    * 
    * @return   devuelve una cadena que es el tipo de etiqueta del objeto
    */
   protected abstract String tipo();
   
   /**
    * Metodo para mostrar una cadena con el tipo de etiqueta y su informacion
    * 
    * @return   devuelve una cadena con la informacion del objeto
    */
   public String toString(){
       return this.tipo() + " - Costo: $" + this.getCosto();
   }
}
