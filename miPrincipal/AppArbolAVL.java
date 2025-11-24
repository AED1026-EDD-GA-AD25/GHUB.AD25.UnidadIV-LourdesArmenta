package miPrincipal;
import arbolAVL.ArbolAVL;
import arbolAVL.Entero;
import arbolAVL.BTreePrinter;

public class AppArbolAVL {
    public static void inicio() {
        ArbolAVL arbol = new ArbolAVL();
        try{
            arbol.insertar(new Entero(2));
            arbol.insertar(new Entero(1));
            arbol.insertar(new Entero(4));

            System.out.println("Forma del árbol, despues de insertar: 2,1,4");
            BTreePrinter.printNode(arbol.getRaiz());

            arbol.insertar(new Entero(5));
            arbol.insertar(new Entero(9));
            System.out.println("Forma del árbol, despues de insertar: 5 y 9");
            BTreePrinter.printNode(arbol.getRaiz());

            arbol.insertar(new Entero(3));
            System.out.println("Forma del árbol, despues de insertar: 3");
            BTreePrinter.printNode(arbol.getRaiz());

            arbol.insertar(new Entero(6));
            System.out.println("Forma del árbol, despues de insertar: 6");
            BTreePrinter.printNode(arbol.getRaiz());

            arbol.insertar(new Entero(7));
            System.out.println("Forma del árbol, despues de insertar: 7");
            BTreePrinter.printNode(arbol.getRaiz());

            

            arbol.eliminar(new Entero(9));
            System.out.println("Forma del árbol, despues de eliminar: 9");
            BTreePrinter.printNode(arbol.getRaiz());

            arbol.inorden();
            System.out.println();



        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }

        
    }
    
}
