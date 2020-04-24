package unq.edu.ar.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

	private String nombre;
	private String apellido;
	private LocalDate fechaDeNacimiento;
	
	
	public Persona(String nombre, LocalDate fechaDeNaciemiento) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNaciemiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public int edad() {
		LocalDate hoy = LocalDate.now();
		return Period.between(this.getFechaDeNacimiento(),hoy).getYears();
	}
	
	public Boolean esMenorQue(Persona persona) {
		return this.edad()<persona.edad();
	}
	
	
	
}
