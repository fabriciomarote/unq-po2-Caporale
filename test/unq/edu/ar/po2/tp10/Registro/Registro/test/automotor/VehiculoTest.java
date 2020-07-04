package unq.edu.ar.po2.tp10.Registro.Registro.test.automotor;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

import unq.edu.ar.po2.tp10.Registro.Registro.src.automotor.RegistroAutomotor;
import unq.edu.ar.po2.tp10.Registro.Registro.src.automotor.Vehiculo;

public class VehiculoTest {
	
	@Test
	public void testVehiculosQueDebenRealizarVtv() {
		RegistroAutomotor registroAutomotor = new RegistroAutomotor();
		Vehiculo vehiculoPolicial = new Vehiculo(true, LocalDate.of(2018, 1, 1), "Buenos Aires");
		Vehiculo vehiculoReciente = new Vehiculo(false, LocalDate.of(2018, 1, 1), "BuenosAires");
		Vehiculo vehiculoLaPlata = new Vehiculo(false, LocalDate.of(2018, 1, 1), "La Plata");
		Vehiculo vechiculoCumpleVtv = new Vehiculo(false, LocalDate.of(2018, 1, 1), "Buenos Aires");
		
		
		assertFalse("Vehiculos policiales no realizan vtv", vehiculoPolicial.debeRealizarVtv(LocalDate.of(2019, 10, 10)));
		assertFalse("Vehiculos con antiguedad menor a un anio no realizan vtv", vehiculoReciente.debeRealizarVtv( LocalDate.of(2018, 11, 10)));
		assertFalse("Vehiculos no radicados en Buenos Aires no realizan vtv", vehiculoLaPlata.debeRealizarVtv(LocalDate.of(2019, 10, 10)));
		assertTrue(vechiculoCumpleVtv.debeRealizarVtv(LocalDate.of(2019, 10, 10)));
	}
}
