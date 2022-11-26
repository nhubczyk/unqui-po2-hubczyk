package ar.edu.unq.po2.parcial.secretarias;

public class SecretariaAdapter implements Secretaria {
	private SecretariaDeInfraestructura secretariaInfra;
	
	@Override
	public float montoTotal() {
		return this.getSecretariaInfra().inversionTotal();
	}

	public SecretariaDeInfraestructura getSecretariaInfra() {
		return secretariaInfra;
	}
	
}
