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
		
		return shipeShifte;
	}
	
	/*
	 *  Retorna un numero que representa la profundidad máxima alcanzada en composiciones que contiene. Continuando con las figuras de ejemplo, las siguienes expresiones deben ser validas:
		a.deepest() es igual a 0. c.deepest() es igual a 1. f.deepest() es igual a 3.
	 */
	
	@Override
	public int deepest() {
		List<Integer> maximaprofundidadOrdenada = shapeShifters.stream().mapToInt(ss-> ss.deepest()).sorted().boxed().collect(Collectors.toList());
		
		int max = maximaprofundidadOrdenada.get(0);
                
		return max + 1;
	}

	 @Override
		public IShapeShifte flat() {
			while (this.deepest() > 1) {
				List<IShapeShifte> list = new ArrayList<IShapeShifte>();
				for (Integer value : this.values()) {
					list.add(new Comun(value));
					shapeShifters = list;
				}
			}
			return this;
		}

	@Override
	public List<Integer> values() {
		
		return this.getShapeShifters().stream().flatMap(ss->ss.values().stream()).collect(Collectors.toList());
		
	}
	
	private List<IShapeShifte> getShapeShifters() {
		return this.shapeShifters;
	}

}
