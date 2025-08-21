
public class Ecuacion
{
    public static void main(String[] args)
    {
        double a = Integer.valueOf(args[0]);
        double b = Integer.valueOf(args[1]);
        double c = Integer.valueOf(args[2]);
        
        double discriminante = (Math.pow(b,2) - 4 * a * c);
        if(discriminante == 0){
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            System.out.println("x1 = x2");
            System.out.println("Resultado: " + x1);
        }
        else if(discriminante < 0){
            System.out.println("Solucion compleja(numero imaginario)");
        }
        else{
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Resultado raiz 1: " + x1);
            System.out.println("Resultado raiz 2: " + x2);
        }
    }
}