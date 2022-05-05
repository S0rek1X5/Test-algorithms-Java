import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String... arg) throws IOException, InterruptedException {
        int n1, n2;
        Scanner sc=new Scanner(System.in);
        do{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.print("Ingrese el primer numero: ");n1=sc.nextInt();
            System.out.print("Ingrese el Segundo numero: ");n2=sc.nextInt();
            
            Num_Entre Main=new Num_Entre();
            Main.procesar(n1, n2);sc.close();
        }while((opc=='s') || (opc=='S'));sc.close();
    }
}