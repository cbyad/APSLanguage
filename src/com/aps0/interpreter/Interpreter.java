package com.aps0.interpreter;

import java.io.File;

import com.aps0.ast.ASTfactory;
import com.aps0.interfaces.IASTfactory;
import com.aps0.interfaces.IASTprogram;
import com.aps0.parser.ParseException;
import com.aps0.parser.Parser;
import com.aps0.parser.aps.APSParser;

public class Interpreter {

	IASTprogram prog ;
	Memoire memoire = new Memoire() ;
	Environnement environnement = new Environnement() ;
	
	
	public void execute(IASTprogram prog){
		prog.eval(environnement, memoire);
	}
	
	public Interpreter(String fileName) {

		IASTfactory factory = new ASTfactory();
		APSParser aps = new APSParser(factory);
		Parser parser = new Parser();
		parser.setAPSParser(aps);

		try {
			File file = new File(fileName);
			IASTprogram prog = parser.parse(file);
			execute(prog);

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Interpreter(args[0]);
		System.out.println(234567899);
	}
	
	
	
	
}
