package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<SolicitudesDeCredito> solicitudes = new ArrayList<SolicitudesDeCredito>();
	
	public Banco() {
		
	}

	public void agregarClientes(Cliente cliente) {
		clientes.add(cliente);
	}

	public Float montoTotalADesembolsar() {
		var monto = 0.00f;
		for(int i=0; i < solicitudes.size(); i++) {
			this.montoAceptable(monto, i, solicitudes);
		}
		return monto;
	}
	
	public void montoAceptable(Float monto, int i, List<SolicitudesDeCredito> solicitudes) {
		if(solicitudes.get(i).sonAceptables()) {
			monto = monto + solicitudes.get(i).getMontoSolicitado();
		}
	}
}
