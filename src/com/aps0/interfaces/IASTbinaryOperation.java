/* *****************************************************************
 * ILP9 - Implantation d'un langage de programmation.
 * by Christian.Queinnec@paracamplus.com
 * See http://mooc.paracamplus.com/ilp9
 * GPL version 3
 ***************************************************************** */
package com.aps0.interfaces;

public interface IASTbinaryOperation extends IASToperation {
	IASTexpression getLeftOperand();
	IASTexpression getRightOperand();
}
