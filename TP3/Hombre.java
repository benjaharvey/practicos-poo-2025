
/**
 * Una clase Hombre que tiene metodos para mostrar su datos, casarse y divorciarse.
 * 
 * @author (your name) 
 * @version 08/09/25
 */
public class Hombre
{
    // instance variables
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;

    /**
     * Constructor de la clase Hombre sin esposa
     * 
     * @param   p_nombre    nombre del hombre
     * @param   p_apellido  apellido del hombre
     * @param   p_edad      edad del hombre
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero");
        this.setEsposa(null);
    }

    /**
     * Constructor de la clase Hombre con esposa
     * 
     * @param   p_nombre    nombre del hombre
     * @param   p_apellido  apellido del hombre
     * @param   p_edad      edad del hombre
     * @param   p_esposa    objeto de clase Mujer que es la esposa del hombre
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Casado");
        this.setEsposa(p_esposa);
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
    private void setEsposa(Mujer p_esposa) {
        this.esposa = p_esposa;
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
    public Mujer getEsposa() {
        return this.esposa;
    }
    
    /**
     * Metodo para casar al Hombre con una Mujer
     * 
     * @param   p_mujer    mujer con la que se quiere casar el hombre
     */
        public void casarseCon(Mujer p_mujer){
        this.setEsposa(p_mujer);
        this.setEstadoCivil("Casado");
    }

    /**
     * Metodo para divorciar al Hombre
     */
    public void divorcio(){
        this.setEstadoCivil("Divorciado");
    }
    
    /**
     * Metodo para mostrar los datos del Hombre
     * 
     * @return  devuelve una cadena con los datos del hombre
     */
    public String datos(){
        return this.getNombre() + " " + this.getApellido() + " de " + this.getEdad() + " años";
    }
    
    /**
     * Metodo para mostrar los datos y el estado civil del hombre
     */
    public void mostrarEstadoCivil(){
        System.out.println(this.datos() + " - " + this.getEstadoCivil());
    }
    
    /**
     * Metodo para mostrar los datos y con quien esta casado el hombre
     */
    public void casadoCon(){
        System.out.println(this.datos() + " esta casado con " + this.getEsposa().datos());
    }
}