/*                              Proyecto_N1
Integrantes:                                            Grupo: 1SF-121
    Shruti Tewaney (8-999-1896)
    Kevin Mojica (4-773-527)
    Daniel Pimentel (8-989-7)
    Madeline Delgado (3-753-1125)
    Peter Rivera (8-972-1516)
*/

import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String... arg) throws IOException, InterruptedException {

        //Declaracion de variables
        Scanner sc = new Scanner(System.in);
        char opc;
        Triangulo Main = new Triangulo();

        do{//Inicio del programa principal
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Comando para limpiar pantalla
            Main.leer(); //Metodo que ejecuta el proceso de triangulacion

            System.out.print("\nDesea realizar otra ejecucion? s/n: "); //Inicio de bucle desea continuar s/n
            opc=sc.nextLine().charAt(0);
            while(opc != 's' && opc != 'S' && opc != 'n' && opc != 'N'){//Condicional para evitar ingresar caracteres que no sean s/n
                System.out.println("\n*****Opcion incorrecta, ingrese nuevamente la informacion*****");
                System.out.print("\nDesea procesar otra informacion? s/n: ");
                opc = sc.next().charAt(0);
            }
            
        }while(opc=='s'||opc=='S');sc.close(); //Fin de bucle desea continuar s/n
    }
}