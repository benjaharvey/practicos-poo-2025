
/**
 * Write a description of class Banco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banco
{
    public static void main(String[] args){
        Persona titular = new Persona(45526737, "Juan Tomas", "Figuerero", 2004);
        
        CajaDeAhorro nuevaCaja = new CajaDeAhorro(26122003, titular, 45000);
        CuentaBancaria nuevaCuenta = new CuentaBancaria(26122003, titular, 20000);
        
        nuevaCaja.mostrar();
        
        nuevaCaja.extraer(25000);
        nuevaCaja.mostrar();
        
        nuevaCaja.depositar(2000000);
        nuevaCaja.mostrar();
        
        nuevaCuenta.mostrar();
        
        nuevaCuenta.depositar(120000);
        nuevaCuenta.extraer(25000);
        
        nuevaCuenta.mostrar();
        
        System.out.println("Cuenta Bancaria: " + nuevaCuenta.toStrinf());
    }
}