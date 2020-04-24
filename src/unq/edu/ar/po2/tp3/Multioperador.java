package unq.edu.ar.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {
	 private List<Integer> numerosEnteros = new ArrayList<Integer>();
	 
	 public void addNumerosEnteros(Integer numeroEntero) {
		 numerosEnteros.add(numeroEntero);
	 }
	 
	 public Integer sumaDeTodosSusNumeros() {
		 Integer suma = 0;
		 for(int entero:numerosEnteros) {
			 suma += entero;
		 }
		 return suma;
	 }
	 public Integer restaDeTodosSusNumeros() {
		 Integer resta = numerosEnteros.get(0);
		List<Integer> numeros = numerosEnteros.subList(1, numerosEnteros.size());
		 for(int entero:numeros) {
			 resta -= entero;
		 }
		 return resta;
	 }
	 public Integer multiplicacionDeTodosSusNumeros() {
		 Integer multiplicacion = 1;
		 for(int entero:numerosEnteros) {
			 multiplicacion *= entero;
		 }
		 return multiplicacion;
	 }


}
