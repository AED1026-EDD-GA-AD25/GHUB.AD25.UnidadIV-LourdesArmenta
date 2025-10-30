package miPrincipal;
import arbolBinario.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        do{
            menu();
            try{
             opc = sc.nextInt();
             switch(opc){
                case 1:
                    AppRecorridoArboles.inicio();
                    break;
                case 0:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Seleccion la opción correcta!");

             }

            }catch(InputMismatchException ex){
                System.out.println("Seleccion un valor válido!");
                sc.nextLine(); //limpia el buffer
                opc = -1; //asigbo un valor que no este en el meni
                continue; 
            }

        }while (opc != 0);
        
    }
    public static void menu(){
        
        System.out.println("\n***************************");
        System.out.println("      Arboles Binarios     ");
        System.out.println("***************************");
        System.out.println("1. Recorrido de árboles    ");
        System.out.println();
        System.out.println("0. Salir");
        System.out.print("Seleccione la opcion deseada:");
    }
}