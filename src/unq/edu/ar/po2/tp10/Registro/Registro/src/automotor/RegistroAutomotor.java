package unq.edu.ar.po2.tp10.Registro.Registro.src.automotor;

import java.time.LocalDate;

public class RegistroAutomotor {
	
	/*
	 * Bad smells:
	 * Large Method, era un metodo muy largo, dificil de leer, no era escalable.
	 * Feature Envy, utilizaba todas las variables de la clase Vehiculo, si debe realizar o no la vtv 
	 *               correspondia resolverlo a la clase vehiculo.
	 * 
	 * 
	 * 
	 */
	
	public Boolean debeRealizarVtv(LocalDate fecha, Vehiculo vehiculo) {
		return vehiculo.debeRealizarVtv(fecha);
	}


}
