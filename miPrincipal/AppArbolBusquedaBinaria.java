package miPrincipal;
import arbolBinarioOrdenado.ArbolBinarioOrdenado;
import arbolBinarioOrdenado.Entero;
public class AppArbolBusquedaBinaria{
    public static void inicio(){
        ArbolBinarioOrdenado arbol = new ArbolBinarioOrdenado();
        try{
            arbol.insertar(new Entero(10));
            arbol.insertar(new Entero(15));
            arbol.insertar(new Entero(30));
            arbol.insertar(new Entero(5));
            arbol.insertar(new Entero(2));
            arbol.insertar(new Entero(1));
            
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
        //Búsqueda iterativa
        arbolBinarioOrdenado.Nodo aux = arbol.buscar(new Entero(30));
        if (aux==null){
            System.out.println("\nDato no encontrado");
        }else{
            System.out.println("\nEncontrado el dato:"+aux.getValor());
        }
        //búsqueda recursiva
        aux= arbol.buscar2(new Entero(15));
        if (aux==null){
            System.out.println("\nDato no encontrado");
        }else{
            System.out.println("\nEncontrado el dato:"+aux.getValor());
        }
        aux= arbol.buscar2(new Entero(150));
        if (aux==null){
            System.out.println("\nDato no encontrado");
        }else{
            System.out.println("\nEncontrado el dato:"+aux.getValor());
        }
        //Eliminacion
        arbol.eliminar(new Entero(2));
        //Imprimer el arbol
        System.out.println();
        arbolBinarioOrdenado.BTreePrinter.printNode(arbol.getRaiz());
        //Elimino hoja
        arbol.eliminar(new Entero(1));
         //Imprimer el arbol
        System.out.println();
        arbolBinarioOrdenado.BTreePrinter.printNode(arbol.getRaiz());
        //Elimina raiz
        arbol.eliminar(new Entero(10));
         //Imprimer el arbol
        System.out.println();
        arbolBinarioOrdenado.BTreePrinter.printNode(arbol.getRaiz());







    }
}
