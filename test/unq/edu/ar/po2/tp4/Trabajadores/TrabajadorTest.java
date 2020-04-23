package unq.edu.ar.po2.tp4.Trabajadores;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author nataliacaporale
 *
 */

public class TrabajadorTest {
	
	private Trabajador trabajador;
	private Ingreso ingreso;
	private IngresoPorHoraExtra ingresoPorHoraExtra;
	
	@BeforeEach
	public void setUp() {
		trabajador = new Trabajador();
		ingreso = new Ingreso(3,30000d,"Sueldo");
		ingresoPorHoraExtra = new IngresoPorHoraExtra(3,10000d,10);
		trabajador.addIngreso(ingreso);
		trabajador.addIngreso(ingresoPorHoraExtra);
			
	}
	
	@Test 
	public void verificaElMontoTotalPercibidoPorElTrabajador() {
		assertEquals(40000,trabajador.getTotalPercibido());
		
	}
	
	@Test
	public void verificaElMontoImponible() {
		assertEquals(30000,trabajador.getMontoImponible());
		
	}
	

	@Test
	public void verificaElValorDeLosImpuestosaPagar() {
		assertEquals(600,trabajador.getImpuestosAPagar());
		
	}
	

}
