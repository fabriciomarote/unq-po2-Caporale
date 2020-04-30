package unq.edu.ar.po2.tp4.Trabajadores;

public class IngresoPorHoraExtra extends Ingreso{
	private Integer cantidadHorasExtra;
       
    public IngresoPorHoraExtra(Integer mes, Double monto,Integer cantidadHorasExtra) {
    	super(mes,monto,"Hora Extra");
    	this.cantidadHorasExtra = cantidadHorasExtra;
    	
    }
    
    @Override
    public Double getMontoImponible(){
    	return 0D;
    }

	public Integer getCantidadHorasExtra() {
		return cantidadHorasExtra;
	}
    
    
       
       
}
