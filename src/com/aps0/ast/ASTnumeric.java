
package com.aps0.ast;

import com.aps0.interfaces.IASTnumeric;

public class ASTnumeric extends ASTconstant implements IASTnumeric {
	
    
    public ASTnumeric (String description) {
        super(description, new Integer(description));
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
