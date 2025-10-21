import java.util.Scanner;

/**
 * Clase Comercio, que nos permite instanciar y probar las clases Lavarropas, Heladera y Cocina
 * 
 * @author      Hardoy - Harvey 
 * @version     20/10/25
 */
public class Comercio
{
    public static void main(String[] args){
        Scanner ingreso = new Scanner(System.in);
        int opcion;
        
        int cuotas = 0;
        float interes = 0;
        
        Cocina nuevaCocina = null;
        Heladera nuevaHeladera = null;
        Lavarropas nuevoLavarropas = null;
        
        do {
            System.out.println("\n --- MENU DEL PROGRAMA ---");
            System.out.println("1. Agregar Cocina");
            System.out.println("2. Agregar Heladera");
            System.out.println("3. Agregar Lavarropas");
            System.out.println("4. Configurar cuotas e interes");
            System.out.println("5. Mostrar Cocina");
            System.out.println("6. Mostrar Heladera");
            System.out.println("7. Mostrar Lavarropas");
            
            System.out.println("0. Cerrar programa");
            
            opcion = ingreso.nextInt();
            
            switch(opcion){
                case 1:
                    
                    ingreso.nextLine();
                    
                    System.out.println("Ingrese la marca de la cocina:");
                    String marca = ingreso.nextLine();
                    
                    System.out.println("Ingrese el precio de la cocina:");
                    float precio = ingreso.nextFloat();
                    
                    System.out.println("Ingrese el stock existente de cocinas: ");
                    int stock = ingreso.nextInt();
                    
                    System.out.println("Ingrese la cantidad de hornallas: ");
                    int hornallas = ingreso.nextInt();
                    
                    System.out.println("Ingrese la cantidad de calorias: ");
                    int calorias = ingreso.nextInt();
                    ingreso.nextLine();
                    
                    System.out.println("Ingrese las dimensiones de la cocina: ");
                    String dimensiones = ingreso.nextLine();
                    
                    nuevaCocina = new Cocina(marca, precio, stock, hornallas, calorias, dimensiones);
                    
                    System.out.println("Cocina agregada!");
                    
                break;
                    
                case 2:
                    
                    ingreso.nextLine();
                    
                    System.out.println("Ingrese la marca de la heladera:");
                    marca = ingreso.nextLine();
                    
                    System.out.println("Ingrese el precio de la heladera:");
                    precio = ingreso.nextFloat();
                    
                    System.out.println("Ingrese el stock existente de heladeras: ");
                    stock = ingreso.nextInt();
                    
                    System.out.println("Ingrese la cantidad de puertas: ");
                    int puertas = ingreso.nextInt();
                    
                    System.out.println("Ingrese la cantidad de pies: ");
                    int pies = ingreso.nextInt();
                    
                    System.out.println("La heladera tiene compresor? (true/false): ");
                    boolean compresor = ingreso.nextBoolean();
                    
                    nuevaHeladera = new Heladera(marca, precio, stock, puertas, pies, compresor);
                    
                    System.out.println("Heladera agregada!");
                
                break;
                
                case 3:
                    
                    ingreso.nextLine();
                    
                    System.out.println("Ingrese la marca del lavarropas:");
                    marca = ingreso.nextLine();
                    
                    System.out.println("Ingrese el precio del lavarropas:");
                    precio = ingreso.nextFloat();
                    
                    System.out.println("Ingrese el stock existente de lavarropas: ");
                    stock = ingreso.nextInt();
                    
                    System.out.println("Ingrese la cantidad de programas que tiene el lavarropas: ");
                    int programas = ingreso.nextInt();
                    
                    System.out.println("Ingrese la cantidad de kilos que soporta el lavarropas: ");
                    float kilos = ingreso.nextFloat();
                    
                    System.out.println("Tiene modo automatico? (true/false): ");
                    boolean automatico = ingreso.nextBoolean();
                    
                    nuevoLavarropas = new Lavarropas(marca, precio, stock, programas, kilos, automatico);
                    
                    System.out.println("Lavarropas agregado!");
                    
                break;
                
                case 4:
                    ingreso.nextLine();
                    
                    System.out.println("Ingrese la cantidad de cuotas disponibles: ");
                    cuotas = ingreso.nextInt();
                    
                    System.out.println("Ingrese el porcentaje de interes que se le aplicara a las cuotas");
                    interes = ingreso.nextFloat();
                    
                break;
                
                case 5:
                    
                    if(nuevaCocina != null){
                        nuevaCocina.imprimir();
                        System.out.println("Cuotas: " + cuotas + " Interes: " + interes);
                        System.out.println("Valor Cuota: " + nuevaCocina.cuotaCredito(cuotas, interes));
                        System.out.println("Valor Cuota Con Adicionales: " + nuevaCocina.creditoConCondicional(cuotas, interes));
                    } else {
                        System.out.println("No se ha creado ninguna cocina!");
                    }
                    
                break;
                
                case 6:
                    
                    if(nuevaHeladera != null){
                        nuevaHeladera.imprimir();
                        System.out.println("Cuotas: " + cuotas + " Interes: " + interes);
                        System.out.println("Valor Cuota: " + nuevaHeladera.cuotaCredito(cuotas, interes));
                        System.out.println("Valor Cuota Con Adicionales: " + nuevaHeladera.creditoConCondicional(cuotas, interes));
                    } else {
                        System.out.println("No se ha creado ninguna heladera!");
                    }
                
                break;
                
                case 7:
                    
                    if(nuevoLavarropas != null){
                        nuevoLavarropas.imprimir();
                        System.out.println("Cuotas: " + cuotas + " Interes: " + interes);
                        System.out.println("Valor Cuota: " + nuevoLavarropas.cuotaCredito(cuotas, interes));
                        System.out.println("Valor Cuota Con Adicionales: " + nuevoLavarropas.creditoConCondicional(cuotas, interes));
                    }
                
                break;
                
                case 0:
                    
                    System.out.println("Gracias por usar nuestro programa :D");
                    System.out.println("Creador por Juan Segundo Hardoy y Benjamín J.A. Harvey");
                    
                break;
            }
        } while (opcion != 0);
        
        ingreso.close();
    }
}