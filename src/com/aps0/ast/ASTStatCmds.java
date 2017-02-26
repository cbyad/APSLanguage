package com.aps0.ast;

import com.aps0.annotation.OrNull;
import com.aps0.interfaces.IASTstatCmds;
import com.aps0.interfaces.IASTcommands;
import com.aps0.interfaces.IASTstatement;

public class ASTStatCmds extends ASTcommands implements IASTstatCmds {

	protected IASTstatement statement;
	protected IASTcommands[] listcmds;
	
	@Override
	public IASTstatement getStatement() {
		return statement;
	}



	public ASTStatCmds(IASTstatement statement, IASTcommands[] listCmds) {
		super();
		this.statement = statement;
		this.listcmds = listCmds;
	}


	@Override
	public String toProlog() {
		
		if (listcmds!=null){
			StringBuilder r = new StringBuilder();
		for(int i=0 ; i<this.listcmds.length; i++){
			r.append(listcmds[i].toProlog());
		}
			return statement.toProlog()+" ," + r.toString();
		}
		else
			return statement.toProlog();
		
	
	}


	@Override
	public IASTcommands[] getCommandes() {
		
		return  listcmds;
	}
	
		

}
