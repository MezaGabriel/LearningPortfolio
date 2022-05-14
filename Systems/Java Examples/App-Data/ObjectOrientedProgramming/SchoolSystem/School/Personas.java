package SchoolSystem.School;

//ABSTRACT = sirve para heredar, para que otra clase extienda de ella, no para instanciarla
abstract class Person {

    protected String nombre;
    protected String apellido;

    public void mostrar(){
        
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);

    }
}