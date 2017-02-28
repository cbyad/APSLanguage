package com.aps0.ast;

import com.aps0.interfaces.IASTstatCmds;
import com.aps0.interfaces.IASTcommands;
import com.aps0.interfaces.IASTstatement;

public class ASTstatCmds extends ASTcommands implements IASTstatCmds {

	protected IASTstatement statement;
	protected IASTcommands[] listcmds;

	@Override
	public IASTstatement getStatement() {
		return statement;
	}

	public ASTstatCmds(IASTstatement statement, IASTcommands[] listCmds) {
		super();
		this.statement = statement;
		this.listcmds = listCmds;
	}

	@Override
	public String toProlog() {
		StringBuilder str = new StringBuilder();

		if (listcmds.length!=0){
			for(int i=0 ; i<this.listcmds.length; i++){
				str.append(listcmds[i].toProlog());
			}
			return statement.toProlog()+"," + str.toString();
		}
		else
			return statement.toProlog();
	}

	@Override
	public IASTcommands[] getCommandes() {
		return  listcmds;
	}
}