package com.aps1.ast;

import com.aps0.interfaces.IASTexpression;
import com.aps0.interfaces.IASTtype;
import com.aps0.interfaces.IASTvariable;
import com.aps1.interfaces.IASTabstraction;
import com.aps1.interfaces.IASTapplication;
import com.aps1.interfaces.IASTfactory;
import com.aps1.interfaces.IASTtypes;

public class ASTfactory extends com.aps0.ast.ASTfactory implements IASTfactory{

	@Override
	public IASTtypes newTypes(IASTtype type, IASTtypes[] types) {
		return new ASTtypes(type,types);
	}

	@Override
	public IASTabstraction newAbstraction(IASTvariable variable, IASTtype type,
			IASTabstraction[] abstractions) {
		
		return new ASTabstraction(variable, type, abstractions);
	}

	@Override
	public IASTapplication newApplication(IASTexpression expression,
			IASTapplication[] applications) {
		
		return new ASTapplication(expression, applications);
	}

	@Override
	public IASTtype newTypeFonctionnel(String name, IASTtypes[] types) {
		
		return new ASTtypeFonctionnel(name, types);
	}

	@Override
	public IASTexpression newApplicationExpr(IASTexpression[] expressions) {
		return new ASTapplicationExpr(expressions);
	}

	@Override
	public IASTexpression newAbstractionExpr(IASTabstraction[] abstraction,
			IASTexpression expression) {
		return new ASTabstractionExpr(abstraction, expression);
	}

		
}
