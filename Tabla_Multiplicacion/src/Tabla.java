import java.util.Scanner;
public class Tabla {
    private int i, num, mul;
    private String cad= "";
    Scanner sc= new Scanner(System.in);

    public void leer(){
        System.out.print("Ingrese la tabla que desea: ");num=sc.nextInt();
        procesar(num);
    }
    public void procesar(int num){
        for(i=0;i<=12;i++){
            mul=num*i;
            cad+="  "+num+" * "+i+" = "+mul+"\n";
        }
        imprimir(cad);
    }
    public void imprimir(String cad){
        System.out.println("\n"+cad);
    }
}
