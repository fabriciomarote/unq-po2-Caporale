package unq.edu.ar.po2.tp10.Registro.Registro.src.automotor;

import java.time.LocalDate;

public class Vehiculo {
	private Boolean esVehiculoPolicial;
	private LocalDate fechaFabricacion;	
	private String ciudadRadicacion; 
	
	public Vehiculo(Boolean esVehiculoPolicial, LocalDate fechaFabricacion, String ciudadRadicacion) {
		this.esVehiculoPolicial = esVehiculoPolicial;
		this.fechaFabricacion = fechaFabricacion;
		this.ciudadRadicacion = ciudadRadicacion;
	}

	public Boolean esVehiculoPolicial() {
		return esVehiculoPolicial;
	}

	public LocalDate getFechaFabricacion() {
		return fechaFabricacion;
	}

	public String ciudadRadicacion() {
		return ciudadRadicacion;
	}

	public Boolean debeRealizarVtv(LocalDate fecha) {
		
		return (!esVehiculoPolicial && tieneMasDeUnAñoDeAntiguedad(fecha)
				&& estaRadicadoEnBuenosAires());
	
	}
	
	protected boolean estaRadicadoEnBuenosAires() {
		return this.ciudadRadicacion().equalsIgnoreCase("Buenos Aires");
	}
	
	protected boolean tieneMasDeUnAñoDeAntiguedad(LocalDate fecha) {
		return fecha.minusYears(1).isAfter(this.getFechaFabricacion());
	}
}
