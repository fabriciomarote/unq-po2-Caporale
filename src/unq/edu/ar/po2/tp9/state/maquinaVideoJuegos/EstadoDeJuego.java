package unq.edu.ar.po2.tp9.state.maquinaVideoJuegos;

public interface EstadoDeJuego {

	public String iniciarJuego(MaquinaVideoJuegos maquina);
	public void terminarJuego(MaquinaVideoJuegos maquina);
	public void chequearEstado(MaquinaVideoJuegos maquinaVideoJuegos);
}
