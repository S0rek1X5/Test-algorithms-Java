import java.util.Scanner;
public class Posi_Nega_Cero {
    private int i, n, num, canCero, suPosi, suNega;
    Scanner sc=new Scanner(System.in);
    public void leer(){
        System.out.print("Ingrese la cantidad de numeros: ");n = sc.nextInt();
        procesar(n);
    }
    public void procesar(int n){
        canCero=0;suPosi=0;suNega=0;
        for(i=1;i<=n;i++){
            System.out.print("   Numero "+i+" = ");num=sc.nextInt();
            if(num>0)
                suPosi+=num;
            else if(num<0)
                suNega+=num;
            else
                canCero++;
        }
        imprimir(suPosi, suNega, canCero);
    }
    public void imprimir(int p, int n, int c){
        System.out.println("\nLa suma de los numeros positivos es: "+ suPosi);
        System.out.println("La suma de los numeros negativos es: "+ suNega);
        System.out.println("La cantidad de ceros es: "+canCero);
    }
    
}
