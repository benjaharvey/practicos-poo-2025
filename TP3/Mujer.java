/**
 * Una clase mujer que tiene metodos para mostrar su datos, casarse y divorciarse.
 * 
 * @author  Hardoy - Harvey
 * @version 08/09/25
 */
public class Mujer
{
    // instance variables
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Hombre esposo;

    /**
     * Constructor de la clase Mujer sin esposo
     * 
     * @param   p_nombre    nombre de la mujer
     * @param   p_apellido  apellido de la mujer
     * @param   p_edad      edad de la mujer
     */
    Mujer(String p_nombre, String p_apellido, int p_edad) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
        this.setEsposo(null);
    }

    /**
     * Constructor de la clase Mujer
     * 
     * @param   p_nombre    nombre de la mujer
     * @param   p_apellido  apellido de la mujer
     * @param   p_edad      edad de la mujer
     * @param   p_esposo    objeto de clase Hombre que es el esposo de la mujer
     */
    Mujer(String p_nombre, String p_apellido, int p_edad, Hombre p_esposo) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Casada");
        this.setEsposo(p_esposo);
    }

    // Setters
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }
    private void setEdad(int p_edad) {
        this.edad = p_edad;
    }
    private void setEstadoCivil(String p_estadoCivil) {
        this.estadoCivil = p_estadoCivil;
    }
    private void setEsposo(Hombre p_esposo) {
        this.esposo = p_esposo;
    }

    // Getters
    public String getNombre() {
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public int getEdad() {
        return this.edad;
    }
    public String getEstadoCivil() {
        return this.estadoCivil;
    }
    public Hombre getEsposo() {
        return this.esposo;
    }
    
    /**
     * Metodo para casar a la Mujer con un Hombre
     * 
     * @param   p_hombre    hombre con el que se quiere casar a la mujer
     */
    public void casarseCon(Hombre p_hombre){
        if(this.getEsposo() == null){
            this.setEsposo(p_hombre);
            this.getEsposo().casarseCon(this);
            this.setEstadoCivil("Casada");
        }
    }
    
    /**
     * Metodo para divorciar a la Mujer
     */
    public void divorcio(){
        if(this.getEstadoCivil().equals("Casada")){
            this.setEstadoCivil("Divorciada");
            
            if(this.getEsposo() != null && this.getEsposo().getEstadoCivil().equals("Casado")){
                this.getEsposo().divorcio();
                this.setEsposo(null);
            }
        }
    }
    
    /**
     * Metodo para mostrar los datos de la Mujer
     * 
     * @return  devuelve una cadena con los datos de la mujer
     */
    public String datos(){
        return this.getNombre() + " " + this.getApellido() + " de " + this.getEdad() + " años";
    }
    
    /**
     * Metodo para mostrar los datos y el estado civil de la mujer
     */
    public void mostrarEstadoCivil(){
        System.out.println(this.datos() + " - " + this.getEstadoCivil());
    }
    
    /**
     * Metodo para mostrar los datos y con quien esta casada la mujer
     */
    public void casadaCon(){
        System.out.println(this.datos() + " esta casada con " + this.getEsposo().datos());
    }
}