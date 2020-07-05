package unq.edu.ar.po2.tp7.Observer.punto3;

public class EnJuego implements EstadoDeJuego {

	@Override
	public void agregarParticipanteAlJuego(Servidor servidor, Participante participante) throws Exception{
		throw new Exception(Error.EN_JUEGO.getValor());
	}

	@Override
	public void notificarSegunCorresponda(Servidor servidor, Pregunta pregunta, Respuesta respuesta, Participante participante) {
		
		if(esRespuestaCorrecta(pregunta, respuesta)){
			servidor.sumarPuntajeA(participante);
			servidor.notificarRespuestaCorrectaA(participante, pregunta);
			servidor.notificarRespuestaCorrectaAParticipantes(participante, pregunta);
		}else {
			participante.recibirRespuestaIncorrecta();
			
		}
		
	}

	public boolean esRespuestaCorrecta(Pregunta pregunta, Respuesta respuesta) {
		return pregunta.getRespuestaCorrecta().equals(respuesta);
	}
	
	

}
