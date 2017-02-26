package com.aps0.parser.aps;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import antlr4.APSgrammar0Lexer;
import antlr4.APSgrammar0Parser;

import com.aps0.interfaces.IASTfactory;
import com.aps0.interfaces.IASTprogram;
import com.aps0.parser.ParseException;
import com.aps0.tools.Input;

public class APSParser {
	
	protected IASTfactory factory;

	public APSParser(IASTfactory factory) {
		this.factory = factory;
	}
	
	protected Input input;
	
	public void setInput(Input input) {
		this.input = input;
	}
	
    public IASTprogram getProgram() throws ParseException {
		try {
			ANTLRInputStream in = new ANTLRInputStream(input.getText());
			
			System.out.println(input.getText());
					
			System.out.println("flux de caractères -> analyseur lexical");
			// flux de caractères -> analyseur lexical
			APSgrammar0Lexer lexer = new APSgrammar0Lexer(in);
			
			System.out.println(" analyseur lexical -> flux de tokens");
			// analyseur lexical -> flux de tokens
			CommonTokenStream tokens =	new CommonTokenStream(lexer);
			
			System.out.println("flux tokens -> analyseur syntaxique");
			// flux tokens -> analyseur syntaxique
			APSgrammar0Parser parser =	new APSgrammar0Parser(tokens);
			
			System.out.println("démarage de l'analyse syntaxique");
			// démarage de l'analyse syntaxique
			APSgrammar0Parser.ProgContext tree = parser.prog();	
			
			System.out.println("parcours de l'AST et appels du Listener");
			// parcours de l'arbre syntaxique et appels du Listener
			ParseTreeWalker walker = new ParseTreeWalker();
			APSListener extractor = new APSListener(factory);
			walker.walk( extractor, tree);	
			
			System.out.println("Parseur reussi");
			return tree.node;
		} catch (Exception e) {
			
			throw new ParseException(e);
		}
    }

    
    
    
    
}
