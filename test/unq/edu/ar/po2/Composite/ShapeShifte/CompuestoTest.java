package unq.edu.ar.po2.Composite.ShapeShifte;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.edu.ar.po2.tp7.Composite.ShapeShifte.Comun;
import unq.edu.ar.po2.tp7.Composite.ShapeShifte.IShapeShifte;

public class CompuestoTest {
	
	private IShapeShifte shapeShifter;
	private IShapeShifte shapeShifter2;
	private IShapeShifte shapeShifter3;
	
	List<Integer> valor;
	List<Integer> valores;

	@BeforeEach
	public void serUp() {
		shapeShifter = new Comun(1);
		shapeShifter2 = new Comun(2);
		shapeShifter3= new Comun(3);
		
		valor = new ArrayList<Integer>();
		valor.add(1);
		
		valores = new ArrayList<Integer>();
		valores.add(1);
		valores.add(2);
		valores.add(3);
		
		
		
	}
	@Test
	public void testCompose() {
		assertEquals(0,shapeShifter.deepest());
		shapeShifter = shapeShifter.compose(shapeShifter2);
		shapeShifter = shapeShifter.compose(shapeShifter3);
		assertEquals(2,shapeShifter.deepest());
	}
	@Test
	public void testDeepest() {
		assertEquals(0,shapeShifter.deepest());
		shapeShifter = shapeShifter.compose(shapeShifter2);
		assertEquals(1,shapeShifter.deepest());
		shapeShifter = shapeShifter.compose(shapeShifter3);

		assertEquals(2,shapeShifter.deepest());
	}
	@Test
	public void testValues() {
		
		assertEquals(valor, shapeShifter.values());
		shapeShifter = shapeShifter.compose(shapeShifter2);
		shapeShifter = shapeShifter.compose(shapeShifter3);
		
		assertEquals(valores, shapeShifter.values());
	}
	
	@Test
	public void testFlat() {
		assertEquals(valor, shapeShifter.values());
		shapeShifter = shapeShifter.compose(shapeShifter2);
		shapeShifter = shapeShifter.compose(shapeShifter3);
		assertEquals(valores, shapeShifter.flat().values());
	}

}
