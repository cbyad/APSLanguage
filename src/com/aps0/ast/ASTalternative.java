
package com.aps0.ast;

import com.aps0.annotation.OrNull;
import com.aps0.interfaces.IASTalternative;
import com.aps0.interfaces.IASTexpression;
import com.aps0.interfaces.IASTvisitor;

public class ASTalternative extends ASTexpression
implements IASTalternative {
    
	public ASTalternative(IASTexpression condition,
                          IASTexpression consequence,
                          IASTexpression alternant ) {
		this.condition = condition;
		this.consequence = consequence;
		this.alternant = alternant;
	}
	private final IASTexpression condition;
	private final IASTexpression consequence;
	private @OrNull final IASTexpression alternant;

	@Override
	public IASTexpression getCondition() {
		return condition;
	}

	@Override
	public IASTexpression getConsequence() {
		return consequence;
	}

	@Override
	public IASTexpression getAlternant() {
		return alternant;
	}

	@Override
	public boolean isTernary () {
	    return this.alternant != null;
	}

    @Override
	public <Result, Data, Anomaly extends Throwable> 
    Result accept(IASTvisitor<Result, Data, Anomaly> visitor, Data data)
            throws Anomaly {
        return visitor.visit(this, data);
    }
}
