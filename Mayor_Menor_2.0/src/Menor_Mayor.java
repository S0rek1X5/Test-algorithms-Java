import java.util.Scanner;
public class Menor_Mayor {
    private int i,n,num,men,may;
    Scanner sc=new Scanner(System.in);
    public void leer(){
        System.out.println("Ingrese la cantidad de numeros: ");n=sc.nextInt();
    }
    public void procesar(){
        System.out.println("Ingrese el numero: ");num=sc.nextInt();
        men=num; may=num;
        for (i=2;i<=n;i++){
            System.out.println("Ingrese el numero: ");num=sc.nextInt();
            if(num<men)
                men=num;
            else if (num>may)
                may=num;
        }
    }
    public void imprimir(){
        System.out.println("\nEl numero menor es: "+men);
        System.out.println("El numero mayor es: "+may);
    }
}
