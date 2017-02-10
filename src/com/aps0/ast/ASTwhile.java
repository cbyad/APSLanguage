package com.aps0.ast;

import com.aps0.interfaces.IASTexpression;
import com.aps0.interfaces.IASTprogram;
import com.aps0.interfaces.IASTwhile;


public class ASTwhile extends ASTstatement implements IASTwhile
{
	
	protected IASTexpression condition ;
	protected IASTprogram body ;
	
	
	public ASTwhile(IASTexpression condition, IASTprogram body) {
		this.condition = condition;
		this.body = body;
	}


	public IASTexpression getCondition() {
		return condition;
	}


	public IASTprogram getBody() {
		return body;
	}

}
