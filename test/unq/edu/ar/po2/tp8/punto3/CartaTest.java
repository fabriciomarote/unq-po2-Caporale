package unq.edu.ar.po2.tp8.punto3;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class CartaTest {
	
	private Carta carta;
	
	@Mock
	private Carta cartaMock;
	
	
	@BeforeEach
	public void setUp() {
		carta = new Carta(Valor.A ,"D");
		
		Mockito.when(this.cartaMock.getPalo()).thenReturn("D");
		Mockito.when(this.cartaMock.getValor()).thenReturn(Valor.DIEZ);
		
		
	}
	

	@Test
	public void elValorDeUnaCartaEsSuperiorAOtra() {
		
		assertFalse(carta.esSuperiorA(cartaMock));
	}
	
	@Test
	public void unaCartaEsMismoPaloQueLaCartaQueRecibePorParametro() {
		
		assertFalse(carta.esSuperiorA(cartaMock));
	}

}
