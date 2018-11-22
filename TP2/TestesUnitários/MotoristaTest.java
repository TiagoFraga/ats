import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.GregorianCalendar;
import java.util.TreeSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl;

class MotoristaTest {
	Motorista m1,m2,m3;
	Viagem v1,v2,v3;
	Carro c1,c2,c3;
	
	@BeforeEach
	void setUp() throws Exception {
		c1 = new Carro(40,2.4,5,"23-34-OP",new Coordenada(3,4),false);
		c2 = new Carro(50,3.8,5,"23-34-OP",new Coordenada(3,4),false);
		c3 = new Carro(60,5.0,5,"23-34-OP",new Coordenada(3,4),false);
		m1 = new Motorista("a71625@di.uminho.pt","Nelson Arieira Parente","1234","Serreleis","7-01-1996",new TreeSet<Viagem>(),80,90,23,400.54,true,c1);
		m2 = new Motorista("a70938@di.uminho.pt","Diogo Meira Neves","1234","Largo das Neves","18-10-1995",new TreeSet<Viagem>(),50,0,23,400.54,true,c2);		
		m3 = new Motorista("a70111@di.uminho.pt","Gustavo Santos","1234","Querido Mudei a Casa","1-10-1965",new TreeSet<Viagem>(),20,40,23,400.54,true,c3);
		v1 = new Viagem(new Coordenada(0,0),new Coordenada(23,45),1.45,"ze@mail",new GregorianCalendar(2013,05,21),305.30,57.4);
		v2 = new Viagem(new Coordenada(30,0),new Coordenada(23,44),1.24,"zeca@mail",new GregorianCalendar(2014,05,24),460.04,21.4);
		v3 = new Viagem(new Coordenada(70,4),new Coordenada(3,45),5.25,"neves_o_motorista@mail",new GregorianCalendar(2016,12,21),34.67,9.27);
	}

	@Test
	void testAtualizaClassificacao() throws ValueOutOfBoundsException {
		//int classificacao1 = 103;
		int classificacao2 = 40;
		int classificacao3 = 60;
		//m.atualizaClassificacao(classificacao1);
		m2.atualizaClassificacao(classificacao2);
		m3.atualizaClassificacao(classificacao3);
		assertNotNull(m2.getClassificacao());
		assertNotNull(m3.getClassificacao());
		//assertEquals(35,m3.getClassificacao());
		//assertEquals(45,m2.getClassificacao());
	}

	@Test
	void testTempoViagem() {
		double distancia1 = 34.34;
		double distancia2 = 67.23;
		double distancia3 = 0.0;
		
		assertNotNull(m1.tempoViagem(34.34));
		assertNotNull(m2.tempoViagem(67.23));
		assertNotNull(m3.tempoViagem(0.0));
		assertEquals(0.8585,m1.tempoViagem(34.34));
		assertEquals(1.3446,m2.tempoViagem(67.23));
		assertEquals(0.0,m3.tempoViagem(0.0));
	}

	@Test
	void testPrecoViagem() {
		double distancia1 = 34.20;
		double distancia2 = 67.40;
		double distancia3 = 0.0;
		
		assertNotNull(m1.precoViagem(distancia1));
		assertNotNull(m2.precoViagem(distancia2));
		assertNotNull(m3.precoViagem(distancia3));
		assertEquals(82.08,m1.precoViagem(distancia1));
		assertEquals(256.12,m2.precoViagem(distancia2));
		assertEquals(0.0,m3.precoViagem(distancia3));
	}

	@Test
	void testAtualizaDados() {
		Motorista m1_aux = new Motorista("a71625@di.uminho.pt","Nelson Arieira Parente","1234","Serreleis","7-01-1996",new TreeSet<Viagem>(),80,90,23,400.54,true,new Carro(40,2.4,5,"23-34-OP",new Coordenada(3,4),false));
		Coordenada c = new Coordenada(27,35);
		double distancia_aux = 23.56;
		double grau = 0.50;
		double fidelidade = 0.67;
		m1_aux.atualizaDados(c, distancia_aux, grau, fidelidade);
		assertNotEquals(m1_aux,m1);
		assertNotEquals(m1.getGrau(),m1_aux.getGrau());
		assertNotEquals(m1.getKmsTotais(),m1_aux.getKmsTotais());
		assertNotEquals(m1.getVeiculo(),m1_aux.getKmsTotais());
		assertNotEquals(m1.getVeiculo().getCoordenadas(),m1_aux.getVeiculo().getCoordenadas());
		assertNotNull(m1_aux.getGrau());
		assertNotNull(m1_aux.getKmsTotais());
		assertNotNull(m1_aux.getVeiculo().getFiabilidade());
		assertNotNull(m1_aux.getVeiculo().getCoordenadas());
		
		
		
	}

	@Test
	void testTotalFaturado() {
		m1.registaViagem(v1);
		m1.registaViagem(v2);
		m1.registaViagem(v3);
		assertNotNull(m1.totalFaturado());
		assertNotNull(m2.totalFaturado());
		assertNotNull(m3.totalFaturado());
		assertEquals(800.01,m1.totalFaturado());
		assertEquals(0.0,m2.totalFaturado());
		assertEquals(0.0,m3.totalFaturado());
	}

	@Test
	void testTotalFaturadoGregorianCalendarGregorianCalendar() {
		GregorianCalendar data_1 = new GregorianCalendar(2013,5,20);
		GregorianCalendar data_2 = new GregorianCalendar(2013,5,27);
		GregorianCalendar data_3 = new GregorianCalendar(2000,1,1);
		GregorianCalendar data_4 = new GregorianCalendar(2000,1,2);
		m1.registaViagem(v1);
		m1.registaViagem(v2);
		m2.registaViagem(v3);
		assertNotNull(m1.totalFaturado(data_1, data_2));
		assertNotNull(m2.totalFaturado(data_3, data_4));
		assertEquals(305.30,m1.totalFaturado(data_1, data_2));
		assertEquals(0.0,m2.totalFaturado(data_3, data_4));
	}

}
