package unq.edu.ar.src.p2.tp4.supermercado;

public class ProductoPrimeraNecesidad extends Producto {
	private Double descuento;

	public ProductoPrimeraNecesidad(String nombre,Double precio, Boolean esPrecioCuidado,Double descuento) {
		super(nombre, precio, esPrecioCuidado);
		this.setDescuento(descuento);
		
	}
	
	@Override
	public Double getPrecio() {
		return this.precio * this.getDescuento();
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}
	

}
