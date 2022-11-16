package ar.edu.unq.po2.composite;

public class Archivo extends ElementosFS {
	private int bytes;
	
	@Override
	public int size() {
		return 3000;
	}

	public int getBytes() {
		return bytes;
	}

}
