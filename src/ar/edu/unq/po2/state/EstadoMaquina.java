package ar.edu.unq.po2.state;

public abstract class EstadoMaquina {
	
	public String presionarInicio(MaquinaVideoJuegos maquina) {
		return "El juego ya fuÃ© iniciado";
	}
	
	public abstract String insertarMoneda(MaquinaVideoJuegos maquina);
	public abstract String jugar(MaquinaVideoJuegos maquina);
	
}