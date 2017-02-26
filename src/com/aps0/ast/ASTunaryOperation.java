
package com.aps0.ast;

import com.aps0.interfaces.IASTexpression;
import com.aps0.interfaces.IASToperator;
import com.aps0.interfaces.IASTunaryOperation;

public class ASTunaryOperation extends ASTexpression implements IASTunaryOperation {
    
    public ASTunaryOperation (IASToperator operator, IASTexpression operand) {
        this.operator = operator;
        this.operand = operand;
    }
    private final IASToperator operator;
    private final IASTexpression operand;
    
    @Override
	public IASTexpression getOperand() {
        return operand;
    }

    @Override
	public IASToperator getOperator() {
        return operator;
    }

    @Override
	public IASTexpression[] getOperands() {
        return new IASTexpression[]{ getOperand() };
    }
    
  
	@Override
	public String toProlog() {
	return operator.toProlog()+"("+operand.toProlog()+")";
	}
}
