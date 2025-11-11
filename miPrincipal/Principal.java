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
                case 2:
                    AppEnterosComparar.inicio();
                    break;
                case 3:
                    AppPersonasComparar.inicio();
                    break;
                case 4:
                    AppOrdenarAlumnos.inicio();
                    break;
                case 5:
                    AppOrdenarAlumnosNombre.inicio();
                    break;
                case 6:
                    AppOrdenarAlumnosPromedio.inicio();
                    break;
                case 7:
                    AppOrdenarAlumnosIdComparator.inicio();
                    break;
                case 8:
                    AppArbolBusquedaBinaria.inicio();
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
        
        System.out.println("\n***************************************+*************");
        System.out.println("                  Arboles Binarios     ");
        System.out.println("****************************++++++*+++***************");
        System.out.println("1. Recorrido de árboles     ");
        System.out.println("2. Comparar Enteros         ");
        System.out.println("3. Comparar Persona por Nombre");
        System.out.println("4. Ordenar arreglo Alumnos por Id");
        System.out.println("5. Ordenar arreglo Alumnos por Nombre");
        System.out.println("6. Ordenar arreglo Alumnos por Promedio");
        System.out.println("7. Ordener arreglo Alumnos por Id utilizando Comparator");
        System.out.println("8. Insertar,buscar,eliminar en un Arbol de Búsqueda Binaria");


        System.out.println();
        System.out.println("0. Salir");
        System.out.print("Seleccione la opcion deseada:");
    }
}