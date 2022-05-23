import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String... arg) throws InterruptedException, IOException {
        Ordenar_Vector Main = new Ordenar_Vector();
        char opc;
        Scanner sc= new Scanner(System.in);
        do{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            Main.leer();

            System.out.print("\n\nDesea volver a ejecutar? s/n\n:");opc=sc.next().charAt(0);
        }while(opc=='s' || opc=='S');
        sc.close();
    }
}
