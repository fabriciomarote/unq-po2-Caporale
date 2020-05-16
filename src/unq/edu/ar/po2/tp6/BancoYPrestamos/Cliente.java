package unq.edu.ar.po2.tp6.BancoYPrestamos;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
    private Integer edad;
    private Double sueldoNetoMensual;
	
    
    public Cliente(String nombre, String apellido, String direccion, Integer edad, Double sueldoNetoMensual) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
	}


	public String getNombre() {
		return nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public String getDireccion() {
		return direccion;
	}


	public Integer getEdad() {
		return edad;
	}


	public Double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}


	public void setSueldoNetoMensual(Double sueldoNetoMensual) {
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	
	public Double getSueldoNetoAnual() {
		return sueldoNetoMensual + (sueldoNetoMensual *12);
	}

	public void cobrarCredito() {
		// TODO Auto-generated method stub
		
	}
    
    
    
  
    
}
