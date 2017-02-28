package com.aps0.parser;

import java.io.File;
import com.aps0.ast.ASTfactory;
import com.aps0.interfaces.IASTfactory;
import com.aps0.interfaces.IASTprogram;
import com.aps0.parser.aps.APSParser;
import com.aps0.tools.Input;
import com.aps0.tools.InputFromFile;

public class Parser {

	public Parser() {		
	}

	protected APSParser apsparser;

	public void setAPSParser (APSParser parser) {
		this.apsparser = parser;
	}

	public IASTprogram parse(File file) throws ParseException {
		Input input = new InputFromFile(file);

		if (file.getName().endsWith(".aps")) {
			if (apsparser == null) {
				throw new ParseException("APS parser not set");
			}
			apsparser.setInput(input);
			IASTprogram program = apsparser.getProgram();
			return program;
		}
		throw new ParseException("file extension not recognized");
	}

	public static void main(String[] args) {

		IASTfactory factory = new ASTfactory();
		APSParser aps = new APSParser(factory);
		Parser parser = new Parser();
		parser.setAPSParser(aps);

		try {

			File file = new File(args[0]);
			IASTprogram prog = parser.parse(file);
			System.out.println("TERME PROLOG--->"+(prog).toProlog());

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
