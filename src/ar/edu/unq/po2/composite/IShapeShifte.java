package ar.edu.unq.po2.composite;

import java.util.List;

public interface IShapeShifte {
	
	public IShapeShifter compose(IShapeShifter isHapeShifter);
	
	public int deepest();
	
	public IShapeShifter flat();
	
	public List<Integer> values();
}
