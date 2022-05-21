public class Registro_estu {

    //Declaracion de las variables para el registro de los estudiantes
    private String nombre;
    private String materia;
    private float acumNotas, promedio;

    public Registro_estu(){ //Constructor que inicializa las variables del registro
        nombre = "";
        materia = "";
        acumNotas = 0;
        promedio = 0;
    }

    public Registro_estu(String nombre, String materia, float acumNotas){ //Constructor que recibe los datos ingresados
        this.nombre = nombre;
        this.materia = materia;
        this.acumNotas = acumNotas;
    }

    public void setNombre(String nombre){//Metodo que recibe informacion y la asigna localmente en la clase
        this.nombre = nombre;
    }
    public String getnombre(){//Metodo que envia la informacion de regreso a la clase donde de imprimiran los valores finales
        return nombre;
    }

    public void setMateria(String materia){//Metodo que recibe informacion y la asigna localmente en la clase
        this.materia = materia;
    }
    public String getMateria(){//Metodo que envia la informacion de regreso a la clase donde de imprimiran los valores finales
        return materia;
    }

    public void setacumNotas(float acumNotas){//Metodo que recibe informacion y la asigna localmente en la clase
        this.acumNotas = acumNotas;
    }
    public float getPromedio(){//Metodo que envia la informacion de regreso a la clase donde de imprimiran los valores finales
        promedio = acumNotas / 3; //Se toman las notas acumuladas y se transforman en promedio
        return promedio;
    }
}
