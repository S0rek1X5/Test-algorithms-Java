import java.util.Scanner;
public class Su_Pa_Im {

    Scanner sc=new Scanner(System.in);
    private int Vec[] = new int [25];
    public void leer(){
        int i,n;
        System.out.print("Ingrese la dimension del vector: ");n=sc.nextInt();
        for(i=0;i<n;i++){
            System.out.print("    Vec["+i+"] = ");Vec[i]=sc.nextInt();
        }
        procesar(n,Vec);
    }
    public void procesar(int n, int Vec[]){
        int suPa=0, suIm=0;
        for(int i=0;i<n;i++){
            if(Vec[i] %2==0)
                suPa+=Vec[i];
            else 
                suIm+=Vec[i];
        }
        imprimir(suPa, suIm);
    }

    public void imprimir(int suPa, int suIm){
        System.out.print("\nLa suma de los elementos pares es: "+suPa);
        System.out.print("\nLa suma de los elementos impares es: "+suIm+"\n");
    }
}