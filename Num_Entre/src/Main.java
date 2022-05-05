import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        int n1, n2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");n1=sc.nextInt();
        System.out.print("Ingrese el Segundo numero: ");n2=sc.nextInt();


        Num_Entre Main=new Num_Entre();
        Main.procesar(n1, n2);sc.close();
    }
}