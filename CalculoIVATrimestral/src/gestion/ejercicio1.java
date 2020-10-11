package gestion;

import facturacion.*;//En el caso de establacer edu.facturacion en vez de facturacion el programa daria error
import java.util.*;

public class ejercicio1 {

    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<Producto>();
        productos.add(new Producto(0.75, "Leche"));// Instancio un producto "leche" a 0,75$
        productos.add(new Producto(0.56, "Cerveza"));
        productos.add(new Producto(0.50, "Pan"));
        productos.add(new Producto(1.45, "Sandia"));
        productos.add(new Producto(8.99, "Salmon"));
        productos.add(new Producto(2.95, "Aguacates"));
        productos.add(new Producto(1.20, "Friegasuelos"));

        Factura miFactura = new Factura(1, productos);
        System.out.println(miFactura); 

    }

}
