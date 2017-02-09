/* *****************************************************************
 * ILP9 - Implantation d'un langage de programmation.
 * by Christian.Queinnec@paracamplus.com
 * See http://mooc.paracamplus.com/ilp9
 * GPL version 3
 ***************************************************************** */
package com.aps0.ast;

import java.math.BigInteger;

import com.aps0.interfaces.IASTinteger;
import com.aps0.interfaces.IASTvisitor;

public class ASTinteger extends ASTconstant implements IASTinteger {
    
    public ASTinteger (String description) {
        super(description, new BigInteger(description));
    }
    @Override
	public BigInteger getValue() {
        return (BigInteger) super.getValue();
    }

    @Override
	public <Result, Data, Anomaly extends Throwable> 
    Result accept(IASTvisitor<Result, Data, Anomaly> visitor, Data data)
            throws Anomaly {
        return visitor.visit(this, data);
    }
}
