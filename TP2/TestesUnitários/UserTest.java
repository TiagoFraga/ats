import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {

	@Test
	void testAdicionaAtor() {
		
		try {
			utilizadores.adiciona(t);
		} catch (EmailAlreadyInUseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true, utilizadores.getUtilizadores().containsKey("marcos@gmail.com"));
	}

	@Test
	void testTop5MotoristasComMaiorDesvio() {
		List<Motorista> r = utilizadores.top5MotoristasComMaiorDesvio();
		List<Motorista> aux = new ArrayList<>();
		assertEquals(aux,r);
		
	}

}
