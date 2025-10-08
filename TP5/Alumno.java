/** Una clase Alumno que nos permite ingresar sus datos, notas, calcular su promedio, determinar si aprobo, etc.
 *
 * @author      Hardoy - Harvey 
 * @version     24/08/2025
 */
public class Alumno extends Persona
{
    // instance variables
    private int lu;
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;
    
    /**
     * @param   p_lu        Libreta universitaria del alumno
     * @param   p_nombre    nombre del alumno
     * @param   p_apellido  apellido del alumno
     */
    Alumno(int p_lu, String p_nombre, String p_apellido, int p_dni, int p_anio)
    {
        super(p_dni, p_nombre, p_apellido, p_anio);
        this.setLU(p_lu);
        this.setNota1(0.0);
        this.setNota2(0.0);
    }

    private void setLU(int p_lu){
        lu = p_lu;
    }
    
    public void setNota1(double p_nota1){
        nota1 = p_nota1;
    }
    public void setNota2(double p_nota2){
        nota2 = p_nota2;
    }
    
    public int getLU(){
        return lu;
    }
    
    public double getNota1(){
        return nota1;
    }
    public double getNota2(){
        return nota2;
    }
    
    /** Metodo que nos permite calcular el promedio en base a las notas
     * @return double
     */
    public double promedio(){
        return (getNota1() + getNota2()) / 2.0;
    }
    
    /** Metodo que devuelve true si el alumno cumplio las condiciones para aprobar o false si no lo hizo
     * @return boolean
     */
    public boolean aprueba(){
        return (promedio() >= 7 && getNota1() > 6 && getNota2() > 6);
    }
    
    /** Metodo que devuelve un texto para avisar si el alumno aprobo o no la mteria
     * @return String
     */
    public String leyendaAprueba(){
        if(aprueba()){
            return "APROBADO";
        }
        else{
            return "DESAPROBADO";
        }
    }
    
    /** Metodo para concatenar nombre y apellido
     * @return String
     */  
    public String nomYApe(){
        return getNombre() + " " + getApellido(); 
    } 

    /** Metodo para concatenar apellido y nombre
     * @return String
     */    
    public String apeYNom(){
         return getApellido() + " " + getNombre();   
    }
    
    /** Metodo para mostrar los datos, notas, promedio y si aprobo o no el alumno
     * 
     */
    public void mostrar(){
        super.mostrar();
        System.out.println("LU: " + getLU() + " " + "Notas: " + getNota1() + "-" + getNota2());
        System.out.println("Promedio: " + promedio() + "-" + leyendaAprueba());
    }
}