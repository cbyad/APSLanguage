/* *****************************************************************
 * ILP9 - Implantation d'un langage de programmation.
 * by Christian.Queinnec@paracamplus.com
 * See http://mooc.paracamplus.com/ilp9
 * GPL version 3
 ***************************************************************** */
package com.aps0.ast;


import com.aps0.interfaces.IASTexpression;
import com.aps0.interfaces.IASTprogram;

public class ASTprogram extends AST implements IASTprogram {
    public ASTprogram(IASTexpression expression) {
        this.expression = expression;
    }

    protected IASTexpression expression;
    
   
    @Override
	public IASTexpression getBody() {
        return this.expression;
    }
}
