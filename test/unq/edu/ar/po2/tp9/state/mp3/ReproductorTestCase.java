package ar.edu.unq.po2.tp10.stateYStrategy.mp3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;



//import org.mockito.Mock.*;

public class ReproductorTestCase {
	private Reproductor reproductor;
	
	@Mock
	Song cancion;
	
	@BeforeEach
	public void setUp() {
		reproductor=new Reproductor();
		cancion =  mock(Song.class);
	}
	
	@Test
	public void seleccionarCancion() {
		assertNotEquals(reproductor.getCancionSeleccionada(), cancion);
		reproductor.seleccionarCancion(cancion);
		assertEquals(reproductor.getCancionSeleccionada(),cancion);
	
	}
	
	
}
