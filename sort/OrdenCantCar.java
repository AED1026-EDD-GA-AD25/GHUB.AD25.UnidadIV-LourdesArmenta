package sort;
import java.util.Comparator;

public class OrdenCantCar implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        int x = o1.length()-o2.length();
        return x!=0?x:o1.compareTo(o2);
    }
    
    
}
