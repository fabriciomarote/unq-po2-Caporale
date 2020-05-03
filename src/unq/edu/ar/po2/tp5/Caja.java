package unq.edu.ar.po2.tp5;


public class Caja {
	
	private Double montoAPagar;
	private Agencia agencia;

	public Caja(Agencia agencia) {
		this.montoAPagar = 0d;
		
	}

	public Double getMontoAPagar() {
		return montoAPagar;
	}
	
	public void registrarProducto(ProductoComercial producto) {
		this.montoAPagar += producto.getPrecioTotal();
		producto.yaRegistrado(agencia);
		//producto.decrementarStock();
		//producto.informar(agencia);
		
	
	}

	
}
