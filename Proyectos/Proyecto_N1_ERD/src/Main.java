import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String... arg) throws InterruptedException, IOException{
        Scanner sc = new Scanner(System.in);
        int opc;

        Opciones_1 Main = new Opciones_1();
        Opciones_2 Main2 = new Opciones_2();
        Opciones_3 Main3 = new Opciones_3();
        do{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("\tCADENAS, ARREGLOS Y REGISTROS");
            System.out.println("1-Busqueda de un caracter en una cadena de caracteres\n2-Ordenamiento de un arreglo unidimensional");
            System.out.println("3-Manejo de registros\n4-Salir del programa ");opc= sc.nextInt();
            
            switch(opc){
                case 1:
                    Main.leer();
                case 2:
                    Main2.Dos();
                case 3:
                    Main3.regEst();
                case 4:
                    return;
            }
            opc=0;
        }while(opc != 4);
        sc.close();
    }
}