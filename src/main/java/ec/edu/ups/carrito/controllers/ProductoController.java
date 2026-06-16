
package ec.edu.ups.carrito.controllers;

import ec.edu.ups.carrito.models.Producto;
import ec.edu.ups.carrito.views.ActualizarProductoView;
import ec.edu.ups.carrito.views.BuscarProductoView;
import ec.edu.ups.carrito.views.CrearProductoView;
import ec.edu.ups.carrito.views.EliminarProductoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ProductoController {
    
    private static List<Producto> listaProductos = new ArrayList<>();
    private CrearProductoView crearProductoView;
    private EliminarProductoView eliminarProductoView;
    private BuscarProductoView buscarProductoView;
    private ActualizarProductoView actualizarProductoView;

    public ProductoController(CrearProductoView crearProductoView) {        
        this.crearProductoView = crearProductoView;
        configurarEventosCrearProducto();
    }
    
    public ProductoController(EliminarProductoView eliminarProductoView) {        
        this.eliminarProductoView = eliminarProductoView;
        configurarEventosEliminarProducto();
    }
    
    public ProductoController(BuscarProductoView buscarProductoView) {        
        this.buscarProductoView = buscarProductoView;
        configurarEventosBuscarProducto();
    }
    
    public ProductoController(ActualizarProductoView actualizarProductoView) {        
        this.actualizarProductoView = actualizarProductoView;
        configurarEventosActualizarProducto();
    }
    
    
    public void crearProducto(){
        int codigo = Integer.parseInt(crearProductoView.getTextFieldCodigo().getText());
        String nombre = crearProductoView.getTextFieldNombre().getText();
        double precio = Double.parseDouble(crearProductoView.getTextFieldPrecio().getText());
        
        Producto producto = new Producto(codigo, nombre, precio);
        listaProductos.add(producto);
        System.out.println("Producto creado exitosamente");
    }
    
    public void eliminarProducto(){
        int codigoEliminar = Integer.parseInt(eliminarProductoView.getTextFieldCodigoEliminar().getText());
        
        for( int i = 0; i < listaProductos.size(); i++){
            if(listaProductos.get(i).getCodigo() == codigoEliminar ){
                listaProductos.remove(i);
                System.out.println("Producto eliminado exitosamente");
                return ;
            }
        }
        
        System.out.println("No se encontro el producto (Codigo no existe)");
        
    }
    
    
    public void buscarProducto(){
        int codigoBuscar = Integer.parseInt(buscarProductoView.getTextFieldBuscarCodigo().getText());
        
        for(int i = 0; i < listaProductos.size(); i++){
            Producto product = listaProductos.get(i);
            if(product.getCodigo() == codigoBuscar){
                String info = "Datos del producto: \n" + "Codigo: " + product.getCodigo() + "\nNombre: " +  product.getNombre() + "\nPrecio: " + product.getPrecio(); 
                buscarProductoView.getTextAreaBusc().setText(info);
                System.out.println("Producto encontrado exitosamente");
                return ;
            }
        }
        
        System.out.println("No se encontro el producto (Codigo no existe)");
    }
    
    public void actualizarProducto(){
        int codigoActualizar = Integer.parseInt(actualizarProductoView.getTextFieldCodigoActualizar().getText());
        String nuevoNombre = actualizarProductoView.getTextFieldNuevoNombre().getText(); 
        double nuevoOreciuo = Double.parseDouble(actualizarProductoView.getTextFieldNuevoPrecio().getText()); 
        
        for(int i = 0; i < listaProductos.size(); i++){
            Producto produc = listaProductos.get(i);
            if(produc.getCodigo() == codigoActualizar){
                produc.setNombre(nuevoNombre);
                produc.setPrecio(nuevoOreciuo);
                System.out.println("Producto actualizado exitosamente");
                return ; 
            }
        }
        
        System.out.println("No se encontro el producto (Codigo no existe)");
    }
    
    
    
    public void configurarEventosCrearProducto(){
        crearProductoView.getButtonAceptar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearProducto();
            }
        });
    }
    
    public void configurarEventosBuscarProducto(){
        buscarProductoView.getAceptarBusc().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarProducto();
            }
        });
    }
    
    public void configurarEventosActualizarProducto(){
       actualizarProductoView.getAceptarAct().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarProducto();
            }
        });
    }
    
    public void configurarEventosEliminarProducto(){
        eliminarProductoView.getAceptarEliminar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarProducto();
            }
        });
    }
    
}
