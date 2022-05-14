package TheoreticalExamples;

import java.util.Calendar;

//Ejemplo de una clase persona en Java con 2 CONSTRUCTORES
public class ExamplePerson2{

    private float altura;
    private float peso;
    private int anioNacimiento;

    public ExamplePerson2() {
        altura = 0.0f;
        peso = 0.0f;
        anioNacimiento = 0;
    }

    public ExamplePerson2(float alturaPersona, float pesoPersona, int anioPersona) {
        altura = alturaPersona;
        peso = pesoPersona;
        anioNacimiento = anioPersona;
    }

    public int obtenerEdad(){

        Calendar fechaActual = Calendar.getInstance();
        int anioActual = fechaActual.get(Calendar.YEAR);

        return anioActual - anioNacimiento;
    
    }

    public float obtenerIMC(){

        return peso / (altura * altura);
    
    }
}
