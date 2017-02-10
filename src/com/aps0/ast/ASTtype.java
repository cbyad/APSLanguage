package com.aps0.ast;

import com.aps0.interfaces.IASTtype;
import com.aps0.interfaces.IASTvisitable;
import com.aps0.interfaces.IASTvisitor;

public class ASTtype implements IASTtype,IASTvisitable
{

	@Override
	public <Result, Data, Anomaly extends Throwable> Result accept(
			IASTvisitor<Result, Data, Anomaly> visitor, Data data)
			throws Anomaly {
			
	        return visitor.visit(this, data);
	    }
	

}
