
package com.aps0.ast;

import com.aps0.interfaces.IASTtype;
import com.aps0.interfaces.IASTvariable;

public class ASTvariable extends ASTnamed implements IASTvariable {

	protected IASTtype type ;
	
	
	public IASTtype getType(){return this.type ;}
	
    public ASTvariable (String name) {
        super(name);
    }

	@Override
	public String toProlog() {
		
		return getName();
	}

 
    
    
}
