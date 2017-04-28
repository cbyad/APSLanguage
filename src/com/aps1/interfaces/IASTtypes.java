package com.aps1.interfaces;

import com.aps0.annotation.OrNull;
import com.aps0.interfaces.IAST;
import com.aps0.interfaces.IASTtype;
import com.aps0.interfaces.Inamed;

public abstract interface IASTtypes extends IAST{
	
	
	public  IASTtype getType() ;
	
	public  IASTtypes[] getTypes() ;

}

