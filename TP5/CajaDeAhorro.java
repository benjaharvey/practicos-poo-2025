/**
 * Una clase CajaDeAhorro que nos permite instanciar y gestionar una caja de ahorro de banco por medio de los metodos definidos
 * 
 * @author      Hardoy - Harvey 
 * @version     08/09/25
 */
public class CajaDeAhorro extends CuentaBancaria
{
    private int extraccionesPosibles;
    
    
    /**
     * Primer constructor de la clase CajaDeAhorro, inicializa el saldo en 0
     *
     * @param   p_nroCuenta     Numero de cuenta del titular de la caja de ahorro
     * @param   p_titular       Datos personales del titular de la caja de ahorro
     */
    
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular){
        super(p_nroCuenta, p_titular, 0);
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
        super(p_nroCuenta, p_titular, p_saldo);
        this.setExtraccionesPosibles(10);
    }
    
    private void setExtraccionesPosibles(int p_extracciones){
        this.extraccionesPosibles = p_extracciones;
    }
    
    public int getExtraccionesPosibles(){
        return this.extraccionesPosibles;
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
     * Metodo que determina si la extracción supera a el saldo existente en la caja o si quedan aun extracciones posibles
     * 
     * @param   p_importe   Cantidad de dinero que se desea extraer del saldo de la caja
     */
    
    public void extraer(double p_importe){
        if(puedeExtraer(p_importe) == true){
            this.setSaldo(this.getSaldo() - p_importe);
            this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
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
     * Metodo que permite visualizar al titular de la caja de ahorro, cuanto saldo posee y cuantas extracciones posibles le quedan
     */
    
    public void mostrar(){
        System.out.println("-  Caja de Ahorro  -");        
        super.mostrar();
        System.out.println("Extracciones posibles: " + this.getExtraccionesPosibles());
    }
}