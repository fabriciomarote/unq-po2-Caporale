package unq.edu.ar.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RectanguloTestCase {
	
	private Rectangulo rectangulo;
	private Point punto;
	
   
	
	@BeforeEach
	public void setUp() throws Exception {
		punto = new Point();
		rectangulo = new Rectangulo(punto,5,10);
	}
	
	@Test
	public void validarConstructorEsquinaSuperiorIzquierda() {
	
		assertEquals(rectangulo.getEsquinaSuperiorIzquierda().getX(),5);
		assertEquals(rectangulo.getEsquinaSuperiorIzquierda().getY(),10);
	}
	
	@Test
	public void validarConstructorEsquinaSuperiorDerecha() {
		
		assertEquals(rectangulo.getEsquinaSuperiorDerecha().getX(),0);
		assertEquals(rectangulo.getEsquinaSuperiorDerecha().getY(),10);
	}
	
	@Test
	public void validarConstructorEsquinaInferiorDerecha() {
		
		assertEquals(rectangulo.getEsquinaInferiorDerecha().getX(),5);
		assertEquals(rectangulo.getEsquinaInferiorDerecha().getY(),0);
	}
	
	@Test
	public void calculoDeArea() {
		assertEquals(rectangulo.area(),50);
	}
	
	@Test
	public void calculoDePerimetro() {
		assertEquals(rectangulo.perimetro(),30);
	}
	@Test
	public void elRectanguloConstruidoEsVertical() {
		assertFalse(rectangulo.esHorizontal());
		assertTrue(rectangulo.esVertical());
		
	}
	
	
		
	

	
	






	

}
