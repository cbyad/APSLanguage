package com.aps0.ast;

import com.aps0.interfaces.IASTcommands;
import com.aps0.interfaces.IASTprogram;

public class ASTprogram extends AST implements IASTprogram {
	
    public ASTprogram(IASTcommands command) {
        this.command = command;
    }

    protected IASTcommands command;
    
   
    @Override
	public IASTcommands getBody() {
        return this.command;
    }
}
