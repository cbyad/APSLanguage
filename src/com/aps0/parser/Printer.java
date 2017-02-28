package com.aps0.parser;

import java.io.File;
import com.aps0.ast.ASTfactory;
import com.aps0.interfaces.IASTfactory;
import com.aps0.interfaces.IASTprogram;
import com.aps0.parser.aps.APSParser;

/*
 * Test Class 
 */
public class Printer {

	private String termeProlog;

	public Printer(String fileName) {

		IASTfactory factory = new ASTfactory();
		APSParser aps = new APSParser(factory);
		Parser parser = new Parser();
		parser.setAPSParser(aps);

		try {
			File file = new File(fileName);
			IASTprogram prog = parser.parse(file);
			this.termeProlog =prog.toProlog();

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public String getTermeProlog(){
		return this.termeProlog ;
	}

	@Override
	public String toString(){
		return termeProlog;
	}

	public static void main(String[] args) {
		Printer printer =new Printer(args[0]);
		System.out.println(printer);

	}
}
