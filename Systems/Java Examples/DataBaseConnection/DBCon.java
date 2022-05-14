package DataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;


public class DBCon {

    public static void main(String[] args){

        /*Personas[] alumnos = new Personas[2];
        for(int i = 0 ; i < alumnos.length ; i++){
            alumnos[i] = new Personas();
            alumnos[i].cargarDatos();
            alumnos[i].calcularPromedio();
        }*/

        Connection conexion = null;
       
        try{
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Registro", "root", "Jorgito0204");
            System.out.println("Conectado");
        }
        catch(Exception e){
            System.out.println("No Conectado" + e);
        }
        finally{
            try{
               

                /*Statement st = conexion.createStatement();

                Personas[] alumnos = new Personas[2];
                int[] misNotas = new int[3];
                //int[] notas = new int[3];
                String NOMBRE = new String();

                for(int i = 0 ; i < alumnos.length ; i++){
                    alumnos[i] = new Personas();
                    NOMBRE = alumnos[i].cargarNombre();
                    misNotas = alumnos[i].cargarNotas();
                }

                for(int j = 0 ; j < 1 ; j++){
                    st.executeUpdate("INSERT INTO registro(nombre, nota1, nota2, nota3) VALUES ('"+NOMBRE+"') , "+ misNotas[j] +" , "+ misNotas[j + 1] +" , "+ misNotas[j + 2] + ")");
                }*/
                conexion.close();
                System.out.println("Conexion Cerrada");
            }
            catch(Exception e){
                System.out.println("No Me Puedo Cerrar " );
            }
        }
    }
   
}

class Personas{

    //Atributos
    private String nombres;
    private int[] notas = new int[3];
    private Scanner entrada;

    //Metodos

    //Constructor
    public Personas(){
        nombres = "";
        int[] notas = {0,0,0};
        entrada = new Scanner(System.in);
    }

    public int[] notas(int i, int j, int k) {
        return null;
    }

    public void establecerNombre(String nom){
        nombres = nom;
    }

    public String obtenerNombre(){
        return nombres;
    }

    /*public void cargarDatos() {
        nombres = cargarNombre();
       
        notas = cargarNotas();
       
    }*/

    public String cargarNombre(){
        System.out.println("Por favor ingrese su nombre");
        nombres = entrada.nextLine();
        return nombres;
    }

    public int[] cargarNotas() {
        for (int i = 0 ; i < notas.length ; i++){
           
            System.out.println("Porfavor cargue la nota" + (i + 1) + "para el alumno");
            notas[i] = entrada.nextInt();
            if(notas[1] < 0 || notas[1] > 10){
                while(notas[1] < 0 || notas[1] > 10){
                    System.out.println("Porfavor ingrese del 0 al 10");
                    notas[i] = entrada.nextInt();    
                }
                //throw new Exception("Error, la nota se asigno en 1 por estar fuera de rango");
            }    
        }
        return notas;      
    }

    public void calcularPromedio(){
        int suma = 0;
        double promedio;

        for (int i = 0 ; i < notas.length ; i++){
            suma = suma + notas[1];
        }
        promedio = suma / notas.length;

        String condicion;

        if(promedio >= 6)
            condicion = "Aprobado";
        else
            condicion = "Desaprobado";
       
        System.out.println("Nombre: " + this.obtenerNombre() + "      Promedio: " + promedio + "      Condicion: " + condicion);
       
    }
}
