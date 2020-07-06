package unq.edu.ar.po2.tp11.TemplateYAdapter.sueldosRecargado;

public class Planta extends Empleado{
	
	public Planta(Double horasTrabajadas, Double cantidadDeHijos) {
		super(horasTrabajadas, cantidadDeHijos);
	}

	@Override
	protected void sumarSueldoPorHora(Double sueldo) {};

	@Override
	protected void sumarSueldoBasico(Double sueldo) {
		sueldo = sueldo + 3000;
	}
	
	@Override
	protected void sumarOtrosConceptos(Double sueldo) {
		this.sumarSueldoPorHijo(sueldo);
	}

	private void sumarSueldoPorHijo(Double sueldo) {
		sueldo = sueldo + this.getCantidadDeHijos()	* 150;	
	}

}
