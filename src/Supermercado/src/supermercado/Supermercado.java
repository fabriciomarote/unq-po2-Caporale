package Supermercado.src.supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	
	private String nombre;
	private String direccion;
    private List<Producto> productos = new ArrayList<>();
    
    public Supermercado(String nombre, String direccion) {
    	this.nombre = nombre;
    	this.setDireccion(direccion);
    	
    }
	public String getNombre() {
		return nombre;
	}

    public Integer getCantidadDeProductos() {
		return productos.size();
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public Double getPrecioTotal() {
		Double precioTotal = productos.stream().mapToDouble(p->p.getPrecio()).sum();
		return  precioTotal;
	
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



}
