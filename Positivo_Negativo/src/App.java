import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tBienvenido");
        System.out.print("Digite su numero entero: "); int num = sc.nextInt();
        if(num>0){
            System.out.println("El numero es positivo");
        } else if(num<0){
            System.out.println("El numero es negativo");
        } else{
            System.out.println("El numero es cero");
        }sc.close();
    }
}