package unq.edu.ar.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	
	
	private String nombre;
	private List <Persona> integrantes = new ArrayList<Persona>();
	
	public Double promedioEdades() {
		
		int totalEdades= integrantes.stream().mapToInt(i-> i.edad()).sum();
		return (double) totalEdades/integrantes.size();
			
	}
	
	public void addPersonas(Persona persona) {
		integrantes.add(persona);
	}
	
	
	
	

}
