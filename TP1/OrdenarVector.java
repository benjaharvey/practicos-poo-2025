import java.util.Scanner;

public class OrdenarVector
{
    public static void main(String[] args)
    {
        double[] var = new double[4];
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese 4 valores: ");
        for(int i=0; i<4; i++){
                    var[i] = teclado.nextDouble();
        }
        System.out.println("Menor elemento: "+ buscarMinimo(var));
        bubbleSort(var);
        System.out.println("Vector ordenado:");
        printArray(var);
    }
    
    public static double buscarMinimo(double[] p_var){
        double minimo = Double.MAX_VALUE;
        for(int i=0; i<4; i++){
            if(p_var[i] < minimo){
                minimo = p_var[i];
            }
        }
        return minimo;
    }
    
    public static void bubbleSort(double[] p_var){
        int i, j;
        double temp;
        for (i = 0; i < 4 - 1; i++) {
            for (j = 0; j < 4 - i - 1; j++) {
                if (p_var[j] > p_var[j + 1]) {
                    
                    temp = p_var[j];
                    p_var[j] = p_var[j + 1];
                    p_var[j + 1] = temp;

                }
            }
        }
    }

    
    public static void printArray(double[] p_array){
        int i;
        for (i = 0; i < 4; i++){
            System.out.print(p_array[i] + "\t");
            }
    }
}