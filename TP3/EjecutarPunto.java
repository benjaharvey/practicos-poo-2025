/**
 * Una clase que utilizamos para instanciar los objetos y probar sus metodos
 */
public class EjecutarPunto
{
    public static void main(String[] args){
        double x = Double.valueOf(args[0]);
        double y = Double.valueOf(args[1]);
        double otro_x = Double.valueOf(args[2]);
        double otro_y = Double.valueOf(args[3]);
        double des_x = Double.valueOf(args[4]);
        double des_y = Double.valueOf(args[5]);
    
        Punto unPunto = new Punto(x, y);
        Punto otroPunto = new Punto(otro_x, otro_y);
        System.out.println("Coordenadas: " + unPunto.coordenadas());
        System.out.println("Distancia entre un punto y otro: " + unPunto.distanciaA(otroPunto));
        
        unPunto.desplazar(des_x, des_y);
        unPunto.mostrar();
        
    }
}