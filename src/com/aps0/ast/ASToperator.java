
package com.aps0.ast;

import com.aps0.interfaces.IASToperator;
import com.aps0.interfaces.IASTvisitor;

public class ASToperator extends ASTnamed implements IASToperator {
    public ASToperator (String name) {
        super(name);
    }

    public <Result, Data, Anomaly extends Throwable> 
    Result accept(IASTvisitor<Result, Data, Anomaly> visitor, Data data)
            throws Anomaly {
        return visitor.visit(this, data);
    }
}
