package ar.edu.unq.po2.parcial.compañiaDeSeguros;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PolizaDeSeguros {
	private EstadoDePoliza miEstadoDePoliza;
	private List<GastosAdministrativos> gastos = new ArrayList<GastosAdministrativos>();
	private List<Item> items = new ArrayList<Item>();
	
	public PolizaDeSeguros() {
		this.setMiEstadoDePoliza(new PolizaAbierta());
	}
	
	public void cerrarInventario() {
		this.getMiEstadoDePoliza().cerrarInventario(this);
	}
	
	public void pagarPoliza() {
		this.getMiEstadoDePoliza().pagoDeLaPoliza(this);
	}
	
	public void cancelarPoliza() {
		this.getMiEstadoDePoliza().cancelarPoliza(this);
	}
	
	public void addItem(Item item) {
		this.getMiEstadoDePoliza().addItem(this, item);
	}
	
	public List<Item> getItems() {
		return this.items;
	}
	
	public List<GastosAdministrativos> getGastos() {
		return this.gastos;
	}
	
	public double montoAsegurado() {
		return items.stream().mapToDouble(item -> item.valorDeUnItem()).sum();
	}
	
	public double precio() {
		return this.porcentajeDelMontoAsegurado() + this.montoGastosAdministrativos();
	}

	public double montoGastosAdministrativos() {
		return this.gastos.stream().mapToDouble(gasto -> gasto.getMonto()).sum();
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
	
	public void setMiEstadoDePoliza(EstadoDePoliza estado) {
		this.miEstadoDePoliza=estado;
	}
	
	public void eliminarGastos() {
		this.gastos = new ArrayList<GastosAdministrativos>();
	}
	
	public void aplicarDescuentoDeLaPoliza() {
		if(this.getMiEstadoDePoliza() instanceof PolizaAbierta) {
			this.addGastosAdministrativos(new GastosAdministrativos("BonificacionAdministrativa", -500));
		}
		else if (this.getMiEstadoDePoliza() instanceof PolizaCerrada) {
			this.gastos.stream().max(Comparator.comparingDouble(gasto -> gasto.getMonto()));
		}
		else {
			if (this.getMiEstadoDePoliza() instanceof PolizaVigente) {
				this.eliminarGastos();
			}
		}
	}
}
