package com.aps0.ast;

import com.aps0.interfaces.IASTassignment;
import com.aps0.interfaces.IASTexpression;
import com.aps0.interfaces.IASTvariable;

public class ASTassignment extends ASTstatement 
implements IASTassignment{

    public ASTassignment (IASTvariable variable, IASTexpression expression) {
        this.variable = variable;
        this.expression = expression;
    }
    private final IASTvariable variable;
    private final IASTexpression expression;
    
    @Override
	public IASTvariable getVariable() {
        return variable;
    }

    @Override
	public IASTexpression getExpression() {
        return expression;
    }

	@Override
	public String toProlog() {
		return "set(\""+">>variable>>"+","+">>expression<<"+")";
		//return "set(\""+variable.toProlog()+","+expression.toProlog()+")";
	}
    //TODO
    
}
