
package com.aps0.interfaces;

public interface IASTbinaryOperation extends IASToperation {
	IASTexpression getLeftOperand();
	IASTexpression getRightOperand();
}
