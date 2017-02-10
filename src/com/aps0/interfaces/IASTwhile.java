package com.aps0.interfaces;

public interface IASTwhile extends IASTstatement{

	public IASTexpression getCondition() ;
	public IASTprogram getBody();
	
}
