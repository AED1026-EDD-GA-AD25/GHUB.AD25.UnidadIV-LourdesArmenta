package miPrincipal;
import arbolBinario.*;

public class AppRecorridoArboles {
    public static void inicio(){
        //crear un arbol binario como el de la figura vista en clase
        ArbolBinario ab = new ArbolBinario();
        Nodo nodoA = new Nodo("A");
        Nodo nodoB = new Nodo("B");
        Nodo nodoC = new Nodo("C");
        Nodo nodoD = new Nodo("D");
        Nodo nodoE = new Nodo("E");
        Nodo nodoF = new Nodo("F");
        Nodo nodoG = new Nodo("G");
        ab.setRaiz(nodoA);
        ab.getRaiz().setIzquierdo(nodoB);
        ab.getRaiz().setDerecho(nodoC);
        nodoB.setIzquierdo(nodoD);
        nodoB.setDerecho(nodoE);
        nodoC.setIzquierdo(nodoF);
        nodoC.setDerecho(nodoG);

        System.out.println("Recorrido recursivo Preorden:");
        ab.preorden();
        System.out.println();
        System.out.println("Recorrido recursivo Inorden:");
        ab.inorden();
        System.out.println();
        System.out.println("Recorrido recursivo Postorden:");
        ab.postorden();
        System.out.println();
        System.out.println("Recorrido por Niveles:");
        ab.recorridoPorNiveles();
        System.out.println();


    }
    
}
