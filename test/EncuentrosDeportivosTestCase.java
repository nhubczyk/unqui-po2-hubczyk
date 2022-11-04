import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.observer.AplicacionMovil;
import ar.edu.unq.po2.observer.Contrincante;
import ar.edu.unq.po2.observer.Deporte;
import ar.edu.unq.po2.observer.Listener;
import ar.edu.unq.po2.observer.Partido;
import ar.edu.unq.po2.observer.Servidor;

class EncuentrosDeportivosTestCase {
	private Servidor servidor; // SUT
	private Listener listener;
	private AplicacionMovil appMovil;
	private Partido partido;
	private Contrincante contrincante;
	private Deporte deporte;
	
	@BeforeEach
	void setUp() {
		servidor = new Servidor();
		listener = mock(Listener.class);
		appMovil = mock(AplicacionMovil.class);
		partido = mock(Partido.class);
		contrincante = mock(Contrincante.class);
		deporte = mock(Deporte.class);
	}
	
	@Test
	void testCargarPartido() {
		servidor.cargarPartido(partido);
		assertTrue(servidor.getPartidos().contains(partido));
	}
	
	@Test
	void testNotificarObservadores() {
	    servidor.cargarPartido(partido);
		
		verify(listener).actualizar(partido);
		verify(listener, times(1)).actualizar(partido);
	}

}
