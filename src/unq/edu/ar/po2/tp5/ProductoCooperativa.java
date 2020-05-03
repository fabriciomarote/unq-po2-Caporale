package unq.edu.ar.po2.tp5;

public class ProductoCooperativa extends ProductoComercial{

	public ProductoCooperativa(Integer stock, Double precio) {
		super(stock, precio);
		
	}

	@Override
	public Double getPrecioTotal() {
		Double importeADescontar = this.getPrecio() * 0.1;
		
		return this.getPrecio()-importeADescontar;
	}

	
	
	

}
