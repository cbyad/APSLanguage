package com.aps0.parser;

import java.io.File;

import com.aps1.ast.ASTfactory;
import com.aps1.interfaces.IASTfactory;
import com.aps0.interfaces.IASTprogram;
import com.aps1.parser.aps.APSParser;


/*
 * Test Class 
 */
public class PrinterTests {


	public PrinterTests(String fileName) {

		IASTfactory factory = new ASTfactory();
		APSParser aps = new APSParser(factory);
		Parser parser = new Parser();
		parser.setAPSParser(aps);

		try {
			File file = new File(fileName);
			IASTprogram prog = parser.parse(file);
			System.out.println("fini!!!!!! \n");

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		PrinterTests printer =new PrinterTests("files/test7.aps");
		
	}
}
