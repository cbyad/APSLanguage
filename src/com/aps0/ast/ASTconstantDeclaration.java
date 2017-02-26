package com.aps0.ast;

import com.aps0.interfaces.IASTconstantDeclaration;
import com.aps0.interfaces.IASTexpression;
import com.aps0.interfaces.IASTtype;

public class ASTconstantDeclaration extends ASTdeclaration 
implements IASTconstantDeclaration{
	
	protected String description ;
	protected IASTexpression expression ;
	protected IASTtype type;
	
	
	
	public ASTconstantDeclaration(String description,
			IASTexpression expression, IASTtype type) {
		super();
		this.description = description;
		this.expression = expression;
		this.type = type;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public IASTexpression getExpression() {
		return expression;
	}

	@Override
	public IASTtype getType() {
		return type;
	}

	@Override
	public String toProlog() {
		return "const(\""+description+","+type.toProlog()+","+expression.toProlog()+")";
	}

	
	
	
}
