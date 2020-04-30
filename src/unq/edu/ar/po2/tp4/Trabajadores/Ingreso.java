package unq.edu.ar.po2.tp4.Trabajadores;

public abstract class  Ingreso  {
	
	private Integer mes;
	private Double monto;
	private String concepto;
	
	public Ingreso(Integer mes, Double monto, String concepto) {
		this.mes = mes;
		this.monto = monto;
		this.concepto = concepto;
	}
	
	public Integer getMes() {
		return mes;
	}
	
	public Double getMonto() {
		return monto;
	}
	
	public String getConcepto() {
		return concepto;
	}
	
	abstract public Double getMontoImponible();
	

}
