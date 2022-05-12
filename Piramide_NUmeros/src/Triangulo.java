import java.util.Scanner;

public class Triangulo {
    Scanner sc=new Scanner(System.in);
    int i,k,j=1;
    public void leer(){
        System.out.printf("Ingrese la cantidad de filas del triangulo: ");k=sc.nextInt();
        procesar(k);
        j=1;
    }
    public void procesar(int k){
        while(j!=k+1){
            System.out.print("\t");
            for(i=j;i<=k;i++){
                if(i<=9)
                    System.out.printf(" 0"+i);
                else if(i>=9)
                    System.out.printf(" "+i);
            }
            j++;
            System.out.print("\n");
            Thread.sleep(1000);
        }
    }
}