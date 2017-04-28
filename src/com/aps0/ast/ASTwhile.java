package com.aps0.ast;


import com.aps0.interfaces.IASTcommands;
import com.aps0.interfaces.IASTexpression;
import com.aps0.interfaces.IASTwhile;
import com.aps0.interpreter.Environnement;
import com.aps0.interpreter.Memoire;


public class ASTwhile extends ASTstatement implements IASTwhile
{

	protected IASTexpression condition ;
	protected IASTcommands[] body ;


	public ASTwhile(IASTexpression condition, IASTcommands[] body) {
		this.condition = condition;
		this.body = body;
	}


	public IASTexpression getCondition() {
		return condition;
	}


	public IASTcommands[] getBody() {
		return body;
	}


	@Override
	public String toProlog() {


		StringBuilder str= new StringBuilder();
		str.append("while("+condition.toProlog()+",[");

		for(int i =0 ;i< this.body.length;i++){
			str.append(this.body[i].toProlog());	
		}
		str.append("])");
		return str.toString();
	}


	@Override
	public void eval(Environnement env, Memoire mem) {
		try {
			Environnement envNext =(Environnement)env.clone();

						while((Boolean)this.condition.eval(env, mem).equals(true)){
			
							for(int i=0 ; i<body.length;i++){
			
								body[i].eval(env,mem);
								env=envNext;
								mem.restriction(env);	
							}	
						}

			int i =0 ;

			
//			while((Boolean)this.condition.eval(env, mem).equals(true) 
//					&& i<body.length){
//
//				body[i].eval(env,mem);
//				env=envNext;
//				mem.restriction(env);
//				i++ ;
//			}
		
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} 
		System.out.println(env + "\n" + mem);
	}
}
