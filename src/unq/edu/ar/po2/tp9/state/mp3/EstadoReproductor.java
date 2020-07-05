package unq.edu.ar.po2.tp9.state.mp3;

public abstract class EstadoReproductor {

	protected abstract void play(Reproductor reproductor);

	protected abstract void pause(Reproductor reproductor) throws RuntimeException;

	protected abstract void stop(Reproductor reproductor);
	


}
