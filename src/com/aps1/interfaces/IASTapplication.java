package com.aps1.interfaces;

import com.aps0.interfaces.IASTexpression;


public interface IASTapplication extends com.aps0.interfaces.IASTexpression{
	
	public IASTexpression getExpression() ;
	public IASTapplication[] getApplications() ;

}
