package com.aps0.ast;

import com.aps0.interfaces.IASTbinaryOperation;
import com.aps0.interfaces.IASTcommand;
import com.aps0.interfaces.IASTcommands;
import com.aps0.interfaces.IASTconstant;
import com.aps0.interfaces.IASTconstantDeclaration;
import com.aps0.interfaces.IASTdeclaration;
import com.aps0.interfaces.IASTfactory;
import com.aps0.interfaces.IASTexpression;
import com.aps0.interfaces.IASToperator;
import com.aps0.interfaces.IASTprogram;
import com.aps0.interfaces.IASTstatement;
import com.aps0.interfaces.IASTtype;
import com.aps0.interfaces.IASTunaryOperation;
import com.aps0.interfaces.IASTvariable;
import com.aps0.interfaces.IASTvariableDec;

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

	@Override
	public IASTconstant newConstant(String name, IASTexpression expression
			) {
		return new ASTconstant(name, expression);
	}

	@Override
	public IASTtype newType(String name) {
		return new ASTtype(name);
	}

	@Override
	public IASTconstantDeclaration newConstantDeclaration(String description,
			IASTexpression expression, IASTtype type) {
		return new ASTconstantDeclaration(description, expression, type);
	}

	@Override
	public IASTvariableDec newVariableDec(String description, IASTtype type) {
		return new ASTVariableDec(description, type);
	}

	@Override
	public IASTcommands newCommands(IASTcommand premcmd, IASTcommands listcmds) {
		return new ASTcommands(premcmd, listcmds);
	}



	@Override
	public IASTcommand newDecCmds(IASTdeclaration declaration, IASTcommands listcmds) {
		return new ASTdecCmds(declaration, listcmds);
	}

	@Override
	public IASTcommand newStatCmds(IASTstatement statement, IASTcommands listcmds) {
		return new ASTStatCmds(statement, listcmds);
	}

   

    
    
}
