package ar.edu.unq.po2.composite;

import java.util.ArrayList;
import java.util.List;

public class Parcela extends Cultivo {
	private List<Cultivo> cultivosParcela = new ArrayList<Cultivo>();
	
	@Override
	public int getGananciaAnual() {
		return 
			cultivosParcela.stream().mapToInt(cultivo -> cultivo.getGananciaAnual()).sum();
	}

	public List<Cultivo> getCultivos() {
		return this.cultivosParcela;
	}

	public void addCultivo(Cultivo cultivo) {
		if (this.cultivosParcela.size() <= 4) {
			this.cultivosParcela.add(cultivo);
		}
	}
	
	public void removeCultivo(Cultivo cultivo) {
		this.cultivosParcela.remove(cultivo);
	}
}
