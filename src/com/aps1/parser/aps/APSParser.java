package com.aps1.parser.aps;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import antlr4.APSgrammar1Lexer;
import antlr4.APSgrammar1Parser;

import com.aps1.interfaces.IASTfactory;
import com.aps0.interfaces.IASTprogram;
import com.aps0.parser.ParseException;

public class APSParser extends com.aps0.parser.aps.APSParser{


	public APSParser(IASTfactory factory) {
		super(factory);
	}




	public IASTprogram getProgram() throws ParseException {
		try {
			ANTLRInputStream in = new ANTLRInputStream(input.getText());
			
			
			System.out.println("TEST: parseur aps1 --------------\n"+input.getText()+"\n---------------------");

			System.out.println("flux de caractères -> analyseur lexical");
			// flux de caractères -> analyseur lexical
			APSgrammar1Lexer lexer = new APSgrammar1Lexer(in);

			System.out.println(" analyseur lexical -> flux de tokens");
			// analyseur lexical -> flux de tokens
			CommonTokenStream tokens =	new CommonTokenStream(lexer);

			System.out.println("flux tokens -> analyseur syntaxique");
			// flux tokens -> analyseur syntaxique
			APSgrammar1Parser parser =	new APSgrammar1Parser(tokens);

			System.out.println("démarage de l'analyse syntaxique");
			// démarage de l'analyse syntaxique
			APSgrammar1Parser.ProgContext tree = parser.prog();	

			System.out.println("parcours de l'AST et appels du Listener");
			// parcours de l'arbre syntaxique et appels du Listener
			ParseTreeWalker walker = new ParseTreeWalker();
			APSListener extractor = new APSListener((IASTfactory)factory);
			walker.walk(extractor, tree);

			System.out.println("Parseur APS1 reussi");
			return tree.node;
		} catch (Exception e) {

			throw new ParseException(e);
		}
	}

}
