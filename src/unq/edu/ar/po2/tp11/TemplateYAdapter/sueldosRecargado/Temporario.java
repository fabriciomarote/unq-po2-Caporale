package unq.edu.ar.po2.tp11.TemplateYAdapter.sueldosRecargado;

public class Temporario extends Empleado {
	
	Boolean tieneConyuge;

	public Temporario(Double horasTrabajadas, Double cantidadDeHijos) {
		super(horasTrabajadas, cantidadDeHijos);
		tieneConyuge = false;
	}

	@Override
	protected void sumarSueldoPorHora(Double sueldo) {
		sueldo = sueldo + 40 * this.horasTrabajadas;

	}

	@Override
	protected void sumarSueldoBasico(Double sueldo) {
		sueldo = sueldo + 1000;

	}

	@Override
	protected void sumarOtrosConceptos(Double sueldo) {
		this.sumarPlusPorConyugeOHijos(sueldo);

	}

	private void sumarPlusPorConyugeOHijos(Double sueldo) {
		if (this.tieneConyuge() || this.getCantidadDeHijos() > 0) {
			sueldo = sueldo + 100;
		}
	}

	private Boolean tieneConyuge() {
		return this.tieneConyuge;
	}

	public void asignarConyuge() {
		this.tieneConyuge = true;
	}


}
