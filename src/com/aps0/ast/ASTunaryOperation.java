
package com.aps0.ast;

import java.util.Objects;

import com.aps0.interfaces.IASTexpression;
import com.aps0.interfaces.IASToperator;
import com.aps0.interfaces.IASTunaryOperation;
import com.aps0.interpreter.Environnement;
import com.aps0.interpreter.Memoire;

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

	@Override
	public Object eval(Environnement env, Memoire mem) {
		
		Objects.requireNonNull(env,"env null");
		Objects.requireNonNull(mem,"mem null");
		
		
		if(operator.getName().equals("not")){
			
			if(operand.eval(env, mem) instanceof  Boolean){
				
				Boolean b  = (Boolean)operand.eval(env, mem) ;
				
				return !b.booleanValue();
			}
			throw new Error("not boolean");
		}
		
		else {
			throw new Error("operand non def");
		}
		
		
}
	
}
