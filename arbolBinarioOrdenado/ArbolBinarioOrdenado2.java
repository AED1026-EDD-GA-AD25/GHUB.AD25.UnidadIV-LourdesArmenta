package arbolBinarioOrdenado;

public class ArbolBinarioOrdenado2 {
    private Nodo raiz = null;

    public ArbolBinarioOrdenado2(){
        raiz = null;
        
        
    }
    /*
     * Insertar de forma iterativa un nodo en el ABB
     */
    public void insertar(Object valor) throws Exception{
        Comparable dato = (Comparable)valor;
        Nodo nuevo = new Nodo();
        nuevo.setValor(dato);
        if (raiz == null){
            raiz = nuevo;

        }else{
            //anterior : padre de aux
            Nodo anterior =null;
            Nodo aux = raiz;
            while(aux !=null){
                anterior = aux;
                if (dato.esMenor(aux.getValor()))
                   aux = aux.getIzquierdo();
                if(dato.esMayor(aux.getIzquierdo()))
                    aux = aux.getDerecho();
                else
                    throw new Exception("Dato duplicado");
            }
            if (dato.esMenor(anterior.getValor()))
                anterior.setIzquierdo(nuevo);
            else
                anterior.setDerecho(nuevo);
                
        }

    }
    public Nodo buscar(Object valor){
        Comparable dato = (Comparable)valor;
        if(raiz == null){
            return raiz;
        }else{
            /*
             * aux: auxiliar que va recorriendo los nodos
             */
        }


    }


    
}
