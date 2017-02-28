package com.aps0.ast;

import com.aps0.interfaces.IASTcommands;
import com.aps0.interfaces.IASTprogram;

public class ASTprogram extends AST implements IASTprogram {
	
    protected IASTcommands[] commands;
    
    
    public ASTprogram(IASTcommands[] commands) {
        this.commands = commands;
    }


    
   
    @Override
	public IASTcommands[] getListCmds() {
        return this.commands;
    }



	@Override
	public String toProlog() {
		
		StringBuilder str= new StringBuilder();
		str.append("prog([");
		
		for(int i =0 ;i< this.commands.length;i++){
			str.append(this.commands[i].toProlog());	
		}
		
		str.append("])");
		return str.toString();
		//return "prog([ "+commands.toProlog()+"])";
	}
}
