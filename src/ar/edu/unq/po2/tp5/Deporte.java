package ar.edu.unq.po2.tp5;

public enum Deporte {
	RUNNIG(1),
	FUTBOL(2),
	BASKET(2),
	TENNIS(3),
	JABALINA(4);

	int complejidad;
	
	Deporte(int i) {
		this.complejidad=i;
	}
}
