package ar.edu.unq.po2.parcial.compañiaDeSeguros;

import java.util.ArrayList;
import java.util.List;

public class PolizaDeSeguros {
	private EstadoDePoliza miEstadoDePoliza;
	private List<GastosAdministrativos> gastos = new ArrayList<GastosAdministrativos>();
	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	public double montoAsegurado() {
		return items.stream().mapToDouble(item -> item.valorDeUnItem()).sum();
	}
	
	public double precio() {
		return this.porcentajeDelMontoAsegurado() + this.montoGastosAdministrativos();
	}

	public double montoGastosAdministrativos() {
		var monto = 0.0;
		for(GastosAdministrativos gasto :gastos) {
			monto += gasto.getMonto();
		}
		return monto;
	}

	public double porcentajeDelMontoAsegurado() {
		return this.montoAsegurado() * 0.75;
	}
	
	public void addGastosAdministrativos(GastosAdministrativos gasto) {
		this.gastos.add(gasto);
	}

	public EstadoDePoliza getMiEstadoDePoliza() {
		return miEstadoDePoliza;
	}
}
