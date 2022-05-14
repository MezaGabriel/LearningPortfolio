package TheoreticalExamples;

import java.util.Calendar;

//Ejemplo de una clase persona en Java
public class ExamplePerson{

    private float altura;
    private float peso;
    private int anioNacimiento;

    public ExamplePerson(float f, float g, int i) {
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
