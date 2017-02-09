// Generated from APSgrammar0.g4 by ANTLR 4.4

	package antlr4 ;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link APSgrammar0Parser}.
 */
public interface APSgrammar0Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Binding}
	 * labeled alternative in {@link APSgrammar0Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBinding(@NotNull APSgrammar0Parser.BindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Binding}
	 * labeled alternative in {@link APSgrammar0Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBinding(@NotNull APSgrammar0Parser.BindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Loop}
	 * labeled alternative in {@link APSgrammar0Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterLoop(@NotNull APSgrammar0Parser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Loop}
	 * labeled alternative in {@link APSgrammar0Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitLoop(@NotNull APSgrammar0Parser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link APSgrammar0Parser#dec}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull APSgrammar0Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link APSgrammar0Parser#dec}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull APSgrammar0Parser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Alternative}
	 * labeled alternative in {@link APSgrammar0Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAlternative(@NotNull APSgrammar0Parser.AlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Alternative}
	 * labeled alternative in {@link APSgrammar0Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAlternative(@NotNull APSgrammar0Parser.AlternativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Statement}
	 * labeled alternative in {@link APSgrammar0Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull APSgrammar0Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Statement}
	 * labeled alternative in {@link APSgrammar0Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull APSgrammar0Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link APSgrammar0Parser#dec}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull APSgrammar0Parser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link APSgrammar0Parser#dec}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull APSgrammar0Parser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link APSgrammar0Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull APSgrammar0Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link APSgrammar0Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull APSgrammar0Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConsTrue}
	 * labeled alternative in {@link APSgrammar0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConsTrue(@NotNull APSgrammar0Parser.ConsTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConsTrue}
	 * labeled alternative in {@link APSgrammar0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConsTrue(@NotNull APSgrammar0Parser.ConsTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstFalse}
	 * labeled alternative in {@link APSgrammar0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstFalse(@NotNull APSgrammar0Parser.ConstFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstFalse}
	 * labeled alternative in {@link APSgrammar0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstFalse(@NotNull APSgrammar0Parser.ConstFalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link APSgrammar0Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull APSgrammar0Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link APSgrammar0Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull APSgrammar0Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link APSgrammar0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary(@NotNull APSgrammar0Parser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link APSgrammar0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary(@NotNull APSgrammar0Parser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstNumeric}
	 * labeled alternative in {@link APSgrammar0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstNumeric(@NotNull APSgrammar0Parser.ConstNumericContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstNumeric}
	 * labeled alternative in {@link APSgrammar0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstNumeric(@NotNull APSgrammar0Parser.ConstNumericContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link APSgrammar0Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull APSgrammar0Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link APSgrammar0Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull APSgrammar0Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Binary}
	 * labeled alternative in {@link APSgrammar0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinary(@NotNull APSgrammar0Parser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Binary}
	 * labeled alternative in {@link APSgrammar0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinary(@NotNull APSgrammar0Parser.BinaryContext ctx);
}