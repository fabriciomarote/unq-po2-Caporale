package unq.edu.ar.po2.tp5;

public class Impuesto extends Factura{
	
	private Double tasa;
	
	public Impuesto(Double tasa) {
		this.tasa = tasa;
	}

	@Override
	public Double getPrecioTotal() {
		return tasa;
	}

	public Double getTasa() {
		return tasa;
	}

	public void setTasa(Double tasa) {
		this.tasa = tasa;
	}


	
	
	
	

}
