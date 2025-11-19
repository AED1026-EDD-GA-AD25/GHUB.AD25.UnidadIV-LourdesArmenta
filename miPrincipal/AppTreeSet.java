package miPrincipal;
import java.util.TreeSet;
import java.util.Iterator;


public class AppTreeSet {
    public static void inicio(){
        TreeSet<Integer> t = new TreeSet<>();
        t.add(5);
        t.add(3);
        t.add(9);
        t.add(2);
        t.add(2);
        System.out.println("Existe el elemento 5 en mi colección? "+t.contains(5));
        System.out.println("Existe el elemento 10 en mi colección? "+t.contains(10));
        t.remove(9);
        t.remove(10);
        t.add(9);
        t.add(1);
        for (Iterator<Integer> it = t.descendingIterator(); it.hasNext(); ){
            System.out.print(it.next() + " ");
        }
        System.out.println();

    }
    
}
