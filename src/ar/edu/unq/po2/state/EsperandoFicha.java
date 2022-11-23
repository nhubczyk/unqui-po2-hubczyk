package ar.edu.unq.po2.state;

public class EsperandoFicha extends EstadoMaquina {

	@Override
	public String insertarMoneda(MaquinaVideoJuegos maquina) {
		maquina.setEstado(new SesionUnJugador());
		return "Primer moneda insertada";
	}

	@Override
	public String jugar(MaquinaVideoJuegos maquina) {
		return "Debe insertar al menos una moneda";
	}

}