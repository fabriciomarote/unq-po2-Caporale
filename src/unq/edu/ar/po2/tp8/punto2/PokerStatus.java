package unq.edu.ar.po2.tp8.punto2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PokerStatus {
	
	public String verificar(String carta1,String carta2,String carta3,String carta4,String carta5){
		List<String> juego1 = new ArrayList<String>();
		juego1.add(carta1);
		juego1.add(carta2);
		juego1.add(carta3);
		juego1.add(carta4);
		juego1.add(carta5);
		
		
		char nuemroDeLaPrimerCarta = carta1.charAt(0);
		char numeroDeLaSegundaCarta = carta2.charAt(0);
		char numeroDeLaTercerCarta = carta3.charAt(0);
		
		char paloDeLaPrimerCarta = carta1.charAt(carta1.length()-1);
		
		
		if( esPoker(juego1, nuemroDeLaPrimerCarta, numeroDeLaSegundaCarta)){
			return "ES POKER";
		}
		else if(esColor(juego1, paloDeLaPrimerCarta)){
			return "ES COLOR";
		}
		 
		else if( esTrio(juego1,nuemroDeLaPrimerCarta, numeroDeLaSegundaCarta, numeroDeLaTercerCarta)) {
			return "ES TRIO";
		}
		else {
		 return "NO TIENE NADA";
		}
		
		
	}

	private boolean esPoker(List<String> juego1, char numero1, char numero2) {
		
		return juego1.stream().map(carta -> carta.charAt(0)).filter(caracter -> caracter.equals(numero1)).collect(Collectors.toList()).size() == 4
				|| juego1.stream().map(carta -> carta.charAt(0)).filter(caracter -> caracter.equals(numero2)).collect(Collectors.toList()).size() == 4;
	}
	
	private boolean esColor(List<String> juego1, char palo) {
		
		return juego1.stream().map(carta -> carta.charAt(carta.length()-1)).filter(caracter -> caracter.equals(palo)).collect(Collectors.toList()).size() == 5;
				
	}
     
     private boolean esTrio(List<String> juego1, char numero1, char numero2, char numero3) {
 		
 		return juego1.stream().map(carta -> carta.charAt(0)).filter(caracter -> caracter.equals(numero1)).collect(Collectors.toList()).size() == 3
				|| juego1.stream().map(carta -> carta.charAt(0)).filter(caracter -> caracter.equals(numero2)).collect(Collectors.toList()).size() == 3
				|| juego1.stream().map(carta -> carta.charAt(0)).filter(caracter -> caracter.equals(numero3)).collect(Collectors.toList()).size() == 3;
 				
 	}

}
