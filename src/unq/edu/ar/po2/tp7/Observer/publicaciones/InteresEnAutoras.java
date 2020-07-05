package unq.edu.ar.po2.tp7.Observer.publicaciones;

import java.util.List;

public class InteresEnAutoras extends Interes{
    
	private List<String> autorasDeInteres;
	
	public InteresEnAutoras(Investigadora investigadoraSuscripta, 
			List<String> autorasDeInteres) {
		super(investigadoraSuscripta);
		this.autorasDeInteres = autorasDeInteres;
	}

	@Override
	public Boolean esDeInteres(Articulo articulo) {
		Boolean tieneAutora = false;
		for (String autora : autorasDeInteres) {
			tieneAutora = tieneAutora || articulo.fueEscritoPor(autora);
		}
		return tieneAutora;
	}
	
	public void agregarAutoraDeInteres(String autora) {
		autorasDeInteres.add(autora);
	}
	
	public void eliminarAutoraDeInteres(String autora) {
		autorasDeInteres.remove(autora);
	}


}
