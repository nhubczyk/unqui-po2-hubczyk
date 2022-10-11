package ar.edu.unq.po2.tp6;

public class PokerStatus {
	
	public PokerStatus() {
		
	}

	public Boolean verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		var resultCarta1 = carta1.startsWith("2") || carta1.startsWith("J") || carta1.startsWith("4");
		var resultCarta2 = carta2.startsWith("2") || carta2.startsWith("J") || carta2.startsWith("4");
		var resultCarta3 = carta3.startsWith("2") || carta3.startsWith("J") || carta3.startsWith("4");
		var resultCarta4 = carta4.startsWith("2") || carta4.startsWith("J") || carta4.startsWith("4");
		var resultCarta5 = carta5.startsWith("2") || carta5.startsWith("J") || carta5.startsWith("4");
		if (resultCarta1 && resultCarta2 && resultCarta3 && resultCarta4) {
			System.out.println("Hay poker");
			return true;
		}
		else {
			if (resultCarta1 && resultCarta2 && resultCarta3 && resultCarta4 && !resultCarta5) {
				System.out.println("No hay poker");
			}
			return false;
		}
	}
}
