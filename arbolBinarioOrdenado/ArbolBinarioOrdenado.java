package arbolBinarioOrdenado;



public class ArbolBinarioOrdenado {
    //atributo
    protected Nodo raiz;
    //constructor por defecto

    public ArbolBinarioOrdenado() {
     raiz = null;   
    }

    public ArbolBinarioOrdenado (Nodo raiz) {
        this.raiz = raiz;
    }
    //getter y setter
    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    private void visitar(Nodo aux){
        System.out.print(aux.getValor()+" ");
    }
    //recorrido recursivos
    /*
     * preorden (RID)
     */
    public void preorden(){
        preorden(raiz);

    }
    private void preorden(Nodo aux){
        if (aux != null){
            visitar(aux);
            preorden(aux.getIzquierdo());
            preorden(aux.getDerecho());

        }
    }
    /*
     * inorden (IRD)
     */
    public void inorden(){
        inorden(raiz);
    }
    private void inorden(Nodo aux){
        if(aux != null){
            inorden(aux.getIzquierdo());
            visitar(aux);
            inorden(aux.getDerecho());
        }
    }
    /*
     * Recorrido postorden (IDR)
     */
    public void postorden(){
        postorden(raiz);
    }
    private void postorden(Nodo aux){
        if (aux !=null){
            postorden(aux.getIzquierdo());
            postorden(aux.getDerecho());
            visitar(aux);
        }

    }
    //Recorrido por niveles
    public void recorridoPorNiveles(){
        cola.Cola<Nodo> cola = new cola.Cola<>();
        cola.encolar(raiz);
        while (!cola.esVacia()){
            Nodo aux = cola.frente();
            visitar(aux);
            if(aux.getIzquierdo()!=null){
                cola.encolar(aux.getIzquierdo());
            }
            if(aux.getDerecho()!=null){
                cola.encolar(aux.getDerecho());
            }
            cola.desencolar();
        }


    }
    /*
     * Recorrido preorden version iterativa
     */
    public void preordenIterativo(){
        pila.Pila<Nodo> pila = new pila.Pila<Nodo>();
        pila.apilar(raiz);
        while (!pila.esVacia()){
            Nodo aux = pila.cima();
            visitar(aux);
            pila.retirar();
            if(aux.getDerecho()!=null){
                pila.apilar(aux.getDerecho());
            }
            if(aux.getIzquierdo()!=null){
                pila.apilar(aux.getIzquierdo());
            }
        }

    }
    /*
     * Recorrido inorden versión iterativa
     */
    public void inordenIterativo(){
        pila.Pila<Nodo> pila = new pila.Pila<>();
        pila.apilar(raiz);
        Nodo aux = raiz.getIzquierdo();
        while (aux != null || !pila.esVacia()){
            if (aux != null){
                pila.apilar(aux);
                aux = aux.getIzquierdo();
            }else{
                aux = pila.cima();
                pila.retirar();
                visitar(aux);
                aux = aux.getDerecho();
            }
        }

    }
    /*
     * Recorrito postorden versión iterativa
     */
    public void postordenIterativo(){
        pila.Pila<Nodo> pila = new pila.Pila<Nodo>();
        Nodo aux = raiz;
        Nodo q = raiz;
        while (aux !=null){
            //avanza por izquierda ya apila los nodos
            while(aux.getIzquierdo() !=null){
                pila.apilar(aux);
                aux = aux.getIzquierdo();
            }
            //ahora voy por la derecha
            while (aux !=null && (aux.getDerecho() == null || aux.getDerecho()==q)){
                visitar(aux);
                q = aux;
                if (pila.esVacia()){
                    return;
                }
                aux = pila.cima();
                pila.retirar();
            }
            pila.apilar(aux);
            aux = aux.getDerecho();
        }   
    }
    public void insertar(Object valor) throws Exception{
        Comparable dato = (Comparable)valor;
        Nodo nuevo = new Nodo();
        nuevo.setValor(dato);
        if(raiz == null)
           raiz = nuevo;
        else{
            // anterior: refenencia al padre de aux
            Nodo anterior = null;
            //aux: auxiliar que va recorriendo los nodos, desde la raiz
            Nodo aux  = raiz;
            while (aux != null){
                anterior = aux;
                if (dato.esMenor(aux.getValor()))
                  aux = aux.getIzquierdo();
                else if (dato.esMayor(aux.getValor()))
                   aux = aux.getDerecho();
                else
                  throw new Exception("Dato Duplicado");
            }
            if(dato.esMenor(anterior.getValor()))
               anterior.setIzquierdo(nuevo);
            else
               anterior.setDerecho(nuevo);
        }
    }
    /**
     * insertar 2 es la interfaz de la operacion, llama al metodo
     * insertarRecursivo que realiza la operacion y devuelve la raiz del nuevo 
     * arbol. A este metodo interno se le pasa la raiz actual, a partir
     * de la cual se describe el camino de busqueda, y al final se enlaza
     * 
     */
    public void insertar2(Object valor) throws Exception{
        Comparable dato = (Comparable) valor;
        raiz = insertarRec(raiz,dato);
    }

    private Nodo insertarRec(Nodo raizSub, Comparable dato) throws Exception{
        if (raizSub == null){
            //caso base, termina la recursividad
            raizSub = new Nodo(dato);
        }
        else{
            if (dato.esMenor(raizSub.getValor())){
                Nodo iz = insertarRec(raizSub.getIzquierdo(), dato);
                raizSub.setIzquierdo(iz);
            }
            else{
                if (dato.esMayor(raizSub.getValor())){
                    Nodo dr = insertarRec(raizSub.getDerecho(), dato);
                    raizSub.setDerecho(dr);
                }
                else{
                    throw new Exception("Dato Duplicado");
                }
            }
        }
        return raizSub;

    }

    /**
     * 
     * @param valor, valor a buscar
     * @return el nodo encontrado
     */
    public Nodo buscar(Object valor){
        Comparable dato = (Comparable)valor;
        if (raiz == null)
           return raiz;
        else{
            //aux: auxiliar que va recorriendo los nodos, de la la raiz
            Nodo aux = raiz;
            while (aux !=null){
                if (dato.esIgual(aux.getValor()))
                   return aux;
                if (dato.esMenor(aux.getValor()))
                   aux = aux.getIzquierdo();
                else 
                   aux = aux.getDerecho();
                   
            }
            return null;
        }
    }

    /**
     * Interfaz de buscar que invoca al metodo recuersivo localizar
     * @param buscado, valor buscado
     * @return Nodo buscado o null si no lo encuentra
     */
    public Nodo buscar2(Object buscado){
        Comparable dato = (Comparable)buscado;
        if (raiz == null)
          return null;
        else
           return localizar(raiz,dato);
    }

    /**
     * Version recursiva
     * @param raizSub
     * @param buscado
     * @return Nodo buscado si lo encuentra, si no retorna null
     */

    private Nodo localizar(Nodo raizSub, Comparable buscado){
        if (raizSub == null)
           return null;
        else if (buscado.esIgual(raizSub.getValor()))
            return raizSub;
        else if (buscado.esMenor(raizSub.getValor()))
            return localizar(raizSub.getIzquierdo(), buscado);
        else 
            return localizar(raizSub.getDerecho(), buscado);

    }

    public boolean eliminar(Object valor){
        Comparable dato = (Comparable)valor;
        //Buscar el nodo a eliminar y su antecesor
        Nodo antecesor = null; //antecesor del nodo a eliminar
        //aux: auxiliar que va recorriendo los nodos, desde la raiz
        Nodo aux = raiz;
        while (aux !=null){
            if (dato.esIgual(aux.getValor())){
                break;
            }
            antecesor = aux;
            if (dato.esMenor(aux.getValor()))
                aux = aux.getIzquierdo();
            else 
                aux = aux.getDerecho();
            

        }
        if (aux == null){
            return false;
        }
        //si llega a este punto, el nodo a eliminar existe y es aux y su antecesor es antecesor
        //Exainar cada caso
        //1. si tiene menos de dos hijos, incluso una hoja
        if (aux.getIzquierdo() == null) //solo tiene hijo derecho
            if(((Comparable) aux.getValor()).esMenor(antecesor.getValor()))
                antecesor.setIzquierdo(aux.getDerecho());
               
            else
                antecesor.setDerecho(aux.getDerecho());
        else if (aux.getDerecho()==null)//solo tiene hijo izquierdo
            if(((Comparable) aux.getValor()).esMenor(antecesor.getValor()))
                 antecesor.setIzquierdo(aux.getIzquierdo());
            else
                 antecesor.setDerecho(aux.getIzquierdo());
        else 
            //El nodo a eliminar tiene rama izquierda y rama derecha
            reemplazarPorMayorIzquierdo(aux);
        aux =null;
        return true;


    }
    /**
     * Reemplaza el nodo actual por el mayor del la rama izquierda
     * 
     * @param act nodo Actual o nodo a eliminar que tiene rama izquierda y rama derecha
     */
    public void reemplazarPorMayorIzquierdo(Nodo act){
       Nodo mayor=act;
       Nodo ant = act;
       mayor =act.getIzquierdo();
       //buscar el mayor de la rama izquierda
       //ant es el antecesor de mayor
       while(mayor.getDerecho() != null){
           ant = mayor;
           mayor =mayor.getDerecho();

       }
       act.setValor(mayor.getValor());//reemplazo
       //reajuste
       if (ant == act)
          ant.setIzquierdo(mayor.getIzquierdo());
       else
         ant.setDerecho(mayor.getIzquierdo());

    }
    

    
}
