package unq.edu.ar.po2.tp8.punto3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

public class CartaTest {
	
	private Carta carta;
	
	
	private Carta cartaMock;
	private Carta cartaMockDistintoPalo;
	private Carta cartaMocKValorInferior;
	
	
	@BeforeEach
	public void setUp() {
		carta = new Carta(Valor.DOS ,"D");
		cartaMock = mock(Carta.class);
		cartaMockDistintoPalo = mock(Carta.class);
		cartaMocKValorInferior = mock(Carta.class);
		
		when(this.cartaMock.getPalo()).thenReturn("D");
		when(this.cartaMock.getValor()).thenReturn(Valor.DIEZ);
		
		when(this.cartaMockDistintoPalo.getPalo()).thenReturn("T");
		when(this.cartaMockDistintoPalo.getValor()).thenReturn(Valor.DOS);
		
		when(this.cartaMocKValorInferior.getPalo()).thenReturn("P");
		when(this.cartaMocKValorInferior.getValor()).thenReturn(Valor.A);
		
		
	}
	
	@Test
	public void seCreaLaCartaAD(){
		
		assertEquals(Valor.DOS, carta.getValor());
		assertEquals("D", carta.getPalo());
	}
	

	@Test
	public void cuandoElValorDeUnaCartaEsSuperiorAOtra() {
		
		assertTrue(carta.esSuperiorA(cartaMocKValorInferior));
	}
	
	@Test
	public void cuandoElValorDeUnaCartaEsMenorAOtra() {
		
		assertFalse(carta.esSuperiorA(cartaMock));
	}
	
	@Test
	public void cuandoElValorDeUnaCartaEsIgualAlDeOtra() {
		
		assertFalse(carta.esSuperiorA(cartaMockDistintoPalo));
	}
	
	@Test
	public void unaCartaEsMismoPaloQueLaCartaQueRecibePorParametro() {
		
		assertTrue(carta.esMismoPaloQue(cartaMock));
	}
	
	@Test
	public void dosCartasSonDeDistintoPalo() {
		
		assertFalse(carta.esMismoPaloQue(cartaMockDistintoPalo));
		
	}

}
