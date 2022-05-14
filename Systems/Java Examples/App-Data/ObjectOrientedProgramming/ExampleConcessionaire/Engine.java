package ExampleConcessionaire;

public class Engine {
    
    private String tipo;
    private String serie;
    

    public Motor(String tipo, String serie) {
        this.tipo = tipo;
        this.setSerie(serie);
    
    }
    
    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String mostrarDatos(){
        return tipo;
    }
}
