
package com.aps0.ast;

import com.aps0.interfaces.IASTboolean;
import com.aps0.interfaces.IASTvisitor;

public class ASTboolean extends ASTconstant implements IASTboolean {

    public ASTboolean (String description) {
        super(description, "true".equals(description));
    }
    
    @Override
	public Boolean getValue() {
        return (Boolean) super.getValue();
    }

	@Override
	public <Result, Data, Anomaly extends Throwable> Result accept(
			IASTvisitor<Result, Data, Anomaly> visitor, Data data)
			throws Anomaly {
		
		return visitor.visit(this, data) ;
	}

	
	@Override
	public String getName() {
		return super.name;
	}

    
}
