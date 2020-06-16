package unq.edu.ar.po2.tp7.Composite;

public class Pura implements PorcionProductivaDeTierra{

	private Cultivo cultivo;

	public Pura(Cultivo cultivo) {
		this.cultivo = cultivo;
	}

	public int gananciasAnuales() {
		
		return this.getCultivo().getGananciaAnual();
	}

	public PorcionProductivaDeTierra getPorciones() {
		
		return null;
	}

	@Override
	public Cultivo getCultivo() {
		
		return this.cultivo;
	}

	@Override
	public void addPorcionroductivaDeTierra(PorcionProductivaDeTierra p) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
