package Functions;

//Mostrar el valor de un numero entero
//Mientras sea menor que 5
public class DoWhile {
    
    public static void main(String[] args){

        int numeroEntero = 0;
        boolean bandera = true;

        while (bandera){
            
            if(numeroEntero >= 5){
                bandera = false;

            } 
            else {
                System.out.println("Valor de numeroEntero: " + numeroEntero);
                numeroEntero++;

            }
        } 
        
    }
}
