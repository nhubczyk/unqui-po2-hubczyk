
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.Banco;
import ar.edu.unq.po2.tp6.Cliente;

public class BancoTestCase {
	private Banco banco;
	private Cliente cliente;
	
	@BeforeEach
	public void SetUp() throws Exception {
		banco = new Banco();
		cliente = new Cliente("Nicolas", "Hubczyk", "Olavarria", 29, 150.000f, 300.000f);
		banco.agregarClientes(cliente);
	}
	
	@Test
	public void testMontoADesembolsar() {
		assertEquals(0.0f, banco.montoTotalADesembolsar());
	}

}
