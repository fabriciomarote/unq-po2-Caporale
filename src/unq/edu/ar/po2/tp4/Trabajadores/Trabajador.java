package unq.edu.ar.po2.tp4.Trabajadores;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	
	private List<Ingreso> ingresos;
	
	
	public Trabajador() {
		this.ingresos = new ArrayList<Ingreso>();
		
	}
	
	public void addIngreso(Ingreso ingreso) {
		ingresos.add(ingreso);
	}

	
	
	public Double getTotalPercibido() {
		return ingresos.stream()
				.mapToDouble(Ingreso::getMonto)
				.sum();
	}
	
	public Double getMontoImponible() {
		
		return ingresos.stream()
				.mapToDouble(Ingreso::getMontoImponible)
				.sum();
		
	}

	public Double getImpuestosAPagar() {
		return this.getMontoImponible()*0.02;
		
	}
	
	

}
