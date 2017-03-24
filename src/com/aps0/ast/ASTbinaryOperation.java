
package com.aps0.ast;

import java.util.Objects;

import com.aps0.interfaces.IASTbinaryOperation;
import com.aps0.interfaces.IASTexpression;
import com.aps0.interfaces.IASToperator;
import com.aps0.interpreter.Environnement;
import com.aps0.interpreter.Memoire;

public class ASTbinaryOperation extends ASTexpression implements IASTbinaryOperation {

	public ASTbinaryOperation (IASToperator operator,
			IASTexpression leftOperand,
			IASTexpression rightOperand ) {
		this.operator = operator;
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}
	private final IASToperator operator;
	private final IASTexpression leftOperand;
	private final IASTexpression rightOperand;

	@Override
	public IASToperator getOperator() {
		return operator;
	}

	@Override
	public IASTexpression[] getOperands() {
		return new IASTexpression[]{ leftOperand, rightOperand };
	}

	@Override
	public IASTexpression getLeftOperand() {
		return leftOperand;
	}

	@Override
	public IASTexpression getRightOperand() {
		return rightOperand;
	}

	@Override
	public String toProlog() {
		return operator.toProlog()+"("+leftOperand.toProlog()+" , "+rightOperand.toProlog()+")";
	}

	@Override
	public Object eval(Environnement env, Memoire mem) {


		Objects.requireNonNull(env,"env null");
		Objects.requireNonNull(mem,"mem null");

		switch (operator.getName()) {

		case "or":
		{
			if(leftOperand.eval(env, mem).equals(true)){
				return true ;
			}

			if(leftOperand.eval(env, mem).equals(false)){
				return rightOperand.eval(env, mem) ;
			}
		}
		break;

		case "and":
		{
			if(leftOperand.eval(env, mem).equals(false)){
				return false ;
			}

			if(leftOperand.eval(env, mem).equals(true)){
				return rightOperand.eval(env, mem) ;
			}

		}
		break;

		
		case "eq":
		{
			
			if(leftOperand.eval(env, mem)==rightOperand.eval(env,mem)){
				return true ;
			}

			if(leftOperand.eval(env, mem)!=rightOperand.eval(env,mem)){
				return false ;
			}
		}
		break;

		case "lt":
		{
			if((Integer)leftOperand.eval(env, mem)<(Integer)rightOperand.eval(env,mem)){
				return true ;
			}

			if((Integer)leftOperand.eval(env, mem)>=(Integer)rightOperand.eval(env,mem)){
				return false ;
			}
		}
		break;
		
		
		
		case "add":
		{
			return (Integer)leftOperand.eval(env, mem)+(Integer)rightOperand.eval(env,mem) ;
				
		}
		
		case "sub":
		{
			return (Integer)leftOperand.eval(env, mem)-(Integer)rightOperand.eval(env,mem) ;
				
		}
		case "mul":
		{
			return (Integer)leftOperand.eval(env, mem)*(Integer)rightOperand.eval(env,mem) ;
				
		}
		
		case "div":
		{
			return (Integer)leftOperand.eval(env, mem)/(Integer)rightOperand.eval(env,mem) ;
				
		}
		
		default:
			
		}
		 throw new Error("binop failed");

	} 
}