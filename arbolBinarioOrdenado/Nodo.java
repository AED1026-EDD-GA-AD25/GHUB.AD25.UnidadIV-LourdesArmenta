package arbolBinarioOrdenado;

public class Nodo {
    //atributos
    private Comparable valor;
    private Nodo izquierdo;
    private Nodo derecho;
    //constructores
    public Nodo() {
        this.valor = null;
        this.izquierdo = null;
        this.derecho = null;
    }
    public Nodo(Comparable valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
    public Nodo(Comparable valor, Nodo izquierdo, Nodo derecho) {
        this.valor = valor;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }
    public Comparable getValor() {
        return valor;
    }
    public void setValor(Comparable valor) {
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
