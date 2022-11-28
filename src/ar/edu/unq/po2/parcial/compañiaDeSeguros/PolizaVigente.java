package ar.edu.unq.po2.parcial.compañiaDeSeguros;

public class PolizaVigente extends EstadoDePoliza {

	@Override
	public String addItem(PolizaDeSeguros poliza, Item item) {
		return "No se agrega un nuevo item al inventario en esta poliza";
	}

	@Override
	public String cerrarInventario(PolizaDeSeguros poliza) {
		return "No se puede cerrar el inventario ya que la poliza se encuentra vigente";
	}

	@Override
	public String pagoDeLaPoliza(PolizaDeSeguros poliza) {
		return "No se puede pagar la poliza ya que se encuentra vigente";
	}

	@Override
	public String cancelarPoliza(PolizaDeSeguros poliza) {
		poliza.eliminarGastos();
		poliza.setMiEstadoDePoliza(new PolizaAbierta());
		return "Se cancelo la poliza";
	}

}
