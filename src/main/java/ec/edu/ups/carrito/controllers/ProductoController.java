
package ec.edu.ups.carrito.controllers;

import ec.edu.ups.carrito.dao.ProductoDAO;
import ec.edu.ups.carrito.models.Producto;
import ec.edu.ups.carrito.views.ActualizarProductoView;
import ec.edu.ups.carrito.views.BuscarProductoView;
import ec.edu.ups.carrito.views.CrearProductoView;
import ec.edu.ups.carrito.views.EliminarProductoView;
import ec.edu.ups.carrito.views.ListarProductoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;

public class ProductoController {
    private ProductoDAO productoDAO; 
    private CrearProductoView crearProductoView;
    private EliminarProductoView eliminarProductoView;
    private BuscarProductoView buscarProductoView;
    private ActualizarProductoView actualizarProductoView;
    private ListarProductoView listarProductoView;

    public ProductoController(ProductoDAO productoDAO, CrearProductoView crearProductoView, EliminarProductoView eliminarProductoView, BuscarProductoView buscarProductoView, ActualizarProductoView actualizarProductoView, ListarProductoView listarProductoView) {
        this.productoDAO = productoDAO;
        this.crearProductoView = crearProductoView;
        this.eliminarProductoView = eliminarProductoView;
        this.buscarProductoView = buscarProductoView;
        this.actualizarProductoView = actualizarProductoView;
        this.listarProductoView = listarProductoView; 
    }
    
    
    public void crearProducto(){
        int respuesta = JOptionPane.showConfirmDialog(crearProductoView, "¿Quieres crear un nuevo producto?", "Confirmar", JOptionPane.YES_NO_OPTION); 
        
        if(respuesta == 0){
            int codigo = Integer.parseInt(crearProductoView.getTextFieldCodigo().getText());
            String nombre = crearProductoView.getTextFieldNombre().getText();
            double precio = Double.parseDouble(crearProductoView.getTextFieldPrecio().getText());
            
            Producto producto = new Producto(codigo, nombre, precio);
            productoDAO.crear(producto);
            crearProductoView.mostrarInformacion("Producto creado exitosamente :)");
            
            crearProductoView.getTextFieldCodigo().setText("");
            crearProductoView.getTextFieldNombre().setText("");
            crearProductoView.getTextFieldPrecio().setText("");
        } else{
            crearProductoView.getTextFieldCodigo().setText("");
            crearProductoView.getTextFieldNombre().setText("");
            crearProductoView.getTextFieldPrecio().setText("");
            crearProductoView.mostrarInformacion("Accion cancelada :(");
        }
    }
    
    public void eliminarProducto(){
        int codigoEliminar = Integer.parseInt(eliminarProductoView.getTextFieldCodigoEliminar().getText());
        Producto producto = productoDAO.buscar(codigoEliminar);
        
        if(producto != null){
            int respuesta = JOptionPane.showConfirmDialog(eliminarProductoView, "¿Quieres eliminar este producto: " + producto.getNombre() + " ?" , "Confirmar", JOptionPane.YES_NO_OPTION); 
            if(respuesta == 0){
                productoDAO.eliminar(codigoEliminar);
                eliminarProductoView.mostrarInformacion("Producto eliminado con exito :)");
                
                eliminarProductoView.getTextFieldCodigoEliminar().setText("");
                listarProducto();
            }else{
                eliminarProductoView.mostrarInformacion("Accion cancelada :(");
            }
        }else{
            eliminarProductoView.mostrarInformacion("No se encontro el producto (Codigo no existe)");
        }
        
    }
    
    
    public void buscarProducto(){
        int codigoBuscar = Integer.parseInt(buscarProductoView.getTextFieldBuscarCodigo().getText());
        Producto producto = productoDAO.buscar(codigoBuscar);
        
        if(producto != null){
            buscarProductoView.getTextFieldNombreBus().setText(producto.getNombre());
            buscarProductoView.getTextFieldPrecioBus().setText(String.valueOf(producto.getPrecio()));
        }else{
            buscarProductoView.getTextFieldNombreBus().setText("");
            buscarProductoView.getTextFieldPrecioBus().setText("");
            buscarProductoView.mostrarInformacion("No se encontro el producto (Codigo no existe)");
        }
    }
    
    public void buscarActualizar(){
        int codigoBuscar = Integer.parseInt(actualizarProductoView.getTextFieldCodigoActualizar().getText());
        Producto producto = productoDAO.buscar(codigoBuscar);
        
        if (producto != null){
            actualizarProductoView.getTextFieldNuevoNombre().setText(producto.getNombre());
            actualizarProductoView.getTextFieldNuevoPrecio().setText(String.valueOf(producto.getPrecio()));
        }else{
            actualizarProductoView.getTextFieldNuevoNombre().setText("");
            actualizarProductoView.getTextFieldNuevoPrecio().setText("");
            actualizarProductoView.mostrarInformacion("No se encontro el producto (Codigo no existe)");
        }
    }
    
    public void actualizarProducto(){
        int codigoBuscar = Integer.parseInt(actualizarProductoView.getTextFieldCodigoActualizar().getText());
        Producto productoExt = productoDAO.buscar(codigoBuscar);
        
        if( productoExt != null){
            int respuesta = JOptionPane.showConfirmDialog(eliminarProductoView, "¿Quieres actualizar este producto: " + productoExt.getNombre() + " ?" , "Confirmar", JOptionPane.YES_NO_OPTION); 
            if(respuesta == 0){
                String nuevoNombre = actualizarProductoView.getTextFieldNuevoNombre().getText(); 
                double nuevoprecio = Double.parseDouble(actualizarProductoView.getTextFieldNuevoPrecio().getText()); 
                Producto productoAct = new Producto(codigoBuscar,nuevoNombre,nuevoprecio);
                productoDAO.actualizar(codigoBuscar,productoAct);
                
                actualizarProductoView.mostrarInformacion("Producto actualizado correctamente :)");
                
                actualizarProductoView.getTextFieldCodigoActualizar().setText("");
                actualizarProductoView.getTextFieldNuevoNombre().setText("");
                actualizarProductoView.getTextFieldNuevoPrecio().setText("");
                
                listarProducto();
            }else{
                actualizarProductoView.mostrarInformacion("Actualizacion candelada");
            }
        }else{
            actualizarProductoView.mostrarInformacion("No se encontro el producto (Codigo no existe)");
        }
    }
    
    public void listarProducto(){
        List<Producto> listaActualizada = productoDAO.listar();
        listarProductoView.cargarDatos(listaActualizada);
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
        actualizarProductoView.getBuscarAct().addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                buscarActualizar();
            }
        });
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
