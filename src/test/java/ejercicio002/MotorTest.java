package ejercicio002;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MotorTest {

	private Motor motor;
	@BeforeEach
	void setUp() throws Exception {
		motor = new Motor();
	}

	@Test
	void testPotencia() {
		boolean rango;
		int potencia = motor.potencia();
		if(potencia>=20 && potencia<=40) {
			rango = true;
		}else {
			rango = false;
		}
		
		assertEquals(true, rango, "La potencia es invalida");
	}

}
