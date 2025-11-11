package miPrincipal;

import arbolBinarioOrdenado.Alumno;
import arbolBinarioOrdenado.CriterioAlumnoNombre;
import arbolBinarioOrdenado.Util;

public class AppOrdenarAlumnosNombre {
    public static void inicio(){
        Alumno arr[] = {    new Alumno(123,"Juan",8.5),
                            new Alumno(100,"Pedro",7.2),
                            new Alumno(125,"Alberto",9.5)
                        };
        Util.ordenar(arr, new CriterioAlumnoNombre());
        for(Alumno a: arr){
            System.out.println(a);
        }

    }
    
}
