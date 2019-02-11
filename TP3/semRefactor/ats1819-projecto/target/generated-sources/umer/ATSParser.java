// Generated from /Users/tiagofraga/Desktop/Complementares/ATS/Trabalhos/Local/TP2/ats1819-projecto/src/antlr4/ATS.g4 by ANTLR 4.7

  package umer;
  import java.awt.geom.Point2D;
  import java.time.LocalDate;
  import java.time.format.DateTimeFormatter;
  import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ATSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, MAIL=17, 
		LETRA=18, CHAR=19, PONTO=20, VIRGULA=21, PONTO_VIRGULA=22, MENOS=23, NUMERO=24, 
		WS=25;
	public static final int
		RULE_log = 0, RULE_evento = 1, RULE_matricula = 2, RULE_localizacao = 3, 
		RULE_nome = 4, RULE_morada = 5, RULE_cod_postal = 6, RULE_nascimento = 7, 
		RULE_empresa = 8, RULE_palavra = 9, RULE_palavra_numero = 10, RULE_password = 11;
	public static final String[] ruleNames = {
		"log", "evento", "matricula", "localizacao", "nome", "morada", "cod_postal", 
		"nascimento", "empresa", "palavra", "palavra_numero", "password"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'logout'", "'recusar viagem'", "'viajar'", "'solicitar'", "'('", 
		"')'", "'login'", "'\"'", "'registar empresa'", "'registar condutor'", 
		"'registar cliente'", "'registar helicoptero'", "'empresa'", "'registar carrinha'", 
		"'registar carro'", "'registar mota'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "MAIL", "LETRA", "CHAR", "PONTO", "VIRGULA", 
		"PONTO_VIRGULA", "MENOS", "NUMERO", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ATS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  umer.UMeR umer = new umer.UMeR();
	  umer.User utilizador = null;
	  
	  private String unquote(String str) {
	    return str.substring(1,str.length()-1);
	  }

	public ATSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LogContext extends ParserRuleContext {
		public List<EventoContext> evento() {
			return getRuleContexts(EventoContext.class);
		}
		public EventoContext evento(int i) {
			return getRuleContext(EventoContext.class,i);
		}
		public TerminalNode EOF() { return getToken(ATSParser.EOF, 0); }
		public LogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).exitLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ATSVisitor ) return ((ATSVisitor<? extends T>)visitor).visitLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogContext log() throws RecognitionException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_log);
		int _la;
		try {
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
					{
					{
					setState(24);
					evento();
					}
					}
					setState(29);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventoContext extends ParserRuleContext {
		public LocalizacaoContext localizacao;
		public Token MAIL;
		public EmpresaContext empresa;
		public PasswordContext password;
		public NomeContext nome;
		public MoradaContext morada;
		public NascimentoContext nascimento;
		public Token NUMERO;
		public MatriculaContext matricula;
		public TerminalNode PONTO_VIRGULA() { return getToken(ATSParser.PONTO_VIRGULA, 0); }
		public LocalizacaoContext localizacao() {
			return getRuleContext(LocalizacaoContext.class,0);
		}
		public TerminalNode MAIL() { return getToken(ATSParser.MAIL, 0); }
		public PasswordContext password() {
			return getRuleContext(PasswordContext.class,0);
		}
		public EmpresaContext empresa() {
			return getRuleContext(EmpresaContext.class,0);
		}
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public MoradaContext morada() {
			return getRuleContext(MoradaContext.class,0);
		}
		public NascimentoContext nascimento() {
			return getRuleContext(NascimentoContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(ATSParser.NUMERO, 0); }
		public MatriculaContext matricula() {
			return getRuleContext(MatriculaContext.class,0);
		}
		public EventoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).enterEvento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).exitEvento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ATSVisitor ) return ((ATSVisitor<? extends T>)visitor).visitEvento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventoContext evento() throws RecognitionException {
		EventoContext _localctx = new EventoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_evento);
		int _la;
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(T__0);
				setState(34);
				match(PONTO_VIRGULA);

				          utilizador = null;
				          System.out.print("LOGOUT: Sucesso");
				          System.out.println("\n");
				         
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(T__1);
				setState(37);
				match(PONTO_VIRGULA);

				          System.out.println("RECUSAR VIAGEM");
				          System.out.println("\n");
				          
				         
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				match(T__2);
				setState(40);
				match(PONTO_VIRGULA);

				          if(utilizador!=null){
				           Boolean bol=false;
				           umer.Driver driver = (umer.Driver) utilizador;
				           bol = umer.doTripQueue(driver.getEmail());
				           if(bol == false){
				            System.out.println("VIAJAR: Erro a realizar a viagem, condutor: "+driver.getEmail());
				            System.out.println("\n");
				           }else{
				            System.out.println("VIAJAR: Viagem efetuada com sucesso, condutor: "+driver.getEmail());
				            System.out.println("\n");
				           }
				          }                              
				         
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				match(T__3);
				setState(43);
				match(T__4);
				setState(44);
				((EventoContext)_localctx).localizacao = localizacao();
				setState(45);
				match(T__5);
				setState(46);
				match(PONTO_VIRGULA);

				          if(utilizador!= null){
				            umer.Client cliente = (umer.Client) utilizador;
				            String string = (((EventoContext)_localctx).localizacao!=null?_input.getText(((EventoContext)_localctx).localizacao.start,((EventoContext)_localctx).localizacao.stop):null);
				            String[] parts = string.split(",");
				            double x = Double.parseDouble(parts[0]);
				            double y = Double.parseDouble(parts[1]);
				            Point2D.Double position = new Point2D.Double (x,y);
				            //umer.newTripClosest(cliente,position);
				            System.out.println("SOLICITAR: Sucesso");
				            System.out.println("\n");
				          }else{
				            System.out.println("SOLICITAR: Erro");
				            System.out.println("\n");
				          }
				         
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				match(T__6);
				setState(50);
				match(T__7);
				setState(51);
				((EventoContext)_localctx).MAIL = match(MAIL);
				setState(52);
				match(T__7);
				setState(53);
				match(T__7);
				setState(54);
				password();
				setState(55);
				match(T__7);
				setState(56);
				match(PONTO_VIRGULA);

				          HashMap <String, umer.User> list = umer.allUsers();
				          if(list.containsKey((((EventoContext)_localctx).MAIL!=null?((EventoContext)_localctx).MAIL.getText():null))){
				              utilizador = list.get((((EventoContext)_localctx).MAIL!=null?((EventoContext)_localctx).MAIL.getText():null));
				              System.out.println("LOGIN : Sucesso! " + utilizador.getEmail());
				              System.out.println("\n");
				          }else{
				              System.out.print("LOGIN : ERRO");
				              System.out.println("\n");
				          }
				         
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				match(T__8);
				setState(60);
				match(T__7);
				setState(61);
				((EventoContext)_localctx).empresa = empresa();
				setState(62);
				match(T__7);
				setState(63);
				match(T__7);
				setState(64);
				((EventoContext)_localctx).password = password();
				setState(65);
				match(T__7);
				setState(66);
				match(PONTO_VIRGULA);

				          Boolean bol;
				          bol = umer.registerCompany((((EventoContext)_localctx).empresa!=null?_input.getText(((EventoContext)_localctx).empresa.start,((EventoContext)_localctx).empresa.stop):null),(((EventoContext)_localctx).password!=null?_input.getText(((EventoContext)_localctx).password.start,((EventoContext)_localctx).password.stop):null));
				          System.out.print("REGISTAR EMPRESA: " + (((EventoContext)_localctx).empresa!=null?_input.getText(((EventoContext)_localctx).empresa.start,((EventoContext)_localctx).empresa.stop):null) + " -> " + bol);
				          System.out.println("\n");
				         
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
				match(T__9);
				setState(70);
				match(T__7);
				setState(71);
				((EventoContext)_localctx).MAIL = match(MAIL);
				setState(72);
				match(T__7);
				setState(73);
				match(T__7);
				setState(74);
				((EventoContext)_localctx).nome = nome();
				setState(75);
				match(T__7);
				setState(76);
				match(T__7);
				setState(77);
				((EventoContext)_localctx).password = password();
				setState(78);
				match(T__7);
				setState(79);
				match(T__7);
				setState(80);
				((EventoContext)_localctx).morada = morada();
				setState(81);
				match(T__7);
				setState(82);
				((EventoContext)_localctx).nascimento = nascimento();
				setState(83);
				((EventoContext)_localctx).NUMERO = match(NUMERO);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(84);
					match(T__7);
					setState(85);
					((EventoContext)_localctx).empresa = empresa();
					setState(86);
					match(T__7);
					}
				}

				setState(90);
				match(PONTO_VIRGULA);

				          Boolean bol;
				          DateTimeFormatter formatto = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				          LocalDate data = LocalDate.parse((((EventoContext)_localctx).nascimento!=null?_input.getText(((EventoContext)_localctx).nascimento.start,((EventoContext)_localctx).nascimento.stop):null), formatto);
				          umer.Driver d = new umer.Driver((((EventoContext)_localctx).MAIL!=null?((EventoContext)_localctx).MAIL.getText():null),(((EventoContext)_localctx).nome!=null?_input.getText(((EventoContext)_localctx).nome.start,((EventoContext)_localctx).nome.stop):null),(((EventoContext)_localctx).password!=null?_input.getText(((EventoContext)_localctx).password.start,((EventoContext)_localctx).password.stop):null),(((EventoContext)_localctx).morada!=null?_input.getText(((EventoContext)_localctx).morada.start,((EventoContext)_localctx).morada.stop):null), data,(double)(((EventoContext)_localctx).NUMERO!=null?Integer.valueOf(((EventoContext)_localctx).NUMERO.getText()):0),(((EventoContext)_localctx).empresa!=null?_input.getText(((EventoContext)_localctx).empresa.start,((EventoContext)_localctx).empresa.stop):null));
				          bol = umer.registerUser((umer.User) d, (((EventoContext)_localctx).empresa!=null?_input.getText(((EventoContext)_localctx).empresa.start,((EventoContext)_localctx).empresa.stop):null));
				          System.out.print("REGISTAR CONDUTOR: " + (((EventoContext)_localctx).MAIL!=null?((EventoContext)_localctx).MAIL.getText():null) + " -> " + bol);
				          System.out.println("\n");
				          
				         
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 8);
				{
				setState(93);
				match(T__10);
				setState(94);
				match(T__7);
				setState(95);
				((EventoContext)_localctx).MAIL = match(MAIL);
				setState(96);
				match(T__7);
				setState(97);
				match(T__7);
				setState(98);
				((EventoContext)_localctx).nome = nome();
				setState(99);
				match(T__7);
				setState(100);
				match(T__7);
				setState(101);
				((EventoContext)_localctx).password = password();
				setState(102);
				match(T__7);
				setState(103);
				match(T__7);
				setState(104);
				((EventoContext)_localctx).morada = morada();
				setState(105);
				match(T__7);
				setState(106);
				((EventoContext)_localctx).nascimento = nascimento();
				setState(107);
				match(T__4);
				setState(108);
				localizacao();
				setState(109);
				match(T__5);
				setState(110);
				match(PONTO_VIRGULA);

				           Boolean bol;
				           DateTimeFormatter formatto = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				           LocalDate data = LocalDate.parse((((EventoContext)_localctx).nascimento!=null?_input.getText(((EventoContext)_localctx).nascimento.start,((EventoContext)_localctx).nascimento.stop):null), formatto);
				           umer.Client c = new umer.Client((((EventoContext)_localctx).MAIL!=null?((EventoContext)_localctx).MAIL.getText():null), (((EventoContext)_localctx).nome!=null?_input.getText(((EventoContext)_localctx).nome.start,((EventoContext)_localctx).nome.stop):null),(((EventoContext)_localctx).password!=null?_input.getText(((EventoContext)_localctx).password.start,((EventoContext)_localctx).password.stop):null), (((EventoContext)_localctx).morada!=null?_input.getText(((EventoContext)_localctx).morada.start,((EventoContext)_localctx).morada.stop):null),data);
				           bol = umer.registerUser((umer.User) c, null);
				           System.out.print("REGISTAR CLIENTE: " + (((EventoContext)_localctx).MAIL!=null?((EventoContext)_localctx).MAIL.getText():null) + " -> " + bol);
				           System.out.println("\n");
				         
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 9);
				{
				setState(113);
				match(T__11);
				setState(114);
				match(T__7);
				setState(115);
				((EventoContext)_localctx).matricula = matricula();
				setState(116);
				match(T__7);
				setState(117);
				((EventoContext)_localctx).NUMERO = match(NUMERO);
				setState(118);
				match(T__4);
				setState(119);
				((EventoContext)_localctx).localizacao = localizacao();
				setState(120);
				match(T__5);
				setState(129);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__7:
					{
					setState(121);
					match(T__7);
					setState(122);
					((EventoContext)_localctx).MAIL = match(MAIL);
					setState(123);
					match(T__7);
					}
					break;
				case T__12:
					{
					setState(124);
					match(T__12);
					setState(125);
					match(T__7);
					setState(126);
					((EventoContext)_localctx).empresa = empresa();
					setState(127);
					match(T__7);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(131);
				match(PONTO_VIRGULA);

				           Boolean bol;
				           String string = (((EventoContext)_localctx).localizacao!=null?_input.getText(((EventoContext)_localctx).localizacao.start,((EventoContext)_localctx).localizacao.stop):null);
				           String[] parts = string.split(",");
				           double x = Double.parseDouble(parts[0]);
				           double y = Double.parseDouble(parts[1]);
				           Point2D.Double position = new Point2D.Double (x,y);
				           if((((EventoContext)_localctx).empresa!=null?_input.getText(((EventoContext)_localctx).empresa.start,((EventoContext)_localctx).empresa.stop):null) ==null){
				              umer.Helicopter heli = new umer.Helicopter((((EventoContext)_localctx).matricula!=null?_input.getText(((EventoContext)_localctx).matricula.start,((EventoContext)_localctx).matricula.stop):null), (((EventoContext)_localctx).NUMERO!=null?Integer.valueOf(((EventoContext)_localctx).NUMERO.getText()):0), position, (((EventoContext)_localctx).MAIL!=null?((EventoContext)_localctx).MAIL.getText():null));
				              bol = umer.registerVehicleP((umer.Vehicle) heli);
				              System.out.print("REGISTAR HELICOPTERO Privado: " + (((EventoContext)_localctx).matricula!=null?_input.getText(((EventoContext)_localctx).matricula.start,((EventoContext)_localctx).matricula.stop):null) + " -> " + bol);
				              System.out.println("\n");
				              
				           }
				           else{
				              umer.Helicopter heli = new umer.Helicopter((((EventoContext)_localctx).matricula!=null?_input.getText(((EventoContext)_localctx).matricula.start,((EventoContext)_localctx).matricula.stop):null), (((EventoContext)_localctx).NUMERO!=null?Integer.valueOf(((EventoContext)_localctx).NUMERO.getText()):0), position, (((EventoContext)_localctx).empresa!=null?_input.getText(((EventoContext)_localctx).empresa.start,((EventoContext)_localctx).empresa.stop):null));
				              bol = umer.registerCompanyVehicle((((EventoContext)_localctx).empresa!=null?_input.getText(((EventoContext)_localctx).empresa.start,((EventoContext)_localctx).empresa.stop):null),(umer.Vehicle) heli);
				              System.out.print("REGISTAR HELICOPTERO Empresa: " + (((EventoContext)_localctx).matricula!=null?_input.getText(((EventoContext)_localctx).matricula.start,((EventoContext)_localctx).matricula.stop):null) + " -> " + bol);
				              System.out.println("\n");
				           } 
				         
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 10);
				{
				setState(134);
				match(T__13);
				setState(135);
				match(T__7);
				setState(136);
				((EventoContext)_localctx).matricula = matricula();
				setState(137);
				match(T__7);
				setState(138);
				((EventoContext)_localctx).NUMERO = match(NUMERO);
				setState(139);
				match(T__4);
				setState(140);
				((EventoContext)_localctx).localizacao = localizacao();
				setState(141);
				match(T__5);
				setState(150);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__7:
					{
					setState(142);
					match(T__7);
					setState(143);
					((EventoContext)_localctx).MAIL = match(MAIL);
					setState(144);
					match(T__7);
					}
					break;
				case T__12:
					{
					setState(145);
					match(T__12);
					setState(146);
					match(T__7);
					setState(147);
					((EventoContext)_localctx).empresa = empresa();
					setState(148);
					match(T__7);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(152);
				match(PONTO_VIRGULA);

				           Boolean bol;
				           String string = (((EventoContext)_localctx).localizacao!=null?_input.getText(((EventoContext)_localctx).localizacao.start,((EventoContext)_localctx).localizacao.stop):null);
				           String[] parts = string.split(",");
				           double x = Double.parseDouble(parts[0]);
				           double y = Double.parseDouble(parts[1]);
				           Point2D.Double position = new Point2D.Double (x,y);
				           if((((EventoContext)_localctx).empresa!=null?_input.getText(((EventoContext)_localctx).empresa.start,((EventoContext)_localctx).empresa.stop):null) ==null){
				              umer.Van van = new umer.Van((((EventoContext)_localctx).matricula!=null?_input.getText(((EventoContext)_localctx).matricula.start,((EventoContext)_localctx).matricula.stop):null), (((EventoContext)_localctx).NUMERO!=null?Integer.valueOf(((EventoContext)_localctx).NUMERO.getText()):0), position, (((EventoContext)_localctx).MAIL!=null?((EventoContext)_localctx).MAIL.getText():null));
				              bol = umer.registerVehicleP((umer.Vehicle) van);
				              System.out.print("REGISTAR VAN Privado: " + (((EventoContext)_localctx).matricula!=null?_input.getText(((EventoContext)_localctx).matricula.start,((EventoContext)_localctx).matricula.stop):null) + " -> " + bol);
				              System.out.println("\n");
				              
				           }
				           else{
				              umer.Van van = new umer.Van((((EventoContext)_localctx).matricula!=null?_input.getText(((EventoContext)_localctx).matricula.start,((EventoContext)_localctx).matricula.stop):null), (((EventoContext)_localctx).NUMERO!=null?Integer.valueOf(((EventoContext)_localctx).NUMERO.getText()):0), position, (((EventoContext)_localctx).empresa!=null?_input.getText(((EventoContext)_localctx).empresa.start,((EventoContext)_localctx).empresa.stop):null));
				              bol = umer.registerCompanyVehicle((((EventoContext)_localctx).empresa!=null?_input.getText(((EventoContext)_localctx).empresa.start,((EventoContext)_localctx).empresa.stop):null),(umer.Vehicle) van);
				              System.out.print("REGISTAR VAN Empresa: " + (((EventoContext)_localctx).matricula!=null?_input.getText(((EventoContext)_localctx).matricula.start,((EventoContext)_localctx).matricula.stop):null) + " -> " + bol);
				              System.out.println("\n");
				           } 
				         
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 11);
				{
				setState(155);
				match(T__14);
				setState(156);
				match(T__7);
				setState(157);
				((EventoContext)_localctx).matricula = matricula();
				setState(158);
				match(T__7);
				setState(159);
				((EventoContext)_localctx).NUMERO = match(NUMERO);
				setState(160);
				match(T__4);
				setState(161);
				((EventoContext)_localctx).localizacao = localizacao();
				setState(162);
				match(T__5);
				setState(171);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__7:
					{
					setState(163);
					match(T__7);
					setState(164);
					((EventoContext)_localctx).MAIL = match(MAIL);
					setState(165);
					match(T__7);
					}
					break;
				case T__12:
					{
					setState(166);
					match(T__12);
					setState(167);
					match(T__7);
					setState(168);
					((EventoContext)_localctx).empresa = empresa();
					setState(169);
					match(T__7);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(173);
				match(PONTO_VIRGULA);

				           Boolean bol;
				           String string = (((EventoContext)_localctx).localizacao!=null?_input.getText(((EventoContext)_localctx).localizacao.start,((EventoContext)_localctx).localizacao.stop):null);
				           String[] parts = string.split(",");
				           double x = Double.parseDouble(parts[0]);
				           double y = Double.parseDouble(parts[1]);
				           Point2D.Double position = new Point2D.Double (x,y);
				           if((((EventoContext)_localctx).empresa!=null?_input.getText(((EventoContext)_localctx).empresa.start,((EventoContext)_localctx).empresa.stop):null) ==null){
				                umer.Car car = new umer.Car((((EventoContext)_localctx).matricula!=null?_input.getText(((EventoContext)_localctx).matricula.start,((EventoContext)_localctx).matricula.stop):null), (((EventoContext)_localctx).NUMERO!=null?Integer.valueOf(((EventoContext)_localctx).NUMERO.getText()):0), position, (((EventoContext)_localctx).MAIL!=null?((EventoContext)_localctx).MAIL.getText():null));
				                bol = umer.registerVehicleP((umer.Vehicle) car);
				                System.out.print("REGISTAR CARRO Privado: " + (((EventoContext)_localctx).matricula!=null?_input.getText(((EventoContext)_localctx).matricula.start,((EventoContext)_localctx).matricula.stop):null) + " -> " + bol);
				                System.out.println("\n");
				              
				           }
				           else{
				                umer.Car car = new umer.Car((((EventoContext)_localctx).matricula!=null?_input.getText(((EventoContext)_localctx).matricula.start,((EventoContext)_localctx).matricula.stop):null), (((EventoContext)_localctx).NUMERO!=null?Integer.valueOf(((EventoContext)_localctx).NUMERO.getText()):0), position, (((EventoContext)_localctx).empresa!=null?_input.getText(((EventoContext)_localctx).empresa.start,((EventoContext)_localctx).empresa.stop):null));
				                bol = umer.registerCompanyVehicle((((EventoContext)_localctx).empresa!=null?_input.getText(((EventoContext)_localctx).empresa.start,((EventoContext)_localctx).empresa.stop):null),(umer.Vehicle) car);
				                System.out.print("REGISTAR CARRO Empresa: " + (((EventoContext)_localctx).matricula!=null?_input.getText(((EventoContext)_localctx).matricula.start,((EventoContext)_localctx).matricula.stop):null) + " -> " + bol);
				                System.out.println("\n");
				           } 
				         
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 12);
				{
				setState(176);
				match(T__15);
				setState(177);
				match(T__7);
				setState(178);
				((EventoContext)_localctx).matricula = matricula();
				setState(179);
				match(T__7);
				setState(180);
				((EventoContext)_localctx).NUMERO = match(NUMERO);
				setState(181);
				match(T__4);
				setState(182);
				((EventoContext)_localctx).localizacao = localizacao();
				setState(183);
				match(T__5);
				setState(192);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__7:
					{
					setState(184);
					match(T__7);
					setState(185);
					((EventoContext)_localctx).MAIL = match(MAIL);
					setState(186);
					match(T__7);
					}
					break;
				case T__12:
					{
					setState(187);
					match(T__12);
					setState(188);
					match(T__7);
					setState(189);
					((EventoContext)_localctx).empresa = empresa();
					setState(190);
					match(T__7);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(194);
				match(PONTO_VIRGULA);

				           Boolean bol;
				           String string = (((EventoContext)_localctx).localizacao!=null?_input.getText(((EventoContext)_localctx).localizacao.start,((EventoContext)_localctx).localizacao.stop):null);
				           String[] parts = string.split(",");
				           double x = Double.parseDouble(parts[0]);
				           double y = Double.parseDouble(parts[1]);
				           Point2D.Double position = new Point2D.Double (x,y);
				           if((((EventoContext)_localctx).empresa!=null?_input.getText(((EventoContext)_localctx).empresa.start,((EventoContext)_localctx).empresa.stop):null) ==null){
				               umer.Bike bike = new umer.Bike((((EventoContext)_localctx).matricula!=null?_input.getText(((EventoContext)_localctx).matricula.start,((EventoContext)_localctx).matricula.stop):null), (((EventoContext)_localctx).NUMERO!=null?Integer.valueOf(((EventoContext)_localctx).NUMERO.getText()):0), position, (((EventoContext)_localctx).MAIL!=null?((EventoContext)_localctx).MAIL.getText():null));
				               bol = umer.registerVehicleP((umer.Vehicle) bike);
				               System.out.print("REGISTAR MOTA Privado: " + (((EventoContext)_localctx).matricula!=null?_input.getText(((EventoContext)_localctx).matricula.start,((EventoContext)_localctx).matricula.stop):null) + " -> " + bol);
				               System.out.println("\n");
				              
				           }
				           else{
				               umer.Bike bike = new umer.Bike((((EventoContext)_localctx).matricula!=null?_input.getText(((EventoContext)_localctx).matricula.start,((EventoContext)_localctx).matricula.stop):null), (((EventoContext)_localctx).NUMERO!=null?Integer.valueOf(((EventoContext)_localctx).NUMERO.getText()):0), position, (((EventoContext)_localctx).empresa!=null?_input.getText(((EventoContext)_localctx).empresa.start,((EventoContext)_localctx).empresa.stop):null));
				               bol = umer.registerCompanyVehicle((((EventoContext)_localctx).empresa!=null?_input.getText(((EventoContext)_localctx).empresa.start,((EventoContext)_localctx).empresa.stop):null),(umer.Vehicle) bike);
				               System.out.print("REGISTAR MOTA Empresa: " + (((EventoContext)_localctx).matricula!=null?_input.getText(((EventoContext)_localctx).matricula.start,((EventoContext)_localctx).matricula.stop):null) + " -> " + bol);
				               System.out.println("\n");
				           } 
				         
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatriculaContext extends ParserRuleContext {
		public List<TerminalNode> NUMERO() { return getTokens(ATSParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(ATSParser.NUMERO, i);
		}
		public List<TerminalNode> MENOS() { return getTokens(ATSParser.MENOS); }
		public TerminalNode MENOS(int i) {
			return getToken(ATSParser.MENOS, i);
		}
		public List<TerminalNode> LETRA() { return getTokens(ATSParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(ATSParser.LETRA, i);
		}
		public MatriculaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matricula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).enterMatricula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).exitMatricula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ATSVisitor ) return ((ATSVisitor<? extends T>)visitor).visitMatricula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatriculaContext matricula() throws RecognitionException {
		MatriculaContext _localctx = new MatriculaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_matricula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(NUMERO);
			setState(200);
			match(MENOS);
			setState(201);
			match(LETRA);
			setState(202);
			match(LETRA);
			setState(203);
			match(MENOS);
			setState(204);
			match(NUMERO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalizacaoContext extends ParserRuleContext {
		public List<TerminalNode> NUMERO() { return getTokens(ATSParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(ATSParser.NUMERO, i);
		}
		public List<TerminalNode> PONTO() { return getTokens(ATSParser.PONTO); }
		public TerminalNode PONTO(int i) {
			return getToken(ATSParser.PONTO, i);
		}
		public TerminalNode VIRGULA() { return getToken(ATSParser.VIRGULA, 0); }
		public LocalizacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localizacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).enterLocalizacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).exitLocalizacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ATSVisitor ) return ((ATSVisitor<? extends T>)visitor).visitLocalizacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalizacaoContext localizacao() throws RecognitionException {
		LocalizacaoContext _localctx = new LocalizacaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_localizacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(NUMERO);
			setState(207);
			match(PONTO);
			setState(208);
			match(NUMERO);
			setState(209);
			match(VIRGULA);
			setState(210);
			match(NUMERO);
			setState(211);
			match(PONTO);
			setState(212);
			match(NUMERO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NomeContext extends ParserRuleContext {
		public List<PalavraContext> palavra() {
			return getRuleContexts(PalavraContext.class);
		}
		public PalavraContext palavra(int i) {
			return getRuleContext(PalavraContext.class,i);
		}
		public NomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).enterNome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).exitNome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ATSVisitor ) return ((ATSVisitor<? extends T>)visitor).visitNome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeContext nome() throws RecognitionException {
		NomeContext _localctx = new NomeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nome);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(214);
				palavra();
				}
				}
				setState(217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETRA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MoradaContext extends ParserRuleContext {
		public List<TerminalNode> VIRGULA() { return getTokens(ATSParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(ATSParser.VIRGULA, i);
		}
		public TerminalNode NUMERO() { return getToken(ATSParser.NUMERO, 0); }
		public Cod_postalContext cod_postal() {
			return getRuleContext(Cod_postalContext.class,0);
		}
		public List<Palavra_numeroContext> palavra_numero() {
			return getRuleContexts(Palavra_numeroContext.class);
		}
		public Palavra_numeroContext palavra_numero(int i) {
			return getRuleContext(Palavra_numeroContext.class,i);
		}
		public List<TerminalNode> CHAR() { return getTokens(ATSParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(ATSParser.CHAR, i);
		}
		public List<TerminalNode> MENOS() { return getTokens(ATSParser.MENOS); }
		public TerminalNode MENOS(int i) {
			return getToken(ATSParser.MENOS, i);
		}
		public List<TerminalNode> PONTO() { return getTokens(ATSParser.PONTO); }
		public TerminalNode PONTO(int i) {
			return getToken(ATSParser.PONTO, i);
		}
		public MoradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_morada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).enterMorada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).exitMorada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ATSVisitor ) return ((ATSVisitor<? extends T>)visitor).visitMorada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoradaContext morada() throws RecognitionException {
		MoradaContext _localctx = new MoradaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_morada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETRA) | (1L << CHAR) | (1L << PONTO) | (1L << MENOS) | (1L << NUMERO))) != 0)) {
				{
				setState(223); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(223);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LETRA:
					case NUMERO:
						{
						setState(219);
						palavra_numero();
						}
						break;
					case CHAR:
						{
						setState(220);
						match(CHAR);
						}
						break;
					case MENOS:
						{
						setState(221);
						match(MENOS);
						}
						break;
					case PONTO:
						{
						setState(222);
						match(PONTO);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(225); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETRA) | (1L << CHAR) | (1L << PONTO) | (1L << MENOS) | (1L << NUMERO))) != 0) );
				}
			}

			setState(229);
			match(VIRGULA);
			setState(230);
			match(NUMERO);
			setState(231);
			match(VIRGULA);
			setState(232);
			cod_postal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cod_postalContext extends ParserRuleContext {
		public List<TerminalNode> NUMERO() { return getTokens(ATSParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(ATSParser.NUMERO, i);
		}
		public List<TerminalNode> MENOS() { return getTokens(ATSParser.MENOS); }
		public TerminalNode MENOS(int i) {
			return getToken(ATSParser.MENOS, i);
		}
		public List<Palavra_numeroContext> palavra_numero() {
			return getRuleContexts(Palavra_numeroContext.class);
		}
		public Palavra_numeroContext palavra_numero(int i) {
			return getRuleContext(Palavra_numeroContext.class,i);
		}
		public List<TerminalNode> CHAR() { return getTokens(ATSParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(ATSParser.CHAR, i);
		}
		public Cod_postalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cod_postal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).enterCod_postal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).exitCod_postal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ATSVisitor ) return ((ATSVisitor<? extends T>)visitor).visitCod_postal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cod_postalContext cod_postal() throws RecognitionException {
		Cod_postalContext _localctx = new Cod_postalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cod_postal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(NUMERO);
			setState(235);
			match(MENOS);
			setState(236);
			match(NUMERO);
			setState(242); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(242);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LETRA:
				case NUMERO:
					{
					setState(237);
					palavra_numero();
					}
					break;
				case MENOS:
					{
					setState(238);
					match(MENOS);
					}
					break;
				case CHAR:
					{
					setState(239);
					match(CHAR);
					}
					break;
				case T__4:
					{
					setState(240);
					match(T__4);
					}
					break;
				case T__5:
					{
					setState(241);
					match(T__5);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(244); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << LETRA) | (1L << CHAR) | (1L << MENOS) | (1L << NUMERO))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NascimentoContext extends ParserRuleContext {
		public List<TerminalNode> NUMERO() { return getTokens(ATSParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(ATSParser.NUMERO, i);
		}
		public List<TerminalNode> MENOS() { return getTokens(ATSParser.MENOS); }
		public TerminalNode MENOS(int i) {
			return getToken(ATSParser.MENOS, i);
		}
		public NascimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nascimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).enterNascimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).exitNascimento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ATSVisitor ) return ((ATSVisitor<? extends T>)visitor).visitNascimento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NascimentoContext nascimento() throws RecognitionException {
		NascimentoContext _localctx = new NascimentoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nascimento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(NUMERO);
			setState(247);
			match(MENOS);
			setState(248);
			match(NUMERO);
			setState(249);
			match(MENOS);
			setState(250);
			match(NUMERO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmpresaContext extends ParserRuleContext {
		public List<Palavra_numeroContext> palavra_numero() {
			return getRuleContexts(Palavra_numeroContext.class);
		}
		public Palavra_numeroContext palavra_numero(int i) {
			return getRuleContext(Palavra_numeroContext.class,i);
		}
		public EmpresaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empresa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).enterEmpresa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).exitEmpresa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ATSVisitor ) return ((ATSVisitor<? extends T>)visitor).visitEmpresa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmpresaContext empresa() throws RecognitionException {
		EmpresaContext _localctx = new EmpresaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_empresa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(252);
				palavra_numero();
				}
				}
				setState(255); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETRA || _la==NUMERO );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PalavraContext extends ParserRuleContext {
		public List<TerminalNode> LETRA() { return getTokens(ATSParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(ATSParser.LETRA, i);
		}
		public PalavraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palavra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).enterPalavra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).exitPalavra(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ATSVisitor ) return ((ATSVisitor<? extends T>)visitor).visitPalavra(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalavraContext palavra() throws RecognitionException {
		PalavraContext _localctx = new PalavraContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_palavra);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(258); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(257);
					match(LETRA);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(260); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Palavra_numeroContext extends ParserRuleContext {
		public List<TerminalNode> LETRA() { return getTokens(ATSParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(ATSParser.LETRA, i);
		}
		public List<TerminalNode> NUMERO() { return getTokens(ATSParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(ATSParser.NUMERO, i);
		}
		public Palavra_numeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palavra_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).enterPalavra_numero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).exitPalavra_numero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ATSVisitor ) return ((ATSVisitor<? extends T>)visitor).visitPalavra_numero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Palavra_numeroContext palavra_numero() throws RecognitionException {
		Palavra_numeroContext _localctx = new Palavra_numeroContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_palavra_numero);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(263); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(262);
					_la = _input.LA(1);
					if ( !(_la==LETRA || _la==NUMERO) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(265); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PasswordContext extends ParserRuleContext {
		public List<TerminalNode> LETRA() { return getTokens(ATSParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(ATSParser.LETRA, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(ATSParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(ATSParser.CHAR, i);
		}
		public List<TerminalNode> NUMERO() { return getTokens(ATSParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(ATSParser.NUMERO, i);
		}
		public List<TerminalNode> PONTO() { return getTokens(ATSParser.PONTO); }
		public TerminalNode PONTO(int i) {
			return getToken(ATSParser.PONTO, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(ATSParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(ATSParser.VIRGULA, i);
		}
		public List<TerminalNode> PONTO_VIRGULA() { return getTokens(ATSParser.PONTO_VIRGULA); }
		public TerminalNode PONTO_VIRGULA(int i) {
			return getToken(ATSParser.PONTO_VIRGULA, i);
		}
		public List<TerminalNode> MENOS() { return getTokens(ATSParser.MENOS); }
		public TerminalNode MENOS(int i) {
			return getToken(ATSParser.MENOS, i);
		}
		public PasswordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_password; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).enterPassword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).exitPassword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ATSVisitor ) return ((ATSVisitor<? extends T>)visitor).visitPassword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasswordContext password() throws RecognitionException {
		PasswordContext _localctx = new PasswordContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_password);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(267);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETRA) | (1L << CHAR) | (1L << PONTO) | (1L << VIRGULA) | (1L << PONTO_VIRGULA) | (1L << MENOS) | (1L << NUMERO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(270); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETRA) | (1L << CHAR) | (1L << PONTO) | (1L << VIRGULA) | (1L << PONTO_VIRGULA) | (1L << MENOS) | (1L << NUMERO))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u0113\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\5\2\"\n\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3[\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0084\n\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0099\n\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\u00ae\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00c3\n\3\3\3\3\3\3\3\5\3\u00c8\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\6\6\u00da\n"+
		"\6\r\6\16\6\u00db\3\7\3\7\3\7\3\7\6\7\u00e2\n\7\r\7\16\7\u00e3\5\7\u00e6"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u00f5\n\b"+
		"\r\b\16\b\u00f6\3\t\3\t\3\t\3\t\3\t\3\t\3\n\6\n\u0100\n\n\r\n\16\n\u0101"+
		"\3\13\6\13\u0105\n\13\r\13\16\13\u0106\3\f\6\f\u010a\n\f\r\f\16\f\u010b"+
		"\3\r\6\r\u010f\n\r\r\r\16\r\u0110\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\2\4\4\2\24\24\32\32\3\2\24\32\2\u0127\2!\3\2\2\2\4\u00c7\3\2\2\2\6"+
		"\u00c9\3\2\2\2\b\u00d0\3\2\2\2\n\u00d9\3\2\2\2\f\u00e5\3\2\2\2\16\u00ec"+
		"\3\2\2\2\20\u00f8\3\2\2\2\22\u00ff\3\2\2\2\24\u0104\3\2\2\2\26\u0109\3"+
		"\2\2\2\30\u010e\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33"+
		"\3\2\2\2\35\36\3\2\2\2\36\"\3\2\2\2\37\35\3\2\2\2 \"\7\2\2\3!\35\3\2\2"+
		"\2! \3\2\2\2\"\3\3\2\2\2#$\7\3\2\2$%\7\30\2\2%\u00c8\b\3\1\2&\'\7\4\2"+
		"\2\'(\7\30\2\2(\u00c8\b\3\1\2)*\7\5\2\2*+\7\30\2\2+\u00c8\b\3\1\2,-\7"+
		"\6\2\2-.\7\7\2\2./\5\b\5\2/\60\7\b\2\2\60\61\7\30\2\2\61\62\b\3\1\2\62"+
		"\u00c8\3\2\2\2\63\64\7\t\2\2\64\65\7\n\2\2\65\66\7\23\2\2\66\67\7\n\2"+
		"\2\678\7\n\2\289\5\30\r\29:\7\n\2\2:;\7\30\2\2;<\b\3\1\2<\u00c8\3\2\2"+
		"\2=>\7\13\2\2>?\7\n\2\2?@\5\22\n\2@A\7\n\2\2AB\7\n\2\2BC\5\30\r\2CD\7"+
		"\n\2\2DE\7\30\2\2EF\b\3\1\2F\u00c8\3\2\2\2GH\7\f\2\2HI\7\n\2\2IJ\7\23"+
		"\2\2JK\7\n\2\2KL\7\n\2\2LM\5\n\6\2MN\7\n\2\2NO\7\n\2\2OP\5\30\r\2PQ\7"+
		"\n\2\2QR\7\n\2\2RS\5\f\7\2ST\7\n\2\2TU\5\20\t\2UZ\7\32\2\2VW\7\n\2\2W"+
		"X\5\22\n\2XY\7\n\2\2Y[\3\2\2\2ZV\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\30"+
		"\2\2]^\b\3\1\2^\u00c8\3\2\2\2_`\7\r\2\2`a\7\n\2\2ab\7\23\2\2bc\7\n\2\2"+
		"cd\7\n\2\2de\5\n\6\2ef\7\n\2\2fg\7\n\2\2gh\5\30\r\2hi\7\n\2\2ij\7\n\2"+
		"\2jk\5\f\7\2kl\7\n\2\2lm\5\20\t\2mn\7\7\2\2no\5\b\5\2op\7\b\2\2pq\7\30"+
		"\2\2qr\b\3\1\2r\u00c8\3\2\2\2st\7\16\2\2tu\7\n\2\2uv\5\6\4\2vw\7\n\2\2"+
		"wx\7\32\2\2xy\7\7\2\2yz\5\b\5\2z\u0083\7\b\2\2{|\7\n\2\2|}\7\23\2\2}\u0084"+
		"\7\n\2\2~\177\7\17\2\2\177\u0080\7\n\2\2\u0080\u0081\5\22\n\2\u0081\u0082"+
		"\7\n\2\2\u0082\u0084\3\2\2\2\u0083{\3\2\2\2\u0083~\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0086\7\30\2\2\u0086\u0087\b\3\1\2\u0087\u00c8\3\2\2\2"+
		"\u0088\u0089\7\20\2\2\u0089\u008a\7\n\2\2\u008a\u008b\5\6\4\2\u008b\u008c"+
		"\7\n\2\2\u008c\u008d\7\32\2\2\u008d\u008e\7\7\2\2\u008e\u008f\5\b\5\2"+
		"\u008f\u0098\7\b\2\2\u0090\u0091\7\n\2\2\u0091\u0092\7\23\2\2\u0092\u0099"+
		"\7\n\2\2\u0093\u0094\7\17\2\2\u0094\u0095\7\n\2\2\u0095\u0096\5\22\n\2"+
		"\u0096\u0097\7\n\2\2\u0097\u0099\3\2\2\2\u0098\u0090\3\2\2\2\u0098\u0093"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\30\2\2\u009b\u009c\b\3\1\2"+
		"\u009c\u00c8\3\2\2\2\u009d\u009e\7\21\2\2\u009e\u009f\7\n\2\2\u009f\u00a0"+
		"\5\6\4\2\u00a0\u00a1\7\n\2\2\u00a1\u00a2\7\32\2\2\u00a2\u00a3\7\7\2\2"+
		"\u00a3\u00a4\5\b\5\2\u00a4\u00ad\7\b\2\2\u00a5\u00a6\7\n\2\2\u00a6\u00a7"+
		"\7\23\2\2\u00a7\u00ae\7\n\2\2\u00a8\u00a9\7\17\2\2\u00a9\u00aa\7\n\2\2"+
		"\u00aa\u00ab\5\22\n\2\u00ab\u00ac\7\n\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00a5"+
		"\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\7\30\2\2"+
		"\u00b0\u00b1\b\3\1\2\u00b1\u00c8\3\2\2\2\u00b2\u00b3\7\22\2\2\u00b3\u00b4"+
		"\7\n\2\2\u00b4\u00b5\5\6\4\2\u00b5\u00b6\7\n\2\2\u00b6\u00b7\7\32\2\2"+
		"\u00b7\u00b8\7\7\2\2\u00b8\u00b9\5\b\5\2\u00b9\u00c2\7\b\2\2\u00ba\u00bb"+
		"\7\n\2\2\u00bb\u00bc\7\23\2\2\u00bc\u00c3\7\n\2\2\u00bd\u00be\7\17\2\2"+
		"\u00be\u00bf\7\n\2\2\u00bf\u00c0\5\22\n\2\u00c0\u00c1\7\n\2\2\u00c1\u00c3"+
		"\3\2\2\2\u00c2\u00ba\3\2\2\2\u00c2\u00bd\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c5\7\30\2\2\u00c5\u00c6\b\3\1\2\u00c6\u00c8\3\2\2\2\u00c7#\3\2\2\2"+
		"\u00c7&\3\2\2\2\u00c7)\3\2\2\2\u00c7,\3\2\2\2\u00c7\63\3\2\2\2\u00c7="+
		"\3\2\2\2\u00c7G\3\2\2\2\u00c7_\3\2\2\2\u00c7s\3\2\2\2\u00c7\u0088\3\2"+
		"\2\2\u00c7\u009d\3\2\2\2\u00c7\u00b2\3\2\2\2\u00c8\5\3\2\2\2\u00c9\u00ca"+
		"\7\32\2\2\u00ca\u00cb\7\31\2\2\u00cb\u00cc\7\24\2\2\u00cc\u00cd\7\24\2"+
		"\2\u00cd\u00ce\7\31\2\2\u00ce\u00cf\7\32\2\2\u00cf\7\3\2\2\2\u00d0\u00d1"+
		"\7\32\2\2\u00d1\u00d2\7\26\2\2\u00d2\u00d3\7\32\2\2\u00d3\u00d4\7\27\2"+
		"\2\u00d4\u00d5\7\32\2\2\u00d5\u00d6\7\26\2\2\u00d6\u00d7\7\32\2\2\u00d7"+
		"\t\3\2\2\2\u00d8\u00da\5\24\13\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2"+
		"\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\13\3\2\2\2\u00dd\u00e2"+
		"\5\26\f\2\u00de\u00e2\7\25\2\2\u00df\u00e2\7\31\2\2\u00e0\u00e2\7\26\2"+
		"\2\u00e1\u00dd\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e6\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\u00e8\7\27\2\2\u00e8\u00e9\7\32\2\2\u00e9\u00ea\7\27\2\2\u00ea"+
		"\u00eb\5\16\b\2\u00eb\r\3\2\2\2\u00ec\u00ed\7\32\2\2\u00ed\u00ee\7\31"+
		"\2\2\u00ee\u00f4\7\32\2\2\u00ef\u00f5\5\26\f\2\u00f0\u00f5\7\31\2\2\u00f1"+
		"\u00f5\7\25\2\2\u00f2\u00f5\7\7\2\2\u00f3\u00f5\7\b\2\2\u00f4\u00ef\3"+
		"\2\2\2\u00f4\u00f0\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\17\3\2\2\2\u00f8\u00f9\7\32\2\2\u00f9\u00fa\7\31\2\2\u00fa"+
		"\u00fb\7\32\2\2\u00fb\u00fc\7\31\2\2\u00fc\u00fd\7\32\2\2\u00fd\21\3\2"+
		"\2\2\u00fe\u0100\5\26\f\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\23\3\2\2\2\u0103\u0105\7\24\2"+
		"\2\u0104\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0107\25\3\2\2\2\u0108\u010a\t\2\2\2\u0109\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\27\3\2\2"+
		"\2\u010d\u010f\t\3\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111\31\3\2\2\2\24\35!Z\u0083\u0098\u00ad"+
		"\u00c2\u00c7\u00db\u00e1\u00e3\u00e5\u00f4\u00f6\u0101\u0106\u010b\u0110";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}