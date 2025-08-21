
public class EjecutarCliente
{
    public static void main(String[] args){
        int dni = Integer.valueOf(args[0]);
        String apellido = String.valueOf(args[1]);
        String nombre = String.valueOf(args[2]);
        double saldo = Double.valueOf(args[3]);
        Cliente unCliente = new Cliente(dni, apellido, nombre, saldo);
        System.out.println("Saldo Cliente: " + unCliente.getSaldo());
        System.out.println("Nuevo Saldo: " + unCliente.nuevoSaldo(300.25));
        System.out.println("Agregar Saldo: " + unCliente.agregarSaldo(425.5));
        System.out.println("Apellido y Nombre: "+ unCliente.apeYNom());
        System.out.println("Nombre y Apellido: "+ unCliente.nomYApe());
        unCliente.mostrar();
    }
}