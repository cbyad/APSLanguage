// Generated from APSgrammar0.g4 by ANTLR 4.4

	package antlr4;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link APSgrammar0Parser}.
 */
public interface APSgrammar0Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ConstantDec}
	 * labeled alternative in {@link APSgrammar0Parser#dec}.
	 * @param ctx the parse tree
	 */
	void enterConstantDec(@NotNull APSgrammar0Parser.ConstantDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstantDec}
	 * labeled alternative in {@link APSgrammar0Parser#dec}.
	 * @param ctx the parse tree
	 */
	void exitConstantDec(@NotNull APSgrammar0Parser.ConstantDecContext ctx);
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
	 * Enter a parse tree produced by the {@code Commandes}
	 * labeled alternative in {@link APSgrammar0Parser#cmds}.
	 * @param ctx the parse tree
	 */
	void enterCommandes(@NotNull APSgrammar0Parser.CommandesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Commandes}
	 * labeled alternative in {@link APSgrammar0Parser#cmds}.
	 * @param ctx the parse tree
	 */
	void exitCommandes(@NotNull APSgrammar0Parser.CommandesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeBool}
	 * labeled alternative in {@link APSgrammar0Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeBool(@NotNull APSgrammar0Parser.TypeBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeBool}
	 * labeled alternative in {@link APSgrammar0Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeBool(@NotNull APSgrammar0Parser.TypeBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeInt}
	 * labeled alternative in {@link APSgrammar0Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeInt(@NotNull APSgrammar0Parser.TypeIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeInt}
	 * labeled alternative in {@link APSgrammar0Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeInt(@NotNull APSgrammar0Parser.TypeIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableAssign}
	 * labeled alternative in {@link APSgrammar0Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssign(@NotNull APSgrammar0Parser.VariableAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableAssign}
	 * labeled alternative in {@link APSgrammar0Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssign(@NotNull APSgrammar0Parser.VariableAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link APSgrammar0Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile(@NotNull APSgrammar0Parser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link APSgrammar0Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile(@NotNull APSgrammar0Parser.WhileContext ctx);
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
	 * Enter a parse tree produced by the {@code Programme}
	 * labeled alternative in {@link APSgrammar0Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgramme(@NotNull APSgrammar0Parser.ProgrammeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Programme}
	 * labeled alternative in {@link APSgrammar0Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgramme(@NotNull APSgrammar0Parser.ProgrammeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecCmds}
	 * labeled alternative in {@link APSgrammar0Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterDecCmds(@NotNull APSgrammar0Parser.DecCmdsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecCmds}
	 * labeled alternative in {@link APSgrammar0Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitDecCmds(@NotNull APSgrammar0Parser.DecCmdsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatCmds}
	 * labeled alternative in {@link APSgrammar0Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterStatCmds(@NotNull APSgrammar0Parser.StatCmdsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatCmds}
	 * labeled alternative in {@link APSgrammar0Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitStatCmds(@NotNull APSgrammar0Parser.StatCmdsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDec}
	 * labeled alternative in {@link APSgrammar0Parser#dec}.
	 * @param ctx the parse tree
	 */
	void enterVariableDec(@NotNull APSgrammar0Parser.VariableDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDec}
	 * labeled alternative in {@link APSgrammar0Parser#dec}.
	 * @param ctx the parse tree
	 */
	void exitVariableDec(@NotNull APSgrammar0Parser.VariableDecContext ctx);
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