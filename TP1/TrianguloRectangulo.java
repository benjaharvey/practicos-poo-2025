
public class TrianguloRectangulo
{
    public static void main(String[] args)
    {
        int cateto1 = Integer.valueOf(args[0]);
        int cateto2 = Integer.valueOf(args[1]);
        int h = 5;
        int j = 2;
        if(Math.pow(h,j) == Math.pow(cateto1,j) + Math.pow(cateto2,j)){
            System.out.println("Es rectangulo");
        }
        else{
            System.out.println("No es rectangulo");
        }
    }
}