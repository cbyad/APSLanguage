package com.aps1.ast;

import com.aps0.annotation.OrNull;
import com.aps0.ast.AST;
import com.aps0.interfaces.IASTtype;
import com.aps1.interfaces.IASTtypes;

public class ASTtypes extends AST implements IASTtypes{

	protected IASTtype type ;
	
	@OrNull protected IASTtypes[] types ;
	
	
		
	public ASTtypes( IASTtype type, IASTtypes[] types) {
		this.type = type;
		this.types = types;
	}



	@Override
	public String toProlog() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IASTtype getType() {
		return type;
	}

	@Override
	public IASTtypes[] getTypes() {
		return types;
	}

}
