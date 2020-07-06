package unq.edu.ar.po2.tp11.sueldosRecargado;

public class Empleado {

	Double horasTrabajadas;
	Double cantidadDeHijos;

	public Empleado(Double horasTrabajadas, Double cantidadDeHijos) {
		super();
		this.horasTrabajadas = horasTrabajadas;
		this.cantidadDeHijos = cantidadDeHijos;
	}
	public Empleado(Double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
		this.cantidadDeHijos = 0D;
	}
	public Double getCantidadDeHijos() {
		return this.cantidadDeHijos;
	}
	public Double getHorasTrabajadas(){
		return this.horasTrabajadas;
	}
	
	public Double sueldo() {
		Double sueldo = 0D;
		this.sumarSueldoPorHora(sueldo);
		this.sumarSueldoBasico(sueldo);
		this.sumarOtrosConceptos(sueldo);
		this.aplicarDescuentos(sueldo);
		return sueldo;
	}
	
	protected abstract void sumarSueldoPorHora(Double sueldo);

	protected abstract void sumarSueldoBasico(Double sueldo);

	protected  abstract void sumarOtrosConceptos(Double sueldo);

	private void aplicarDescuentos(Double sueldo) {
		sueldo= sueldo * 0.87;
	}
	
	
//	
//	/**
//	 * Es metodo hook
//	 * 
//	 */
//	public void  plusPorConyuge() { };
}
