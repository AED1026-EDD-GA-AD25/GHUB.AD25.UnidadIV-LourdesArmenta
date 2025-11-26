package miPrincipal;
import grafo.*;

public class AppOperacionesGrafo {
    //Este programa muestra como utilizar la clase grafo
    public static void inicio(){
        GrafoMatriz grafo = new GrafoMatriz(5);
        grafo.nuevoVertice("D");
        grafo.nuevoVertice("F");
        grafo.nuevoVertice("K");
        grafo.nuevoVertice("L");
        grafo.nuevoVertice("R");
        try{
            grafo.nuevoArco("D", "F");
            grafo.nuevoArco("D", "K");
            grafo.nuevoArco("F","D");
            grafo.nuevoArco("L","R");
            grafo.nuevoArco("L","F");
            grafo.nuevoArco("L","D");

            System.out.println("Es D adyacente de F ? "+grafo.adyacente("D","F"));
            System.out.println("Es F adyacente de D ? "+grafo.adyacente("F","D"));
            System.out.println("Es R adyacente de F ? "+grafo.adyacente("R","F"));

            System.out.println("Vertices del Grafo:");
            System.out.println(grafo.imprimirVertices());

            System.out.println("Matriz de Adyacencia de Grafo:");
            System.out.println(grafo.imprimirMatriz());

            System.out.println("Imprimir de Nuevo matriz de Adyacencia:");
            int[][] matriz;
            matriz = grafo.getMatriz();
            for(int i=0;i<matriz.length;i++){
                for(int j=0;j<matriz[i].length;j++){
                    System.out.print(matriz[i][j]+" ");
                }
                System.out.println();
            }

          
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        

        
    }
    
}
