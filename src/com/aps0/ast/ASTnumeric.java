
package com.aps0.ast;

import java.util.Objects;

import com.aps0.interfaces.IASTnumeric;
import com.aps0.interpreter.Environnement;
import com.aps0.interpreter.Memoire;

public class ASTnumeric extends ASTconstant implements IASTnumeric {


	public ASTnumeric (String description) {
		super(description, new Integer(description));
	}

	@Override
	public Integer getValue() {
		return (Integer) super.getValue();
	}


	@Override
	public String getName() {
		return super.name;
	}

	@Override
	public String toProlog() {
		return getDescription();
	}

	@Override
	public Object eval(Environnement env, Memoire mem) {

		Objects.requireNonNull(env,"env null");
		Objects.requireNonNull(mem,"mem null");
		System.out.println(env + "\n" + mem);
		return getValue();
	}

}
