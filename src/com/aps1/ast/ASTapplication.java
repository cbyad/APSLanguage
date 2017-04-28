package com.aps1.ast;

import com.aps0.annotation.OrNull;
import com.aps0.ast.ASTexpression;
import com.aps0.interfaces.IASTexpression;
import com.aps0.interpreter.Environnement;
import com.aps0.interpreter.Memoire;
import com.aps1.interfaces.IASTapplication;

public class ASTapplication extends ASTexpression implements IASTapplication{

	protected IASTexpression expr ;
	@OrNull protected IASTapplication[] applications ;
	
	
	public ASTapplication(IASTexpression expr, IASTapplication[] applications) {
		super();
		this.expr = expr;
		this.applications = applications;
	}

	public IASTexpression getExpression() {
		return expr;
	}

	public IASTapplication[] getApplications() {
		return applications;
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
