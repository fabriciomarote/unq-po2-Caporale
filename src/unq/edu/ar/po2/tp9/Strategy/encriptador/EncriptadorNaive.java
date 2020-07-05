package unq.edu.ar.po2.tp9.Strategy.encriptador;

public class EncriptadorNaive {
	
	private ModoDeEncriptacion modoDeEncriptacion;
	
	public EncriptadorNaive(ModoDeEncriptacion modoDeEncriptacion) {
		this.modoDeEncriptacion = modoDeEncriptacion;
	}
	
	public ModoDeEncriptacion getModoDeEncriptacion() {
		return modoDeEncriptacion;
	}

	public void setModoDeEncriptacion(ModoDeEncriptacion modoDeEncriptacion) {
		this.modoDeEncriptacion = modoDeEncriptacion;
	}

	public String encriptar(String texto) {
		return getModoDeEncriptacion().encriptar(texto);
	}

	public String desencriptar(String texto) {
		return getModoDeEncriptacion().desencriptar(texto);
	}

}
