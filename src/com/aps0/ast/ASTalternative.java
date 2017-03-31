package com.aps0.ast;

import com.aps0.annotation.OrNull;
import com.aps0.interfaces.IASTalternative;
import com.aps0.interfaces.IASTcommands;
import com.aps0.interfaces.IASTexpression;
import com.aps0.interpreter.Environnement;
import com.aps0.interpreter.Memoire;

public class ASTalternative extends ASTstatement
implements IASTalternative {

	public ASTalternative(IASTexpression condition,
			IASTcommands[] consequence,
			IASTcommands[] alternant ) {
		this.condition = condition;
		this.consequence = consequence;
		this.alternant = alternant;
	}
	private final IASTexpression condition;
	private final IASTcommands[] consequence;
	private @OrNull final IASTcommands[] alternant;

	@Override
	public IASTexpression getCondition() {
		return condition;
	}

	@Override
	public IASTcommands[] getConsequence() {
		return consequence;
	}

	@Override
	public IASTcommands[] getAlternant() {
		return alternant;
	}

	@Override
	public boolean isTernary () {
		return this.alternant != null;
	}

	@Override
	public String toProlog() {

		StringBuilder str= new StringBuilder();

		if(isTernary()){
			str.append("if("+condition.toProlog()+",[");

			for(int i=0 ;i<this.consequence.length;i++){
				str.append(consequence[i].toProlog());
			}
			str.append("],[");

			for(int i=0 ;i<this.alternant.length;i++){
				str.append(alternant[i].toProlog());
			}
			str.append("])");

			return str.toString() ;
		}

		else {

			str.append("if("+condition.toProlog()+",[");

			for(int i=0 ;i<this.consequence.length;i++){
				str.append(consequence[i].toProlog());
			}
			str.append("])");

			return str.toString() ;
		}
	}

	@Override
	public void eval(Environnement env, Memoire mem) {

		try {
			Environnement envNext =(Environnement)env.clone();


			if((Boolean)this.condition.eval(env, mem).equals(true) ){

				for(int i=0 ; i<consequence.length;i++){

					consequence[i].eval(env,mem);
				}	
			}
			else
			{
				for(int i=0 ; i<consequence.length;i++){
					alternant[i].eval(env,mem);
				}	
			}
			env=envNext;
			mem.restriction(env);


		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} 
		System.out.println(env + "\n" + mem);
	}

}








