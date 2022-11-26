package ar.edu.unq.po2.parcial.secretarias.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.parcial.secretarias.Empleado;
import ar.edu.unq.po2.parcial.secretarias.Programa;
import ar.edu.unq.po2.parcial.secretarias.Proyecto;

class ProgramaTestCase {
	private Programa programa;
	private Programa programa2;
	private Empleado empleado;
	private Empleado empleado2;
	private Proyecto proyecto1;
	private Proyecto proyecto2;
	private Proyecto proyecto3;
	
	@BeforeEach
	public void setUp() {
		empleado = mock(Empleado.class);
		empleado2 = mock(Empleado.class);
		proyecto1 = mock(Proyecto.class);
		proyecto2 = mock(Proyecto.class);
		proyecto3 = mock(Proyecto.class);
		programa = new Programa("MasAguaPotable", empleado, 100);
		programa.addActividad(proyecto1);
		programa2 = new Programa("MasExtraccion", empleado2, 200);
		programa.addActividad(programa2);
		programa2.addActividad(proyecto2);
		programa2.addActividad(proyecto3);
		
		when(proyecto1.getFechaDeInicio()).thenReturn(LocalDate.of(2022, 4, 5));
		when(proyecto2.getFechaDeInicio()).thenReturn(LocalDate.of(2022, 2, 1));
		when(proyecto3.getFechaDeInicio()).thenReturn(LocalDate.of(2022, 5, 20));
		
		when(proyecto1.inversionTotal()).thenReturn(100000);
		when(proyecto2.inversionTotal()).thenReturn(50000);
		when(proyecto3.inversionTotal()).thenReturn(20000);
	}
	
	@Test
	void testFechaDeInicioProgramaMasAguaPotable() {
		assertEquals(LocalDate.of(2022, 2, 1),programa.getFechaDeInicio());
		assertEquals(LocalDate.of(2022, 2, 1), programa2.getFechaDeInicio());
	}
	
	@Test
	void testInversionTotalProgramaMasAguaPotable() {
		assertEquals(170300, programa.inversionTotal());
	}

}
