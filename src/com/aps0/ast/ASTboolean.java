
package com.aps0.ast;

import java.util.Objects;

import com.aps0.interfaces.IASTboolean;
import com.aps0.interpreter.Environnement;
import com.aps0.interpreter.Memoire;

public class ASTboolean extends ASTconstant implements IASTboolean {

    public ASTboolean (String description) {
        super(description, "true".equals(description));
    }
    
    @Override
	public Boolean getValue() {
        return (Boolean) super.getValue();
    }
	
	@Override
	public String getName() {
		return super.name;
	}

	@Override
	public String toProlog() {
		return getValue().toString();
	}

	@Override
	public Object eval(Environnement env, Memoire mem) {
		
		Objects.requireNonNull(env,"env null");
		Objects.requireNonNull(mem,"mem null");
		System.out.println(env + "\n" + mem);
		return getValue();
	}
	
    
}
