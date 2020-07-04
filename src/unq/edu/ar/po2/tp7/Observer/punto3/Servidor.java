package unq.edu.ar.po2.tp7.Observer.punto3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Servidor {
	
	private Set<IParticipante> participantes;
	private Cuestionario cuestionario;
	private Map <IParticipante, Integer> puntajes;
	private EstadoDeJuego estado;
	
	public Servidor(Cuestionario cuestionario) {
		this.participantes = new HashSet<IParticipante>();
		this.cuestionario = cuestionario;
		this.puntajes = new HashMap<IParticipante, Integer>();
		this.estado = new ListoParaComenzar();
	}
	
	public void nuevoParticipante(Participante participante) throws Exception{
		this.estado.agregarParticipanteAlJuego(this, participante);
	}
	
	public void verificarRespuesta(String pregunta, Respuesta respuesta, Participante participante) throws Exception  {
		Pregunta preguntaEspecifica = this.cuestionario.getPreguntas().stream()
				.filter(p -> p.getPregunta().equals(pregunta))
				.collect(Collectors.toList()).get(0);
		this.estado.notificarSegunCorresponda(this, preguntaEspecifica, respuesta, participante);
	}

	/*
	 * Comienza el juego. Verifica que sean 5 los participantes.
	 */
	public void empezarJuego() {
		if(this.getParticipantes().size()==5) {
		this.estado = new EnJuego();
		this.notificarParticipantesComienzoDeJuego();
		}
	}
	
	/*
	 * @param participante que se encuentra juagando al juego.
	 * Cada participante suma 1 punto por cada respuesta correcta, en el caso de tener 5 respuestas correctas 
	 * y ser el primero este gana el juego.
	 */
	
	public void sumarPuntajeA(Participante participante) {	
		Integer puntajeParticipante = this.puntajes.get(participante);
		this.puntajes.put(participante, puntajeParticipante + 1);
		if(this.puntajes.get(participante) == 5) {
			this.juegoFinalizado();
			this.notificarATodosLosParticipantesElGanador(participante);
		}	
	}

	/*
	 * Envia las preguntas del cuetionario a cada participante de la partida en curso.
	 */
	private void notificarParticipantesComienzoDeJuego() {
		List<String> preguntas = this.cuestionario.getPreguntasParaParticipante();
		 this.participantes.stream().forEach(participante -> participante.recibirCuestionario(preguntas));
		
	}
	
	/*
	 * @param se recibe por parametro el participante que ha ganado la partida.
	 */
	private void notificarATodosLosParticipantesElGanador(Participante participante) {
		String notificacion = "El usuario ganador de la partida es" + " " + participante.getNombre();
		
		this.participantes.stream().forEach(p->p.recibirNotificacion(notificacion));	
	}
	
	public void notificarRespuestaCorrectaA(Participante participante, Pregunta pregunta) {
		participante.respuestaCorrecta(pregunta);
	}
	
	public void notificarRespuestaCorrectaAParticipantes(Participante participante, Pregunta pregunta) {
		String notificacion = "El participante" + " " + participante.getNombre()+ " " 
	                           + "ha contestado correctamente la pregunta" + pregunta.getPregunta();
		
		this.getParticipantes().stream().forEach(p -> p.recibirNotificacion(notificacion));
		
	}

	public void participanteConPuntajeInicial(Participante participante) {
		this.puntajes.put(participante, 0);
		
	}

	private void juegoFinalizado() {
		this.estado = new Finalizado();
		
	}
	
	public void desuscribir(Participante participante) {
		this.participantes.remove(participante);
	}

	
	public void agregarParticipanteAlServidor(IParticipante participante) {
		participantes.add(participante);
	}
	
	
	public Set<IParticipante> getParticipantes() {
		return participantes;
	}

	public Cuestionario getCuestionario() {
		return this.cuestionario;
	}

	public Map<IParticipante, Integer> getPuntajes() {
		return puntajes;
	}

	public EstadoDeJuego getEstado() {
		return estado;
	}
	

}
