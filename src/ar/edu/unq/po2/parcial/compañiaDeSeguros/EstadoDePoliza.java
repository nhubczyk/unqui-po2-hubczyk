package ar.edu.unq.po2.parcial.compañiaDeSeguros;

public abstract class EstadoDePoliza {

	public abstract String addItem(PolizaDeSeguros poliza, Item item);
	
	public abstract String cerrarInventario(PolizaDeSeguros poliza);
	
	public abstract String pagoDeLaPoliza(PolizaDeSeguros poliza);
	
	public abstract String cancelarPoliza(PolizaDeSeguros poliza);
}
