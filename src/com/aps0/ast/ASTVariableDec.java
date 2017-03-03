package com.aps0.ast;

import com.aps0.interfaces.IASTtype;
import com.aps0.interfaces.IASTvariableDec;

public class ASTVariableDec extends ASTdeclaration implements 
IASTvariableDec {

	protected String description;
	protected IASTtype type;

	public ASTVariableDec(String description, IASTtype type) {
		super();
		this.description = description;
		this.type = type;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public IASTtype getType() {
		return type;
	}

	@Override
	public String toProlog() {
		return "var(\""+description+"\","+type.toProlog()+")";
	}
}
