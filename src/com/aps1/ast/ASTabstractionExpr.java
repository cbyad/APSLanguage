package com.aps1.ast;

import com.aps0.ast.ASTexpression;
import com.aps0.interfaces.IASTexpression;
import com.aps0.interpreter.Environnement;
import com.aps0.interpreter.Memoire;
import com.aps1.interfaces.IASTabstraction;
import com.aps1.interfaces.IASTabstractionExpr;

public class ASTabstractionExpr extends ASTexpression implements IASTabstractionExpr{

	
	protected IASTabstraction[] abstraction ;
	protected IASTexpression expression ;
	
	
	
	public ASTabstractionExpr(IASTabstraction[] abstraction,
			IASTexpression expression) {
		super();
		this.abstraction = abstraction;
		this.expression = expression;
	}

	public IASTabstraction[] getAbstraction() {
		return abstraction;
	}

	public IASTexpression getExpression() {
		return expression;
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
