package com.aps0.parser.aps;

import com.aps0.interfaces.IASTalternative;
import com.aps0.interfaces.IASTbinaryOperation;
import com.aps0.interfaces.IASTboolean;
import com.aps0.interfaces.IASTexpression;
import com.aps0.interfaces.IASTnumeric;
import com.aps0.interfaces.IASToperator;
import com.aps0.interfaces.IASTprogram;
import com.aps0.interfaces.IASTunaryOperation;
import com.aps0.interfaces.IASTvariable;
import com.aps0.interfaces.IASTvisitor;
import com.aps0.tools.MLPrinter;

/* 
 * Affichage d'un AST .
 */
public class APSProgramPrinter
implements IASTvisitor<Object,MLPrinter,Exception> {
	
	protected IASTprogram input;

	public void setInput(IASTprogram input) {
		this.input = input;
	}
	
	public String getString() throws Exception {
		MLPrinter printer = new MLPrinter();
		visit((IASTprogram)input,printer);
		return printer.getContents();
	}
	
	protected void appendVariables(IASTvariable[] vars, String separator, MLPrinter printer) {
		boolean first = true;
		for (IASTvariable x : vars) {
			if (first) {
				first = false;
			}
			else {
				printer.append(separator);
			}
			printer.append(x.getMangledName());
		}
	}

	protected void appendExpressions(IASTexpression[] exp, String separator, MLPrinter printer) throws Exception  {
		boolean first = true;
		for (IASTexpression e : exp) {
			if (first) {
				first = false;
			}
			else {
				printer.append(separator);
			}
			e.accept(this,printer);
		}
	}

	
	// Visite des déclarations de haut niveau

	public Object visit(IASTprogram iast, MLPrinter printer) throws Exception {
		iast.getBody().accept(this,printer);
		printer.insertBreak();
		return null;
	}

	
	// Implantation des méthodes du visiteur IASTvisitable
	
	@Override
	public Object visit(IASTalternative iast, MLPrinter printer) throws Exception {
		printer.openBreakParen("(");
		printer.append("if ");
		printer.indent();
		iast.getCondition().accept(this,printer);
		printer.dedent();
		printer.insertBreak();
		printer.append("then ");
		printer.indent();
		iast.getConsequence().accept(this,printer);
		printer.dedent();
		if (iast.isTernary()) {
			printer.insertBreak();
			printer.append("else ");
			printer.indent();
			iast.getAlternant().accept(this,printer);
			printer.dedent();
		}
		printer.closeBreakParen(")");
		return null;
	}

	@Override
	public Object visit(IASTbinaryOperation iast, MLPrinter printer) throws Exception {
		printer.openParen("(");
		iast.getLeftOperand().accept(this, printer);
		printer.append(" " + iast.getOperator().getName() + " ");
		iast.getRightOperand().accept(this, printer);
		printer.closeParen(")");
		return null;
	}

	@Override
	public Object visit(IASTunaryOperation iast, MLPrinter printer) throws Exception {
		printer.openParen("(");
		printer.append(iast.getOperator().getName());	
		iast.getOperand().accept(this, printer);
		printer.closeParen(")");	
		return null;		
	}


	

	@Override
	public Object visit(IASTboolean iast, MLPrinter printer) throws Exception {
		printer.append(iast.getDescription());
		return null;
	}


	
	@Override
	public Object visit(IASTnumeric iast, MLPrinter printer) throws Exception {
		printer.append(iast.getDescription());
		return null;
	}

	

	@Override
	public Object visit(IASToperator iast, MLPrinter printer) throws Exception {
		// Ce nœud n'est jamais visité
		assert(false);
		return null;
	}



	
	@Override
	public Object visit(IASTvariable iast, MLPrinter printer) throws Exception {
		printer.append(iast.getMangledName());
		return null;
	}

}
