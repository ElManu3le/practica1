package gestion;

import java.util.*;
import facturacion.*;

public class ejercicio3 {

    public static void main(String[] args) {

        List<Factura> listafacturas = new ArrayList<Factura>();

        List<Producto> productos = new ArrayList<Producto>();
        productos.add(new Producto(0.75, "Leche", IVA.normal));
        productos.add(new Producto(8.99, "Salmon", IVA.reducido));
        productos.add(new Producto(2.95, "Aguacates", IVA.superreducido));
        productos.add(new Producto(1.20, "Friegasuelos", IVA.normal));
        productos.add(new Producto(0.56, "Cerveza", IVA.reducido));
        productos.add(new Producto(1.45, "Sandia", IVA.superreducido));

        listafacturas.add(new Factura(1, productos));

        /***************************** */
        List<Producto> productos2 = new ArrayList<Producto>();
        productos2.add(new Producto(5.36, "Coche juguete", IVA.normal));
        productos2.add(new Producto(18.99, "Bidon Gasolina 10L", IVA.reducido));
        productos2.add(new Producto(60000.0, "Golf GTI PLUS", IVA.normal));
        productos2.add(new Producto(80.00, "Kit cuchillos japoneses", IVA.normal));

       
        listafacturas.add(new Factura(2, productos2));
        /***************************** */

        List<Producto> productos3 = new ArrayList<Producto>();
        productos3.add(new Producto(3.50, "Plastilina", IVA.reducido));
        productos3.add(new Producto(5.00, "Llave USB", IVA.reducido));
        productos3.add(new Producto(6.00, "Cerveza AMBAR Pack 12", IVA.reducido));
        productos3.add(new Producto(85.75, "Wisky Hibiki ", IVA.reducido));

        
        listafacturas.add(new Factura(3, productos3));
        /***************************** */

        List<Producto> productos4 = new ArrayList<Producto>();
        productos4.add(new Producto(65.45, "Ratón Razer", IVA.normal));
        productos4.add(new Producto(5.00, "Folios DIN A4 pack 100", IVA.reducido));
        productos4.add(new Producto(150000.99, "Ferrari spyder", IVA.normal));
        productos4.add(new Producto(65.00, "Halo 6 ", IVA.normal));
        productos4.add(new Producto(210.45, "Windows 10 Pro", IVA.reducido));

       
        listafacturas.add(new Factura(4, productos4));
        /***************************** */

        List<Producto> productos5 = new ArrayList<Producto>();
        productos5.add(new Producto(7.35, "Portal 2", IVA.normal));
        productos5.add(new Producto(45.20, "Half Life Alyx", IVA.reducido));
        productos5.add(new Producto(0.00, "Team Fortress 2", IVA.superreducido));
        productos5.add(new Producto(35.40, "Metro Exodus", IVA.normal));
        productos5.add(new Producto(15.25, "Rising Storm 2: Viertman", IVA.reducido));
        productos5.add(new Producto(20.00, "Tarjeta STEAM 20$", IVA.superreducido));

        listafacturas.add(new Factura(5, productos5));


        for (Factura valor : listafacturas) {
            System.out.println(valor + "\n El importe con IVA: " + UtilidadesFactura.calcularImporteFacturaConIVA(
                    valor)
            );
            
        }
       
    }

}
