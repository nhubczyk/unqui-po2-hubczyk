package ar.edu.unq.po2.parcial.microbiologia;

import java.util.ArrayList;
import java.util.List;

public class InstitutoDeMicrobiologia {
	private int codigo;
	private List<Barril> barriles = new ArrayList<Barril>();
	
	public InstitutoDeMicrobiologia(int cod, Barril barril) {
		this.codigo=cod;
		this.addBarril(barril);
	}

	private void addBarril(Barril barril) {
		this.barriles.add(barril);
	}
}
