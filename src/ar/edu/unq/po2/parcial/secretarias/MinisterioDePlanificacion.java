package ar.edu.unq.po2.parcial.secretarias;

import java.util.List;

public class MinisterioDePlanificacion {

	public MinisterioDePlanificacion() {
		
	}
	
	public float montoTotalAInvertir(List<Secretaria> secretarias) {
		float total = 0;
		for (Secretaria secretaria : secretarias){
			total += secretaria.montoTotal();
		}
		return total;
	}
}
