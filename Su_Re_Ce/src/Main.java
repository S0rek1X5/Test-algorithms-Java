import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String... arg) throws IOException, InterruptedException {
        Posi_Nega_Cero Main=new Posi_Nega_Cero();
        Scanner sc=new Scanner(System.in);
        char opc;
        do{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
            Main.leer();
            System.out.println("Desea realizar otra ejecucion s/n: ");
            opc=sc.nextLine().charAt(0);
        }while((opc=='s') || (opc=='S'));sc.close();
    }
}
