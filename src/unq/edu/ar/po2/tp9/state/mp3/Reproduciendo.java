package ar.edu.unq.po2.tp10.stateYStrategy.mp3;

public class Reproduciendo extends EstadoReproductor {

	@Override
	protected void play(Reproductor reproductor) {
		throw new ErrorYaHayReproduccionEnCurso();
		
	}

	@Override
	protected void pause(Reproductor reproductor) {
		 reproductor.getCancionSeleccionada().pausa();
		 reproductor.setEstado(new Pausado());
	}

	@Override
	protected void stop(Reproductor reproductor) {
		reproductor.getCancionSeleccionada().stop();
		reproductor.setEstado(new SeleccionDeTemas());
	}

}
