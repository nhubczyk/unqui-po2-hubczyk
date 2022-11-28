package ar.edu.unq.po2.parcial.compañiaDeSeguros;

public class PolizaCerrada extends EstadoDePoliza {

	@Override
	public String addItem(PolizaDeSeguros poliza, Item item) {
		poliza.getItems().add(item);
		poliza.addGastosAdministrativos(new GastosAdministrativos("Recargo por extension", item.valorDeUnItem() * 0.3));
		return "Agregar un item a la poliza";	
	}

	@Override
	public String cerrarInventario(PolizaDeSeguros poliza) {
		return "No se puede cerrar el inventario ya que la poliza esta cerrada";
	}

	@Override
	public String pagoDeLaPoliza(PolizaDeSeguros poliza) {
		poliza.setMiEstadoDePoliza(new PolizaVigente());
		return "Se realizo el pago de la poliza";
	}

	@Override
	public String cancelarPoliza(PolizaDeSeguros poliza) {
		return "No se puede cancela la poliza ya que se encuentra cerrada";
	}
}
