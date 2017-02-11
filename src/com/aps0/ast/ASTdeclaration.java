package com.aps0.ast;
import com.aps0.interfaces.IASTcommands;
import com.aps0.interfaces.IASTdeclaration;
import com.aps0.interfaces.IASTvisitor;


public class ASTdeclaration extends ASTcommands implements IASTdeclaration
{

	protected  IASTcommands[] cmds ;
	
	@Override
	public <Result, Data, Anomaly extends Throwable> Result accept(
			IASTvisitor<Result, Data, Anomaly> visitor, Data data)
			throws Anomaly {
		
		return visitor.visit(this, data);
	}



	public IASTcommands[] getCmds() {
		return cmds;
	}

	
}

