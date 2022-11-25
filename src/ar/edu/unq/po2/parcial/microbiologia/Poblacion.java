package ar.edu.unq.po2.parcial.microbiologia;

import java.util.ArrayList;
import java.util.List;

public class Poblacion extends Consumidor {
	private List<Consumidor> consumidores = new ArrayList<Consumidor>();
	private int factorDeOxidacion;
	
	public Poblacion(int factor) {
		this.factorDeOxidacion=factor;
	}
	
	public int getFactorDeOxidacion() {
		return this.factorDeOxidacion;
	}
	
	@Override
	public double consumoDeOxigeno() {
		return this.sumatoriaDelConsumoDeLosConsumidores()
				* this.cantidadDeConsumidores() / this.getFactorDeOxidacion();
	}

	public List<Consumidor> getConsumidores() {
		return consumidores;
	}
	
	public void addConsumidor(Consumidor consumidor) {
		this.consumidores.add(consumidor);
	}
	
	public void removeConsumidor(Consumidor consumidor) {
		this.consumidores.remove(consumidor);
	}
	
	public double sumatoriaDelConsumoDeLosConsumidores() {
		return this.getConsumidores().stream().mapToDouble(c -> c.consumoDeOxigeno()).sum();
	}
	
	public int cantidadDeConsumidores() {
		return this.getConsumidores().size();
	}

}
