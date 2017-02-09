
package com.aps0.ast;

import com.aps0.interfaces.Inamed;

public abstract class ASTnamed extends AST implements Inamed {
    
    public ASTnamed (String name) {
        this.name = name;
    }
    private String name;
    
    @Override
	public String getName() {
        return name;
    }
}
