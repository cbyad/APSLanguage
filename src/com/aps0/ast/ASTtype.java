package com.aps0.ast;

import com.aps0.interfaces.IASTtype;
import com.aps0.interfaces.IASTvisitable;
import com.aps0.interfaces.IASTvisitor;

public class ASTtype implements IASTtype,IASTvisitable
{
	protected String name ;
	
	
	public  ASTtype(String name) {
		this.name=name ;
	}

	@Override
	public <Result, Data, Anomaly extends Throwable> Result accept(
			IASTvisitor<Result, Data, Anomaly> visitor, Data data)
			throws Anomaly {
			
	        return visitor.visit(this, data);
	    }

	@Override
	public String getName() {
		return this.name;
	}
	
	

}
