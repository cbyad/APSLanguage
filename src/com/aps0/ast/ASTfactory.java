package com.aps0.ast;

import com.aps0.interfaces.IASTalternative;
import com.aps0.interfaces.IASTbinaryOperation;
import com.aps0.interfaces.IASTcommands;
import com.aps0.interfaces.IASTfactory;
import com.aps0.interfaces.IASTboolean;
import com.aps0.interfaces.IASTexpression;
import com.aps0.interfaces.IASTnumeric;
import com.aps0.interfaces.IASToperator;
import com.aps0.interfaces.IASTprogram;
import com.aps0.interfaces.IASTstatement;
import com.aps0.interfaces.IASTunaryOperation;
import com.aps0.interfaces.IASTvariable;

public class ASTfactory implements IASTfactory {

    @Override
	public IASTprogram newProgram(IASTcommands command) {
        return new ASTprogram(command);
    }
    
    @Override
	public IASToperator newOperator(String name) {
        return new ASToperator(name);
    }

 

    @Override
	public IASTstatement newAlternative(IASTexpression condition,
                                          IASTprogram consequence, 
                                          IASTprogram alternant) {
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
	public IASTexpression newNumericConstant(String value) {
		return new ASTnumeric(value);
	}

	@Override
	public IASTexpression newBooleanConstant(String value) {
		return new ASTboolean(value);
	}

	@Override
	public IASTstatement newWhile(IASTexpression condition, IASTprogram body) {
		return new ASTwhile(condition, body);
	}

	@Override
	public IASTstatement newAssignment(IASTvariable variable,
			IASTexpression value) {
		return new ASTassignment(variable, value);
	}

   


 

    
    
    
}
