package unq.edu.ar.po2.tp10.Cuenta.Cuenta.src.cuenta;

public class CuentaCorriente extends CuentaBancaria{
	private Integer limiteDescubierto;
	
	public CuentaCorriente(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo, Integer limiteDescubierto) {
		super(historialDeMovimientos, notificador, saldo);
		this.limiteDescubierto = limiteDescubierto;
	}

	public boolean esPosibleExtraerDeLaCuenta(Integer monto) {
		return this.saldo + this.limiteDescubierto >= monto;
	}

}
