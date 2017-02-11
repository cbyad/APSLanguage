package com.aps0.ast;

import com.aps0.interfaces.IASTconstant;
import com.aps0.interfaces.IASTexpression;
import com.aps0.interfaces.IASTtype;
import com.aps0.interfaces.IASTvisitor;


/*
 * ASTconstant is used for bool/num constante
 * not the same with data introduiced by 'const'
 * 
 */

public class ASTconstant extends ASTexpression 
implements IASTconstant {

	private final String description;
    private final Object value;
    protected String name;
    protected IASTexpression expression;
    protected IASTtype type;
    
    public ASTconstant(String description, Object value) {
        this.description = description;
        this.value = value;
    }
    
    

    

    @Override
	public String getDescription() {
        return this.description;
    }

    @Override
	public Object getValue() {
        return this.value;
    }

	@Override
	public <Result, Data, Anomaly extends Throwable> Result accept(
			IASTvisitor<Result, Data, Anomaly> visitor, Data data)
			throws Anomaly {
		return visitor.visit(this, data);
	}

	@Override
	public String getName() {
		return name;
	}
}
