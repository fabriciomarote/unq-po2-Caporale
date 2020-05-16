package unq.edu.ar.po2.tp6.BancoYPrestamos;

public class CreditoHipotecario extends SolicitudDeCredito {
	
	private Propiedad propiedad;

	public CreditoHipotecario(Cliente cliente, Double monto, Integer plazoEnMeses, Propiedad propiedad) {
		super(cliente, monto, plazoEnMeses);
		this.propiedad = propiedad;
		
	}

	@Override
	public boolean esCreditoValido() {
		boolean esSueldoNetoMensualValido = this.getCliente().getSueldoNetoMensual()*0.5D > this.montoCuota();
		
		return  esSueldoNetoMensualValido && this.getCliente().getEdad()<=65;
	}
	
	

}
