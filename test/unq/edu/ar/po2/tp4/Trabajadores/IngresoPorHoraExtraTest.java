package unq.edu.ar.po2.tp4.Trabajadores;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IngresoPorHoraExtraTest {
	
	
		
		private IngresoPorHoraExtra ingreso;
		
		@BeforeEach
		public void setUp() {
			ingreso = new IngresoPorHoraExtra(3,30000d,10);
		}
		
		@Test
		public void validandoElConstructor() {
			assertEquals(3,ingreso.getMes());
			assertEquals(30000d,ingreso.getMonto());
			assertEquals("Hora Extra",ingreso.getConcepto());
			assertEquals(10,ingreso.getCantidadHorasExtra());
		}
		
		
}
	
	


