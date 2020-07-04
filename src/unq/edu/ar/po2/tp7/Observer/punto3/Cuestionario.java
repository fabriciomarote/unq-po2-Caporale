package unq.edu.ar.po2.tp7.Observer.punto3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cuestionario {
	
	private List<Pregunta> preguntas; 
	
	public Cuestionario(Pregunta pregunta1, Pregunta pregunta2, Pregunta pregunta3, Pregunta pregunta4, Pregunta pregunta5) {
		this.preguntas = new ArrayList<Pregunta>();
		this.preguntas.add(pregunta1);
		this.preguntas.add(pregunta2);
		this.preguntas.add(pregunta3);
		this.preguntas.add(pregunta4);
		this.preguntas.add(pregunta5);	
	}

	public List<Pregunta> getPreguntas() {
		return preguntas;
	}
	
	public List<String> getPreguntasParaParticipante(){
		
		return this.getPreguntas().parallelStream().map(pregunta -> pregunta.getPregunta()).collect(Collectors.toList());
	}
	
	
	
	

}
