package com.aps0.parser.aps;

import java.util.List;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import antlr4.APSgrammar0Listener;
import antlr4.APSgrammar0Parser.AlternativeContext;
import antlr4.APSgrammar0Parser.BinaryContext;
import antlr4.APSgrammar0Parser.ConsTrueContext;
import antlr4.APSgrammar0Parser.ConstFalseContext;
import antlr4.APSgrammar0Parser.ConstNumericContext;
import antlr4.APSgrammar0Parser.ConstantDecContext;
import antlr4.APSgrammar0Parser.DeclarationContext;
import antlr4.APSgrammar0Parser.ProgContext;
import antlr4.APSgrammar0Parser.StatementContext;
import antlr4.APSgrammar0Parser.TypeBoolContext;
import antlr4.APSgrammar0Parser.TypeIntContext;
import antlr4.APSgrammar0Parser.UnaryContext;
import antlr4.APSgrammar0Parser.VariableAssignContext;
import antlr4.APSgrammar0Parser.VariableDecContext;
import antlr4.APSgrammar0Parser.WhileContext;

import com.aps0.interfaces.IASTfactory;
import com.aps0.interfaces.IASTexpression;
import com.aps0.interfaces.IASTvariable;

import static antlr4.APSgrammar0Parser.*;

/**
 * Cette classe décrit à ANTRL comment construire un AST.
 * C'est un Listener : à chaque pas de l'analyse syntaxique, ANTRL
 * appelle cette classe, qui crée un ASTNode correspondant à ce qui
 * a été reconnu. 
 * Un Listener ne peut pas renvoyer de valeur, nous utilisons donc des
 * champs du contexte ctx pour transferer l'information d'une règle
 * de grammaire à l'autre.
 * 
 */
public class APSListener implements APSgrammar0Listener {
	
	public APSListener(IASTfactory factory) {
		super();
		this.factory = factory;		
	}
	
	/*
	 * Le parseur est paramétré par une fabrique qui indique comment
	 * créer les instances concrètes d'AST.
	 */
	protected IASTfactory factory;
	

	@Override
	public void exitConstantDec(ConstantDecContext ctx) {
		ctx.node=factory.newConstantDeclaration(ctx.getText(), ctx.arg.node, ctx.typ.node);
		
	}
	@Override
	public void exitAlternative(AlternativeContext ctx) {
		ctx.node=factory.newAlternative(ctx.condition.node,
										ctx.consequence.node,
										ctx.alternant==null?null:ctx.alternant.node);
		
	}
	
	@Override
	public void exitStatement(StatementContext ctx) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void exitVariableAssign(VariableAssignContext ctx) {
		ctx.node=factory.newAssignment(factory.newVariable(ctx.ident.getText()), ctx.arg.node);
		
	}
	@Override
	public void exitWhile(WhileContext ctx) {
		ctx.node=factory.newWhile(ctx.condition.node, ctx.body.node);
		
	}
	@Override
	public void exitConsTrue(ConsTrueContext ctx) {
		ctx.node=factory.newBooleanConstant("true"); //true
		
	}
	@Override
	public void exitConstFalse(ConstFalseContext ctx) {
		ctx.node=factory.newBooleanConstant("false"); //false
		
	}
	@Override
	public void exitProg(ProgContext ctx) {
		// TODO Auto-generated method stub
		
		
	}
	
	@Override
	public void exitUnary(UnaryContext ctx) {
		ctx.node=factory.newUnaryOperation( factory.newOperator(ctx.op.getText()), ctx.arg.node);
	}
	@Override
	public void exitVariableDec(VariableDecContext ctx) {
		// TODO Auto-generated method stub
		//ctx.node =factory.newVariable(ctx.getText()); revoir VAriableDEC
		
	}
	@Override
	public void exitConstNumeric(ConstNumericContext ctx) {
		ctx.node =factory.newNumericConstant(ctx.constNum.getText());
		
	}
	@Override
	public void exitDeclaration(DeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void exitBinary(BinaryContext ctx) {
		ctx.node=factory.newBinaryOperation(factory.newOperator(ctx.op.getText()),
				ctx.arg1.node, ctx.arg2.node);
	}
	
	@Override
	public void exitTypeBool(TypeBoolContext ctx) {
		ctx.node =factory.newType(ctx.getText());
		
	}
	
	@Override
	public void exitTypeInt(TypeIntContext ctx) {
		ctx.node =factory.newType(ctx.getText());
	}
	
	public void enterEveryRule(ParserRuleContext arg0) {}
	public void exitEveryRule(ParserRuleContext arg0) {}
	public void visitErrorNode(ErrorNode arg0) {}
	public void visitTerminal(TerminalNode arg0) {}
	public void enterConstantDec(ConstantDecContext ctx) {}
	public void enterAlternative(AlternativeContext ctx) {}
	public void enterStatement(StatementContext ctx) {}
	public void enterVariableAssign(VariableAssignContext ctx) {}
	public void enterWhile(WhileContext ctx) {}
	public void enterConsTrue(ConsTrueContext ctx) {}
	public void enterConstFalse(ConstFalseContext ctx) {}
	public void enterProg(ProgContext ctx) {}
	public void enterUnary(UnaryContext ctx){}
	public void enterVariableDec(VariableDecContext ctx){}
	public void enterConstNumeric(ConstNumericContext ctx){}
	public void enterDeclaration(DeclarationContext ctx){}
	public void enterBinary(BinaryContext ctx){}
	public void enterTypeBool(TypeBoolContext ctx) {}
	public void enterTypeInt(TypeIntContext ctx) {}

	
	/*
	 * ANTLRGrammarBaseListener, automatiquement généré, fournit
	 * un squelette d'objet "Listener".
	 * Il suffit de redéinir les méthodes qui nous intéressent : celles de la
	 * forme "exit<règle>".
	 */

}
