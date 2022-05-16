import java.util.Scanner;
import java.io.IOException;
public class Opciones_2 {
    public void Dos() throws InterruptedException, IOException{
        Scanner sc=new Scanner(System.in);
        int opt,ord,i,j;
        int[] num=new int[6];

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("Introduzca los numeros que desea ordenar");
        for(i=0;i<6;i++){
            System.out.print(": ");num[i]=sc.nextInt();
        }
        System.out.print("Desea ordenar de forma ascendente o descendente a/d: ");
        char opc=sc.next().charAt(0);
        System.out.println("\nSu arreglo es:");
            for(i=0;i<6;i++){
                System.out.print(" "+num[i]);
            }
        if(opc=='a'){
            for(i=0;i<6;i++){
                for(j=0;j<6;j++){
                    if(num[i]<num[j]){
                        ord=num[i];
                        num[i]=num[j];
                        num[j]=ord;
                    }
                }
            }
            System.out.println("\n\nSu arreglo ordenado:");
            for(i=0;i<6;i++){
                System.out.print(" "+num[i]);
            }
        }
        else if(opc=='d'){
            for(i=0;i<6;i++){
                for(j=0;j<6;j++){
                    if(num[i]>num[j]){
                        ord=num[i];
                        num[i]=num[j];
                        num[j]=ord;
                    }
                }
            }
            System.out.println("\n\nSu arreglo ordenado:");
            for(i=0;i<6;i++){
                System.out.print(" "+num[i]);
            }
        }
        System.out.println("\n\tDigite\n1-Volver a ejecutar\n2-Volver al menu principal\n3-Salir del programa:");
        opt=sc.nextInt();
        switch(opt){
            case 1:
                Dos();
            case 2:
                break;
            case 3:
                System.exit(3);
        }
    }
}