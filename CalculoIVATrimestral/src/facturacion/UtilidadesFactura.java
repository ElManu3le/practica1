package facturacion;

public class UtilidadesFactura {

    public static double calcularImporteFactura(Factura f) { // Calcular el importe sin IVA
        double zeroIVA = 0.0;
        for (var producto : f.getProductos()) {
            zeroIVA += producto.getImporte();
        }
        return zeroIVA;

    }

    public static double calcularIVAFactura(Factura f) { // Calcula el IVA total de la factura
        double IVA = 0.0;
        for (var producto : f.getProductos()) {
            IVA += producto.getImporte() * producto.getIva().ayadido;
        }

        return IVA;

    }

    public static double calcularImporteFacturaConIVA(Factura f) { // Calcular importe de la factura con IVA
        return calcularImporteFactura(f) + calcularIVAFactura(f);
    }

}