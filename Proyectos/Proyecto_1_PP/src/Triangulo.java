import java.util.Scanner;

public class Triangulo {

    Scanner sc=new Scanner(System.in);
    //Declaracion de variables
    int i,k,j=1;

    public void leer() throws InterruptedException{
        System.out.print("Ingrese la cantidad de filas del triangulo: ");
        k = sc.nextInt();

        procesar(k);
        j=1;
    }

    public void procesar(int k) throws InterruptedException{
        System.out.print("\n");
        while(j!=k+1){
            System.out.print("\t");
            for(i=j;i<=k;i++){
                if(i<=9)//Condicional para aregar un cero a la izquierda a los numeros menores que 10
                    System.out.printf(" 0"+i);
                else if(i>9)
                    System.out.printf(" "+i);
            }
            j++;
            System.out.print("\n");
            Thread.sleep(500);//Ralentizacion de la impresion
        }
    }
}