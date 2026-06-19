
package ec.edu.ups.carrito.dao;

import ec.edu.ups.carrito.models.Producto;

public interface ProductoDAO {
    void crear(Producto producto);
    Producto buscar(int codigo);
    void actualizar (int codigo, Producto producto); 
    void eliminar(int codigo);
}

