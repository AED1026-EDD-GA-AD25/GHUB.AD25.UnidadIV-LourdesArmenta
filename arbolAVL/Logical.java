package arbolAVL;
/*
Determina si se debe cambiar la altura a un nodo, 
Es utilizado por arbolAVL
*/

public class Logical {
    boolean v;

    public Logical(boolean v) {
        this.v = v;
    }

    public boolean booleanValue() {
        return v;
    }

    public void setLogical(boolean v) {
        this.v = v;
    }
    
    
}
