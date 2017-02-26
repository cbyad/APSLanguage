package com.aps0.ast;
import com.aps0.interfaces.IASTdeclaration;


public class ASTdeclaration extends AST implements IASTdeclaration
{

	IASTdeclaration declaration;

	@Override
	public String toProlog() {
		return "ASTdeclaration";
	}


	
}

