package unq.edu.ar.p2.tp4.supermercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.edu.ar.p2.tp4.supermercado.ProductoPrimeraNecesidad;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 0.9d);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(7.2), leche.getPrecio());
	}
}
