import java.util.Scanner;
public class App{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Digite el primer numero: "); a= sc.nextInt();
        System.out.print("Digite el segundo numero: "); b= sc.nextInt();
        if(a>b){
            System.out.println(" " + a+" Es mayor que " + b);
            System.out.println(" " + b+" Es menor que " + a);
        } else if(b>a){
            System.out.println(" "+ b +" Es mayor que " + a);
            System.out.println(" "+ a +" Es menor que " + b);
        } else{
            System.out.println("Ambos digitos son iguales");
        } sc.close();
    }
}
/*
Esta es otra forma que tambien me sirvio para hacer el algoritmo
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a,b,mayor;
        System.out.print("Digite el primer numero: "); a= sc.nextInt();
        System.out.print("Digite el segundo numero: "); b= sc.nextInt();
        if(a>b){
            mayor=a;
            System.out.println("El numero mayor es: "+ mayor);
        } else if(b>a){
            mayor=b;
            System.out.println("El numero mayor es: "+ mayor);
        } else{
            System.out.println("Ambos digitos son iguales");
        } sc.close();
    } */