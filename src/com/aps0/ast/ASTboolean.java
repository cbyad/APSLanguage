
package com.aps0.ast;

import com.aps0.interfaces.IASTboolean;

public class ASTboolean extends ASTconstant implements IASTboolean {

    public ASTboolean (String description) {
        super(description, "true".equals(description));
    }
    
    @Override
	public Boolean getValue() {
        return (Boolean) super.getValue();
    }



	
	@Override
	public String getName() {
		return super.name;
	}

	@Override
	public String toProlog() {
		return getValue().toString();
	}
	
	

    
}
