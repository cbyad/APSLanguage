package com.aps0.ast;

import com.aps0.annotation.OrNull;
import com.aps0.interfaces.IASTStatCmds;
import com.aps0.interfaces.IASTcommands;
import com.aps0.interfaces.IASTstatement;

public class ASTStatCmds extends ASTcommand implements IASTStatCmds {

	protected IASTstatement statement;
	protected @OrNull IASTcommands listcmds;
	
	
	public IASTstatement getStatement() {
		return statement;
	}


	public IASTcommands getListCmds() {
		return listcmds;
	}


	public ASTStatCmds(IASTstatement statement, IASTcommands listCmds) {
		super();
		this.statement = statement;
		this.listcmds = listCmds;
	}


	@Override
	public String toProlog() {
		if (listcmds!=null)
			return statement.toProlog()+listcmds.toProlog();
		else
			return statement.toProlog();
	}

}
