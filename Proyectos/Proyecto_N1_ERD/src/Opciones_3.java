import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Opciones_3 {

    Scanner sc =  new Scanner(System.in); //Declaracion de escaner para datos tipo string
    Scanner num = new Scanner(System.in); //Declaracion de escaner para datos tipo numerico.
    DecimalFormat df = new DecimalFormat("#.00"); //Herramienta para limitar los decimales de los promedios
    Registro_estu ESCU[] = new Registro_estu[4]; //Registro que albergara informacion de cuatro estudiantes
    String nombre, materia;
    float acumNotas, promedio;
    float notas[] = new float[3]; //Arreglo para el almacenamiento de tres notas por cada estudiante
    int i, j, opt,opc;

    public void regEst() throws InterruptedException, IOException{ //Metodo para peticion de datos
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        for(i=0;i<ESCU.length;i++){//Ciclo for que recibe la informacion de cada estudiante por separado
            System.out.print("\n\nIngrese el nombre del estudiante " + (i+1) + ": ");//Se ingresa el nombre del estudiante
            nombre = sc.nextLine();
            System.out.print("Ingrese la materia del estudiante " + (i+1) + ": ");//Se ingresa la materia del estudiante
            materia = sc.nextLine();
            for(j=0;j<notas.length;j++){//Ciclo para el ingreso de las 3 calificaciones
                System.out.print("Ingrese la nota " + (j+1) + " del estudiante " + (i+1) + ": ");
                notas[j] = num.nextFloat();
                acumNotas += notas[j];// Se crea un acumulativo para luego calcular el promedio del estudiante
            }
            promedio = acumNotas / 3; // Calculo del promedio del estudiante

            
            ESCU[i] = new Registro_estu(nombre, materia, acumNotas); // Envio de informacion de los estudiantes a la clase que organizara la informacion
            acumNotas = 0; // Reinicio del acumulativo para evitar errores
        }

        impresion(nombre, materia, promedio); //El metodo envia los datos aqui mostrados para su impresion
    }

    public void impresion(String nombre, String materia, float promedio) throws InterruptedException, IOException{ //Metodo para la impresion de los datos del registro
        for(i=0; i<ESCU.length; i++){
            System.out.println("\n\nEl nombre del estudiante " + (i+1) + " es: " + ESCU[i].getnombre());
            System.out.println("La materia del estudiante " + (i+1) + " es: " + ESCU[i].getMateria());
            System.out.println("El promedio del estudiante " + (i+1) + " en la materia " + ESCU[i].getMateria() + " es de: " + df.format(ESCU[i].getPromedio()));
        }
        System.out.println("\n\n\tDigite\n1-Volver a ejecutar\n2-Volver al menu principal\n3-Salir del programa:");
        opc=sc.nextInt();
        switch(opc){
        case 1:
        case 2:
            Main.main();
        case 3:
            System.exit(3);
    }
    }
}