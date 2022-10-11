import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.PokerStatus;

class PokerStatusTestCase {
	PokerStatus poker;
	
	@BeforeEach
	public void setUp() throws Exception {
		poker = new PokerStatus();
		
	}
	
	@Test
	void testVerificarPoker() {
		
		assertTrue(poker.verificar("2P", "2C", "2D", "2T", "4C"));
		assertTrue(poker.verificar("2P", "2C", "2D", "2T", "2P"));
		assertTrue(poker.verificar("JP", "JC", "JD", "4T", "JP"));
		assertTrue(poker.verificar("JP", "JP", "JP", "JP", "2P"));
	}
	
	@Test
	void testVerificarNoHayPoker() {
		
		assertFalse(poker.verificar("2P", "2C", "2D", "2T", "4C"));
	}
	
    @AfterEach 
    public void tearDown() {   
    	
    }   

}
