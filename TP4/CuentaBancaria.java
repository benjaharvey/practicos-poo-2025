
/**
 * Clase CuentaBancaria que nos permite instanciar una cuenta bancaria, que utilizaremos para realizar operaciones de deposito y extracción, ademas de poder visualizar los datos del titular de dicha cuenta 
 * 
 * @author      Hardoy - Harvey 
 * @version     8/9/25
 */
public class CuentaBancaria
{
     private int nroCuenta;
     private double saldo;
     private Persona titular;
     
     /**
      * Primer constructor de la clase CuentaBancaria, que inicializa el saldo en 0
      * 
      * @param  p_nroCuenta     Numero de cuenta del titular
      * @param  p_titular       Datos personales del titular
      */
     
     public CuentaBancaria(int p_nroCuenta, Persona p_titular){
         this.setNroCuenta(p_nroCuenta);
         this.setTitular(p_titular);
         this.setSaldo(0);
     }
     
    /**
      * Segundo constructor de la clase CuentaBancaria, que inicializa el saldo mediante el parametro p_saldo 
      * 
      * @param  p_nroCuenta     Numero de cuenta del titular
      * @param  p_titular       Datos personales del titular
      * @param  p_saldo         Saldo inicial de la cuenta bancaria
      */
     public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo){
         this.setNroCuenta(p_nroCuenta);
         this.setTitular(p_titular);
         this.setSaldo(p_saldo);
     }

     private void setNroCuenta(int p_nroCuenta){
         this.nroCuenta = p_nroCuenta;
     }

     private void setSaldo(double p_saldo){
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
      * Metodo que deposita una cantidad de dinero al saldo de la cuenta bancaria
      * 
      * @param  p_importe   Importe que se va a depositar en el saldo de la cuenta
      */
     
     public double depositar(double p_importe){
         this.setSaldo(getSaldo() + p_importe);
         return getSaldo();
     }
     
          
     /**
      * Metodo que extrae una cantidad de dinero del saldo de la cuenta bancaria
      * 
      * @param  p_importe   Importe que se va a extraer del saldo de la cuenta
      */
     
     public double extraer(double p_importe){
         this.setSaldo(getSaldo() - p_importe);
         return getSaldo(); 
     }
     
     /**
      * Metodo que permite visualizar el titular de la cuenta bancaria y con cuanto saldo cuenta este
      * 
      */
     
     public void mostrar(){
         System.out.println(" - Cuenta Bancaria - ");
         System.out.println("Titular: " + getTitular().nomYApe() + " (" + getTitular().edad() + " años)");
         System.out.println("Saldo: " + getSaldo());
     }
     
     /**
      * Metodo que concatena todos los datos de la cuenta en una sola linea
      * 
      * @return String
      */
     
     public String toStrinf(){
         return getNroCuenta() + "      " + getTitular().nomYApe() + "      " + getSaldo(); 
     }
}