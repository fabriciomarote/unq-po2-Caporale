package unq.edu.ar.po2.tp7.Observer.publicaciones;

import java.util.List;

public class InteresEnTitulo extends Interes {
private List<String> titulosDeInteres;
	
	public InteresEnTitulo(Investigadora investigadoraSuscripta, List<String> titulosDeInteres) {
		super(investigadoraSuscripta);
		this.titulosDeInteres = titulosDeInteres;
	}

	@Override
	public Boolean esDeInteres(Articulo articulo) {
		return titulosDeInteres.contains(articulo.getTitulo());
	}
	
	public void agregarTituloDeInteres(String titulo) {
		titulosDeInteres.add(titulo);
	}
	
	public void eliminarTituloDeInteres(String titulo) {
		titulosDeInteres.remove(titulo);
	}


}
