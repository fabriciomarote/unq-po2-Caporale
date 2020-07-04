package unq.edu.ar.po2.tp10.Cuenta.Cuenta.src.cuenta;

public abstract class CuentaBancaria {
	protected HistorialMovimientos historialDeMovimientos;
	protected Notificador notificador;
	protected int saldo;
	
	public CuentaBancaria(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super();
		this.historialDeMovimientos = historialDeMovimientos;
		this.notificador = notificador;
		this.saldo = saldo;
	}

	public int getSaldo() {
		return saldo;
	}
	
	/*
	 * Bad smell:
	 * Switch Statements: esPosibleExtraerDeLaCuenta(monto), es un metodo que utilizan sus clases hijas, cada una con distinta logica,
	 *                    dependiendo del objeto.
	 *                    Pero el metodo extraer(monto), es el mismo para todas, lo unico que varia, segun el objeto es 
	 *                    es la posibilidad o no de poder extraer el monto solicitado
	 *                    y esto dependera de cada objeto, es por eso que se decide definier su protocolo de 
	 *                    extraccion en la clase abstracta y la posibilidad de extraccion del monto solicitado
	 *                    se delega en el objeto, ya que aqui es donde verdaderamente hay un cambio dependiendo del
	 *                    objeto.
	 */
	public void extraer(Integer monto) {
		 if(esPosibleExtraerDeLaCuenta(monto)) {
				this.saldo = saldo - monto;
				this.historialDeMovimientos.registrarMovimiento("Extracción", monto);
				this.notificador.notificarNuevoSaldoACliente(this);
			}
		
	}
	
	
	public abstract boolean esPosibleExtraerDeLaCuenta(Integer monto);
}
