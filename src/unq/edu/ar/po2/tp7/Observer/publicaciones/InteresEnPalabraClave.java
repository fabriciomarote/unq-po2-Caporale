package unq.edu.ar.po2.tp7.Observer.publicaciones;

import java.util.List;

public class InteresEnPalabraClave  extends Interes{
	private List<String> palabrasClaveDeInteres;

	public InteresEnPalabraClave(Investigadora investigadoraSuscripta, List<String> palabrasClaveDeInteres) {
		super(investigadoraSuscripta);
		this.palabrasClaveDeInteres = palabrasClaveDeInteres;
	}

	@Override
	public Boolean esDeInteres(Articulo articulo) {
		return this.palabrasClaveDeInteres.stream().anyMatch(p -> p.equals(articulo.tienePalabraClave(p)));
	}
	
	public void agregarPalabraClaveDeInteres(String palabraClave) {
		palabrasClaveDeInteres.add(palabraClave);
	}
	
	public void eliminarPalabraClaveDeInteres(String palabraClave) {
		palabrasClaveDeInteres.remove(palabraClave);
	}

}
