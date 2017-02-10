
package com.aps0.interfaces;

public interface IASTfactory {
	
    IASTprogram newProgram(
            IASTcommands command);
    

    IASTstatement newAlternative(
            IASTexpression condition,
            IASTprogram consequence,
            IASTprogram alternant);

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

    IASTstatement  newWhile(IASTexpression condition , IASTprogram body);
   
    IASTstatement newAssignment(IASTvariable variable , IASTexpression value);
    
    IASTconstant newConstant(String name, IASTexpression expression, IASTtype type);
    
    
    
    
   
}
