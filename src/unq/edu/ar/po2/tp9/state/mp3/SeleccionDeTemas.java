package unq.edu.ar.po2.tp9.state.mp3;

public class SeleccionDeTemas extends EstadoReproductor {

	@Override
	protected void play(Reproductor reproductor) {
		reproductor.getCancionSeleccionada().play();
		reproductor.setEstado(new Reproduciendo());
	}

	@Override
	protected void pause(Reproductor reproductor) throws ErrorNoHayReproduccionEnCurso {
		throw new ErrorNoHayReproduccionEnCurso();
		
	}

	@Override
	protected void stop(Reproductor reproductor) {
		throw new ErrorNoHayReproduccionEnCurso();	
	}

}
