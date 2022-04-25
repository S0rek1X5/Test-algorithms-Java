import java.util.Scanner;
public class Su_Pares_Impares {
    private int i, n, num, suPar, suImpar;
    Scanner sc = new Scanner(System.in);
    public void leer(){
        System.out.print("Ingrese la cantidad de numeros: ");n=sc.nextInt();
    }
    public void procesar(){
        suPar=0; suImpar=0;
        for (i=1;i<=n;i++){
            System.out.print(" Numero " +i+ " = ");num=sc.nextInt();
            if(num %2 == 0)
                suPar+=num;
            else
                suImpar+=num;
        }
    }
    public void imprimir(){
        System.out.println("\nLa suma de los numeros pares es: "+suPar);
        System.out.println("La suma de los numeros impares es: "+suImpar);
    }
}