import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String... arg) throws IOException, InterruptedException {
        Scanner sc=new Scanner(System.in);
        char opc;
        Menor_Mayor Main = new Menor_Mayor();
        do{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
            //Comando para limpiar pantalla
            Main.leer();
            Main.procesar();
            Main.imprimir();
            System.out.println("Digite s/n si desea procesar otra informacion o cerrar la consola:");
            opc= sc.next().charAt(0);
        }while(opc =='s'||opc=='S'); sc.close();
    }
}