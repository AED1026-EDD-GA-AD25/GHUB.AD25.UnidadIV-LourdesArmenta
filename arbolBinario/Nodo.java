package arbolBinario;

public class Nodo {
    //atributos
    private Object valor;
    private Nodo izquierdo;
    private Nodo derecho;
    //constructores
    public Nodo() {
        this.valor = null;
        this.izquierdo = null;
        this.derecho = null;
    }
    public Nodo(Object valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
    //getter y setter
    public Object getValor() {
        return valor;
    }
    public void setValor(Object valor) {
        this.valor = valor;
    }
    public Nodo getIzquierdo() {
        return izquierdo;
    }
    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }
    public Nodo getDerecho() {
        return derecho;
    }
    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
    
    
    

    
}
