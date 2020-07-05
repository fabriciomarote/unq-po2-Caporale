package ar.edu.unq.po2.tp10.stateYStrategy.mp3;

public class Pausado extends EstadoReproductor {

	@Override
	protected void play(Reproductor reproductor) {
		reproductor.getCancionSeleccionada().play();
		reproductor.setEstado(new Reproduciendo());

	}

	@Override
	protected void pause(Reproductor reproductor) throws RuntimeException {
		throw new ErrorCancionPausada();

	}

	@Override
	protected void stop(Reproductor reproductor) {
		reproductor.getCancionSeleccionada().stop();
		reproductor.setEstado(new SeleccionDeTemas());

	}

}
