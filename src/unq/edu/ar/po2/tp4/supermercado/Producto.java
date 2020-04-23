package unq.edu.ar.po2.tp4.supermercado;

public class Producto {
	private String nombre;
	public Double precio;
	protected Boolean esPrecioCuidado;
	
	public Producto (String nombre, Double precio) {
		this.nombre= nombre;
		this.precio=precio;
		this.esPrecioCuidado=false;
		
	}
	
	public Producto(String nombre2, Double precio2, Boolean esPrecioCuidado2) {
		this.nombre = nombre2;
		this.precio = precio2;
		this.esPrecioCuidado = esPrecioCuidado2;
	}

	public String getNombre() {
		return nombre;
	}
	
	public Double getPrecio() {
		return precio;
	}
	public Boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}

	public void aumentarPrecio(double precio) {
		this.precio += precio;
		
		
	}
	

}
