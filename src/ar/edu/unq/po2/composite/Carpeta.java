package ar.edu.unq.po2.composite;

import java.util.ArrayList;
import java.util.List;

public class Carpeta extends ElementosFS {
	private List<ElementosFS> carpetasFileSystem = new ArrayList<ElementosFS>();
	
	@Override
	public int size() {
		return this.carpetasFileSystem.stream().mapToInt(elemento -> elemento.size()).sum();
	}
	
	public void addElementoFS(ElementosFS elemento) {
		this.carpetasFileSystem.add(elemento);
	}
	
	public void removeElementoFS(ElementosFS elemento) {
		this.carpetasFileSystem.remove(elemento);
	}
	
	public List<ElementosFS> getElementosFS() {
		return this.carpetasFileSystem;
	}

}
