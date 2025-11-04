package arbolBinario;

public class ArbolBinario {
    //atributo
    private Nodo raiz;
    //constructor por defecto

    public ArbolBinario() {
     raiz = null;   
    }

    public ArbolBinario(Nodo raiz) {
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

    }
    /*
     * Recorrido inorden versión iterativa
     */
    public void inordenIterativo(){

    }
    /*
     * Recorrito postorden versión iterativa
     */
    public void postordenIterativo(){
        
    }

    

    
}
