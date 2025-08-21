public class crearFigura
{
    public static void main(String[] args){
        
        double ancho = Math.random();
        double alto = Math.random();
        Rectangulo unRectangulo = new Rectangulo(alto, ancho);
        unRectangulo.desplazar(40, -20);
        unRectangulo.caracteristicas();
        
        double x = Double.valueOf(args[0]);
        double y = Double.valueOf(args[1]);
        Punto unPunto = new Punto(x, y);
        ancho = Math.random();
        alto = Math.random();
        Rectangulo otroRectangulo = new Rectangulo(unPunto, alto, ancho);
        
        unRectangulo.elMayor(otroRectangulo).caracteristicas();
        System.out.println("Distancia entre un rectangulo y otro: " + unRectangulo.distanciaA(otroRectangulo));

    }
}