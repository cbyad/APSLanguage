package com.aps0.ast;

import java.util.Objects;

import com.aps0.interfaces.IASTcommands;
import com.aps0.interfaces.IASTdecCmds;
import com.aps0.interfaces.IASTdeclaration;
import com.aps0.interpreter.Environnement;
import com.aps0.interpreter.Memoire;

public class ASTdecCmds extends ASTcommands implements IASTdecCmds {

	protected IASTdeclaration declaration;
	protected IASTcommands[] listcmds;

	public ASTdecCmds(IASTdeclaration declaration, IASTcommands[] listcmds) {
		super();
		this.declaration = declaration;
		this.listcmds = listcmds;
	}

	@Override
	public IASTdeclaration getDeclaration() {
		return declaration;
	}

	@Override
	public String toProlog() {

		StringBuilder r = new StringBuilder();
		for(int i=0 ; i<this.listcmds.length; i++){
			r.append(listcmds[i].toProlog());
		}
		return declaration.toProlog()+","+r.toString();

	}

	@Override
	public IASTcommands[] getCommandes() {

		return this.listcmds;
	}

	@Override
	public void eval(Environnement env, Memoire mem) {
		Objects.requireNonNull(env,"env null");
		Objects.requireNonNull(mem,"mem null");

		declaration.eval(env, mem);
		for (int i = 0; i < listcmds.length; i++) {
			listcmds[i].eval(env, mem);
		}
		System.out.println(env + "\n" + mem);
	}

}
