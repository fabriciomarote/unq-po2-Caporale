package unq.edu.ar.po2.tp3;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PointTestCase {
	private Point punto;
	private Point punto2;
	private Point punto3;
	
	@BeforeEach
	public void setUp() {
		punto = new Point();
		punto2 = new Point(2,2);
		punto3 = new Point(3,5);
		
	}
	
	@Test
	public void moverElPunto00alpunto32(){
		punto.moverPuntoA(3, 2);
		
		assertEquals(punto.getX(),3);
		assertEquals(punto.getY(),2);	
	}
	
	@Test
	public void sumarPunto3AlPunto2(){
		Point puntoSuma = punto2.sumaPuntoA(punto3);
	
		assertEquals(puntoSuma.getX(),5);
		assertEquals(puntoSuma.getY(),7);
			
	}


}
