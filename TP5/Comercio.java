
/**
 * Write a description of class Comercio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comercio
{
    public static void main(String[] args){
        Cocina nuevaCocina = new Cocina("Volcan", 65000, 7, 4, 2500, "50*30*30cm");
        Heladera nuevaHeladera = new Heladera("Samsung", 1200f, 8, 11, 2, true);
        Lavarropas nuevoLavarropas = new Lavarropas("LG", 950f, 5, 12, 80, false);
        
        int cuotas = 12;
        float interes = 3.5f;
        
        nuevaCocina.imprimir();
        System.out.println("Cuotas: " + cuotas + " Interes: " + interes);
        System.out.println("Valor Cuota: " + nuevaCocina.cuotaCredito(cuotas, interes));
        System.out.println("Valor Cuota Con Adicionales: " + nuevaCocina.cuotaCredito(cuotas, interes));
        
        nuevaHeladera.imprimir();
        System.out.println("Cuotas: " + cuotas + " Interes: " + interes);
        System.out.println("Valor Cuota: " + nuevaHeladera.cuotaCredito(cuotas, interes));
        System.out.println("Valor Cuota Con Adicionales: " + nuevaHeladera.cuotaCredito(cuotas, interes));
        
        nuevoLavarropas.imprimir();
        System.out.println("Cuotas: " + cuotas + " Interes: " + interes);
        System.out.println("Valor Cuota: " + nuevoLavarropas.cuotaCredito(cuotas, interes));
        System.out.println("Valor Cuota Con Adicionales: " + nuevoLavarropas.cuotaCredito(cuotas, interes));
    }
}