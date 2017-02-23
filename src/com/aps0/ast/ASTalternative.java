package com.aps0.ast;

import com.aps0.annotation.OrNull;
import com.aps0.interfaces.IASTalternative;
import com.aps0.interfaces.IASTexpression;
import com.aps0.interfaces.IASTprogram;

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
	public String toProlog() {
		return "if("+condition.toProlog()+","+">>CONSEQUENCE<<"+","+">>ALTERNANT<<";
		//return "if("+condition.toProlog()+","+consequence.toProlog()+","+alternant.toProlog();
	}

  
}
