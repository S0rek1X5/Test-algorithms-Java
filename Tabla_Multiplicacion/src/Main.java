import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String... arg) throws IOException, InterruptedException {
        Scanner sc= new Scanner(System.in);
        char opc;
        do{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            Tabla Main = new Tabla();
            Main.leer();
            System.out.println("Desea realizar otra ejecucion s/n: ");
            opc= sc.nextLine().charAt(0);
        }while(opc=='s'||opc=='S');sc.close();
        
    }
}