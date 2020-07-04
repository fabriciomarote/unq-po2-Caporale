package unq.edu.ar.po2.tp7.Observer.punto3;

public class Pregunta {
	
	private String pregunta;
	private Respuesta respuestaCorrecta;
	
	public Pregunta(String pregunta, Respuesta respuestaCorrecta) {
		super();
		this.pregunta = pregunta;
		this.respuestaCorrecta = respuestaCorrecta;
	}

	public String getPregunta() {
		return pregunta;
	}

	public Respuesta getRespuestaCorrecta() {
		return respuestaCorrecta;
	}
	
	
	
	

}
