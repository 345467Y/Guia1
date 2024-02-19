package Actividad1;

import java.util.Date;

public class Producto {
    private int codigo;
    private String nombre;
    private TipoProducto tipo;
    private Date fechaExpiracion;
    private String fabricante;
    private int cantidadInventario;
    private double precioUnitario;

    public Producto(int codigo, String nombre, TipoProducto tipo, Date fechaExpiracion, String fabricante, int cantidadInventario, double precioUnitario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaExpiracion = fechaExpiracion;
        this.fabricante = fabricante;
        this.cantidadInventario = cantidadInventario;
        this.precioUnitario = precioUnitario;
    }

    public int obtenerCodigo() {
        return codigo;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public TipoProducto obtenerTipo() {
        return tipo;
    }

    public Date obtenerFechaExpiracion() {
        return fechaExpiracion;
    }

    public String obtenerFabricante() {
        return fabricante;
    }

    public int obtenerCantidadInventario() {
        return cantidadInventario;
    }

    public double obtenerPrecioUnitario() {
        return precioUnitario;
    }

    public void establecerCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerTipo(TipoProducto tipo) {
        this.tipo = tipo;
    }

    public void establecerFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public void establecerFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void establecerCantidadInventario(int cantidadInventario) {
        this.cantidadInventario = cantidadInventario;
    }

    public void establecerPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
