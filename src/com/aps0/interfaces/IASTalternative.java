/* *****************************************************************
 * ILP9 - Implantation d'un langage de programmation.
 * by Christian.Queinnec@paracamplus.com
 * See http://mooc.paracamplus.com/ilp9
 * GPL version 3
 ***************************************************************** */
package com.aps0.interfaces;

import com.aps0.annotation.OrNull;

public interface IASTalternative extends IASTexpression {
	IASTexpression getCondition();
	IASTexpression getConsequence();
	@OrNull IASTexpression getAlternant();
	boolean isTernary();
}
