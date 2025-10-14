
/**
 * Una clase CuentaBancaria, que nos permite realizar operaciones basicas como depositar un monto y mostrar los datos del titular
 * 
 * @author      Hardoy - Harvey 
 * @version     20/10/25
 */

public class CuentaBancaria
{
    private int nroCuenta;
    private double saldo;
    private Persona titular;
    
    
    /**
     *  Primer constructor de la clase CuentaBancaria, este iniciara con el saldo en 0
     *  
     *  @param  p_nroCuenta     Numero de cuenta de la cuenta bancaria
     *  @param  p_titular       Titular de la cuenta bancaria
     */
    
    public CuentaBancaria(int p_nroCuenta, Persona p_titular){
        this.setTitular(p_titular);
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(0);
    }
    
    
    /**
     *  Segundo constructor de la clase CuentaBancaria, este iniciara con el saldo que el parametro p_saldo le indique
     *  
     *  @param  p_nroCuenta     Numero de cuenta de la cuenta bancaria
     *  @param  p_titular       Titular de la cuenta bancaria
     *  @param  p_saldo         Cantidad de saldo inicial con la que inicia la cuenta bancaria
     */
    
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setTitular(p_titular);
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(p_saldo);
    }
    
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    
    protected void setSaldo(double p_saldo){
        this.saldo = p_saldo;
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
    
    /**
     * Metodo que nos permite agregar al saldo un monto que sera indicado por el parametro p_importe
     * 
     * @param   p_importe       Cantidad de dinero que sera depositado (agregado) al saldo de la cuenta
     */
    
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }
    
    
    /**
     * Metodo que mostrara los detalles principales de la cuenta bancaria
     */
    
    public void mostrar(){
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
    }
}