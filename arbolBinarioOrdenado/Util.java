package arbolBinarioOrdenado;
import java.lang.Comparable;
import java.util.Comparator;

public class Util {
    //Ordena en base al algoritmo de la burbuja
    public static void ordenar(Comparable arr[]){
        if (arr==null || arr.length<2)
           return;

        boolean ordenado = false;
        while (!ordenado){
            ordenado = true;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i+1].compareTo(arr[i]) < 0){
                    Comparable aux = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = aux;
                    ordenado = false;
                }
            }
        }


    }
    public static void ordenar(Object arr[], Criterio cr){
        if (arr==null || arr.length<2)
           return;

        boolean ordenado = false;
        while (!ordenado){
            ordenado = true;
            for(int i=0;i<arr.length-1;i++){
                //ahoara la decicion de quien precede  a quien
                //la toma la instancia Criterio
                if(cr.comparar(arr[i+1], arr[i]) < 0){
                    Object aux = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = aux;
                    ordenado = false;
                }
            }
        }

    }

    public static void ordenar(Object arr[], Comparator cr){
        if (arr==null || arr.length<2)
           return;

        boolean ordenado = false;
        while (!ordenado){
            ordenado = true;
            for(int i=0;i<arr.length-1;i++){
                //ahoara la decicion de quien precede  a quien
                //la toma la instancia Criterio
                if(cr.compare(arr[i+1], arr[i]) < 0){
                    Object aux = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = aux;
                    ordenado = false;
                }
            }
        }

    }
    
}
