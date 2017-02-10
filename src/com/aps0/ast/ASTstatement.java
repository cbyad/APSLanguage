package com.aps0.ast;

import com.aps0.interfaces.IASTcommands;
import com.aps0.interfaces.IASTstatement;
import com.aps0.interfaces.IASTvisitor;

public class ASTstatement extends ASTcommands implements IASTstatement{

	protected IASTcommands[] cmds ;
	
	@Override
	public <Result, Data, Anomaly extends Throwable> Result accept(
			IASTvisitor<Result, Data, Anomaly> visitor, Data data)
			throws Anomaly {
		// TODO Auto-generated method stub
		return null;
	}

	public IASTcommands[] getCmds() {
		return cmds;
	}


	
	
}
