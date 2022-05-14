package SchoolSystem.School;

//extends agregar a los protegidos a su libreria
public class Students  extends Person{
    
    //CREACION DE VARIABLES (SUPER IMPORTANTE)

    //desde aqui
    private boolean aprobado;
    private int nota1;
    private int nota2;
    private int nota3;

    //"CONSTRUCTOR"
    public Alumnos(int nota1, int nota2, int nota3){

        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.aprobado = calcular_aprobado();
    }
    //hasta aqui


    //Procedimiento para inserciones publicas
    void setNota1(int nota1){

        this.nota1 = nota1;
        this.aprobado = this.calcular_aprobado();

    }

    //Prodecimiento para reutilizar la funcion Mostrar();
    void recalcular_aprobado(){

        this.aprobado = this.calcular_aprobado();

    }

    //Funcion
    private boolean calcular_aprobado(){
        
        double promedio = (this.nota1 + this.nota2 + this.nota3) / 3;
        if(promedio >= 6){
            return true;
        } else {
            return false;
        }

    }

    //Procedimiento = Funcion que no retorna ningun valor
    public void mostrar(){

        super.mostrar();
        if(this.aprobado){
            System.out.println("Alumno Aprobado");
        } else {
            System.out.println("Alumno Desaprobado");
        }
    }

    //CLONACION
    /*
    protected Alumnos clone(){
        try {
            return (Alumnos) super clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }*/
}
