package ar.edu.unq.po2.tp10.stateYStrategy.mp3;

public class Reproductor {
	private Song cancionSeleccionada;
	private EstadoReproductor estadoActual;
	
	public Reproductor() {
		super();
		this.estadoActual = new SeleccionDeTemas();
	}
	
	
	public void play(Song cancion) {
		estadoActual.play(this);
	}
	public void pause() {
		estadoActual.pause(this);
	}
	public void stop() {
		estadoActual.stop(this);
	}
	public void seleccionarCancion(Song cancion) {
		cancionSeleccionada = cancion;
	}
	protected Song getCancionSeleccionada() {
		return cancionSeleccionada;
	}


	public void setEstado(EstadoReproductor estado) {
		 estadoActual = estado;
		
	}



}
