/**
 * Una clase CajaDeAhorro que nos permite instanciar y gestionar una caja de ahorro de banco por medio de los metodos definidos
 * 
 * @author      Hardoy - Harvey 
 * @version     08/09/25
 */
public class CajaDeAhorro
{
    private int nroCuenta;
    private double saldo;
    private int extraccionesPosibles;
    private Persona titular;
    
    
    /**
     * Primer constructor de la clase CajaDeAhorro, inicializa el saldo en 0
     *
     * @param   p_nroCuenta     Numero de cuenta del titular de la caja de ahorro
     * @param   p_titular       Datos personales del titular de la caja de ahorro
     */
    
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular){
        this.setSaldo(0);
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setExtraccionesPosibles(10);
    }
    
    
    /**
     * Segundo constructor de la clase CajaDeAhorro, inicializa el saldo mediante el parametro p_saldo
     *
     * @param   p_nroCuenta     Numero de cuenta del titular de la caja de ahorro
     * @param   p_titular       Datos personales del titular de la caja de ahorro
     * @param   p_saldo         Saldo inicial con el que contara la caja de ahorro
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setSaldo(p_saldo);
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setExtraccionesPosibles(10);
    }
    
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    
    private void setExtraccionesPosibles(int p_extracciones){
        this.extraccionesPosibles = p_extracciones;
    }
    
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public int getExtraccionesPosibles(){
        return this.extraccionesPosibles;
    }
    
    public Persona getTitular(){
        return this.titular;
    }
    
    /**
     * Metodo que nos permite calcular si es posible o no realizar una extracción de la caja de ahorro
     * 
     * @return boolean
     */
    
    private boolean puedeExtraer(double p_importe){
        if(p_importe <= this.getSaldo() && getExtraccionesPosibles() > 0){
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Metodo que realizara la extracción en el saldo de la caja de ahorro, recibira el importe a extraer mediante el parametro p_importe
     * 
     * @param   p_importe   Importe que sera extraido del saldo 
     */
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
    }
    
    /**
     * Metodo que determina si la extracción supera a el saldo existente en la caja o si quedan aun extracciones posibles
     * 
     * @param   p_importe   Cantidad de dinero que se desea extraer del saldo de la caja
     */
    
    public void extraer(double p_importe){
        if(puedeExtraer(p_importe) == true){
            extraccion(p_importe);
        } else {
            
            if(this.getExtraccionesPosibles() == 0){
                System.out.println("No tiene habilitadas mas extracciones!");
            }
            
            if(p_importe > this.getSaldo()){
                System.out.println("No puede extraer mas que el saldo!");
            }
            
        }
    }
    
     /**
     * Metodo que deposita la cantidad desea de dinero a la caja de ahorro
     * 
     * @param   p_importe   Cantidad de dinero que se desea depositar a el saldo de la caja
     */

    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }
    
    /**
     * Metodo que permite visualizar al titular de la caja de ahorro, cuanto saldo posee y cuantas extracciones posibles le quedan
     */
    
    public void mostrar(){
        System.out.println("-  Caja de Ahorro  -");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Extracciones posibles: " + this.getExtraccionesPosibles());
    }
}