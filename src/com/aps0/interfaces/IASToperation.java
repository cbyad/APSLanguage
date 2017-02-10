
package com.aps0.interfaces;

public abstract interface IASToperation extends IASTexpression {
	IASToperator getOperator();
	IASTexpression[] getOperands();
}
