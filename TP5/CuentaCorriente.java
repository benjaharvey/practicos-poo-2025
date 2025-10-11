
/**
 * Una clase CuentaCorriente que nos permite instanciar y gestionar una cuenta corriente de banco por medio de los metodos que fueron definidos
 * 
 * @author      Hardoy - Harvey 
 * @version     8/9/2025
 */
public class CuentaCorriente extends CuentaBancaria
{
    private double limiteDescubierto;
    
    /**
     * Primer constructor de la clase CuentaCorriente, inicializa el saldo en 0
     *
     * @param   p_nroCuenta     Numero de cuenta del titular de la cuenta bancaria
     * @param   p_titular       Datos personales del titular de la cuenta bancaria
     */
    
    public CuentaCorriente(int p_nroCuenta, Persona p_titular){
        super(p_nroCuenta, p_titular, 0);
        this.setLimiteDescubierto(500);
    }
    
    /**
     * Segundo constructor de la clase CuentaCorriente, inicializa el saldo en 0
     *
     * @param   p_nroCuenta     Numero de cuenta del titular de la cuenta bancaria
     * @param   p_titular       Datos personales del titular de la cuenta bancaria
     * @param   p_saldo         Saldo inicial de la cuenta bancaria
     */
    
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo){
        super(p_nroCuenta, p_titular, p_saldo);
        this.setLimiteDescubierto(500);
    }
    
    private void setLimiteDescubierto(double p_limite){
        this.limiteDescubierto = p_limite;
    }
    
    public double getLimiteDescubierto(){
        return this.limiteDescubierto;
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
     * Metodo que determina si la extracción supera a el saldo existente en la cuenta corriente
     * 
     * @param   p_importe   Cantidad de dinero que se desea extraer del saldo de la caja
     */
    
    public boolean extraer(double p_importe){ 
        if(puedeExtraer(p_importe) == true){
            this.setSaldo(this.getSaldo() - p_importe);
            return true;
        } else {
            return false;
        }
    }   
    
    /**
     * Metodo que permite visualizar al titular de la caja de ahorro, cuanto saldo posee y cual es su limite descubierto
     */
    
    public void mostrar(){ 
        System.out.println("- Cuenta Corriente -"); 
        super.mostrar();
        System.out.println("Descubierto: " + this.getLimiteDescubierto());
    } 
}