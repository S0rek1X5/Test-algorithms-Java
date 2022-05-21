import java.io.IOException;
import java.util.*;
// Opcion 1
public class Opciones_1 {
    Main Opciones_1 = new Main();
    private String cad, mincad; char car, mincar; int cant = 0;
    Scanner sc = new Scanner(System.in);
    int opt;

    public void leer() throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.print("Ingrese una cadena: ");
        cad = sc.nextLine();
        System.out.println("¿Qué caracter desea buscar?");
        car = sc.next().charAt(0);
        
        procesar(cad, car);
    }

    public void procesar(String cad, char car) throws InterruptedException, IOException {
        mincad = cad.toLowerCase();
        mincar = Character.toLowerCase(car); 

        int i;
        for (i = 0; i < mincad.length(); i++) {
            if (mincad.charAt(i) == mincar)
                cant++;
        }
        imprimir(cant);
    }

    public void imprimir(int pos) throws InterruptedException, IOException {
        if (cant == 1)
            System.out.println(" '" + car + "' " + " se encuentra " + cant +  " vez en '" +  cad +"' ");
        else if (cant == 0)
            System.out.println(" '" + car + "' " + " no se encuentra en '" +  cad +"' ");
        else 
            System.out.println(" '" + car + "' " + " se encuentra " + cant +  " veces en '" +  cad +"' ");

            System.out.println("\n\n\tDigite\n1-Volver a ejecutar\n2-Volver al menu principal\n3-Salir del programa:");
            opt=sc.nextInt();
            switch(opt){
                case 1:
                    leer();
                case 2:
                    Main.main();
                case 3:
                    System.exit(3);
            }
    }
}