package unq.edu.ar.po2.tp6.BancoYPrestamos;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List<Cliente> clientes;
	private List<SolicitudDeCredito> solicitudesDeCreditos;
	private Double montoTotalADesembolzar;
	
	
	
	public Banco() {
		clientes = new ArrayList<Cliente>();
		solicitudesDeCreditos = new ArrayList<SolicitudDeCredito>();
		montoTotalADesembolzar = 0D;
		
	}
	
	public void agregar(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void agregar(SolicitudDeCredito solicitudDeCredito) {
		solicitudesDeCreditos.add(solicitudDeCredito);
	}
	
	public void evaluarSolicitudDeCredito(SolicitudDeCredito credito){
		  credito.esCreditoValido();
		  this.desembolsarCredito(credito.getCliente());
		
	}
	
	
	private void desembolsarCredito(Cliente cliente) {
		 cliente.cobrarCredito();
		
	}

	public void otorgarCredito(SolicitudDeCredito credito) {
		 credito.esCreditoValido();
		
		
	}

	public Double getMontoTotalADesembolzar() {
		return montoTotalADesembolzar;
	}
	
	public void calcularMontoTotalADesembolzar() {
		this.montoTotalADesembolzar = this.getSolicitudesDeCreditos().stream()
																	.filter(solicitud -> solicitud.esCreditoValido())
																	.mapToDouble(solicitud -> solicitud.getMonto()).sum();
		
	}

	public List<Cliente> getClientes() {
		
		return this.clientes;
	}
	
    public List<SolicitudDeCredito> getSolicitudesDeCreditos() {
		
		return this.solicitudesDeCreditos;
	}
	
	

}
