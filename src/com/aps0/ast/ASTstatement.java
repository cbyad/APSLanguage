package com.aps0.ast;

import com.aps0.interfaces.IASTstatement;

public class ASTstatement extends ASTcommands implements IASTstatement
{

	
	@Override
	public String toProlog() {
		return "ASTstatement";
	}	
	
}
