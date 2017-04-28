package com.aps0.ast;


import com.aps0.interfaces.IASTcommands;
import com.aps0.interfaces.IASTprogram;
import com.aps0.interpreter.Environnement;
import com.aps0.interpreter.Memoire;

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
	}

	@Override
	public void eval(Environnement env, Memoire mem) {
		System.out.println("Etat avant evaluation "+env + mem);
		for(int i=0 ; i<commands.length;i++){
			commands[i].eval(env,mem);
		}
		mem.restriction(env);
		System.out.println("Etat apres evaluation "+env + mem);
	}
	
}
