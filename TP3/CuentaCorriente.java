
/**
 * Una clase CuentaCorriente que nos permite instanciar y gestionar una cuenta corriente de banco por medio de los metodos que fueron definidos
 * 
 * @author      Hardoy - Harvey 
 * @version     8/9/2025
 */
public class CuentaCorriente
{
    private int nroCuenta;
    private double saldo;
    private double limiteDescubierto;
    private Persona titular;
    
    /**
     * Primer constructor de la clase CuentaCorriente, inicializa el saldo en 0
     *
     * @param   p_nroCuenta     Numero de cuenta del titular de la cuenta bancaria
     * @param   p_titular       Datos personales del titular de la cuenta bancaria
     */
    
    public CuentaCorriente(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(0);
        this.setLimiteDescubierto(500);
        this.setTitular(p_titular);
    }
    
    
    /**
     * Segundo constructor de la clase CuentaCorriente, inicializa el saldo en 0
     *
     * @param   p_nroCuenta     Numero de cuenta del titular de la cuenta bancaria
     * @param   p_titular       Datos personales del titular de la cuenta bancaria
     */
    
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(p_saldo);
        this.setLimiteDescubierto(500);
        this.setTitular(p_titular);
    }
    
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    
    private void setLimiteDescubierto(double p_limite){
        this.limiteDescubierto = p_limite;
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
    
    public Persona getTitular(){
        return this.titular;
    }
    
    public double getLimiteDescubierto(){
        return this.limiteDescubierto;
    }
    
    /**
     * Metodo que deposita la cantidad desea de dinero a la cuenta corriente
     * 
     * @param   p_importe   Cantidad de dinero que se desea depositar a el saldo de la cuenta
     */
    
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }
    
    /**
     * Metodo que nos permite calcular si es posible o no realizar una extracción de la cuenta corriente
     * 
     * @return boolean
     */
    
    private boolean puedeExtraer(double p_importe){
        if(p_importe <= this.getSaldo() + this.getLimiteDescubierto()){
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Metodo que realizara la extracción en el saldo de la cuenta corriente, recibira el importe a extraer mediante el parametro p_importe
     * 
     * @param   p_importe   Importe que sera extraido del saldo 
     */
    
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
    }
    
    /**
     * Metodo que determina si la extracción supera a el saldo existente en la cuenta corriente
     * 
     * @param   p_importe   Cantidad de dinero que se desea extraer del saldo de la caja
     */
    
    public void extraer(double p_importe){ 
    
        if(puedeExtraer(p_importe) == true){
            extraccion(p_importe);
        } else {
            System.out.println("El importe de extracción sobrepasa el límite de descubierto!"); 
        } 
    }
    
    /**
     * Metodo que permite visualizar al titular de la caja de ahorro, cuanto saldo posee y cual es su limite descubierto
     */
    
    public void mostrar(){ 
        System.out.println("- Cuenta Corriente -"); 
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe()); 
        System.out.println("Descubierto: " + this.getLimiteDescubierto());
    } 
}