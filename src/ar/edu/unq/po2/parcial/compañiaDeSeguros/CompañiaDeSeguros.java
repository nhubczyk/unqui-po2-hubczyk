package ar.edu.unq.po2.parcial.compañiaDeSeguros;

import java.util.ArrayList;
import java.util.List;

public class CompañiaDeSeguros {
	private List<PolizaDeSeguros> polizas = new ArrayList<PolizaDeSeguros>();
	private BonificacionServices miBonificacion;
	
	public CompañiaDeSeguros() {
		
	}
	
	public void addPoliza(PolizaDeSeguros poliza) {
		this.polizas.add(poliza);
	}
	
	public List<PolizaDeSeguros> getPolizas() {
		return this.polizas;
	}

	public BonificacionServices getMiBonificacion() {
		return miBonificacion;
	}
}
