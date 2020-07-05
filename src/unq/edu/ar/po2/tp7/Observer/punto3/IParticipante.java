package unq.edu.ar.po2.tp7.Observer.punto3;

import java.util.ArrayList;
import java.util.List;

public interface IParticipante {
	
	void recibirCuestionario(List<String> preguntas);
	
	void solicitarIngresoALaPartida(Servidor servidor)throws Exception;
	
	void recibirNotificacion(String notificacion);

    void recibirRespuestaCorrecta(Pregunta pregunta);
	
	void recibirRespuestaIncorrecta();
	
}
