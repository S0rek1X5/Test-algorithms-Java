import java.util.Scanner;
public class Calculator{
    Scanner escaner = new Scanner(System.in);

    public void CalSuma(){
        int valor,suma=0;
        System.out.println("Digite los numeros que desee sumar: ");
        do{
            System.out.println(" ");valor=escaner.nextInt();
            suma+=valor;
        }while(valor!=0);
        System.out.println("El resultado de su suma es: " + suma);
    }
    public void CalResta(){
        int valor_1,valor_2,resta;
        System.out.print("Digite los numeros que desea restar: ");valor_1=escaner.nextInt();
        System.out.print(" ");valor_2=escaner.nextInt();
        resta=valor_1 - valor_2;
        System.out.println("El resultado de su resta es: " + resta);
    }
    public void CalMultiplicacion(){
        int valor,multi=1;
        System.out.println("Digite los numeros que desee multiplicar:");
        do{
            System.out.println(" ");valor=escaner.nextInt();
            multi*=valor;
            System.out.println("El resultado de su multiplicacion es: " + multi);
        }while(valor!=0);
    }
    public void CalDivision(){
        int valor_1,valor_2,divi;
        System.out.print("Digite los numeros que desea dividir: ");valor_1=escaner.nextInt();
        System.out.print("/ ");valor_2=escaner.nextInt();
        divi=valor_1 / valor_2;
        System.out.println("El resultado de su resta es: " + divi);
    }

    public static void main (String[] args){
        Scanner escaner = new Scanner(System.in);
        int opc;
        System.out.println("Bienvenido");
        System.out.print("Que operacion desea realizar? "); opc=escaner.nextInt();
        System.out.println("Digite 0 para ejecutar el calculador");
        if (opc==1){
            CalSuma();
        }else if(opc==2){
            CalResta();
        }else if(opc==3){
            CalMultiplicacion();
        }else if(opc==4){
            CalDivision();
        }else{
            System.out.println("Usted no ha elegido una opcion valida");
        }
    }
}