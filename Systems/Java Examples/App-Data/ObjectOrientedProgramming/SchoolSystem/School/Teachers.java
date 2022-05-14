package SchoolSystem.School;

public class Teachers extends Person{

    //Agregando dni
    protected String dni;

    Profesores(String dni){

        this.dni = dni;

    }

    public void mostrar(){
        
        super.mostrar();
        System.out.println("dni " + this.dni);

    }

}