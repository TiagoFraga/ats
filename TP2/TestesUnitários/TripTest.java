import static org.junit.jupiter.api.Assertions.*;

import java.util.GregorianCalendar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TripTest {
	@Test
	void testGetcinicial() {
		int x = v.getcinicial().getX();
		int y = v.getcinicial().getY();
		assertEquals(0, x);
		assertEquals(1,y);
	}

	@Test
	void testCompareTo() {
		Viagem v1 = new Viagem (cinicial ,cfinal , 5.0 , "1", date, 2.0, 3.0);
		assertEquals(0,v.compareTo(v1));
		Viagem v2 = new Viagem (cinicial ,cfinal , 5.0 , "1", date, 2.0, 2.0);
		assertEquals(-1,v.compareTo(v2));
		
	}

}
