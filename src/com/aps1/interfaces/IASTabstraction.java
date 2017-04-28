package com.aps1.interfaces;

import com.aps0.interfaces.IASTexpression;
import com.aps0.interfaces.IASTtype;
import com.aps0.interfaces.IASTvariable;

public interface IASTabstraction extends IASTexpression{
	
	
	public   IASTvariable getVariable() ;
	public  	IASTtype getType() ;
	public  IASTabstraction[] getAbstractions() ;

}
