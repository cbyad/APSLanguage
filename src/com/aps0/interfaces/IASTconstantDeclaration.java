package com.aps0.interfaces;

public interface IASTconstantDeclaration extends IASTdeclaration{
	//example :    CONST a 2 int
	
	/** The accurate description of the constant */
    public String getDescription(); //a 
    
	public IASTexpression getExpression(); //2
	public IASTtype getType(); //int
	
	
}
