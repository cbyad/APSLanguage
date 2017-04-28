package com.aps1.interfaces;

import com.aps0.interfaces.IASTexpression;
import com.aps0.interfaces.IASTtype;
import com.aps0.interfaces.IASTvariable;


public interface IASTfactory extends com.aps0.interfaces.IASTfactory {
	
	public IASTtypes  newTypes(IASTtype type , IASTtypes[] types);
	
	public IASTabstraction  newAbstraction(IASTvariable variable , IASTtype type ,IASTabstraction[] abs );
	
	public IASTapplication newApplication(IASTexpression expression, IASTapplication[] applications);
	
	
	public IASTtype newTypeFonctionnel(String name , IASTtypes[] types);
	
	
	public IASTexpression newApplicationExpr(IASTexpression[] expressions);
	public IASTexpression newAbstractionExpr(IASTabstraction[] abstraction,
			IASTexpression expression);
}