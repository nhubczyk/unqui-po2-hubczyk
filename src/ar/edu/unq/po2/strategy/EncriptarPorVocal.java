package ar.edu.unq.po2.strategy;

public class EncriptarPorVocal implements Codificador {

	@Override
	public void encriptar(String texto) {
		texto.replaceAll("eo", "ia");
	}

	@Override
	public void desencriptar(String texto) {
		texto.replaceAll("texto", "12345");
	}

}
