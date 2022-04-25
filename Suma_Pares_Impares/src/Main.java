import java.io.IOException; //Libreria para limpiar pantalla
import java.util.Scanner;
public class Main {
    public static void main(String... arg) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        char opc;
        Su_Pares_Impares Main;
        Main = new Su_Pares_Impares();
        do{ //Ciclo Do while para repetir la ejecucion
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
            //Comando para limpiar pantalla
            Main.leer();
            Main.procesar();
            Main.imprimir();
            System.out.println("Digite s/n si desea procesar otra informacion o cerrar la consola:");
            opc= sc.next().charAt(0);
        }while(opc=='s'||opc=='S'); sc.close();
    }
}