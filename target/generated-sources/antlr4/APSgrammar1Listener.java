// Generated from APSgrammar1.g4 by ANTLR 4.4

	package antlr4;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link APSgrammar1Parser}.
 */
public interface APSgrammar1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ConstantDec}
	 * labeled alternative in {@link APSgrammar1Parser#dec}.
	 * @param ctx the parse tree
	 */
	void enterConstantDec(@NotNull APSgrammar1Parser.ConstantDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstantDec}
	 * labeled alternative in {@link APSgrammar1Parser#dec}.
	 * @param ctx the parse tree
	 */
	void exitConstantDec(@NotNull APSgrammar1Parser.ConstantDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeFonctionnel}
	 * labeled alternative in {@link APSgrammar1Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeFonctionnel(@NotNull APSgrammar1Parser.TypeFonctionnelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeFonctionnel}
	 * labeled alternative in {@link APSgrammar1Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeFonctionnel(@NotNull APSgrammar1Parser.TypeFonctionnelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentExpr}
	 * labeled alternative in {@link APSgrammar1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdentExpr(@NotNull APSgrammar1Parser.IdentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentExpr}
	 * labeled alternative in {@link APSgrammar1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdentExpr(@NotNull APSgrammar1Parser.IdentExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link APSgrammar1Parser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(@NotNull APSgrammar1Parser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link APSgrammar1Parser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(@NotNull APSgrammar1Parser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Alternative}
	 * labeled alternative in {@link APSgrammar1Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAlternative(@NotNull APSgrammar1Parser.AlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Alternative}
	 * labeled alternative in {@link APSgrammar1Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAlternative(@NotNull APSgrammar1Parser.AlternativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Programm}
	 * labeled alternative in {@link APSgrammar1Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgramm(@NotNull APSgrammar1Parser.ProgrammContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Programm}
	 * labeled alternative in {@link APSgrammar1Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgramm(@NotNull APSgrammar1Parser.ProgrammContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeBool}
	 * labeled alternative in {@link APSgrammar1Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeBool(@NotNull APSgrammar1Parser.TypeBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeBool}
	 * labeled alternative in {@link APSgrammar1Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeBool(@NotNull APSgrammar1Parser.TypeBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeInt}
	 * labeled alternative in {@link APSgrammar1Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeInt(@NotNull APSgrammar1Parser.TypeIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeInt}
	 * labeled alternative in {@link APSgrammar1Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeInt(@NotNull APSgrammar1Parser.TypeIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableAssign}
	 * labeled alternative in {@link APSgrammar1Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssign(@NotNull APSgrammar1Parser.VariableAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableAssign}
	 * labeled alternative in {@link APSgrammar1Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssign(@NotNull APSgrammar1Parser.VariableAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link APSgrammar1Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile(@NotNull APSgrammar1Parser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link APSgrammar1Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile(@NotNull APSgrammar1Parser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConsTrue}
	 * labeled alternative in {@link APSgrammar1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConsTrue(@NotNull APSgrammar1Parser.ConsTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConsTrue}
	 * labeled alternative in {@link APSgrammar1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConsTrue(@NotNull APSgrammar1Parser.ConsTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstFalse}
	 * labeled alternative in {@link APSgrammar1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstFalse(@NotNull APSgrammar1Parser.ConstFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstFalse}
	 * labeled alternative in {@link APSgrammar1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstFalse(@NotNull APSgrammar1Parser.ConstFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link APSgrammar1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary(@NotNull APSgrammar1Parser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link APSgrammar1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary(@NotNull APSgrammar1Parser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecCmds}
	 * labeled alternative in {@link APSgrammar1Parser#cmds}.
	 * @param ctx the parse tree
	 */
	void enterDecCmds(@NotNull APSgrammar1Parser.DecCmdsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecCmds}
	 * labeled alternative in {@link APSgrammar1Parser#cmds}.
	 * @param ctx the parse tree
	 */
	void exitDecCmds(@NotNull APSgrammar1Parser.DecCmdsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatCmds}
	 * labeled alternative in {@link APSgrammar1Parser#cmds}.
	 * @param ctx the parse tree
	 */
	void enterStatCmds(@NotNull APSgrammar1Parser.StatCmdsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatCmds}
	 * labeled alternative in {@link APSgrammar1Parser#cmds}.
	 * @param ctx the parse tree
	 */
	void exitStatCmds(@NotNull APSgrammar1Parser.StatCmdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link APSgrammar1Parser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(@NotNull APSgrammar1Parser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link APSgrammar1Parser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(@NotNull APSgrammar1Parser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AbstractionExpr}
	 * labeled alternative in {@link APSgrammar1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAbstractionExpr(@NotNull APSgrammar1Parser.AbstractionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AbstractionExpr}
	 * labeled alternative in {@link APSgrammar1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAbstractionExpr(@NotNull APSgrammar1Parser.AbstractionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ApplicationExpr}
	 * labeled alternative in {@link APSgrammar1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterApplicationExpr(@NotNull APSgrammar1Parser.ApplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ApplicationExpr}
	 * labeled alternative in {@link APSgrammar1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitApplicationExpr(@NotNull APSgrammar1Parser.ApplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDec}
	 * labeled alternative in {@link APSgrammar1Parser#dec}.
	 * @param ctx the parse tree
	 */
	void enterVariableDec(@NotNull APSgrammar1Parser.VariableDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDec}
	 * labeled alternative in {@link APSgrammar1Parser#dec}.
	 * @param ctx the parse tree
	 */
	void exitVariableDec(@NotNull APSgrammar1Parser.VariableDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstNumeric}
	 * labeled alternative in {@link APSgrammar1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstNumeric(@NotNull APSgrammar1Parser.ConstNumericContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstNumeric}
	 * labeled alternative in {@link APSgrammar1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstNumeric(@NotNull APSgrammar1Parser.ConstNumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link APSgrammar1Parser#exprs}.
	 * @param ctx the parse tree
	 */
	void enterExprs(@NotNull APSgrammar1Parser.ExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link APSgrammar1Parser#exprs}.
	 * @param ctx the parse tree
	 */
	void exitExprs(@NotNull APSgrammar1Parser.ExprsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Binary}
	 * labeled alternative in {@link APSgrammar1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinary(@NotNull APSgrammar1Parser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Binary}
	 * labeled alternative in {@link APSgrammar1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinary(@NotNull APSgrammar1Parser.BinaryContext ctx);
}