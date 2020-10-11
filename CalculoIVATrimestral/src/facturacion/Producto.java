package facturacion;

public class Producto {

	private double importe;
	private String descripcion;
	private IVA iva;

	public Producto(double importe, String descripcion) {// constructor con los campos importe y descripcion
		this.importe = importe;
		this.descripcion = descripcion;

	}

	public Producto(double importe, String descripcion, IVA iva) {// constructor con los campos importe y descripcion,
																	// añadiendo el iva
		this.importe = importe;
		this.descripcion = descripcion;
		this.iva = iva;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public IVA getIva() {
		return iva;
	}

	public void setIva(IVA iva) {
		this.iva = iva;
	}

	@Override
	public String toString() {
		return "Producto [descripcion=" + descripcion + ", importe=" + importe + "]";
	}

}
