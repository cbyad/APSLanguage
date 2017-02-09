
package com.aps0.ast;

import com.aps0.interfaces.IAST;

public abstract class AST implements IAST {
    public String getClassShortName() {
        return this.getClass().getName()
                .replaceFirst("^com.paracamplus.ilp1.", "");
    }
}
