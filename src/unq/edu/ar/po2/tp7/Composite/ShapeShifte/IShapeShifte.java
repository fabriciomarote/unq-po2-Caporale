package unq.edu.ar.po2.tp7.Composite.ShapeShifte;

import java.util.List;

public interface IShapeShifte {
	
		public IShapeShifte compose(IShapeShifte ss); 
		public int deepest();
		public IShapeShifte flat();
		public List<Integer> values();
		
	

}
