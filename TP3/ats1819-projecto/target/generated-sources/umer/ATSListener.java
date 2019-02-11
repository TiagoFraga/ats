// Generated from /Users/tiagofraga/Desktop/Complementares/ATS/Trabalhos/Local/TP2/ats1819-projecto/src/antlr4/ATS.g4 by ANTLR 4.7

  package umer;
  import java.awt.geom.Point2D;
  import java.time.LocalDate;
  import java.time.format.DateTimeFormatter;
  import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ATSParser}.
 */
public interface ATSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ATSParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(ATSParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATSParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(ATSParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATSParser#evento}.
	 * @param ctx the parse tree
	 */
	void enterEvento(ATSParser.EventoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATSParser#evento}.
	 * @param ctx the parse tree
	 */
	void exitEvento(ATSParser.EventoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATSParser#matricula}.
	 * @param ctx the parse tree
	 */
	void enterMatricula(ATSParser.MatriculaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATSParser#matricula}.
	 * @param ctx the parse tree
	 */
	void exitMatricula(ATSParser.MatriculaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATSParser#localizacao}.
	 * @param ctx the parse tree
	 */
	void enterLocalizacao(ATSParser.LocalizacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATSParser#localizacao}.
	 * @param ctx the parse tree
	 */
	void exitLocalizacao(ATSParser.LocalizacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATSParser#nome}.
	 * @param ctx the parse tree
	 */
	void enterNome(ATSParser.NomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATSParser#nome}.
	 * @param ctx the parse tree
	 */
	void exitNome(ATSParser.NomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATSParser#morada}.
	 * @param ctx the parse tree
	 */
	void enterMorada(ATSParser.MoradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATSParser#morada}.
	 * @param ctx the parse tree
	 */
	void exitMorada(ATSParser.MoradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATSParser#cod_postal}.
	 * @param ctx the parse tree
	 */
	void enterCod_postal(ATSParser.Cod_postalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATSParser#cod_postal}.
	 * @param ctx the parse tree
	 */
	void exitCod_postal(ATSParser.Cod_postalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATSParser#nascimento}.
	 * @param ctx the parse tree
	 */
	void enterNascimento(ATSParser.NascimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATSParser#nascimento}.
	 * @param ctx the parse tree
	 */
	void exitNascimento(ATSParser.NascimentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATSParser#empresa}.
	 * @param ctx the parse tree
	 */
	void enterEmpresa(ATSParser.EmpresaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATSParser#empresa}.
	 * @param ctx the parse tree
	 */
	void exitEmpresa(ATSParser.EmpresaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATSParser#palavra}.
	 * @param ctx the parse tree
	 */
	void enterPalavra(ATSParser.PalavraContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATSParser#palavra}.
	 * @param ctx the parse tree
	 */
	void exitPalavra(ATSParser.PalavraContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATSParser#palavra_numero}.
	 * @param ctx the parse tree
	 */
	void enterPalavra_numero(ATSParser.Palavra_numeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATSParser#palavra_numero}.
	 * @param ctx the parse tree
	 */
	void exitPalavra_numero(ATSParser.Palavra_numeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATSParser#password}.
	 * @param ctx the parse tree
	 */
	void enterPassword(ATSParser.PasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATSParser#password}.
	 * @param ctx the parse tree
	 */
	void exitPassword(ATSParser.PasswordContext ctx);
}