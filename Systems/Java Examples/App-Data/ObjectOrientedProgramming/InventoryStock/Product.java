package InventoryStock;

public class Product {
    
    //atributos o propiedades
    private String nombre;
    private int precio;
    private int stock;
    private int precioventa;
    private boolean promocional;

    //constructor
    public Producto(String nombres, int precios, int stocks, boolean promocionals) {
        this.nombre = nombres;
        this.precio = precios;
        this.stock = stocks;
        this.precioventa = this.calcularpreciodeventa(precios,stocks,promocionals);
        this.setPromocional(promocionals);
        
    }

    public boolean isPromocional() {
        return promocional;
    }

    public void setPromocional(boolean promocional) {
        this.promocional = promocional;
    }

    private int  calcularpreciodeventa(int precio_de_compra, int cantidad, boolean promo){

        double resultado;

        if(!promo) {
            if((cantidad >= 1000 && precio_de_compra > 1500) || stock < 50 ){
                resultado = (precio_de_compra * 1.15) + 1.21;
            }else {
                resultado = (precio_de_compra * 1.20) * 1.21;
            }
        }else {
            resultado = precio_de_compra * 1.21;
        }

        return (int) resultado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPrecio() {
        return this.precio;
    }

    public int getStock() {
        return this.stock;
    }

    public int getVenta() {
        return this.precioventa;
    }

}