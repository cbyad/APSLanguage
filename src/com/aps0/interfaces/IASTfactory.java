
package com.aps0.interfaces;

public interface IASTfactory {
	
    IASTprogram newProgram(
            IASTcommands[] command);

    IASTstatement newAlternative(
            IASTexpression condition,
            IASTcommands[] consequence,
            IASTcommands[] alternant);

    IASToperator newOperator(String name);
    
    IASTvariable newVariable(String name);
    
    IASTexpression newUnaryOperation(
            IASToperator operator,
            IASTexpression operand);

    IASTexpression newBinaryOperation(
            IASToperator operator,
            IASTexpression leftOperand,
            IASTexpression rightOperand);

    IASTexpression newNumericConstant(String value);

    IASTexpression newBooleanConstant(String value);

    IASTstatement  newWhile(IASTexpression condition , IASTcommands[] body);
   
    IASTstatement newAssignment(IASTvariable variable , IASTexpression value);
    
    
    IASTtype newType(String name);
    

	IASTconstantDeclaration newConstantDeclaration(String description,
			IASTexpression expression, IASTtype type);
	
	IASTvariableDec newVariableDec(String description, IASTtype type);
	
	IASTstatCmds newStatCmds(IASTstatement statement, IASTcommands[] listcmds);
	
	IASTdecCmds newDecCmds(IASTdeclaration declaration, IASTcommands[] listcmds);
}