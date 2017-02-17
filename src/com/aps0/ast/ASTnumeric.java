
package com.aps0.ast;

import java.math.BigInteger;

import com.aps0.interfaces.IASTnumeric;

public class ASTnumeric extends ASTconstant implements IASTnumeric {
	
    
    public ASTnumeric (String description) {
        super(description, new BigInteger(description));
    }
    
    @Override
	public Integer getValue() {
        return (Integer) super.getValue();
    }
    

	@Override
	public String getName() {
		return super.name;
	}

	@Override
	public String toProlog() {
		return getDescription();
	}

	
}
