
package com.aps0.ast;

import com.aps0.interfaces.IASToperator;

public class ASToperator extends ASTnamed implements IASToperator {
    public ASToperator (String name) {
        super(name);
    }

	@Override
	public String toProlog() {
		return getName();
	}

  
}
