package miPrincipal;
import arbolBinarioOrdenado.ArbolBinarioOrdenado;
import arbolBinarioOrdenado.Entero;
public class AppArbolBusquedaBinaria{
    public static void inicio(){
        ArbolBinarioOrdenado arbol = new ArbolBinarioOrdenado();
        try{
            arbol.insertar(new Entero(10));
            arbol.insertar(new Entero(4));
            arbol.insertar(new Entero(30));
            arbol.insertar(new Entero(2));
            arbol.insertar(new Entero(5));
            arbol.insertar(new Entero(25));
            arbol.insertar(new Entero(40));
            arbol.insertar(new Entero(23));
            arbol.insertar(new Entero(28));
            arbol.insertar(new Entero(26));
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
        //Recorridos
        System.out.println("Recorrido en preorden:");
        arbol.preorden();   
        System.out.println("\nRecorrido en inorden:");
        arbol.inorden();
        System.out.println("\nRecorrido en postorden:");
        arbol.postorden();
        //Imprimer el arbol
        System.out.println();
        arbolBinarioOrdenado.BTreePrinter.printNode(arbol.getRaiz());
        System.out.println("Se encuentra el elemento 25: "+arbol.buscar(new Entero(25)).getValor());
        System.out.println("Se encuentra el elemento 11: "+arbol.buscar(new Entero(11)));
        arbol.eliminar(new Entero(26));
        arbol.eliminar(new Entero(26));
        
        System.out.println("Arbol después de eliminar el 26:");
        arbolBinarioOrdenado.BTreePrinter.printNode(arbol.getRaiz());
        arbol.eliminar(new Entero(30));
        System.out.println("Arbol después de eliminar el 30:");
        arbolBinarioOrdenado.BTreePrinter.printNode(arbol.getRaiz());


        






    }
}
