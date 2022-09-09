package ar.edu.unq.po2.tp3;

public class Rectangulo {
	private Point esquinaInferiorDerecha;
	private Point esquinaSuperiorIzquierda;
	
	public Rectangulo(Point esquinaInfDer, Point esquinaSupIzq) {
		this.setEsquinaInferiorDerecha(esquinaInfDer);
		this.setEsquinaSuperiorIzquierda(esquinaSupIzq);
	}
	
	public int perímetroDelCuadrado() {
		return this.sumaDelLadoSuperior() + this.sumaDelLadoSuperior() + this.sumaDelLadoDerecho() + this.sumaDelLadoDerecho();
	}
	
	public int sumaDelLadoSuperior() {
		return this.getEsquinaSuperiorIzquierda().getX() + this.getEsquinaInferiorDerecha().getX();
	}
	
	public int sumaDelLadoDerecho() {
		return this.getEsquinaInferiorDerecha().getY() + this.getEsquinaSuperiorIzquierda().getY();
	}

	public int areaDelRectangulo() {
		return this.alto() - this.ancho();
	}

	public int alto() {
		return this.getEsquinaInferiorDerecha().getY() - this.getEsquinaSuperiorIzquierda().getY();
	} 
	
	public int ancho() {
		return this.getEsquinaInferiorDerecha().getX() - this.getEsquinaSuperiorIzquierda().getX();
	}

	public Point getEsquinaInferiorDerecha() {
		return esquinaInferiorDerecha;
	}

	public void setEsquinaInferiorDerecha(Point esquinaInferiorDerecha) {
		this.esquinaInferiorDerecha = esquinaInferiorDerecha;
	}

	public Point getEsquinaSuperiorIzquierda() {
		return esquinaSuperiorIzquierda;
	}

	public void setEsquinaSuperiorIzquierda(Point esquinaSuperiorIzquierda) {
		this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
	}

	
}
