
package com.aps0.interfaces;

import com.aps0.ast.ASTdecCmds;

public interface IASTfactory {
	
    IASTprogram newProgram(
            IASTcommands[] command);
    
    /*
    IASTcommands newCommands(
    		IASTcommand premcmd,
    		IASTcommands listCmds);
     */ 
  
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

    IASTstatement  newWhile(IASTexpression condition , IASTcommands[] body);
   
    IASTstatement newAssignment(IASTvariable variable , IASTexpression value);
    
    IASTconstant newConstant(String name, IASTexpression expression);
    
    IASTtype newType(String name);
    

	IASTconstantDeclaration newConstantDeclaration(String description,
			IASTexpression expression, IASTtype type);
	
	
	IASTvariableDec newVariableDec(String description, IASTtype type);

	//IASTcommand newDecCmds(IASTdeclaration declaration, IASTcommands listcmds);

	//IASTcommand newStatCmds(IASTstatement statement, IASTcommands listcmds);
	
	IASTstatCmds newStatCmds(IASTstatement statement, IASTcommands[] listcmds);
	
	IASTdecCmds newDecCmds(IASTdeclaration declaration, IASTcommands[] listcmds);
	
	
}
