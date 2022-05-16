import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String... arg) throws IOException, InterruptedException {
        Scanner sc=new Scanner(System.in);
        char opc='s';
        while(opc=='s'|| opc=='S'){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            Su_Pa_Im Main = new Su_Pa_Im();
            Main.leer();
            System.out.println("Desea volver a ejecutar? s/n: ");opc=sc.next().charAt(0);
        }
    }
}