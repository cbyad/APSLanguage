
package com.aps0.ast;

import com.aps0.interfaces.IASTexpression;
import com.aps0.interfaces.IASToperator;
import com.aps0.interfaces.IASTunaryOperation;
import com.aps0.interfaces.IASTvisitor;

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
	public <Result, Data, Anomaly extends Throwable> 
    Result accept(IASTvisitor<Result, Data, Anomaly> visitor, Data data)
            throws Anomaly {
        return visitor.visit(this, data);
    }
}
