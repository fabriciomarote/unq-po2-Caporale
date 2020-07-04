package unq.edu.ar.po2.tp10.Registro.Registro.src.automotor;

import java.time.LocalDate;

public class RegistroAutomotor {
	
	public Boolean debeRealizarVtv(LocalDate fecha, Vehiculo vehiculo) {
		return vehiculo.debeRealizarVtv(fecha);
	}


}
