package unq.edu.ar.po2.tp7.Composite;

import java.util.List;

public class Pura implements PorcionProductivaDeTierra{

	private Cultivo cultivo;

	public Pura(Cultivo cultivo) {
		this.cultivo = cultivo;
	}

	public int gananciasAnuales() {
		
		return this.getCultivo().getGananciaAnual();
	}

	@Override
	public void addPorcionroductivaDeTierra(PorcionProductivaDeTierra p) {
		
	}
	
	public Cultivo getCultivo() {
		return this.cultivo;
	}

	@Override
	public void eliminar(PorcionProductivaDeTierra p) {
	
		
	}

	@Override
	public List<PorcionProductivaDeTierra> obtenerPorcionProductivaDeTierra() {
		return null;
		
		
	}
	
	
	
	

}
