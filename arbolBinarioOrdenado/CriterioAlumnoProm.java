package arbolBinarioOrdenado;

public class CriterioAlumnoProm extends Criterio<Alumno>{

    @Override
    public int comparar(Alumno a, Alumno b) {
        /*
        if (a.getPromedio()>b.getPromedio())
            return 1;
        else if (a.getPromedio()<b.getPromedio())
                return -1;
             else
                return 0;
        */
        double dif = a.getPromedio()-b.getPromedio();
        /*
        if (dif>0)
           return 1;
        else if(dif<0)
                return -1;
             else
                return 0;
        */
        return dif>0 ? 1: dif<0?-1:0;
        
           
        
    }
    
    
}
