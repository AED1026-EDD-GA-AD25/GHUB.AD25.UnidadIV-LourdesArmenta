package sort;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestSort {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Pablo");
        arr.add("Nora");
        arr.add("Rolando");
        arr.add("Analia");
        arr.add("Aldo");
        arr.add("Octavio");
        arr.add("Luz");
        //orden alfabetico ascendente
        Collections.sort(arr,new OrdenAsc());
        System.out.println();
        System.out.println("Ascendente:");
        for (String s:arr){
            System.out.println(s);
        }
        
        //orden alfabetico descendenre
        Collections.sort(arr,new OrdenDes());
        System.out.println();
        System.out.println("Descendente:");
       
        for (String s:arr){
            System.out.println(s);
        }
        for (String s:arr){
            System.out.println(s);
        }
        //orden por cantiad d caracteres
        Collections.sort(arr,new OrdenCantCar());
        System.out.println();
        System.out.println("Ascente:");
       
        for (String s:arr){
            System.out.println(s);
        }
        System.out.println();
        System.out.println("Tamaño:");
        
        for (String s:arr){
            System.out.println(s);
        }
    }
    
}
