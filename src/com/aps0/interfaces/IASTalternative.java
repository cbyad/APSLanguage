
package com.aps0.interfaces;

import com.aps0.annotation.OrNull;

public interface IASTalternative extends IASTstatement {
	IASTexpression getCondition();
	IASTcommands[] getConsequence();
	@OrNull IASTcommands[] getAlternant();
	boolean isTernary();
	
}
