package unq.edu.ar.po2.tp11.TemplateYAdapter.sueldosRecargado;

public class Pasante extends Empleado{
	
	public Pasante(Double horasTrabajadas) {
		super(horasTrabajadas);
	}
	@Override
	protected void sumarSueldoPorHora(Double sueldo) {
		sueldo = sueldo + 40 * this.getHorasTrabajadas();
	}
	@Override
	protected void sumarSueldoBasico(Double sueldo) {}

	@Override
	protected void sumarOtrosConceptos(Double sueldo) {}


}
