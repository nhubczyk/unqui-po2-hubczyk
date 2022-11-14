import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.Caja;
import ar.edu.unq.po2.tp5.Producto;
import ar.edu.unq.po2.tp5.ProductoCooperativa;

class MercadoCentralTestCase {
	
	Producto fideos;
	Producto arroz;
	ProductoCooperativa leche;
	Caja caja;
	
	@BeforeEach
	public void setUp() {
		fideos = new Producto(5.40f, 10);
		arroz = new Producto(2.30f, 2);
		leche = new ProductoCooperativa(3.20f, 5);
		caja = new Caja();
	}
	
	@Test
	void testGetPrecio() {
		assertEquals(5.40f,fideos.getPrecio());
		assertEquals(3.20f,leche.getPrecio());
	}
	
	@Test
	void testMontoAPagar() {
		assertEquals(10.80f, caja.montoAPagar(arroz));
		assertEquals(7.7f, caja.montoAPagar(fideos));
		assertEquals(4.6f, caja.montoAPagar(leche));
	}

	@Test
	void testDescuento() {
		assertEquals(0.64000005f, caja.montoAPagar(leche));
	}

}
