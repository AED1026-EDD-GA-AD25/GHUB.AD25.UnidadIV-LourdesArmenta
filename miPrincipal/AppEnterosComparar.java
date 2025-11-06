package miPrincipal;
import arbolBinarioOrdenado.Entero;


public class AppEnterosComparar {
    public static void inicio(){
        Entero num1 = new Entero(10);
        Entero num2 = new Entero(15);
        if(num1.esMayor(num2)){
            System.out.println(num1+" es mayor que "+num2);
        }else if(num1.esMenor(num2)){
            System.out.println(num1+" es menor que "+num2);
        }else
            System.out.println(num1+" es igual que "+num2);

        num1 = new Entero(15);
        num2 = new Entero(10);
        if(num1.esMayor(num2)){
            System.out.println(num1+" es mayor que "+num2);
        }else if(num1.esMenor(num2)){
            System.out.println(num1+" es menor que "+num2);
        }else
            System.out.println(num1+" es igual que "+num2);

        num1 = new Entero(15);
        num2 = new Entero(15);
        if(num1.esMayor(num2)){
            System.out.println(num1+" es mayor que "+num2);
        }else if(num1.esMenor(num2)){
            System.out.println(num1+" es menor que "+num2);
        }else
            System.out.println(num1+" es igual que "+num2);




    }
    
}
