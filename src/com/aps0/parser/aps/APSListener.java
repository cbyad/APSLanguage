package com.aps0.parser.aps;

import java.util.List;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import antlr4.APSgrammar0Listener;

import com.aps0.interfaces.IASTfactory;
import com.aps0.interfaces.IASTblock;
import com.aps0.interfaces.IASTexpression;
import com.aps0.interfaces.IASTvariable;

import static antlr4.APSgrammar0Parser.*;

/**
 * Cette classe décrit à ANTRL comment construire un AST.
 * C'est un Listener : à chaque pas de l'analyse syntaxique, ANTRL
 * appelle cette classe, qui crée un ASTNode correspondant à ce qui
 * a été reconnu. 
 * Un Listener ne peut pas renvoyer de valeur, nous utilisons donc des
 * champs du contexte ctx pour transferer l'information d'une règle
 * de grammaire à l'autre.
 * 
 */
public class APSListener implements APSgrammar0Listener {
	
	/*
	 * Le parseur est paramétré par une fabrique qui indique comment
	 * créer les instances concrètes d'AST.
	 */
	protected IASTfactory factory;
	
	public APSListener(IASTfactory factory) {
		super();
		this.factory = factory;		
	}
	
	
	/*
	 * ANTLRGrammarBaseListener, automatiquement généré, fournit
	 * un squelette d'objet "Listener".
	 * Il suffit de redéinir les méthodes qui nous intéressent : celles de la
	 * forme "exit<règle>".
	 */
	
	
}
