package unq.edu.ar.po2.tp6.BancoYPrestamos;

public class Propiedad {
	
	private String descripcion;
	private String direccion;
	private Double valorFiscal;
	
	
	public Propiedad(String descripcion, String direccion, Double valorFiscal) {
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public Double getValorFiscal() {
		return valorFiscal;
	}


	public void setValorFiscal(Double valorFiscal) {
		this.valorFiscal = valorFiscal;
	}
	
	
	
	

}
