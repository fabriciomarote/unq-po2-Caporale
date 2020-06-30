package unq.edu.ar.po2.tp7.Composite.ShapeShifte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Compuesto implements IShapeShifte {
	
	private List<IShapeShifte> shapeShifters;
	
	public Compuesto(IShapeShifte ss1, IShapeShifte ss2) {
		this.shapeShifters.add(ss1);
		this.shapeShifters.add(ss2);
	}

	@Override
	public IShapeShifte compose(IShapeShifte ss) {
		IShapeShifte shipeShifte = new Compuesto(this,ss);
		// recibe un IShapeShifter y retorna un nuevo IShapeShifter que es el resultado de componer al receptor con el que es enviado como parámetro.
		//La composición se realiza al mismo nivel de profundidad.
		//En la Figura 1 se muestran esquemas de IShapeShifter, cada letra sibolizaria un nombre de variable. Entonces las siguientes expresiones deberían ser verdaderas:
		//a.compose(b) es igual a c d.compose(c) es igual a d d.compose(e) es igual a f
		return null;
	}
	
	@Override
	public int deepest() {
		// Retorna un numero que representa la profundidad máxima alcanzada en composiciones que contiene. Continuando con las figuras de ejemplo, las siguienes expresiones deben ser validas:
		//a.deepest() es igual a 0. c.deepest() es igual a 1. f.deepest() es igual a 3.
		List<Integer> maximaprofundidadOrdenada = shapeShifters.stream().mapToInt(ss-> ss.deepest()).sorted().boxed().collect(Collectors.toList());
		
		int max = maximaprofundidadOrdenada.get(0);
                
		return max + 1;
	}

	@Override
	public IShapeShifte flat() {
		if(this.deepest()>=1) {
			return 
		}
		// Si el IShapeShifter posee una prfundidad maxima >= 1, entonces retorna un IShapeShifter de profundidad maxima 1 con todos los IShapeShifter de profundidad 0 contenidos. En cualquier otro caso, retorna el mismo IShapeShifter.
		//Siguiendo los siguientes ejemplos:
		//	a.flat() es igual a a.
		//	f.flat() es igual a g.
		//	Importante: No es necesario establecer un orden particular de los IShapeShifter en los resultantes.
		return this;
	}

	@Override
	public List<Integer> values() {
		// Retorna una lista de enteros con los valores incluidos en el IShapeShifter. Siguiendo el ejemplo:
		//a.values retorna una lista con el entero 1.
		//d.values retorna una lista con los enteros 3,1 y 2.
		//Importante: No es necesario establecer un orden particular de los enteros en la lista.

		return null;
	}

}
