package unq.edu.ar.po2.tp8.punto1;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class PokerStatus {
	
	//private boolean esPoker;
	// encargada de verificar si en una ronda del juego, un jugador ha recibido, en un conjunto de 5 cartas,

	
	
	public Boolean verificar(String carta1,String carta2,String carta3,String carta4,String carta5){
		List<String> juego1 = new ArrayList<String>();
		juego1.add(carta1);
		juego1.add(carta2);
		juego1.add(carta3);
		juego1.add(carta4);
		juego1.add(carta5);
		
		
		
		char numero1 = carta1.charAt(0);
		char numero2 = carta2.charAt(0);
		
		return juego1.stream().map(carta -> carta.charAt(0)).filter(caracter -> caracter.equals(numero1)).collect(Collectors.toList()).size() == 4
				|| juego1.stream().map(carta -> carta.charAt(0)).filter(caracter -> caracter.equals(numero2)).collect(Collectors.toList()).size() == 4;
		
		
	}
}
