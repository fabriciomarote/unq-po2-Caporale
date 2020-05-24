package unq.edu.ar.po2.tp8.punto2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.edu.ar.po2.tp8.punto2.PokerStatus;

public class PockerStatusTest {
	
private PokerStatus pokerStatus;
	
	
	@BeforeEach
	public void setUp() {
		pokerStatus = new PokerStatus();
			
	}
	
   
	
	@Test
	public void cuandoUnJugadorRecibeCuatroCartasDelMismoNumeroTodasJunatasAlPrincipioTienePoker() {
		assertEquals("ES POKER",pokerStatus.verificar("4D","4P","4C","4T","8T")); // verify
	}
	
	@Test
	public void cuandoUnJugadorRecibeCuatroCartasDelMismoNumeroTodasAlFinalTienePoker() {
		assertEquals("ES POKER",pokerStatus.verificar("8D","AP","AC","AT","AD")); // verify
	}
	
	@Test
	public void cuandoUnJugadorRecibeCuatroCartasDelMismoNumeroMezcladasTienePoker() {
		assertEquals("ES POKER",pokerStatus.verificar("8D","4P","8C","8T","8P")); // verify
	}
	
	@Test
	public void cuandoUnJugadorRecibeTresCartasDelMismoNumeroTodasAtrasYLasOtrasDosRestantesDeOtrosNumerosTieneTrio() {
		assertEquals("ES TRIO",pokerStatus.verificar("3D","8T","4C","4P","4T")); // verify
	}
	
	@Test
	public void cuandoUnJugadorRecibeTresCartasDelMismoNumeroTodasMezcladasYLasOtrasDosRestantesDeOtrosNumerosTieneTrio() {
		assertEquals("ES TRIO",pokerStatus.verificar("3D","8T","3C","4P","3T")); // verify
	}
	
	@Test
	public void cuandoUnJugadorRecibeTresCartasDelMismoNumeroTodasAdelanteYLasOtrasDosRestantesDeOtrosNumerosTieneTrio() {
		assertEquals("ES TRIO",pokerStatus.verificar("4D","4P","4C","3P","8T")); // verify
	}
	
	@Test
	public void cuandoUnJugadorRecibeLasCincoCartasDelMismoNumeroPalo() {
		assertEquals("ES COLOR",pokerStatus.verificar("4D","3D","AD","QD","10D")); // verify
	}
	
	@Test
	public void cuandoUnJugadorRecibeCincoCartasDeDistintoPaloYDistintoNumeroNoTieneNada() {
		assertEquals("NO TIENE NADA", pokerStatus.verificar("AD", "10D", "3T", "5P", "7C"));
	}


}
