package unq.edu.ar.po2.tp4.Trabajadores;

public class IngresoImponible extends Ingreso {
	

	public IngresoImponible(int mes, double monto, String concepto) {
		super(mes,monto,concepto);
	}

	@Override
	    public Double getMontoImponible(){
	    	return this.getMonto();
	    }

}
