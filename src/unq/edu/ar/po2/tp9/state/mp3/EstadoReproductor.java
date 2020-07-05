package ar.edu.unq.po2.tp10.stateYStrategy.mp3;

public abstract class EstadoReproductor {

	protected abstract void play(Reproductor reproductor);

	protected abstract void pause(Reproductor reproductor) throws RuntimeException;

	protected abstract void stop(Reproductor reproductor);
	


}
