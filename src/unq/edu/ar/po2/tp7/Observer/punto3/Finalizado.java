package unq.edu.ar.po2.tp7.Observer.punto3;



public class Finalizado implements EstadoDeJuego{

	@Override
	public void agregarParticipanteAlJuego(Servidor servidor, IParticipante participante) throws Exception {
		throw new Exception(Error.El_JUEGO_A_FINALIZADO.getValor());
		
	}

	@Override
	public void notificarSegunCorresponda(Servidor servidor, Pregunta pregunta, Respuesta respuesta, Participante participante) throws Exception {
	     throw new Exception(Error.El_JUEGO_A_FINALIZADO.getValor());
	
	}

}
