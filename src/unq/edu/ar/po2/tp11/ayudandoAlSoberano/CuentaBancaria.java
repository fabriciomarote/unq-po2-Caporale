package unq.edu.ar.po2.tp11.ayudandoAlSoberano;

import java.util.ArrayList;
import java.util.List;

/**
 * Patron templateMethod.
 * Clase Abstracta. Define operacion primitiva esExtraccionPermitida() 
 *
 */

public class CuentaBancaria {
	
	private String titular;
	private int saldo;
	private List<String> movimientos;

	public CuentaBancaria(String titular) {
		this.titular = titular;
		this.saldo = 0;
		this.movimientos = new ArrayList<String>();
	}

	public String getTitular() {
		return this.titular;
	}

	public int getSaldo() {
		return this.saldo;
	}

	protected void setSaldo(int monto) {
		this.saldo = monto;
	}

	public void agregarMovimientos(String movimiento) {
		this.movimientos.add(movimiento);
	}

	public  void extraer(int monto) {
		if (esExtraccionPermitida(monto)) {
			this.setSaldo(this.getSaldo() - monto);
			this.agregarMovimientos("Extraccion");
		}
	}
	
	/**
	 * @param monto de la extraccion
	 * @return boolean True si se puede extraer el moto recibido por parametro
	 * Operacion primitiva a Redefinir en subclases
	 */
	protected abstract boolean esExtraccionPermitida(int monto);

}
