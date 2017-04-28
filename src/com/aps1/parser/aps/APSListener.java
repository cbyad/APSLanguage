package com.aps1.parser.aps;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import antlr4.APSgrammar1Listener;
import antlr4.APSgrammar1Parser.AbstractionExprContext;
import antlr4.APSgrammar1Parser.ApplicationExprContext;
import antlr4.APSgrammar1Parser.ArgsContext;
import antlr4.APSgrammar1Parser.ExprsContext;
import antlr4.APSgrammar1Parser.TypeFonctionnelContext;
import antlr4.APSgrammar1Parser.TypesContext;

import com.aps0.interfaces.IASTcommands;
import com.aps1.interfaces.IASTabstraction;
import com.aps1.interfaces.IASTapplication;
import com.aps1.interfaces.IASTfactory;
import com.aps1.interfaces.IASTtypes;

import static antlr4.APSgrammar1Parser.*;



public class APSListener implements APSgrammar1Listener {

	public APSListener(IASTfactory factory) {
		super();
		this.factory = factory;		
	}


	protected IASTfactory factory;

	//APS0
	@Override
	public void exitProgramm(ProgrammContext ctx) {

		ctx.node= factory.newProgram(toCommands(ctx.listcmds));	
	}

	@Override
	public void exitDecCmds(DecCmdsContext ctx) {
		ctx.node= factory.newDecCmds(ctx.declaration.node , 
				toCommands(ctx.commandes) );
	}

	@Override
	public void exitStatCmds(StatCmdsContext ctx) {
		ctx.node=factory.newStatCmds(ctx.statement.node,
				toCommands(ctx.commandes));
	}

	@Override
	public void exitConstantDec(ConstantDecContext ctx) {
		ctx.node=factory.newConstantDeclaration(ctx.ident.getText(), 
				ctx.arg.node,
				ctx.typ.node);

	}

	@Override
	public void exitAlternative(AlternativeContext ctx) {
		ctx.node=factory.newAlternative(ctx.condition.node,
				toCommands(ctx.consequence),
				ctx.alternant==null?null:toCommands(ctx.alternant));
	}


	@Override
	public void exitVariableAssign(VariableAssignContext ctx) {
		ctx.node=factory.newAssignment(
				factory.newVariable(ctx.ident.getText()), ctx.arg.node);

	}
	@Override
	public void exitWhile(WhileContext ctx) {
		ctx.node=factory.newWhile(ctx.condition.node, toCommands(ctx.body));

	}
	@Override
	public void exitConsTrue(ConsTrueContext ctx) {
		ctx.node=factory.newBooleanConstant("true");

	}
	@Override
	public void exitConstFalse(ConstFalseContext ctx) {
		ctx.node=factory.newBooleanConstant("false");

	}

	@Override
	public void exitUnary(UnaryContext ctx) {
		ctx.node=factory.newUnaryOperation( 
				factory.newOperator(ctx.op.getText()), ctx.arg.node);
	}
	@Override
	public void exitVariableDec(VariableDecContext ctx) {
		ctx.node =factory.newVariableDec(ctx.ident.getText(), ctx.typ.node);

	}
	@Override
	public void exitConstNumeric(ConstNumericContext ctx) {
		ctx.node =factory.newNumericConstant(ctx.constNum.getText());

	}

	@Override
	public void exitIdentExpr(IdentExprContext ctx) {
		ctx.node= factory.newIdentExpr(ctx.ident.getText());

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

	/* ANTLR4 list to AST Array*/

	protected IASTcommands[] toCommands(
			List<CmdsContext> ctxs) {
		if (ctxs == null) return new IASTcommands[0];
		IASTcommands[] r = new IASTcommands[ctxs.size()];
		int pos = 0;
		for (CmdsContext e : ctxs) {
			r[pos++] = e.node;
		}
		return r;
	}


	// Nothing to do here
	public void enterEveryRule(ParserRuleContext arg0) {}
	public void exitEveryRule(ParserRuleContext arg0) {}
	public void visitErrorNode(ErrorNode arg0) {}
	public void visitTerminal(TerminalNode arg0) {}
	public void enterConstantDec(ConstantDecContext ctx) {}
	public void enterAlternative(AlternativeContext ctx) {}
	public void enterVariableAssign(VariableAssignContext ctx) {}
	public void enterWhile(WhileContext ctx) {}
	public void enterConsTrue(ConsTrueContext ctx) {}
	public void enterConstFalse(ConstFalseContext ctx) {}
	public void enterUnary(UnaryContext ctx){}
	public void enterVariableDec(VariableDecContext ctx){}
	public void enterConstNumeric(ConstNumericContext ctx){}
	public void enterBinary(BinaryContext ctx){}
	public void enterTypeBool(TypeBoolContext ctx) {}
	public void enterTypeInt(TypeIntContext ctx) {}
	public void enterProgramm(ProgrammContext ctx) {}
	public void enterDecCmds(DecCmdsContext ctx) {}
	public void enterStatCmds(StatCmdsContext ctx) {}
	public void enterIdentExpr(IdentExprContext ctx) {}



	//APS1

	public void enterTypeFonctionnel(TypeFonctionnelContext ctx) {}
	public void enterTypes(TypesContext ctx) {	}
	public void enterArgs(ArgsContext ctx) {}
	public void enterAbstractionExpr(AbstractionExprContext ctx) {}
	public void enterApplicationExpr(ApplicationExprContext ctx) {}
	public void enterExprs(ExprsContext ctx) {}


	@Override
	public void exitTypeFonctionnel(TypeFonctionnelContext ctx) {
		ctx.node= factory.newTypeFonctionnel(ctx.typ.getText(), toTypes(ctx.typs));
	}


	protected IASTtypes[] toTypes(
			List<TypesContext> ctxs) {
		if (ctxs == null) return new IASTtypes[0];
		IASTtypes[] r = new IASTtypes[ctxs.size()];
		int pos = 0;
		for (TypesContext e : ctxs) {
			r[pos++] = e.node;
		}
		return r;
	}

	protected IASTabstraction[] toAbs(
			List<ArgsContext> ctxs) {
		if (ctxs == null) return new IASTabstraction[0];
		IASTabstraction[] r = new IASTabstraction[ctxs.size()];
		int pos = 0;
		for (ArgsContext e : ctxs) {
			r[pos++] = e.node;
		}
		return r;
	}
	
	
	protected IASTapplication[] toApp(
			List<ExprsContext> ctxs) {
		if (ctxs == null) return new IASTapplication[0];
		IASTapplication[] r = new IASTapplication[ctxs.size()];
		int pos = 0;
		for (ExprsContext e : ctxs) {
			r[pos++] = e.node;
		}
		return r;
	}



	@Override
	public void exitTypes(TypesContext ctx) {
		ctx.node=factory.newTypes(ctx.typ.node, toTypes(ctx.typs));
	}

	@Override
	public void exitArgs(ArgsContext ctx) {
		ctx.node=factory.newAbstraction(
				factory.newVariable(ctx.ident.getText()), 
				ctx.typ.node, 
				toAbs(ctx.arg));
	}

	@Override
	public void exitAbstractionExpr(AbstractionExprContext ctx) {
		ctx.node= factory.newAbstractionExpr(toAbs(ctx.abs), ctx.exp.node);
	}



	@Override
	public void exitApplicationExpr(ApplicationExprContext ctx) {
		ctx.node= factory.newApplicationExpr(toApp(ctx.app));
	}



	@Override
	public void exitExprs(ExprsContext ctx) {
		ctx.node=factory.newApplication(ctx.exp.node, toApp(ctx.exps));
	}
}
