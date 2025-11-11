package arbolBinarioOrdenado;
import java.util.Comparator;

public class OtroCriterioAlumnoId implements Comparator<Alumno>{

    @Override
    public int compare(Alumno o1, Alumno o2) {
        int dif = o1.getId()-o2.getId();
        return dif>0? 1: dif<0? -1:0;
    }
    
    
}
