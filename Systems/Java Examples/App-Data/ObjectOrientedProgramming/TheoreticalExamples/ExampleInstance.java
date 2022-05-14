package TheoreticalExamples;

public class ExampleInstance {

    public static void main(String[] args){

        ExamplePerson2 maria = new ExamplePerson2(1.60f,65.0f, 1990);

        ExamplePerson2 juan = new ExamplePerson2(1.5f, 80.0f, 2000);

        System.out.println(maria.obtenerEdad());
        System.out.println(juan.obtenerIMC());
    }
}
