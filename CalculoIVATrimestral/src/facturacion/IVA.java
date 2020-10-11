package facturacion;

public enum IVA {

    superreducido(.04), reducido(.1), normal(.21);

    double ayadido;

    private IVA(double valor) {
        valor = ayadido;

    }

}
