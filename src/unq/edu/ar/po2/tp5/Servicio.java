package unq.edu.ar.po2.tp5;

public class Servicio extends Factura{
	
	private Double costoPorUnidad;
	private Integer unidadesConsumidas; 
	
	public Servicio(Double costoPorUnidad, Integer unidadesConsumidas) {
		this.costoPorUnidad = costoPorUnidad;
		this.unidadesConsumidas = unidadesConsumidas;
	}

	@Override
	public Double getPrecioTotal() {
		
		return this.costoPorUnidad * this.unidadesConsumidas;
	}

	
	
	

}
