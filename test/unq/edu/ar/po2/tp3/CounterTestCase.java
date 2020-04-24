package unq.edu.ar.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {
	private Counter counter;
	
	@BeforeEach
	public void setUp() {
		counter = new Counter();
		counter.addNumeros(1);
		counter.addNumeros(6);
		counter.addNumeros(1);
		counter.addNumeros(1);
		counter.addNumeros(5);
		counter.addNumeros(3);
		counter.addNumeros(7);
		counter.addNumeros(9);
		counter.addNumeros(5);
		counter.addNumeros(11);
		
		
	}
	 @Test
	 public void hay9NumerosImpares() {
		 assertEquals(counter.cantidadDeImpares(),9);
	 }

	 @Test
	 public void hay1NumeroPar() {
		 assertEquals(counter.cantidadDePares(),1);
	 }
	 @Test
	 public void hay2MultiplosDe5() {
		 assertEquals(counter.cantidadDeMultiplosDe(5),2);
	 }
	 @Test
	 public void hay3MultiplosDe3() {
		 assertEquals(counter.cantidadDeMultiplosDe(3),3);
	 }

}
