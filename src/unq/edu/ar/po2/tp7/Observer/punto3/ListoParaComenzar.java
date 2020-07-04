package unq.edu.ar.po2.tp7.Observer.punto3;

public class ListoParaComenzar implements EstadoDeJuego{

	@Override
	public void agregarParticipanteAlJuego(Servidor servidor, Participante participante) throws Exception {
		if(servidor.getParticipantes().size() < 5) {
			servidor.agregarParticipanteAlServidor(participante);
			servidor.participanteConPuntajeInicial(participante);	
		}else {
			throw new Exception(Error.CUPO_LLENO.getValor());
		}
		
	}

	@Override
	public void notificarSegunCorresponda(Servidor servidor, Pregunta pregunta, Respuesta respuesta, Participante participante) throws Exception {
		throw new Exception(Error.NO_ESTA_COMPLETO_EL_CUPO.getValor()); 
	}
	

}
