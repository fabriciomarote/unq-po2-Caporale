package unq.edu.ar.po2.tp7.Observer.punto3;


import java.util.ArrayList;
import java.util.List;

public class Participante implements IParticipante {
			
		private List<String> preguntasRecibidas;
		private List<String> notificaciones;
		private Servidor servidor;
		private String nombre;
		
		public Participante (String nombre) {
			this.nombre = nombre;
			this.preguntasRecibidas = new ArrayList<String>();
			this.notificaciones = new ArrayList<String>();
		}

		@Override
		public void recibirCuestionario(List<String> preguntas) {
			this.preguntasRecibidas = preguntas;
			
		}
	
		@Override
		public void recibirNotificacion(String notificacion) {
			this.notificaciones.add(notificacion);
		}
		
		
		/*
		 * suscripcion al juego
		 */
		@Override
		public void solicitarIngresoALaPartida(Servidor servidor) throws Exception{
			this.servidor = servidor;
			this.servidor.nuevoParticipante(this);
		}
		
		@Override
		public void enviarRespuesta(String pregunta, Respuesta respuesta) throws Exception  {
			if(this.esParticipanteEnJuego()) {
				this.servidor.verificarRespuesta(pregunta, respuesta, this);
		    }else {
				throw new Exception(Error.NO_ES_PARTICIPANTE_EN_JUEGO.getValor());
			}
		}
		
		public boolean esParticipanteEnJuego() {
			return this.servidor != null;
		}

		public void respuestaCorrecta(Pregunta pregunta) {
			this.preguntasRecibidas.remove(pregunta.getPregunta());	
		}

		public void respuestaIncorrecta() {
			this.recibirNotificacion("La Respuesta es incorrecta");	
		}

		public List<String> getNotificaciones() {
			return notificaciones;
		}

		public List<String> getPreguntasRecibidas() {
			return preguntasRecibidas;
		}

		public String getNombre() {
			return this.nombre;
		}

}
