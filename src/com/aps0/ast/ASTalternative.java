
package com.aps0.ast;

import com.aps0.annotation.OrNull;
import com.aps0.interfaces.IASTalternative;
import com.aps0.interfaces.IASTexpression;
import com.aps0.interfaces.IASTprogram;
import com.aps0.interfaces.IASTvisitor;

public class ASTalternative extends ASTstatement
implements IASTalternative {
    
	public ASTalternative(IASTexpression condition,
			IASTprogram consequence,
			IASTprogram alternant ) {
		this.condition = condition;
		this.consequence = consequence;
		this.alternant = alternant;
	}
	private final IASTexpression condition;
	private final IASTprogram consequence;
	private @OrNull final IASTprogram alternant;

	@Override
	public IASTexpression getCondition() {
		return condition;
	}

	@Override
	public IASTprogram getConsequence() {
		return consequence;
	}

	@Override
	public IASTprogram getAlternant() {
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
