package unq.edu.ar.po2.tp7.Composite;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.Mock;


public class MixtoTest {
	
	private PorcionProductivaDeTierra porcionMixta;
	private PorcionProductivaDeTierra porcionMixtaCompuesto;

	@Mock
	private Pura porcionPura1 = mock(Pura.class);
	@Mock
	private Pura porcionPura2 = mock(Pura.class);
	@Mock
	private Pura porcionPura3 = mock(Pura.class);
	@Mock
	private Pura porcionPura4 = mock(Pura.class);
	@Mock
	private Pura porcionPura5 = mock(Pura.class);
	@Mock
	private Pura porcionPura6 = mock(Pura.class);
	@Mock
	private Pura porcionPura7 = mock(Pura.class);
	
	
	
	@BeforeEach
	public void setUp() {
		porcionMixta = new Mixto();
		porcionMixtaCompuesto = new Mixto();
	
		when(porcionPura1.gananciasAnuales()).thenReturn(300);
		when(porcionPura2.gananciasAnuales()).thenReturn(300);
		when(porcionPura3.gananciasAnuales()).thenReturn(300);
		
		
		when(porcionPura4.gananciasAnuales()).thenReturn(500);
		when(porcionPura5.gananciasAnuales()).thenReturn(500);
		when(porcionPura6.gananciasAnuales()).thenReturn(500);
		when(porcionPura7.gananciasAnuales()).thenReturn(500);
		
		porcionMixtaCompuesto.addPorcionroductivaDeTierra(porcionPura4);
		porcionMixtaCompuesto.addPorcionroductivaDeTierra(porcionPura5);
		porcionMixtaCompuesto.addPorcionroductivaDeTierra(porcionPura6);
		porcionMixtaCompuesto.addPorcionroductivaDeTierra(porcionPura7);
		
		porcionMixta.addPorcionroductivaDeTierra(porcionMixtaCompuesto);
		porcionMixta.addPorcionroductivaDeTierra(porcionPura1);
		porcionMixta.addPorcionroductivaDeTierra(porcionPura2);
		porcionMixta.addPorcionroductivaDeTierra(porcionPura3);
				
	}
	
	@Test
	public void porcionMixtaCompuestoTieneComoGananciaAnual500() {
		System.out.println(porcionPura4.gananciasAnuales());
		System.out.println(porcionPura5.gananciasAnuales());
		System.out.println(porcionPura6.gananciasAnuales());
		System.out.println(porcionPura7.gananciasAnuales());
		System.out.println(porcionMixtaCompuesto.gananciasAnuales());
		assertEquals(500,porcionMixtaCompuesto.gananciasAnuales());
	}
	
	@Test
	public void porcionMixtaTieneComoGananciaAnual350() {
		
		assertEquals(350,porcionMixta.gananciasAnuales());
	}

}
