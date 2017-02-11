package com.aps0.ast;

import com.aps0.interfaces.IASTcommands;
import com.aps0.interfaces.IASTprogram;
import com.aps0.interfaces.IASTvisitor;

public class ASTprogram extends AST implements IASTprogram {
	
    public ASTprogram(IASTcommands command) {
        this.command = command;
    }

    protected IASTcommands command;
    
   
    @Override
	public IASTcommands getBody() {
        return this.command;
    }


	@Override
	public <Result, Data, Anomaly extends Throwable> Result accept(
			IASTvisitor<Result, Data, Anomaly> visitor, Data data)
			throws Anomaly {
		// TODO Auto-generated method stub
		return visitor.visit(this, data);
	}
}
