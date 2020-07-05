package unq.edu.ar.po2.tp7.Observer.publicaciones;

import java.util.List;

public abstract class Suscripcion {
	
	private Investigadora investigadoraSuscripta;
	private SistemaDePublicaciones sistema;
	
	public Suscripcion(Investigadora investigadoraSuscripta, SistemaDePublicaciones sistema) {
		this.investigadoraSuscripta = investigadoraSuscripta;
		this.sistema = sistema;
		sistema.agregarSuscripcion(this);
		investigadoraSuscripta.agregarSuscripcion(this);
	}
	
	public abstract Boolean esDeInteres(Articulo articulo);

	public void updateInvestigadoras(Articulo articulo) {
		if (esDeInteres(articulo)) {
			investigadoraSuscripta.updateInvestigadora(articulo);
		}
	}
	
}
