// Generated from /Users/tiagofraga/Desktop/Complementares/ATS/Trabalhos/Local/TP2/ats1819-projecto/src/antlr4/ATS.g4 by ANTLR 4.7

  package umer;
  import java.awt.geom.Point2D;
  import java.time.LocalDate;
  import java.time.format.DateTimeFormatter;
  import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ATSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ATSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ATSParser#log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(ATSParser.LogContext ctx);
	/**
	 * Visit a parse tree produced by {@link ATSParser#evento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvento(ATSParser.EventoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ATSParser#matricula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatricula(ATSParser.MatriculaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ATSParser#localizacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalizacao(ATSParser.LocalizacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ATSParser#nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome(ATSParser.NomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ATSParser#morada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMorada(ATSParser.MoradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ATSParser#cod_postal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCod_postal(ATSParser.Cod_postalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ATSParser#nascimento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNascimento(ATSParser.NascimentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ATSParser#empresa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpresa(ATSParser.EmpresaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ATSParser#palavra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalavra(ATSParser.PalavraContext ctx);
	/**
	 * Visit a parse tree produced by {@link ATSParser#palavra_numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalavra_numero(ATSParser.Palavra_numeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link ATSParser#password}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassword(ATSParser.PasswordContext ctx);
}