package com.aps0.ast;

import org.antlr.v4.parse.ANTLRParser.throwsSpec_return;

import com.aps0.interfaces.IASTident;
import com.aps0.interpreter.Adresse;
import com.aps0.interpreter.Environnement;
import com.aps0.interpreter.Memoire;

public class ASTident extends  ASTexpression  implements IASTident{
	protected String ident ;


	public ASTident(String ident) {
		this.ident= ident ;
	}

	@Override
	public String toProlog() {
		return getName() ;
	}

	@Override
	public Object eval(Environnement env, Memoire mem) {

		if(env.getEnv().containsKey(ident)){
			Object obj= env.getEnv().get(ident);

			if(obj instanceof Adresse){
				System.out.println(env + "\n" + mem);
				return mem.getMem().get(obj);
			}

			else {
				System.out.println(env + "\n" + mem);
				return obj ;

			}
		}
		throw  new Error("ni adresse ni value");

	}

	@Override
	public String getName() {
		return ident ;
	}

}
