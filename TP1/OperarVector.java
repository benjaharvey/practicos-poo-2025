import java.util.Scanner;
public class OperarVector
{
    public static void main(String[] args){
        int[] var = new int[5];
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese los 5 valores enteros del vector: ");
        for(int i=0; i<5; i++){
                    var[i] = teclado.nextInt();
                    System.out.println("Nota "+ (i+1) +": "+ var[i] + "\t");
        }
        System.out.println("Promedio notas: "+ calcularPromedio(var));
        System.out.println("Mayor nota: "+ buscarMaximo(var));
    }
    
    public static double calcularPromedio(int[] p_var){
        int suma = 0;
        for(int i=0; i<5; i++){
            suma += p_var[i];
        }
        return (double)suma / 5;
    }

        public static int buscarMaximo(int[] p_var){
        int maximo = Integer.MIN_VALUE;
        for(int i=0; i<5; i++){
            if(p_var[i] > maximo){
                maximo = p_var[i];
            }
        }
        return maximo;
    }
    

}