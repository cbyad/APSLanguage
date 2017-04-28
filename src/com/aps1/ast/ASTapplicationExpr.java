package com.aps1.ast;

import com.aps0.ast.ASTexpression;
import com.aps0.interfaces.IASTexpression;
import com.aps0.interpreter.Environnement;
import com.aps0.interpreter.Memoire;
import com.aps1.interfaces.IASTapplicationExpr;

public class ASTapplicationExpr extends ASTexpression implements IASTapplicationExpr{


	protected IASTexpression[] expression ;

	
	
	
	
	public IASTexpression[] getExpression() {
		return expression;
	}


	public ASTapplicationExpr(IASTexpression[] expression) {
		super();
		this.expression = expression;
	}


	@Override
	public String toProlog() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eval(Environnement env, Memoire mem) {
		// TODO Auto-generated method stub
		return null;
	}

}
