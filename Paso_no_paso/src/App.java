import java.util.Scanner;
public class App {
/*Programa que lea una nota (Decimal), e imprima si el estudiante paso la asignatura de java */
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese una nota: ");float nota= sc.nextFloat();
        if(nota >= 60.5 && nota <= 100){
            System.out.println("El estudiante paso Java");
        }else if(nota < 0 || nota > 100){
            System.out.println("Error la nota no existe");
        } else{
            System.out.println("El estudiante reprobo Java");
        }sc.close();
    }
}