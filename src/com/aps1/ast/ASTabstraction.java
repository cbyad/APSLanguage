package com.aps1.ast;

import com.aps0.annotation.OrNull;
import com.aps0.ast.ASTexpression;
import com.aps0.interfaces.IASTtype;
import com.aps0.interfaces.IASTvariable;
import com.aps0.interpreter.Environnement;
import com.aps0.interpreter.Memoire;
import com.aps1.interfaces.IASTabstraction;

public class ASTabstraction extends ASTexpression implements IASTabstraction{

	protected  IASTvariable variable ;
	protected 	IASTtype type ;
	@OrNull protected IASTabstraction[] abstractions ;


	public ASTabstraction(IASTvariable variable, IASTtype type,
			IASTabstraction[] abstractions) {
		super();
		this.variable = variable;
		this.type = type;
		this.abstractions = abstractions;
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

	@Override
	public IASTvariable getVariable() {
		return variable;
	}

	@Override
	public IASTtype getType() {
		return type;
	}

	@Override
	public IASTabstraction[] getAbstractions() {
		return abstractions;
	}

}
