
package com.aps0.ast;

import com.aps0.interfaces.IASTboolean;
import com.aps0.interfaces.IASTtype;
import com.aps0.interfaces.IASTvisitor;

public class ASTboolean extends ASTconstant implements IASTboolean,IASTtype {

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
		// TODO Auto-generated method stub
		return null;
	}

    
}
