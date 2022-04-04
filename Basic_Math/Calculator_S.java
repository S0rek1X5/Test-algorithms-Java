import java.util.Scanner;
/*Programa que lea dos numeros (decimales) y un caracter (+, -, *, /), e
imprima la operacion segun el caracter*/
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el pimer numero: ");float num_1 = sc.nextFloat();
        System.out.println("Ingrese el segundo numero: ");float num_2 = sc.nextFloat();
        System.out.println("ingrese un caracter (+, -, *, /)\n: ");char c = sc.next().charAt(0);
        switch(c){
            case '+':
                System.out.println("La suma de "+num_1+" + "+ num_2 +" = "+ (num_1+num_2));break;
            case '-':
                System.out.println("La resta de "+num_1+" - "+ num_2 +" = "+ (num_1-num_2));break;
            case '*':
                System.out.println("La multiplicacion de "+num_1+" * "+ num_2 +" = "+ (num_1*num_2));break;
            case '/':
                if(num_2!=0){
                    System.out.println("La division de "+num_1+" / "+ num_2 +" = "+ (num_1/num_2));
                }else{
                    System.out.println("Error\nDivision por cero");
                }break;
            default:
                System.out.println("Error\nCaracter incorrecto");
        } sc.close();
    }
}