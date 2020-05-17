package unq.edu.ar.po2.tp8.punto1;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.edu.ar.po2.tp8.punto1.PokerStatus;

public class PokerStatusTest {
	
	//encargada de verificar si en una ronda del juego, un jugador ha recibido, en un conjunto de 5 cartas,cuatro cartas iguales en su valor
 // verificar(String,String,String,String,String)
	
	/*
	 * verificar puede recibir : - poker ( 4D,4P,4C,4T,8T)
	 * 							- poker con las cartas del mismo numero al final  ( 8D,4P,4C,4T,4D)
	 *                           - poker con las cartas del mismo numero mezcladas ( 8D,4P,8C,8T,8P)
	 * 							 - No Poker con 3 cartas del mismo numero (4D,4P,3C,4T,8T)
	 * 							 - No poker con 3 cartas del mismo numero en dstinto orden (4D,8T,3C,4P,4T)
	 * 								- No poker con 3 cartas del mismo numero al final (3D,8P,4C,4P,4T)
	 * 							*/
	
	//setUp
	private PokerStatus pokerStatus;
	
	
	@BeforeEach
	public void setUp() {
		pokerStatus = new PokerStatus();
			
	}
	
   
	
	@Test
	public void cuandoUnJugadorRecibeCuatroCartasDelMismoNumeroTodasJunatasAlPrincipioTienePoker() {
		assertTrue(pokerStatus.verificar("4D","4P","4C","4T","8T")); // verify
	}
	
	@Test
	public void cuandoUnJugadorRecibeCuatroCartasDelMismoNumeroTodasAlFinalTienePoker() {
		assertTrue(pokerStatus.verificar("8D","4P","4C","4T","4D")); // verify
	}
	
	@Test
	public void cuandoUnJugadorRecibeCuatroCartasDelMismoNumeroMezcladasTienePoker() {
		assertTrue(pokerStatus.verificar("8D","4P","8C","8T","8P")); // verify
	}
	
	@Test
	public void cuandoUnJugadorRecibeTresCartasDelMismoNumeroTodasAtrasYLasOtrasDosRestantesDeOtrosNumerosNoTienePoker() {
		assertFalse(pokerStatus.verificar("3D","8T","4C","4P","4T")); // verify
	}
	
	@Test
	public void cuandoUnJugadorRecibeTresCartasDelMismoNumeroTodasMezcladasYLasOtrasDosRestantesDeOtrosNumerosNoTienePoker() {
		assertFalse(pokerStatus.verificar("3D","8T","4C","4P","4T")); // verify
	}
	
	@Test
	public void cuandoUnJugadorRecibeTresCartasDelMismoNumeroTodasAdelanteYLasOtrasDosRestantesDeOtrosNumerosNoTienePoker() {
		assertFalse(pokerStatus.verificar("4D","4P","4C","3P","8T")); // verify
	}
	
	
	}

