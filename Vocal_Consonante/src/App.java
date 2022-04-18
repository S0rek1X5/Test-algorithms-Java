import java.util.*;
//Programa que lea si una letra es vocal o consonante
public class App {
    private char letra;
    private String voc_con;
    public void leer(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese una letra: ");letra=sc.next().charAt(0);
        sc.close();
    }
    public void procesar(){
        if ((letra == 'A' || letra =='a' || letra =='E' || letra =='e') ||
        (letra =='I' || letra=='i' || letra=='O' || letra=='o' || letra=='U') ||
        (letra=='u')){
            voc_con = "Vocal";
        }
        else{
            voc_con ="Consonante";
        }
    }
    public void imprimir(){
        System.out.println("La letra "+ letra +" Es una "+voc_con);
    }
    public static void main(String[] args) throws Exception {
        App app=new App();
        app.leer();
        app.procesar();
        app.imprimir();
    }
}