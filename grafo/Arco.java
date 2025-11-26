package grafo;

public class Arco {
    //Atributos
    //nombre de vertice destino
    private String destino;
    //perso del arco
    private int peso;
    //constructores
    public Arco(String destino) {
        this.destino = destino;
    }
    public Arco(String destino, int peso) {
        this.destino = destino;
        this.peso = peso;
    }
    //getter y setter
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    @Override
    public boolean equals(Object obj) {
        Arco a = (Arco) obj;
        return this.destino == a.destino;  
    } 
}
