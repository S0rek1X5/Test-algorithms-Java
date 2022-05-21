import java.util.Scanner;
public class Su_Ini_Cen_Fin {
    Scanner sc = new Scanner(System.in);
    private int Vec[] = new int[25];

    public void leer(){
        int n,i;
        System.out.print("Ingrese la dimension del vector: ");n=sc.nextInt();
        while(n%2 ==0){
            System.out.print("Error la dimension debe ser impar\n: ");n=sc.nextInt();
        }
        for(i=0;i<n;i++){
            System.out.print("\tVec["+i+"] = ");;Vec[i]=sc.nextInt();
        }
        procesar(n,Vec);            
    }
    public void procesar(int n,int Vec[]){
        int i, cen,suma=0;
        cen=(n/2);
        for(i=0;i<n;i++){
            if(i==0||i==cen||i==n-1)
                suma +=Vec[i];
        }
        imprimir(suma);
    }
    public void imprimir(int suma){
        System.out.println("\nLa suma de lso elementos inicio, centro y final es: "+suma);
    }
}