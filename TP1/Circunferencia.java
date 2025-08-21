
public class Circunferencia
{
    public static void main(String[] args){
        int radio = Integer.valueOf(args[0]);
        System.out.println("El perimetro es de: " + calcularPerimetro(radio));
    }
    
    public static int calcularPerimetro(int p_radio) {
        return (int) (2 * Math.PI * p_radio);
    }
}