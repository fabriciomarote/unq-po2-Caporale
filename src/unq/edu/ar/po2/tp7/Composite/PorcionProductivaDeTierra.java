package unq.edu.ar.po2.tp7.Composite;

import java.util.List;

public interface PorcionProductivaDeTierra {

	int gananciasAnuales();

	void addPorcionroductivaDeTierra(PorcionProductivaDeTierra p);
	
	void eliminar(PorcionProductivaDeTierra p);
	
	List<PorcionProductivaDeTierra> obtenerPorcionProductivaDeTierra();

}