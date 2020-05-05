package unq.edu.ar.po2.tp5;

public class Servicio extends Factura{
	
	private Double costoPorUnidad;
	private Integer unidadesConsumidas; 

	@Override
	public Double getPrecioTotal() {
		
		return costoPorUnidad * unidadesConsumidas;
	}

	
	
	

}
