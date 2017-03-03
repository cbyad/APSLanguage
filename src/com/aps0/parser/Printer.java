package com.aps0.parser;

import java.io.File;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import com.aps0.ast.ASTfactory;
import com.aps0.interfaces.IASTfactory;
import com.aps0.interfaces.IASTprogram;
import com.aps0.parser.aps.APSParser;
import com.thaiopensource.relaxng.output.OutputDirectory.Stream;

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
		
		File file = new File("files/toProlog");
		
	        try {
	        	
	            // Creation du fichier
	            file .createNewFile();
	            // creation d'un writer (un écrivain)
	            final FileWriter writer = new FileWriter(file);
	            try {
	            
	                writer.write(printer.getTermeProlog());
	            } finally {
	                writer.close();
	            }
	        } catch (Exception e) {
	            System.out.println("Impossible de creer le fichier");
	        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
