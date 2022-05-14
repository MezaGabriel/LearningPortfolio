package ExampleConcessionaire;

public class Car {

    private String marca;
    private int modelo;
    private String color;
    private Motor motor;

    public Automovil(String marca, int modelo, String color, Motor motor) {
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
    }

    public String informarDatos() {

        return "Datos del Automovil: " + 
            " Marca: " + marca +
            " Modelo: " + modelo +
            " Color: " + color +
            " Motor: " + motor.mostrarDatos();
    }
}
