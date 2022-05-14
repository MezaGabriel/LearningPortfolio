package Functions;

//SENTENCIA SWITCH
public class Switch {
    
    public static void main(String[] args){
        float operando1 = 3.0f;
        float operando2 = 2.5f;

        String operacion = "*";
        //este valor se puede cambiar
        
        switch (operacion){
            case "+":
                System.out.println("Resultado: " + (operando1 + operando2));
                break;
            case "-":
                System.out.println("Resultado: " + (operando1 - operando2));
                break;
            case "/":
                System.out.println("Resultado: " + (operando1 / operando2));
                break;
            case "*":
                System.out.println("Resultado: " + (operando1 * operando2));
                break;
            default:
                System.out.println("Operación no válida");
                break;
        }
    }
}
