/**
 * Una clase CajaDeAhorro que permite obtener sus datos
 * 
 * @author Hardoy - Harvey 
 * @version 08/09/25
 */
public class CajaDeAhorro
{
    private int nroCuenta;
    private double saldo;
    private int extraccionesPosibles;
    private Persona titular;
    
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular){
        this.setSaldo(0);
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setExtraccionesPosibles(10);
    }
    
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
    
    private boolean puedeExtraer(double p_importe){
        if(p_importe <= this.getSaldo() && getExtraccionesPosibles() > 0){
            return true;
        } else {
            return false;
        }
    }
    
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
    }
    
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
    
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }
    
    public void mostrar(){
        System.out.println("-  Caja de Ahorro  -");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Extracciones posibles: " + this.getExtraccionesPosibles());
    }
}