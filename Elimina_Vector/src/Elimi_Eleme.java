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
        int po,i;
        System.out.print("Ingrese la posicion del elemento a eliminar: ");po=sc.nextInt();
        while(po<0 || po>n-1){
            System.out.print("ERROR La posicion no existe\n");
            System.out.print("Ingrese la posicion del elemento a eliminar: ");po=sc.nextInt();
        }
        for(i=po;i<n-1;i++){
            Vec[i]=Vec[i+1];
        }
        imprimir(n, Vec);
    }
    public void imprimir(int n, int Vec[]){
        int i;
        System.out.print("Vector resultante\n");
        for(i=0;i<n-1;i++){
            System.out.print("  Vec["+i+"] = "+Vec[i]+"\n");
        }
    }
}
