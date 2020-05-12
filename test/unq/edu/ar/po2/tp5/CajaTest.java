package unq.edu.ar.po2.tp5;


import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.edu.ar.po2.tp4.Trabajadores.IngresoImponible;

public class CajaTest {
	
	
	private Agencia agencia;
	
	private Stock stock;
	private Caja caja1;
	private Caja caja2;
	private Producto azucar;
	private Producto pan;
	private Producto pancho;
	private Producto leche;
	private Producto papel;
	private Producto facturaGas;
	private Producto impuesto;
	
	@BeforeEach
	public void setUp() {
	    stock= new Stock();
		caja1 = new Caja(agencia,stock);
		azucar = new ProductoCasaTradicional(55d);
		pan = new ProductoCasaTradicional(30d);
		leche = new ProductoCasaTradicional(50d);
		pancho = new ProductoCooperativa(100d);
		papel = new ProductoCooperativa(55d);
		facturaGas = new Servicio(30d, 400);
		impuesto = new Impuesto(50d);
		stock.addProducto(leche, 3);
		stock.addProducto(azucar,10);
		stock.addProducto(pan, 2);
		stock.addProducto(pancho, 12);
		stock.addProducto(papel, 3);
		
		
			
	}
	
	@Test 
	public void verificarConstructor() {
		assertEquals(agencia, caja1.getAgencia());
		assertEquals(stock, caja1.getStock());
		assertEquals(0, caja1.getMontoAPagar());	
	}
	
	@Test 
	public void verificarMontoAPagarLuegodeCompra() {
		caja1.registrarProducto(leche);
		caja1.registrarProducto(pan);
		caja1.registrarProducto(azucar);
		
		assertEquals(135d, caja1.getMontoAPagar());	
	}
	
	@Test 
	public void verificarMontoAPagarLuegodeFinalizadaLaCompra() {
		caja1.registrarProducto(leche);
		caja1.registrarProducto(pan);
		caja1.registrarProducto(azucar);
		caja1.finalizarCompra();
		
		assertEquals(0d, caja1.getMontoAPagar());	
	}
	
	
	
	
	
	

}
