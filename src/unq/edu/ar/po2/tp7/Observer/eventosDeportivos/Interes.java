package unq.edu.ar.po2.tp7.Observer.eventosDeportivos;

public abstract class Interes {
	
	private AplicacionMovil aplicacionMovil;
	private Servidor servidor;
	
	public Interes(AplicacionMovil aplicacionMovil, Servidor servidor) {
		this.aplicacionMovil = aplicacionMovil;
		this.servidor = servidor;
	}
	
	public abstract Boolean esDeInteres(Partido partido);

}
