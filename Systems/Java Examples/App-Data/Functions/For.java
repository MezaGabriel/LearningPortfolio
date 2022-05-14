package Functions;

//Informa los numeros pares entre 0 y 10
public class For {

    public static void main(String[] args){

        int numeroInicio = 0;
        int numeroFin = 10;

        for(int i = numeroInicio; i <= numeroFin; i++){

            if((i % 2) == 0){

                System.out.println("Numero par: " + i);

            }
        }

    }
    
}
