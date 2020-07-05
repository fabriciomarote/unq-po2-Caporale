package unq.edu.ar.po2.tp7.Observer.eventosDeportivos;

import java.util.*;

public class Partido {
	
	private String deporte;
	private List<String> contrincantes;
	private String resultado;
	
	public Partido(String deporte, List<String> contrincantes, String resultado) {
		this.deporte = deporte;
		this.contrincantes = contrincantes;
		this.resultado = resultado;
	}

	public String getDeporte() {
		return deporte;
	}
	
	public Boolean jugoContrincante(String contrincante) {
		return contrincantes.contains(contrincante);
	}

}
