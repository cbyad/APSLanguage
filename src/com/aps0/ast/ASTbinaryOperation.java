
package com.aps0.ast;

import com.aps0.interfaces.IASTbinaryOperation;
import com.aps0.interfaces.IASTexpression;
import com.aps0.interfaces.IASToperator;

public class ASTbinaryOperation extends ASTexpression implements IASTbinaryOperation {

    public ASTbinaryOperation (IASToperator operator,
                               IASTexpression leftOperand,
                               IASTexpression rightOperand ) {
        this.operator = operator;
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }
    private final IASToperator operator;
    private final IASTexpression leftOperand;
    private final IASTexpression rightOperand;
    
    @Override
	public IASToperator getOperator() {
        return operator;
    }

    @Override
	public IASTexpression[] getOperands() {
        return new IASTexpression[]{ leftOperand, rightOperand };
    }

    @Override
	public IASTexpression getLeftOperand() {
        return leftOperand;
    }

    @Override
	public IASTexpression getRightOperand() {
        return rightOperand;
    }

	@Override
	public String toProlog() {
		return operator.toProlog()+"("+leftOperand.toProlog()+" , "+rightOperand.toProlog()+")";
	}
    
  
}
