package unq.edu.ar.po2.tp6.BancoYPrestamos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PropiedadTest {
	
	private Propiedad propiedad;
	
	@BeforeEach
	public void setUp() {
		
	propiedad = new Propiedad("terreno baldio", "av. siempreviva 1234", 40000d);
	}
	
	@Test
	public void validacionDelContructor () {
		assertEquals("terreno baldio", propiedad.getDescripcion());
		assertEquals("av. siempreviva 1234",propiedad.getDireccion());
		assertEquals(40000d, propiedad.getValorFiscal());
	}
	

}
