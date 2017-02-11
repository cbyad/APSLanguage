package com.aps0.ast;

import com.aps0.interfaces.IASTcommands;
import com.aps0.interfaces.IASTvisitor;

public  class ASTcommands extends AST implements IASTcommands{

	@Override
	public <Result, Data, Anomaly extends Throwable> Result accept(
			IASTvisitor<Result, Data, Anomaly> visitor, Data data)
			throws Anomaly {
		// TODO Auto-generated method stub
		return visitor.visit(this, data);
	}


}
