/**
 * Una clase que utilizamos para instanciar los objetos Laboratorio y Producto para luego probar sus metodos
 */
public class GestionarStock
{
    public static void main(String[] args)
    {
        Laboratorio nuevoLab = new Laboratorio("Colgate S.A", "Scalabrani Ortiz S.A", "54-11 -4239-8447");
        Producto prueba = new Producto(12345, "Perfumeria", "Jabon Deluxe", 5.25, nuevoLab);
        
        prueba.ajuste(500);
        prueba.mostrar();
        prueba.ajuste(-200);
        prueba.mostrar();
        prueba.mostrarLinea();
    }
}