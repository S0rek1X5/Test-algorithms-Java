import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        char opc;
        Nuevo_Elemen Main= new Nuevo_Elemen();
        Scanner sc = new Scanner(System.in);
        do{

            Main.leer();


            System.out.println("\n\nDesea realizar otra ejecucion? s/n: ");opc=sc.next().charAt(0);
        }while(opc=='s' || opc=='S');
        sc.close();
    }
}
