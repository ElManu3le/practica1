package gestion;

import facturacion.*;
import java.util.*;

public class ejercicio2 {

    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<Producto>();
        productos.add(new Producto(0.75, "Leche", IVA.normal));
        productos.add(new Producto(8.99, "Salmon", IVA.reducido));
        productos.add(new Producto(2.95, "Aguacates", IVA.superreducido));
        productos.add(new Producto(1.20, "Friegasuelos", IVA.normal));
        productos.add(new Producto(0.56, "Cerveza", IVA.reducido));
        productos.add(new Producto(1.45, "Sandia", IVA.superreducido));

        Factura miFactura = new Factura(1, productos);
        System.out.println(productos + "\n El importe con IVA: " +
                UtilidadesFactura.calcularImporteFacturaConIVA(miFactura));
    }

}
