
package com.aps0.ast;

import com.aps0.interfaces.IASTtype;
import com.aps0.interfaces.IASTvariable;
import com.aps0.interfaces.IASTvisitor;

public class ASTvariable extends ASTnamed implements IASTvariable {

	protected IASTtype type ;
	
	public IASTtype getType(){return this.type ;}
	
    public ASTvariable (String name) {
        super(name);
    }

    @Override
	public <Result, Data, Anomaly extends Throwable> 
    Result accept(IASTvisitor<Result, Data, Anomaly> visitor, Data data)
            throws Anomaly {
        return visitor.visit(this, data);
    }
    
    /*
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("<");
        sb.append(this.getClassShortName());
        sb.append(" name='");
        sb.append(this.getName());
        sb.append("'/>");
        return sb.toString();
    }
    */
}
