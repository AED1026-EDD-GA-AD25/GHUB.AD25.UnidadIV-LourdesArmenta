package arbolBinarioOrdenado;

public class Persona implements Comparable{
    private int id;
    private String nombre;
    public Persona() {
    }
    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + "]";
    }
    @Override
    public boolean esIgual(Object q) {
        Persona obj = (Persona)q;
        if( this.nombre.compareTo(obj.getNombre()) == 0)
            return true;
        else
            return false;
    }
    @Override
    public boolean esMayor(Object q) {
        Persona obj = (Persona)q;
        if( this.nombre.compareTo(obj.getNombre()) >0)
            return true;
        else
            return false;

        
    }
    @Override
    public boolean esMenor(Object q) {
        Persona obj = (Persona)q;
        if( this.nombre.compareTo(obj.getNombre())< 0)
            return true;
        else
            return false;
       
    }
    
    
    
}
