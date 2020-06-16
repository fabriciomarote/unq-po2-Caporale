package unq.edu.ar.po2.tp7.Composite;

public enum Cultivo {
	
	SOJA(500),
	TRIGO(300);
	
	private int gananciaAnual;

	private Cultivo(int gananciaAnual) {
		this.gananciaAnual = gananciaAnual;
	}

	public int getGananciaAnual() {
		return gananciaAnual;
	}
	
	

}
