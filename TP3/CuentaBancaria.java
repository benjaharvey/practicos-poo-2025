
/**
 * Write a description of class CuentaBancaria here.
 * 
 * @author      Hardoy - Harvey 
 * @version     8/9/25
 */
public class CuentaBancaria
{
     private int nroCuenta;
     private double saldo;
     private Persona titular;
     
     public CuentaBancaria(int p_nroCuenta, Persona p_titular){
         this.setNroCuenta(p_nroCuenta);
         this.setTitular(p_titular);
     }
     
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
     
     public double depositar(double p_importe){
         this.setSaldo(getSaldo() + p_importe);
         return getSaldo();
     }
     
     public double extraer(double p_importe){
         this.setSaldo(getSaldo() - p_importe);
         return getSaldo(); 
     }
     
     public void mostrar(){
         System.out.println(" - Cuenta Bancaria - ");
         System.out.println("Titular: " + getTitular().nomYApe() + " (" + getTitular().edad() + " años)");
         System.out.println("Saldo: " + getSaldo());
     }
     
     public String toStrinf(){
         return getNroCuenta() + "      " + getTitular().nomYApe() + "      " + getSaldo(); 
     }
}