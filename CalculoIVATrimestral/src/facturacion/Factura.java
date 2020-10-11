package facturacion;

import java.util.*;

public class Factura {
    private int numero;
    private List<Producto> productos;
    private Date fecha;

    public Factura(int numero, List<Producto> productos) {
        this.numero = numero;
        this.productos = productos;

    }

    public Factura(int numero, List<Producto> productos, Date fecha) {
        this.numero = numero;
        this.productos = productos;
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        String factura = "Factura: " + numero + "\n*********\n";

        for (Producto producto : productos) {
            factura += producto.getDescripcion() + "-----> " + producto.getImporte() + "\n";
        }

        return factura;
    }

}