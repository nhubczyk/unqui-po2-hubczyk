import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.Cliente;
import ar.edu.unq.po2.tp5.Producto;
import ar.edu.unq.po2.tp5.ProductoCooperativa;
import ar.edu.unq.po2.tp5.Registro;

class RegistroTestCase {

	private Registro fideos;
	private Registro leche;
	private Cliente cliente;
	
	@BeforeEach
	public void setUp() {
		fideos = new Producto(5.20f, 10);
		leche = new ProductoCooperativa(6.10f, 5);
		// El producto que desea adquirir el cliente es fideos.
		cliente = new Cliente(); 
	}
	
	@Test
	public void registrarProductoYObtenerMonto() {
		cliente.agregarRegistro(fideos);
		assertEquals(5.2f, fideos.montoAPagar());
		cliente.agregarRegistro(leche);
		assertEquals(6.1f, leche.montoAPagar());
	}
	
	@Test
	public void testDescuento() {
		assertEquals(0.61f, leche.descuento());
	}

}
