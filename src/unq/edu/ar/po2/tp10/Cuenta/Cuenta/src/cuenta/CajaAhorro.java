package unq.edu.ar.po2.tp10.Cuenta.Cuenta.src.cuenta;

public class CajaAhorro extends CuentaBancaria{

	public CajaAhorro(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super(historialDeMovimientos, notificador, saldo);
	}

	@Override
	public void extraer(Integer monto) {
		if(elSaldoEnCuentaEsMayorAlMontoAExtraer(monto)) {
			this.saldo = saldo - monto;
			this.historialDeMovimientos.registrarMovimiento("Extracción", monto);
			this.notificador.notificarNuevoSaldoACliente(this);
		}
	}

	private boolean elSaldoEnCuentaEsMayorAlMontoAExtraer(Integer monto) {
		return this.saldo >= monto;
	}
	

}
