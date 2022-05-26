import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        Elimi_Eleme Main= new Elimi_Eleme();
        char opc;
        do{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            Main.leer();
            System.out.println("Desea volver a ejecutar?: s/n");opc=sc.next().charAt(0);
        }while(opc=='s'||opc=='S');
        sc.close();
    }
}
