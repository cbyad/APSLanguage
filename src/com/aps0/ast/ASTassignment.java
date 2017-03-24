package com.aps0.ast;

import com.aps0.interfaces.IASTassignment;
import com.aps0.interfaces.IASTexpression;
import com.aps0.interfaces.IASTvariable;
import com.aps0.interpreter.Adresse;
import com.aps0.interpreter.Environnement;
import com.aps0.interpreter.Memoire;

public class ASTassignment extends ASTstatement 
implements IASTassignment{

    public ASTassignment (IASTvariable variable, IASTexpression expression) {
        this.variable = variable;
        this.expression = expression;
    }
    private final IASTvariable variable;
    private final IASTexpression expression;
    
    @Override
	public IASTvariable getVariable() {
        return variable;
    }

    @Override
	public IASTexpression getExpression() {
        return expression;
    }

	@Override
	public String toProlog() {
		return "set(\""+variable.toProlog()+"\","+expression.toProlog()+")";
	}

	@Override
	public void eval(Environnement env, Memoire mem) {
		
		if(env.getEnv().containsKey(this.variable.getName())){
			Adresse a = (Adresse)env.getEnv().get(this.variable.getName());
			Object v =this.expression.eval(env, mem);
			mem.modif(a, v);
		}
	}
    
}
