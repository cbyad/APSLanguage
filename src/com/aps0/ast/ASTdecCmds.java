package com.aps0.ast;

import com.aps0.interfaces.IASTcommands;
import com.aps0.interfaces.IASTdecCmds;
import com.aps0.interfaces.IASTdeclaration;

public class ASTdecCmds extends ASTcommand implements IASTdecCmds {

	
	protected IASTdeclaration declaration;
	protected IASTcommands listcmds;
	
	
	
	public ASTdecCmds(IASTdeclaration declaration, IASTcommands listcmds) {
		super();
		this.declaration = declaration;
		this.listcmds = listcmds;
	}

	public IASTdeclaration getDeclaration() {
		return declaration;
	}

	public IASTcommands getListcmds() {
		return listcmds;
	}

	@Override
	public String toProlog() {
		return declaration.toProlog()+" , "+listcmds.toProlog();
	}

}
