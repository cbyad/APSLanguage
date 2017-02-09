/* *****************************************************************
 * ILP9 - Implantation d'un langage de programmation.
 * by Christian.Queinnec@paracamplus.com
 * See http://mooc.paracamplus.com/ilp9
 * GPL version 3
 ***************************************************************** */
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
