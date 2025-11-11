package colecciones;
import java.util.Collection;
import java.util.ArrayList;

public class UNombres {
    public static Collection<String> obtenerLista(){
        //Vector<String> v = new Vector<>(); 
        ArrayList<String> v = new ArrayList<>();
        v.add("Pablo");
        v.add("Juan");
        v.add("Carlos");
        return v;

    }
    
}
