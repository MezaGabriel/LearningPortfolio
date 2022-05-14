package InventoryStock;

public class Aplication {
   
    public static void main(String[] args) {
        Producto producto1 = new Producto("Cafe", 1000, 10, false);
        Producto producto2 = new Producto("Leche", 500, 100, true);
        Producto producto3 = new Producto("Yerba", 890, 652, true);
        Inventario inventario = new Inventario();
        inventario.agregarprod(producto1);
        inventario.agregarprod(producto2);
        inventario.agregarprod(producto3);
        inventario.mostrarproducto();

    }
}
