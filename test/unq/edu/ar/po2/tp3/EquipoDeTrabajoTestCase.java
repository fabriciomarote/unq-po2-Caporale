package unq.edu.ar.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EquipoDeTrabajoTestCase{
	
	
	private EquipoDeTrabajo equipoDeTrabajo;
	private Persona persona;
	private Persona persona1;
	private Persona persona2;
	private Persona persona3;
	private Persona persona4;

	
	@BeforeEach
	public void setUp() {
		persona= new Persona("Lu", LocalDate.of(2003,1,9)); //17
		persona1= new Persona("Natu", LocalDate.of(1982,12,6)); //37
		persona2= new Persona("Pepe", LocalDate.of(1988,7,19)); //31
		persona3= new Persona("Pepa", LocalDate.of(1920,4,1)); // 100
		persona4= new Persona("Pipa", LocalDate.of(2000,4,1)); //20
		
		equipoDeTrabajo = new EquipoDeTrabajo();
		equipoDeTrabajo.addPersonas(persona);
		equipoDeTrabajo.addPersonas(persona1);
		equipoDeTrabajo.addPersonas(persona2);
		equipoDeTrabajo.addPersonas(persona3);
		equipoDeTrabajo.addPersonas(persona4);
			
	}
	
	@Test
	public void promedios() {
		assertEquals(41,equipoDeTrabajo.promedioEdades());
	}

}
