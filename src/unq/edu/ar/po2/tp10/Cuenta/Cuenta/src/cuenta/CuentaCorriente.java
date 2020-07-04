package unq.edu.ar.po2.tp10.Cuenta.Cuenta.src.cuenta;

public class CuentaCorriente extends CuentaBancaria{
	private Integer limiteDescubierto;
	
	public CuentaCorriente(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo, Integer limiteDescubierto) {
		super(historialDeMovimientos, notificador, saldo);
		this.limiteDescubierto = limiteDescubierto;
	}
	
	@Override
	public void extraer(Integer monto) {
		if(elMontoExtraibleNoSuperaAlSolicitado(monto))
			this.saldo = saldo - monto;
			this.historialDeMovimientos.registrarMovimiento("Extracción", monto);
			this.notificador.notificarNuevoSaldoACliente(this);
	}

	private boolean elMontoExtraibleNoSuperaAlSolicitado(Integer monto) {
		return this.saldo + this.limiteDescubierto >= monto;
	}

}
