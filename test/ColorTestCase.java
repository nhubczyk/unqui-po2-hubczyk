import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.Color;

class ColorTestCase {
	
	Color color;
	
	public void setUp() {
		new ColorTestCase().testSiguienteElemento();
	}
	
	@Test
	void testSiguienteElemento() {
		System.out.println(color.siguienteElemento(color));;
	}

}
