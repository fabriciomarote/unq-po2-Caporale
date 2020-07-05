package unq.edu.ar.po2.tp7.Observer.publicaciones;

import java.util.*;

public class SistemaDePublicaciones {

	private List<Articulo> articulos;
	private List<Suscripcion> suscripciones;
	
	public SistemaDePublicaciones() {
		this.articulos = new ArrayList<Articulo>();
		this.suscripciones = new ArrayList<Suscripcion>();
	}
	
	public void agregarArticulo(Articulo articulo) {
		articulos.add(articulo);
		notificarSuscriptoras(articulo);
	}
	
	public void agregarSuscripcion(Suscripcion suscripcion) {
		suscripciones.add(suscripcion);
	}
	
	public void eliminarSuscripcion(Suscripcion suscripcion) {
		suscripciones.remove(suscripcion);
	}
	
	private void notificarSuscriptoras(Articulo articulo) {
		for (Suscripcion suscripcion : suscripciones) {
			suscripcion.updateInvestigadoras(articulo);
		}
	}
}
