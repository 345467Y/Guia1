package Actividad1;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
public class Tienda {
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Producto> productos;


    public Tienda(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.productos = new ArrayList<>();
    }


    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public String obtenerTelefono() {
        return telefono;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> obtenerProductos() {
        return productos;
    }
}


