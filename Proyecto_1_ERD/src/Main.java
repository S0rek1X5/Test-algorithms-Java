import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String... arg) throws IOException, InterruptedException {
        Scanner sc=new Scanner(System.in);
        int opc;
        Opciones_2 Main=new Opciones_2();
        do{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("\tCADENAS, ARREGLOS Y REGISTROS");
            System.out.println("1-Busqueda de un caracter en una cadena de caracteres\n2-Ordenamiento de un arreglo unidimensional");
            System.out.println("3-Manejo de registros\n4-Salir del programa ");opc= sc.nextInt();
            switch(opc){
                case 1:
                case 2:
                    Main.Dos();
                case 3:
                case 4:
                    return;
            }
        }while(opc==1||opc==2||opc==3||opc==4);
    }
}