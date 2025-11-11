package miPrincipal;

import arbolBinarioOrdenado.Alumno;
import arbolBinarioOrdenado.CriterioAlumnoProm;
import arbolBinarioOrdenado.OtroCriterioAlumnoId;
import arbolBinarioOrdenado.Util;

public class AppOrdenarAlumnosIdComparator {
    public static void inicio(){
         Alumno arr[] = {    new Alumno(123,"Juan",8.5),
                            new Alumno(100,"Pedro",7.2),
                            new Alumno(125,"Alberto",9.5)
                        };
        Util.ordenar(arr, new OtroCriterioAlumnoId());
        for(Alumno a: arr){
            System.out.println(a);
        }

    }
    
}
