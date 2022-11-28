package ar.edu.unq.po2.parcial.compañiaDeSeguros.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.parcial.compañiaDeSeguros.Item;
import ar.edu.unq.po2.parcial.compañiaDeSeguros.PolizaAbierta;
import ar.edu.unq.po2.parcial.compañiaDeSeguros.PolizaCerrada;
import ar.edu.unq.po2.parcial.compañiaDeSeguros.PolizaDeSeguros;

class PolizaAbiertaTestCase {
	private PolizaAbierta polizaAbierta;
	private PolizaDeSeguros poliza;
	private Item item;
	private List<Item> items;
	
	@BeforeEach
	public void setUp() {
		polizaAbierta = new PolizaAbierta();
		poliza = mock(PolizaDeSeguros.class);
		item = mock(Item.class);
		items = new ArrayList<Item>();
		
		when(poliza.getItems()).thenReturn(items);
	}
	
	@Test
	void testAddItem() {
		polizaAbierta.addItem(poliza, item);
		assertTrue(items.contains(item));
	}
	
	@Test
	void testCerrarInventario() {
		polizaAbierta.cerrarInventario(poliza);
		verify(poliza).setMiEstadoDePoliza(any(PolizaCerrada.class));
	}
}
