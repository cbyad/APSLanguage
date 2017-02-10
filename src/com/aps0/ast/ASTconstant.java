package com.aps0.ast;

import com.aps0.interfaces.IASTconstant;
import com.aps0.interfaces.IASTexpression;
import com.aps0.interfaces.IASTtype;
import com.aps0.interfaces.IASTvisitor;

public class ASTconstant extends ASTexpression 
implements IASTconstant {

    public ASTconstant(String description, Object value) {
        this.description = description;
        this.value = value;
    }
    
    
    
    public ASTconstant(String name, IASTexpression expression, IASTtype type) {
		super();
		this.description=null;
		this.value=null;
		this.name = name;
		this.expression = expression;
		this.type = type;
	}



	private final String description;
    private final Object value;
    protected String name;
    protected IASTexpression expression;
    protected IASTtype type;
    
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		return name;
	}
}
