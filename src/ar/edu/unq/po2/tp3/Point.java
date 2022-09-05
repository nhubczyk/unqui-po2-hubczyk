package ar.edu.unq.po2.tp3;

public class Point {
	private int x;
	private int y;
	
	//Constructor de Point.8.1
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	//Constructor de Point.8.2
	public Point() {
		x=0;
		y=0;
	}
	
	public void moverPoint(int otroX, int otroY) {
		setX(otroX);
		setY(otroY);
	}
	
	public Point sumarPunto(Point punto) {
		return new Point(this.x + punto.getX(), this.y + punto.getY());
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}
