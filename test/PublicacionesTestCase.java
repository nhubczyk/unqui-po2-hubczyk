import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.observer.Sistema;
import ar.edu.unq.po2.observer.Articulo;
import ar.edu.unq.po2.observer.Investigador;


class PublicacionesTestCase {
	private Sistema sistema; // SUT
	private Investigador investigador; // DOC
	private Articulo articulo;
	
	@BeforeEach
	void setUp() {
		sistema = new Sistema();
		investigador = mock(Investigador.class);
		sistema.adscribir(investigador);
		articulo = mock(Articulo.class);
	}
	
	@Test
	void testCargarArcticulo() {
		sistema.cargarArticulo(articulo);
		assertTrue(sistema.getArticulos().contains(articulo));
	}
	
	@Test
	void testNotificarObservadores() {
		sistema.cargarArticulo(articulo); // Exercise


		// Verify
		verify(investigador).actualizar(articulo);
		verify(investigador, times(1)).actualizar(articulo);
	}

}
