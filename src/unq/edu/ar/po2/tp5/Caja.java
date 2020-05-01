package unq.edu.ar.po2.tp5;


public class Caja {
	
	private Double montoAPagar;

	public Caja() {
		this.montoAPagar = 0d;
		
	}

	public Double getMontoAPagar() {
		return montoAPagar;
	}
	
	public void registrarproducto(Producto producto) {
		this.montoAPagar += producto.getPrecioTotal();
		producto.decrementarStock();
		
	
	}

	
}
