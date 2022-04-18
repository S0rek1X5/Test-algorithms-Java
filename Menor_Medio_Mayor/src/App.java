import java.util.*;
//Programa que lea tres numeros e imprima el numero menor, mediano y mayor
public class App {
    private int n1,n2,n3,men,med,may;
    private void leer(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");n1=sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");n2=sc.nextInt();
        System.out.print("Ingrese el tercer numero: ");n3=sc.nextInt();
        men=n1; may=n3;
    }
    private void procesar(){
        if(n2<men)
            men=n2;
        if(n3<men)
            men=n3;
        if(n1>may)
            may=n1;
        if(n2>may)
            may=n2;
        med=(n1+n2+n3-may-men);
    }
    private void imprimir(){
        System.out.println("El numero menor es: "+men);
        System.out.println("El numero menor es: "+med);
        System.out.println("El numero menor es: "+may);
    }
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.leer();
        app.procesar();
        app.imprimir();
    }
}