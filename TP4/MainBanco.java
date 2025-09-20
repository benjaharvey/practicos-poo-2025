
public class MainBanco {
    
    public static void main(String[] args) {
        Localidad localidad1 = new Localidad("Riachuelo", "Corrientes");
        Empleado empleado1 = new Empleado(12345, "Benjamin", "Harvey", 350000, 2005);
        
        BancoConHash nuevoBanco = new BancoConHash("Banco Corrientes", localidad1, 145, empleado1);
        
        Empleado empleado2 = new Empleado(5555, "Flavio", "Mendoza", 250000, 2010);
        
        nuevoBanco.agregarEmpleado(empleado2);
        
        nuevoBanco.mostrar();
        
        double sueldos = nuevoBanco.sueldosAPagar();
        
        System.out.println(sueldos);
    }
}
