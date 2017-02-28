package com.aps0.ast;

import com.aps0.interfaces.IASTtype;

public class ASTtype extends ASTnamed implements IASTtype
{
	
	public  ASTtype(String name) {
		super(name);
	}

	@Override
	public String toProlog() {
		return getName();
	}
	
}
