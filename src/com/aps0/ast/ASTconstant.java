package com.aps0.ast;

import com.aps0.interfaces.IASTconstant;

public abstract class ASTconstant extends ASTexpression 
implements IASTconstant {

    public ASTconstant(String description, Object value) {
        this.description = description;
        this.value = value;
    }
    private final String description;
    private final Object value;
    protected 
    
    @Override
	public String getDescription() {
        return this.description;
    }

    @Override
	public Object getValue() {
        return this.value;
    }
}
