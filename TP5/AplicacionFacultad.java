import java.util.*;
/**
 * Write a description of class AplicacionFacultad here.
 * 
 * @author      Hardoy - Harvey 
 * @version     20/10/2025
 */
public class AplicacionFacultad
{
    public static void main(String[] args){
        Exclusivo cargoExclusivo = new Exclusivo("Titular-TFA", 800, 2015, 200, 120, 40);
        Cargo cargoComun = new Cargo("JTP-Progamacion", 300, 2020, 15);
        SemiExclusivo semiCargo = new SemiExclusivo("JTP-Analisis de Sistemas", 500, 2023, 25, 5);
        
        Profesor unProfesor = new Profesor(111, "Perez", "Juan", 1990, "Ing. en Sistemas", cargoExclusivo);
        unProfesor.agregarCargo(cargoComun);
        
        Profesor otroProfesor = new Profesor(222, "Harvey", "Benja", 2004, "Lic. en Sistemas", semiCargo);
        
        Facultad unne = new Facultad("Univ Nacional del Nordeste", unProfesor);
        unne.agregarProfesor(otroProfesor);
        
        unne.listarProfesorCargos();
        unne.nominaProfesores();
    }
}