package ar.edu.unq.po2.strategy;

public class EncriptarPorNumero implements Codificador {

	@Override
	public void encriptar(String texto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desencriptar(String texto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Codificador devolverOtroCodificador() {
		return new EncriptarPorNumero();
	}

}
