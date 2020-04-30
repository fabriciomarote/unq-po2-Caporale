package unq.edu.ar.po2.tp4.Trabajadores;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IngresoTest {
	
	private Ingreso ingreso;
	
	@BeforeEach
	public void setUp() {
		ingreso = new IngresoImponible(3,30000d,"Sueldo");
	}
	
	@Test
	public void validandoElConstructor() {
		assertEquals(3,ingreso.getMes());
		assertEquals(30000d,ingreso.getMonto());
		assertEquals("Sueldo",ingreso.getConcepto());
	}
	
	
}
