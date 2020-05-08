package unq.edu.ar.po2.tp5;

public class ProductoCooperativa extends ProductoComercial{

	public ProductoCooperativa(Double precio) {
		super(precio);
		
	}

	@Override
	public Double getPrecioTotal() {
		Double importeADescontar = this.getPrecio() * 0.1;
		
		return this.getPrecio()-importeADescontar;
	}

	
	
	

}
