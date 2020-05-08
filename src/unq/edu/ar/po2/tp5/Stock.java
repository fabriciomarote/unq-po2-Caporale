package unq.edu.ar.po2.tp5;

import java.util.HashMap;
import java.util.Map;

public class Stock {
	
	private Map<Producto, Integer> stockDeProductos;
	
	public Stock() {
		stockDeProductos = new HashMap<Producto, Integer>();
	}
	
	public void addProducto(Producto producto, Integer stock) {
		
		this.stockDeProductos.put(producto, stock);
	}
	
	public void removeProducto(Producto producto) {
		this.stockDeProductos.remove(producto);
	}

	public Integer stockDe(Producto producto) {
		return this.stockDeProductos.get(producto);
	}
	
	public void descontarStock(Producto producto) {
		Integer stockActualizado =  this.stockDe(producto) - 1;
		this.stockDeProductos.replace(producto, stockActualizado);
	}
}
