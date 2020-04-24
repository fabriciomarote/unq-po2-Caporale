package unq.edu.ar.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultioperadorTestCase {
	
	private Multioperador multioperador;
	
	@BeforeEach
	public void setUp(){
		multioperador = new Multioperador();
		multioperador.addNumerosEnteros(1);
		multioperador.addNumerosEnteros(2);
		multioperador.addNumerosEnteros(3);
		multioperador.addNumerosEnteros(4);
		multioperador.addNumerosEnteros(5);
	}
	
	@Test
	public void laSumaDeTodosLosElementosEs15() {
		assertEquals(multioperador.sumaDeTodosSusNumeros(),15);
	}
	@Test
	public void laRestaDeTodosLosElementosEsMenos13() {
		assertEquals(multioperador.restaDeTodosSusNumeros(),-13);
	}
	@Test
	public void laMultiplicacionDeTodosLosElementosEs() {
		assertEquals(multioperador.multiplicacionDeTodosSusNumeros(),120);
	}

}
