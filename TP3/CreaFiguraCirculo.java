
/**
 * Write a description of class CreaFiguraCirculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Random;

public class CreaFiguraCirculo
{
    public static void main(String[] args){
        Random unNumero = new Random();
        double radio = unNumero.nextDouble() * 100.0;
        
        Circulo nuevoCirculo = new Circulo(radio, new Punto(0, 0));
        
        nuevoCirculo.desplazar(-240, -230);
        
        nuevoCirculo.caracteristicas();
    }
}