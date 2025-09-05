
/**
 * Clase ProbarCuentaBancaria, que nos permite ir probando uno por uno los metodos que definimos en la clase CuentaBancaria
 * 
 * @author      Hardoy-Harvey
 * @version     8/9/2025
 */
public class ProbarCuentaBancaria
{
    public static void main(String[] args){
        Persona nuevaPersona = new Persona(45526737, "Benjamin", "Harvey", 2003);
        CuentaBancaria nuevaCuenta = new CuentaBancaria(2612, nuevaPersona, 256010);
        
        nuevaCuenta.mostrar();
        
        nuevaCuenta.depositar(100000);
        
        nuevaCuenta.mostrar();
        
        nuevaCuenta.extraer(50000);
        
        nuevaCuenta.mostrar();
        System.out.println(" " + nuevaCuenta.toStrinf());
    }
}