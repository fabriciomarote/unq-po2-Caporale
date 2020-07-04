package unq.edu.ar.po2.tp10.Cuenta.Cuenta.src.cuenta;

public class CajaAhorro extends CuentaBancaria{

	public CajaAhorro(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super(historialDeMovimientos, notificador, saldo);
	}

	public boolean esPosibleExtraerDeLaCuenta(Integer monto) {
		return this.saldo >= monto;
	}
	

}
