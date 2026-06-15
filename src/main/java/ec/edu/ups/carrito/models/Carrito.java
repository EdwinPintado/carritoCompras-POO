
package ec.edu.ups.carrito.models;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<ItemCarrito> items;

    public Carrito() {
        items = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto, int cantidad){
        ItemCarrito item = new ItemCarrito(producto,cantidad);
        items.add(item);
    }
    
     public void eliminarProducto(int codigo){
        ItemCarrito item = buscarProducto(codigo);
        if(item != null)
            items.remove(item);
    }
     
    public ItemCarrito buscarProducto(int codigo){
        for(ItemCarrito item : items){
            if(item.getProducto().getCodigo() == codigo)
                return item;
        }
        return null;
    }
    public double calcularTotal(){
        double total= 0;
        for(ItemCarrito item: items){
            total+=item.calcularSubTotal();
        }
        return total;
    }
}
