package unq.edu.ar.po2.tp5;

public class ProductoCasaTradicional extends ProductoComercial{
	
	private Double precio;

	public ProductoCasaTradicional(Double precio) {
		super(precio);
		
	}

	@Override
	public Double getPrecioTotal() {
		
		return this.getPrecio();
	}

	
}
