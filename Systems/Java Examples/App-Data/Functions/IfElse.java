package Functions;

// Informa el resultado de la division
// SENTENCIA IF/ELSE
public class IfElse {

    public static void main(String[] args){
        int dividendo = 6;
        int divisor = 0;
        int resultado = 0;

        if(divisor != 0) {

            resultado = dividendo / divisor;
            System.out.println("El resultado es: " + resultado);
        } else {

            System.out.println("No se puede dividir por cero");
        }
    }
}