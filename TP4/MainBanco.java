
public class MainBanco {
    
    public static void main(String[] args) {
        Localidad localidad1 = new Localidad("Riachuelo", "Corrientes");
        Empleado empleado1 = new Empleado(12345, "Benjamin", "Harvey", 350000, 2005);
        
        Banco nuevoBanco = new Banco("Banco Corrientes", localidad1, 145, empleado1);
        
        Empleado empleado2 = new Empleado(5555, "Flavio", "Mendoza", 250000, 2010);
        
        nuevoBanco.agregarEmpleado(empleado2);
        
        nuevoBanco.mostrar();
        
        System.out.println("Sueldos a pagar: " + nuevoBanco.sueldosAPagar());
        
        Persona unaPersona = new Persona(5343, "Juan", "Perez", 2008);
        
        Persona otraPersona = new Persona(1234, "Pablo", "Mendez", 2001);
        
        CuentaBancaria unaCuenta = new CuentaBancaria(123, unaPersona, 4000);
        
        CuentaBancaria otraCuenta = new CuentaBancaria(456, otraPersona, 0);
        
        nuevoBanco.agregarCuentaBancaria(unaCuenta);
        nuevoBanco.agregarCuentaBancaria(otraCuenta);
        
        nuevoBanco.mostrarResumen();
        
    }
}
