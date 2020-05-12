package unq.edu.ar.po2.tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StockTest {
	
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
	public void verificarStock() {
		caja1.registrarProducto(leche);
		caja1.registrarProducto(leche);
		caja1.registrarProducto(leche);
		caja1.registrarProducto(azucar);
		caja1.registrarProducto(pan);
		caja1.registrarProducto(pan);
		assertEquals(0,stock.stockDe(leche));
		assertEquals(9,stock.stockDe(azucar));
		assertEquals(0,stock.stockDe(pan));
						
	}
	@Test
	public void varificarStockVariasCajas() {
		caja2 = new Caja(agencia,stock);
		caja1.registrarProducto(leche);
		caja2.registrarProducto(leche);
		caja1.registrarProducto(leche);
		caja2.registrarProducto(azucar);
		caja1.registrarProducto(pan);
		caja2.registrarProducto(pan);
		assertEquals(0,stock.stockDe(leche));
		assertEquals(9,stock.stockDe(azucar));
		assertEquals(0,stock.stockDe(pan));
						
	}
	

}
