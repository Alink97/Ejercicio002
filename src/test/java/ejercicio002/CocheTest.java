package ejercicio002;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CocheTest {

	private Coche car; 
	
	@BeforeEach
	void setUp() throws Exception {
		car = new Coche();
	}

	@Test
	void testArranque() {
		car.arrancar();
	}

}
