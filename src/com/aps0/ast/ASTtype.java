package com.aps0.ast;

import com.aps0.interfaces.IASTtype;

public class ASTtype extends AST implements IASTtype
{
	protected String name ;
	
	
	public  ASTtype(String name) {
		this.name=name ;
	}

	
	@Override
	public String getName() {
		return this.name;
	}


	@Override
	public String toProlog() {
		return name;
	}
	
	

}
