package unq.edu.ar.po2.tp6.BancoYPrestamos;

public abstract class SolicitudDeCredito {
	private Cliente cliente;
	private Double monto;
	private Integer plazoEnMeses;
	
	public SolicitudDeCredito(Cliente cliente, Double monto, Integer plazoEnMeses) {
		super();
		this.cliente = cliente;
		this.monto = monto;
		this.plazoEnMeses = plazoEnMeses;
	}
	
	

	public Cliente getCliente() {
		return cliente;
	}



	public Double getMonto() {
		return monto;
	}



	public Integer getPlazoEnMeses() {
		return plazoEnMeses;
	}



	public Double montoCuota() {
		return this.getMonto()/this.getPlazoEnMeses();
	}
	
	public abstract boolean esCreditoValido();
	

}
