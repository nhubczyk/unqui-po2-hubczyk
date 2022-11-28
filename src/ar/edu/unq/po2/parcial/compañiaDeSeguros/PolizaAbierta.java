package ar.edu.unq.po2.parcial.compañiaDeSeguros;

public class PolizaAbierta extends EstadoDePoliza {

	@Override
	public String addItem(PolizaDeSeguros poliza, Item item) {
		poliza.getItems().add(item);
		return "Ingresar un item del inventario";
	}

	@Override
	public String cerrarInventario(PolizaDeSeguros poliza) {
		poliza.setMiEstadoDePoliza(new PolizaCerrada());
		return "Finalizo la carga del inventario";
	}

	@Override
	public String pagoDeLaPoliza(PolizaDeSeguros poliza) {
		return "No se puede pagar ya que la poliza esta abierta";
	}

	@Override
	public String cancelarPoliza(PolizaDeSeguros poliza) {
		return "No se puede cancelar ya que la poliza esta abierta";
	}

}
