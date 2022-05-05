public class Num_Entre {
    public void procesar(int n_1,int n_2){
        String cad="       "; int i;
        if(n_1<n_2){
            for(i=n_1+1;i<n_2;i++){
                if(i<n_2-1)
                    cad+=i+", ";
                else
                    cad+=i;
            }
        }
        else if(n_1>n_2){
            for(i=n_1-1;i>n_2;i--){
                if(i>n_2+1)
                    cad+=i+", ";
                else
                    cad+=i;
            }
        }
        else
            cad="No hay numeros entre ellos";

    imprimir(cad);
    }
    public void imprimir(String cad){
        System.out.print("\n "+cad+"\n ");
    }
}