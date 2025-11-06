package miPrincipal;
import arbolBinarioOrdenado.Persona;

public class AppPersonasComparar {
    public static void inicio() {
        Persona p1 = new Persona(123,"Beto Cuevas");
        Persona p2 = new Persona(125,"Ana Gonzalez");
        if(p1.esMayor(p2))
            System.out.println(p1+" es mayor que "+p2);
        else if(p1.esMenor(p2))
            System.out.println(p1+" es Menor que "+p2);
        else
            System.out.println(p1+" es igual que "+p2);

        p1 = new Persona(123,"Alicia Lopez");
        p2 = new Persona(125,"Carlos Rivera");
        if(p1.esMayor(p2))
            System.out.println(p1+" es mayor que "+p2);
        else if(p1.esMenor(p2))
            System.out.println(p1+" es Menor que "+p2);
        else
            System.out.println(p1+" es igual que "+p2);

        p1 = new Persona(123,"Alicia Lopez");
        p2 = new Persona(125,"Alicia Lopez");
        if(p1.esMayor(p2))
            System.out.println(p1+" es mayor que "+p2);
        else if(p1.esMenor(p2))
            System.out.println(p1+" es Menor que "+p2);
        else
            System.out.println(p1+" es igual que "+p2);
        
    }
    
}
