import java.util.Scanner;
//Programa que lea n cantidad de numero e imprima la suma de los 
//numero positivos y negativos
public class App {
    Scanner sc = new Scanner(System.in);
    private int i, n, num, suPo=0, suNe=0;
    public void leer(){
        System.out.print("Ingrese la cantidad de numeros: ");n=sc.nextInt();
    }
    public void procesar(){
        for(i=1;i<=n;i++){
            System.out.print("Numero: ");num=sc.nextInt();
            if(num>=0)
                suPo += num;
            else
                suNe += num;
        }
    }
    public void imprimir(){
        System.out.println("La suma de los numero positivos es: \n"+suPo);
        System.out.println("La suma de los numeros negativos es: \n"+suNe);
    }
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.leer();
        app.procesar();
        app.imprimir();
    }
}