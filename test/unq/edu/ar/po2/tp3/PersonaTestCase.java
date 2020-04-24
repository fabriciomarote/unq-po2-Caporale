package unq.edu.ar.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTestCase {
	
	private Persona persona;
	private Persona persona1;
	
	@BeforeEach
	public void setUp() {
		persona= new Persona("Lu", LocalDate.of(2003,1,9));
		persona1= new Persona("Natu", LocalDate.of(1982,12,6));
		
	}
	
	@Test
	public void luEsMenorQueNatu() {
		assertTrue(persona.esMenorQue(persona1));
		
	}
	
	@Test
	public void natuTiene37Años() {
		assertEquals(persona1.edad(),37);
	}
	

}
