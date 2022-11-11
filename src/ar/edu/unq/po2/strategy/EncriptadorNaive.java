package ar.edu.unq.po2.strategy;

public class EncriptadorNaive {
	
	private Codificador codificador;

	public void encriptar(String texto) {
		codificador.encriptar(texto);
	}
	
	public void desencriptar(String texto) {
		codificador.desencriptar(texto);
	}
	
	public void setCodificador(Codificador codificador) {
		this.codificador=codificador;
	}
}
