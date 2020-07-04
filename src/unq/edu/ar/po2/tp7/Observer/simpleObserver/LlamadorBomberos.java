package unq.edu.ar.po2.tp7.Observer.simpleObserver;
import java.util.Observable;
import java.util.Observer;

/**
 * Importante: esta clase fue desarrollada a modo de ejemplo y disparador
 * para ser criticados y mejorados en la practica de Observer de la materia
 * Objetos 2 de la UNQ.
 * 
 * ventaja: usa la estructura de java , no incorpora nada mas que los metodos de esa clase.
 * desventaja, el hecho de ukltilar la interfaz de java, no permite por ejemplo, poder enviar mas parametros en el update o el notify
 * o si hay que implementar el envio de distintos mensajes por que hay que notificar sobre distintos cambios de distintos parametros,
 * ejemplo, en nuestro tp debiamos avisar que se valida una muestra y que se crea una muestra, es por eso que implementamos nuestra propia interfaz.
 * 
 */

public class LlamadorBomberos implements Observer{
	
	public Sensor miSensor;
	
	public LlamadorBomberos(Sensor sensor){
		this.miSensor=sensor;
		this.miSensor.addObserver(this); //Se agrega como observador
	}

	@Override
	public void update(Observable o, Object arg) {
		//sabe que recibe solamente este mensaje cuando cambio la temperatura, 
		//Y la recibe solamente del sensor con el que fue iniciado.
		
		this.verificarSituacion(this.miSensor.getTemperatura());
		
	}

	private void verificarSituacion(int temperatura) {
		if(temperatura > 60){
			//Llamar a los bomberos
		}
		
	}
	
	

}
