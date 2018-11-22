import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoordenadaTest {
	Coordenada test;
	@BeforeEach
	void setUp() throws Exception {
		test = new Coordenada(0,0);
	}

	@Test
	void testDistancia() {
		Coordenada b = new Coordenada(0,0);
		assertEquals(0, test.distancia(b));
	}

}
