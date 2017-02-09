/* *****************************************************************
 * ILP9 - Implantation d'un langage de programmation.
 * by Christian.Queinnec@paracamplus.com
 * See http://mooc.paracamplus.com/ilp9
 * GPL version 3
 ***************************************************************** */
package com.aps0.ast;

import com.aps0.interfaces.IASTalternative;
import com.aps0.interfaces.IASTbinaryOperation;
import com.aps0.interfaces.IASTblock;
import com.aps0.interfaces.IASTblock.IASTbinding;
import com.aps0.interfaces.IASTfactory;
import com.aps0.interfaces.IASTboolean;
import com.aps0.interfaces.IASTexpression;
import com.aps0.interfaces.IASTfloat;
import com.aps0.interfaces.IASTinteger;
import com.aps0.interfaces.IASTinvocation;
import com.aps0.interfaces.IASToperator;
import com.aps0.interfaces.IASTprogram;
import com.aps0.interfaces.IASTsequence;
import com.aps0.interfaces.IASTstring;
import com.aps0.interfaces.IASTunaryOperation;
import com.aps0.interfaces.IASTvariable;

public class ASTfactory implements IASTfactory {

    @Override
	public IASTprogram newProgram(IASTexpression expression) {
        return new ASTprogram(expression);
    }
    
    @Override
	public IASToperator newOperator(String name) {
        return new ASToperator(name);
    }

    @Override
	public IASTsequence newSequence(IASTexpression[] asts) {
        return new ASTsequence(asts);
    }

    @Override
	public IASTalternative newAlternative(IASTexpression condition,
                                          IASTexpression consequence, 
                                          IASTexpression alternant) {
        return new ASTalternative(condition, consequence, alternant);
    }

    @Override
	public IASTvariable newVariable(String name) {
        return new ASTvariable(name);
    }


    @Override
	public IASTunaryOperation newUnaryOperation(IASToperator operator,
                                                IASTexpression operand) {
        return new ASTunaryOperation(operator, operand);
    }

    @Override
	public IASTbinaryOperation newBinaryOperation(IASToperator operator,
            IASTexpression leftOperand, IASTexpression rightOperand) {
        return new ASTbinaryOperation(operator, leftOperand, rightOperand);
    }

    @Override
	public IASTinteger newIntegerConstant(String value) {
        return new ASTinteger(value); 
    }

    @Override
	public IASTfloat newFloatConstant(String value) {
        return new ASTfloat(value);
    }

    @Override
	public IASTstring newStringConstant(String value) {
        return new ASTstring(value);
    }

    @Override
	public IASTboolean newBooleanConstant(String value) {
        return new ASTboolean(value);
    }


    @Override
	public IASTblock newBlock(IASTbinding[] binding,
                              IASTexpression body) {
        return new ASTblock(binding, body);
    }
    @Override
	public IASTbinding newBinding(IASTvariable variable, IASTexpression initialisation) {
        return new ASTblock.ASTbinding(variable, initialisation);
    }
    
    @Override
	public IASTinvocation newInvocation(IASTexpression function,
            IASTexpression[] arguments) {
    	return new ASTinvocation(function, arguments);
    }

}
