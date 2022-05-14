//Ejemplo de validacion internna
package TheoreticalExamples;


public class ExampleInternalValidation {

    private float saldo;

    public float informarSaldo(){

        return saldo;

    }
    
    public boolean establecerNuevoSaldo(float nuevoSaldo) {

        boolean seModificoSaldo;

        if(nuevoSaldo >= 00f) {
            saldo = nuevoSaldo;
            seModificoSaldo = true;
        } else {
            seModificoSaldo = false;
        }

        return seModificoSaldo;
    }
}
