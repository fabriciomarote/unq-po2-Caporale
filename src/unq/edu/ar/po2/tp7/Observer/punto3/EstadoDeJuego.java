package unq.edu.ar.po2.tp7.Observer.punto3;

public interface EstadoDeJuego {
	
	void agregarParticipanteAlJuego(Servidor servidor, Participante participante) throws Exception;

	void notificarSegunCorresponda(Servidor servidor, Pregunta pregunta, Respuesta respuesta, Participante participante) throws Exception;

}
