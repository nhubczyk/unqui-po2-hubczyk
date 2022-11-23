package ar.edu.unq.po2.state;

public class SesionDosJugadores extends EstadoMaquina {

	@Override
	public String insertarMoneda(MaquinaVideoJuegos maquina) {
		return "Ya fueron insertadas 2 monedas";
	}

	@Override
	public String jugar(MaquinaVideoJuegos maquina) {
		maquina.setEstado(new EsperandoInicio());
		return "Esperemos que hayan disfrutado su sesion :)";
	}

}
