package ar.edu.unq.po2.tp3;

public class Rectangulo {
	private Point x;
	private Point y;
	

	public int calcularAreaDelRectangulo() {
		return calcularAncho() * calcularAlto();
	}

	private int calcularAncho() {
		return 0;
	}

	public Point getX() {
		return x;
	}


	public void setX(Point x) {
		this.x = x;
	}


	public Point getY() {
		return y;
	}


	public void setY(Point y) {
		this.y = y;
	}
	
}
