package unq.edu.ar.po2.tp5;

public abstract class Producto {
	
	private Integer stock;
	private Double precio;

	public Producto(Integer stock, Double precio) {
		this.stock = stock;
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	public void decrementarStock() {
		this.stock -= 1;
	}
	
	abstract public Double getPrecioTotal();
	
	

}
