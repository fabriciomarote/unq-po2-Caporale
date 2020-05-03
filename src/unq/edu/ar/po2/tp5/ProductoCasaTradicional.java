package unq.edu.ar.po2.tp5;

public class ProductoCasaTradicional extends ProductoComercial{

	public ProductoCasaTradicional(Integer stock, Double precio) {
		super(stock, precio);
		
	}

	@Override
	public Double getPrecioTotal() {
		
		return this.getPrecio();
	}

}
