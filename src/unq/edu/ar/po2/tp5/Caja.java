package unq.edu.ar.po2.tp5;


public class Caja {
	
	private Double montoAPagar;
	private Agencia agencia;
	private Stock stock;

	public Caja(Agencia agencia, Stock stock) {
		this.montoAPagar = 0d;
		this.agencia = agencia;
		this.stock = stock;
			
	}

	public Double getMontoAPagar() {
		return montoAPagar;
	}
	
	public Agencia getAgencia() {
		return this.agencia;
	}

	public Stock getStock() {
		return stock;
	}


	public void registrarProducto(Producto producto) {
		this.montoAPagar += producto.getPrecioTotal();
		stock.descontarStock(producto);
		producto.registrarEn(agencia);
		
	}

	
}
