package unq.edu.ar.po2.tp6.BancoYPrestamos;

public class CreditoPersonal extends SolicitudDeCredito{
	
	
	public CreditoPersonal(Cliente cliente, Double monto, Integer plazoEnMeses) {
		super(cliente, monto, plazoEnMeses);
		
	}

	@Override
	public boolean esCreditoValido() {
		return this.getCliente().getSueldoNetoAnual()> 15000D && this.montoCuota()<= this.getCliente().getSueldoNetoMensual()*0.7D;
		
	}
	
	
	
	
	
	
	
	

}
