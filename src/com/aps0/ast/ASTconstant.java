/* *****************************************************************
 * ILP9 - Implantation d'un langage de programmation.
 * by Christian.Queinnec@paracamplus.com
 * See http://mooc.paracamplus.com/ilp9
 * GPL version 3
 ***************************************************************** */
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
    
    @Override
	public String getDescription() {
        return this.description;
    }

    @Override
	public Object getValue() {
        return this.value;
    }
}
