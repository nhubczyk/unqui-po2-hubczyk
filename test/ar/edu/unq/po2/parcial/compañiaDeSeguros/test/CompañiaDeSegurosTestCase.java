package ar.edu.unq.po2.parcial.compañiaDeSeguros.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.parcial.compañiaDeSeguros.GastosAdministrativos;
import ar.edu.unq.po2.parcial.compañiaDeSeguros.Item;
import ar.edu.unq.po2.parcial.compañiaDeSeguros.PolizaAbierta;
import ar.edu.unq.po2.parcial.compañiaDeSeguros.PolizaCerrada;
import ar.edu.unq.po2.parcial.compañiaDeSeguros.PolizaDeSeguros;
import ar.edu.unq.po2.parcial.compañiaDeSeguros.PolizaVigente;

class CompañiaDeSegurosTestCase {
	private PolizaDeSeguros poliza;
	private PolizaAbierta estadoAbierto;
	private PolizaCerrada estadoCerrado;
	private PolizaVigente estadoVigente;
	private Item item;
	private GastosAdministrativos gastos;
	
	@BeforeEach
	public void setUp() {
		poliza = new PolizaDeSeguros();
		estadoAbierto = mock(PolizaAbierta.class);
		estadoCerrado = mock(PolizaCerrada.class);
		estadoVigente = mock(PolizaVigente.class);
		item = mock(Item.class);
		gastos = mock(GastosAdministrativos.class);
		
		
		
		poliza.addItem(item);
		poliza.addGastosAdministrativos(gastos);
	}
	
	@Test
	void testEstadoAbierto() {
		assertEquals(PolizaAbierta.class, poliza.getMiEstadoDePoliza().getClass());
	}
	
	@Test
	void testCerrarInventario() {
		poliza.setMiEstadoDePoliza(estadoAbierto);
		poliza.cerrarInventario();
		verify(estadoAbierto).cerrarInventario(poliza);
	}
	
	@Test
	void testPagarPoliza() {
		poliza.setMiEstadoDePoliza(estadoCerrado);
		poliza.pagarPoliza();
		verify(estadoCerrado).pagoDeLaPoliza(poliza);
	}
	
	@Test
	void testCancelarPoliza() {
		poliza.setMiEstadoDePoliza(estadoVigente);
		poliza.cancelarPoliza();
		verify(estadoVigente).cancelarPoliza(poliza);
	}
		
}
