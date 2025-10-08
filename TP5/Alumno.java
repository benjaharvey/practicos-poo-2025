/** Una clase Alumno que nos permite ingresar sus datos, notas, calcular su promedio, determinar si aprobo, etc. Una subclase de Persona.
 *
 * @author      Hardoy - Harvey 
 * @version     /2025
 */
public class Alumno extends Persona
{
    // instance variables
    private int lu;
    private double nota1;
    private double nota2;
    
    /**
     * @param   p_lu        Libreta universitaria del alumno
     * @param   p_nombre    nombre del alumno
     * @param   p_apellido  apellido del alumno
     * @param   p_dni       dni del alumno
     * @param   p_anio      anio de nacimiento del alumno
     */
    Alumno(int p_lu, String p_nombre, String p_apellido, int p_dni, int p_anio)
    {
        super(p_dni, p_nombre, p_apellido, p_anio);
        this.setLU(p_lu);
        this.setNotaUno(0.0);
        this.setNotaDos(0.0);
    }

    //Setters
    private void setLU(int p_lu){
        lu = p_lu;
    }
    public void setNotaUno(double p_nota1){
        nota1 = p_nota1;
    }
    public void setNotaDos(double p_nota2){
        nota2 = p_nota2;
    }
    
    //Getters
    public int getLU(){
        return lu;
    }
    public double getNotaUno(){
        return nota1;
    }
    public double getNotaDos(){
        return nota2;
    }
    
    /** Metodo que nos permite calcular el promedio en base a las notas
     * @return double
     */
    public double promedio(){
        return (getNotaUno() + getNotaDos()) / 2.0;
    }
    
    /** Metodo que devuelve true si el alumno cumplio las condiciones para aprobar o false si no lo hizo
     * @return boolean
     */
    public boolean aprueba(){
        return (promedio() >= 7 && getNotaUno() > 6 && getNotaDos() > 6);
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
        return super.getNombre() + " " + super.getApellido(); 
    } 

    /** Metodo para concatenar apellido y nombre
     * @return String
     */    
    public String apeYNom(){
         return super.getApellido() + " " + super.getNombre();   
    }
    
    /** Metodo para mostrar los datos, notas, promedio y si aprobo o no el alumno
     * 
     */
    public void mostrar(){
        super.mostrar();
        System.out.println("LU: " + getLU() + " " + "Notas: " + getNotaUno() + "-" + getNotaDos());
        System.out.println("Promedio: " + promedio() + "-" + leyendaAprueba());
    }
    
    
    
    
    
    
}