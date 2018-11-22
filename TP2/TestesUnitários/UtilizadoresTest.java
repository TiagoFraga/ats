import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UtilizadoresTest {
	private Utilizadores utilizadores;
	private Map<String,Ator> atores;
	Motorista t;
	Motorista r;
	
	@BeforeEach
	void setUp() throws Exception {
		atores = new HashMap<>();
		Set a = new TreeSet<>();
		Veiculo v = new Carro();
		 r = new Motorista();
		 t = new Motorista ("marcos@gmail.com", "Marcos", "123", "Morada", "", a, 0,0,0,0.0,true,v);
		utilizadores = new Utilizadores(atores);
	}

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
/*
	@Test
	void testAdicionaStringStringStringStringStringVeiculo() {
		fail("Not yet implemented");
	}

	@Test
	void testTop10ClientesGastadores() {
		fail("Not yet implemented");
	}
*/
	@Test
	void testTop5MotoristasComMaiorDesvio() {
		List<Motorista> r = utilizadores.top5MotoristasComMaiorDesvio();
		List<Motorista> aux = new ArrayList<>();
		assertEquals(aux,r);
		
	}

}
