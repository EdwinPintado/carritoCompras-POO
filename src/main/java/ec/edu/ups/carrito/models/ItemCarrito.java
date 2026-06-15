
package ec.edu.ups.carrito.models;

import java.util.Objects;


public class ItemCarrito {
    private Producto producto;
    private int cantidad;

    public ItemCarrito() {
    }

    public ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.producto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemCarrito other = (ItemCarrito) obj;
        return Objects.equals(this.producto, other.producto);
    }
    public double calcularSubTotal(){
        return producto.getPrecio() * cantidad;
    } 
    
}