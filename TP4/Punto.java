/**
 * Una clase Punto que nos permite desplazar un punto por X y por Y para formar figuras geometricas y calcular distancias entre puntos.
 * 
 * @author      Hardoy - Harvey 
 * @version     24/08/2025
 */
public class Punto
{
    // instance variables
    private double x;
    private double y;

    /** Constructor para el objecto Punto
     * @param   p_x     abscisa x
     * @param   p_y     tangente y
     */
    Punto(double p_x, double p_y)
    {
        setX(p_x);
        setY(p_y);
    }
    /** Constructor para el objecto Punto
     *
     */
    Punto(){
        x = 0.0;
        y = 0.0;
    }

    private void setX(double p_x)
    {
        x = p_x;
    }
    private void setY(double p_y){
        y = p_y;
    }
    
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    
    /** Metodo que desplaza el punto segun los valores que le pasamos
     * @param   p_dx    cuanto desplazamos el punto x
     * @param   p_dy    cuanto desplazamos el punto y
     */
    public void desplazar(double p_dx, double p_dy){
        setX(getX() + p_dx);
        setY(getY() + p_dy);
    }
    /** Metodo que devuelve las coordenadas
     * @return  String 
     */
    public String coordenadas(){
        return "(" + getX() + ", " + getY() + ")";
    }
    /** Metodo para calcular la distancia entre el objeto punto y y otro objeto punto
     * @param   p_ptoDistante   otro punto hasta el que se calcula la distancia
     * @return double
     */
    public double distanciaA(Punto p_ptoDistante){
        double pitagoras = Math.pow(this.getX() - p_ptoDistante.getX(), 2) 
                     + Math.pow(this.getY() - p_ptoDistante.getY(), 2);
        return Math.sqrt(pitagoras);
    }
    /** Metodo que muestra la posicion de los puntos
     * 
     */
    public void mostrar(){
        System.out.println("Punto.X: "+ getX() + " Y: "+ getY());
    }
    
}
