
package com.aps0.ast;

import java.math.BigInteger;

import com.aps0.interfaces.IASTnumeric;
import com.aps0.interfaces.IASTvisitor;

public class ASTnumeric extends ASTconstant implements IASTnumeric {
	
    
    public ASTnumeric (String description) {
        super(description, new BigInteger(description));
    }
    
    @Override
	public Integer getValue() {
        return (Integer) super.getValue();
    }
    
	@Override
	public <Result, Data, Anomaly extends Throwable> Result accept(
			IASTvisitor<Result, Data, Anomaly> visitor, Data data)
			throws Anomaly {

		return visitor.visit(this, data);
	}
	@Override
	public String getName() {
		return super.name;
	}

}
