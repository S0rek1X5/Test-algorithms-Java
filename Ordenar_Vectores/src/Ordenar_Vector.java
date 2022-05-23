import java.io.IOException;
import java.util.Scanner;

public class Ordenar_Vector {
    private int Vec[] =new int[25];
    Scanner sc=new Scanner(System.in);
    public void leer() throws InterruptedException, IOException{
        int i,n;
        System.out.print("Ingrese la dimension del vector: ");n=sc.nextInt();
        for(i=0;i<n;i++){
            System.out.print("  Vec[" +i+"] = ");Vec[i]=sc.nextInt();
        }
        procesar(n,Vec);
    }
    public void procesar(int n, int Vec[]) throws InterruptedException, IOException{
        int i,j,aux;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(Vec[i]<Vec[j]){
                    aux=Vec[i];
                    Vec[i]=Vec[j];
                    Vec[j]=aux;
                }
            }
        }
        imprimir(n,Vec);
    }
    public void imprimir(int n, int Vec[]) throws InterruptedException, IOException{
        int i;
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("\nVector ordenado de menor a mayor\n");
        for(i=0;i<n;i++){
            System.out.println("  Vec[" +i+"] = "+Vec[i]);
        }
        System.out.print("\n");
    }
}
