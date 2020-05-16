package unq.edu.ar.po2.tp6.BancoYPrestamos;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BancoTest {
	
	private Banco banco;
	private Cliente cliente1;
	private Cliente cliente2;
	private Cliente cliente3;
	private Cliente cliente4;
	private Double monto;
	private SolicitudDeCredito creditoHipotecario;
	private SolicitudDeCredito creditoPersonal;
	private List<Cliente> clientes;
	
	
	
	@BeforeEach
	public void setUp() {
		banco = new Banco();
		cliente1= new Cliente("Pepa","Martinez","direccion 123", 81, 60000d);
		cliente2= new Cliente("Pepe","Gonzalez","direccion 1234", 80, 35000d);
		cliente3= new Cliente("Pepo","Perez","direccion 12345", 31, 69000d);
		cliente4= new Cliente("Pepu","Lopez","direccion 123456", 18, 50000d);	
		monto = 30000D;
		
		banco.agregar(cliente1);
		banco.agregar(cliente2);
		banco.agregar(cliente3);
		
		creditoHipotecario = new CreditoHipotecario(cliente1, 20000D, 10, null);
		creditoPersonal = new CreditoPersonal(cliente2, monto, 12);
		banco.agregar(creditoHipotecario);
		banco.agregar(creditoPersonal);
		
		
		clientes = new ArrayList<Cliente>();
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		
		
	}
	
	@Test
	public void listaDeClientesDelbanco() {
		assertEquals(clientes, banco.getClientes());
		
	}
	
	@Test
	public void cliente4EsClienteDelbanco() {
		banco.agregar(cliente4);
		clientes.add(cliente4);
		assertEquals(clientes, banco.getClientes());
		
	}
	
	@Test
	public void elBancoTiene2SolicitudesDeCredito() {
		
		
		assertEquals(2,banco.getSolicitudesDeCreditos().size());
		
	}
	
	@Test 
	public void montoADesembolzarDeCreditosAprobadosDelbanco() {
		banco.calcularMontoTotalADesembolzar();
		assertEquals(30000D, banco.getMontoTotalADesembolzar());
		
	}
	

	
	
	
	

}
