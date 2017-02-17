package com.aps0.ast;

import com.aps0.annotation.OrNull;
import com.aps0.interfaces.IASTcommand;
import com.aps0.interfaces.IASTcommands;

public  class ASTcommands extends AST implements IASTcommands{

	
	protected IASTcommand premcmd;
	protected @OrNull IASTcommands listcmds;
	
	
	public ASTcommands(IASTcommand premcmd, IASTcommands listcmds) {
		super();
		this.premcmd = premcmd;
		this.listcmds = listcmds;
	}

	public IASTcommand getPremCmd() {
		return this.premcmd;
	}
	
	public IASTcommands getListcmds() {
		return listcmds;
	}


	@Override
	public String toProlog() {
		if (listcmds!=null)
			return premcmd.toProlog()+listcmds.toProlog();
		else
			return premcmd.toProlog();
	}

	
	




}
