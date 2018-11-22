import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.TreeSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AtorTest {
	
	Cliente cliente1 , cliente2;
	Viagem v1, v2, v3;

	@BeforeEach
	void setUp() throws Exception {
		cliente1 = new Cliente("a70676@di.uminho.pt","Marcos de Morais Luis","1234","Bairro do malhao","31-07-1995",new TreeSet<Viagem>() , 765.34 );
		cliente2 = new Cliente("a70951@di.uminho.pt","Pedro Miguel Lopes Pereira","1234","Rua da Alegria","28-07-1995",new TreeSet<Viagem>(), 34.67 );
		v1 = new Viagem(new Coordenada(0,0),new Coordenada(23,45),1.45,"ze@mail",new GregorianCalendar(2013,05,21),305.30,57.4);
		v2 = new Viagem(new Coordenada(30,0),new Coordenada(23,44),1.24,"zeca@mail",new GregorianCalendar(2014,05,24),460.04,21.4);
		v3 = new Viagem(new Coordenada(70,4),new Coordenada(3,45),5.25,"neves_o_motorista@mail",new GregorianCalendar(2016,12,21),34.67,9.27);
	}

	@Test
	void testRegistaViagem() {
		TreeSet<Viagem> lista = new TreeSet<Viagem>();
		TreeSet<Viagem> lista2 = new TreeSet<Viagem>();
		lista.add(v1);
		lista.add(v2);
		cliente1.registaViagem(v1);
		cliente1.registaViagem(v2);
		assertNotNull(cliente1.getHistorico());
		assertEquals(lista,cliente1.getHistorico());
		assertEquals(lista2,cliente2.getHistorico());
		
	}

	@Test
	void testViagensEntreDatas() throws InvalidIntervalException {
		ArrayList<Viagem> lista1 = new ArrayList<Viagem>();
		ArrayList<Viagem> lista2 = new ArrayList<Viagem>();
		cliente1.registaViagem(v1);
		cliente1.registaViagem(v2);
		cliente2.registaViagem(v3);
		GregorianCalendar data_1 = new GregorianCalendar(2013,5,20);
		GregorianCalendar data_2 = new GregorianCalendar(2013,5,27);
		GregorianCalendar data_3 = new GregorianCalendar(2000,1,1);
		GregorianCalendar data_4 = new GregorianCalendar(2000,1,2);
		assertNotNull(cliente1.viagensEntreDatas(data_1,data_2));
		assertEquals(lista2,cliente2.viagensEntreDatas(data_3,data_4));
		//assertEquals(lista1,cliente1.viagensEntreDatas(data_1,data_2));
	}

	@Test
	void testMaiorDesvio() throws NenhumaViagemException {
		Viagem viagem1 = new Viagem(new Coordenada(0,0),new Coordenada(23,45),1.45,"ze@mail",new GregorianCalendar(2013,05,21),305.30,57.4);
		
		cliente1.registaViagem(v1);
		cliente1.registaViagem(v2);
		assertNotNull(cliente1.maiorDesvio());
		assertEquals(viagem1,cliente1.maiorDesvio());
		
	}

}
