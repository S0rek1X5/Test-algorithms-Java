import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String... arg) throws IOException, InterruptedException {
        Scanner sc=new Scanner(System.in);
        char opc;
        Triangulo Main = new Triangulo();
        do{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            Main.leer();
            System.out.print("Desea realizar otra ejecucion? s/n: ");opc=sc.nextLine().charAt(0);

            while(opc != 's' && opc != 'S' && opc != 'n' && opc != 'N'){
                System.out.println("\n*****Opcion incorrecta, ingrese nuevamente la informacion*****");
                System.out.print("\nDesea procesar otra informacion? s/n: ");
                opc = sc.next().charAt(0);
            }
            
        }while(opc=='s'||opc=='S');sc.close();
    }
}