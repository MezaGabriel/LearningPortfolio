package SchoolSystem.School;

//VECTORIZAR = crear una lista (ARRAYS)
import java.util.ArrayList;
import java.util.Iterator;

public class Lessons {

    //variables
    private String nombre;
    private int anio;
    private Profesores profesor;

    Clases(String nombre, int anio){

        this.nombre = nombre;
        this.anio = anio;

    }

    void agregarProfesor(Profesores profesor){

        this.profesor = profesor;

    }

    //Creacion de Array
    ArrayList <Alumnos> alumnos = new ArrayList<Alumnos>();

    //PROCEDIMIENTOS INVOCABLES

    //anotacion : invocacion mediante = Clase Alumnos y variable alumno
    void agregar_alumnos(Alumnos alumno){

        this.alumnos.add(alumno);

    }

    void quitar_alumno(Alumnos alumno){

        this.alumnos.remove(alumno);

    }

    
    //procedimiento para lo visible en la aplicacion
    //desde aqui
    void mostrar(){

        System.out.println(this.nombre + " " + this.anio);
        System.out.println(this.profesor.nombre + " " + this.profesor.apellido);

        for(int i = 0; i < this.alumnos.size(); i++){
            
            System.out.println("Alumno en posicion " + i);
            this.alumnos.get(i).mostrar();
            System.out.println("-----------------------------------------------");

        }
            
    }
    
    //iterador = variable
    void mostrar2(){

        Iterator <Alumnos> it = this.alumnos.iterator();
        while(it.hasNext()){

            it.next().mostrar();
            System.out.println("-----------------------------------------------");

        }
        
    }
    //hasta aqui

}
