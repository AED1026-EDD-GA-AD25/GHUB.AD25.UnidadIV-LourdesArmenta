package arbolBinarioOrdenado;
import java.lang.Comparable;
public class Alumno implements Comparable<Alumno>{
    private int id;
    private String nombre;
    private double promedio;
    public Alumno() {
    }
    public Alumno(int id, String nombre, double promedio) {
        this.id = id;
        this.nombre = nombre;
        this.promedio = promedio;
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
    public double getPromedio() {
        return promedio;
    }
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    @Override
    public String toString() {
        return "Alumno [id=" + id + ", nombre=" + nombre + ", promedio=" + promedio + "]";
    }
    @Override
    public int compareTo(Alumno o) {
        return this.id-o.getId();
    };
    
    
}