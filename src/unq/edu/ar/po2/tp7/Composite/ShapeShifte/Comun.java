package unq.edu.ar.po2.tp7.Composite.ShapeShifte;

import java.util.ArrayList;
import java.util.List;

public class Comun implements IShapeShifte{
	
	private Integer value;
	
	public Comun(Integer value) {
		super();
		this.value = value;
	}

	@Override
	public IShapeShifte compose(IShapeShifte ss) {
		Compuesto ret =  new Compuesto(this, ss);
		return ret;
	}

	@Override
	public int deepest() {
		return 0;
	}

	@Override
	public IShapeShifte flat() {
		
		return this;
	}

	@Override
	public List<Integer> values() {
	List<Integer> valuesIntegers=new ArrayList<Integer>();
	valuesIntegers.add(this.value);
		
		return valuesIntegers;
	}

}
