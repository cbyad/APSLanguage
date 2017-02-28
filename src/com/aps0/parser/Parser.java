package com.aps0.parser;

import java.io.File;
import com.aps0.interfaces.IASTprogram;
import com.aps0.parser.aps.APSParser;
import com.aps0.tools.Input;
import com.aps0.tools.InputFromFile;

public class Parser {


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

}