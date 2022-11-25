package ar.edu.unq.po2.parcial.microbiologia;

import java.util.ArrayList;
import java.util.List;

public class InstitutoDeMicrobiologia {
	private List<Barril> barriles = new ArrayList<Barril>();

	public void addBarril(Barril barril) {
		this.barriles.add(barril);
	}
}
