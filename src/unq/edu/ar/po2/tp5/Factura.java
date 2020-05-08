package unq.edu.ar.po2.tp5;

public abstract class Factura implements Producto {
	
	@Override
	public void registrarEn(Agencia agencia) {
		agencia.registrarPago(this);
		
	}

}
