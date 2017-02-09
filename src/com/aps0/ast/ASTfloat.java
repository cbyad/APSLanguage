/* *****************************************************************
 * ILP9 - Implantation d'un langage de programmation.
 * by Christian.Queinnec@paracamplus.com
 * See http://mooc.paracamplus.com/ilp9
 * GPL version 3
 ***************************************************************** */
package com.aps0.ast;

import java.math.BigDecimal;

import com.aps0.interfaces.IASTfloat;
import com.aps0.interfaces.IASTvisitor;

public class ASTfloat extends ASTconstant implements IASTfloat {

    public ASTfloat (String description) {
        super(description, new BigDecimal(description));
    }
    @Override
	public BigDecimal getValue() {
        return (BigDecimal) super.getValue();
    }

    @Override
	public <Result, Data, Anomaly extends Throwable> 
    Result accept(IASTvisitor<Result, Data, Anomaly> visitor, Data data)
            throws Anomaly {
        return visitor.visit(this, data);
    }
}
