import java.util.Scanner;

public class Nuevo_Elemen {
    Scanner sc=new Scanner(System.in);
    private int Vec[]=new int[25];

    public void leer(){
        int i,n,nE,po;
        System.out.print("Ingrese la dimension del vector: ");n=sc.nextInt();
        for(i=0;i<n;i++){
            System.out.print("  Vec["+i+"] = "); Vec[i]=sc.nextInt();
        }
        System.out.print("\nIngrese el nuevo elemento: ");nE=sc.nextInt();
        System.out.print("\nIngrese la posicion: ");po=sc.nextInt();
        while(po<0 || po>n-1){
            System.out.print("\n\tERROR\nPosicion incorrecta");
            System.out.print("\nIngrese la posicion: ");po=sc.nextInt();
        }
        procesar(n,Vec,nE,po);
    }
    public void procesar(int n,int Vec[],int nE,int po){
        int i;
        for(i=n;i>=po+1;i--){
            Vec[i]=Vec[i-1];
        }
        Vec[po] = nE;
        imprimir(n,Vec);
    }
    public void imprimir (int n, int Vec[]){
        int i;
        System.out.println("\nSu vector queda como:");
        for(i=0;i<=n;i++){
            System.out.println("  Vec["+i+"] = "+Vec[i]);
        }
    }
}