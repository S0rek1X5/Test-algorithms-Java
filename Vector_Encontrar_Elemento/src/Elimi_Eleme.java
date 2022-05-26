import java.util.Scanner;

public class Elimi_Eleme {
    Scanner sc=new Scanner(System.in);
    private int Vec[]=new int[25];

    public void leer(){
        int i,n;
        System.out.print("Ingrese la dimension del vector: ");n=sc.nextInt();
        for(i=0;i<n;i++){
            System.out.print("  Vec["+i+"] = ");
            Vec[i]=sc.nextInt();
        }
        procesar(n,Vec);
    }
    public void procesar(int n, int Ve[]){
        int po,aux=0,i,num=0;
        System.out.print("Ingrese el elemento que quiere buscar: ");po=sc.nextInt();
        for(i=0;i<=n;i++){
            if(Vec[i]==po)
                aux=Vec[i];
            while((i==n) && (aux!=po)){
                System.out.print("\nERROR El elemento no existe\n");
                System.out.print("Ingrese el elemento que quiere buscar: ");po=sc.nextInt();
                i=0;
            }
        }
        for(i=0;i<n;i++){
            if(Vec[i]==po)
                num=i;
        }
        imprimir(n, num,Vec);
    }
    public void imprimir(int n, int num,int Vec[]){
        System.out.print("\nSu elemento esta en la posicion: \n");
        System.out.print(" Vec["+num+"]");
    }
}