//crear una lista o arreglo donde se almacene los productos
package InventoryStock;

import java.util.ArrayList;
import java.util.List;


public class Inventory {

    private List<Producto>listadeproducto;

    public Inventario(){

        this.listadeproducto = new ArrayList<Producto>();
    }
    
    public void agregarprod(Producto producto){
        this.listadeproducto.add(producto);
    }
    
    public void mostrarproducto(){

        int totalcompra = 0;
        int totalventa = 0;

        for (Producto p:this.listadeproducto){
            totalcompra += p.getPrecio();
            totalventa += p.getVenta();

        System.out.println("Nombre de producto: "+p.getNombre());
        System.out.println("Precio de producto: "+p.getVenta());
        }
        System.out.println("Total de precios de compra: "+totalcompra);
        System.out.println("Total de precios de venta: "+totalventa);
    }
}
