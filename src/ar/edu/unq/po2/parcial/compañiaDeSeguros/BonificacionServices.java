package ar.edu.unq.po2.parcial.compañiaDeSeguros;

public interface BonificacionServices {

	public boolean codigoValido(int codigo);
	
	public void anularCodigo(int codigo);
	
	public void notificarTitular(String mailTitular, int codigo);
}
