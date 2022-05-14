package ExampleConcessionaire;

import java.util.ArrayList;
import java.util.List;

public class Concessionaire; {

    public static void main(String[] args){

        List<Automovil> ListaAutos = new ArrayList <>();

        ListaAutos.add(new Automovil("Ford", 2021, "Blanco", new Motor("Naftero", "123-ABC")));
        ListaAutos.add(new Automovil("Toyota", 2021, "Negro", new Motor("Naftero", "987-ABC")));

        for(Automovil auto : ListaAutos) {

            System.out.println(auto.informarDatos());
        }
    }
    
}
