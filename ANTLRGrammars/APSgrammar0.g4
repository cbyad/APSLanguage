grammar APSgrammar0 ;

@header {
	package antlr4 ;
}

/* 
 * Règles syntaxiques.
 * 
 * ANTLR impose que le nom des règles syntaxique comment par 
 * une minuscule.
 * Ces règles ont la forme "BNF".
 * Chaque règle retourne un objet Java représentant un morceau d'AST.
 * La récursivité directe à gauche est autorisée.
 */


//Structure general d'un programme APS0
prog returns [com.aps0.interfaces.IASTprogram node]
	: '[' (cmds+=cmd)* ']' * EOF 
	;
	
//commandes
cmd returns [com.aps0.interfaces.IASTCommands node]
	
	: stat (';'? cmds+=cmd)*								#Statement
	| dec ';' ( cmds+=cmd )*								#Declaration
	;
	
//declaration
dec : 
	'VAR' IDENT type   										#Variable
	| 'CONST' IDENT expr type 							    #Constant
	;
	
//statement
stat :
	'SET' IDENT expr 										#Binding
	| 'IF' expr prog prog    								#Alternative
	| 'WHILE' expr prog										#Loop
	;
	
 //type
 type : 'int' 
 	  | 'bool' 
 	  ;
 	  
//expressions
expr:
	'true'													#ConsTrue
	|'false'												#ConstFalse
	|constNum=NUM											#ConstNumeric
	/* |var=IDENT												#Variable */
	|'(' 'not' expr ')'										#Unary
	|'(' 'and' expr expr ')'  								#Binary
	|'(' 'or' expr expr ')'  								#Binary
	|'(' 'add' expr expr ')'  								#Binary
	|'(' 'mul' expr expr ')'  								#Binary
	|'(' 'sub' expr expr ')'  								#Binary
	|'(' 'div' expr expr ')'  								#Binary
	|'(' 'lt' expr expr ')'  								#Binary
	|'(' 'eq' expr expr ')'  								#Binary
	;

/*
 * Regles lexicales 
 * ANTLR impose que le nom des règles lexicales commencent par
 * une majuscule. 
 * Ces règles prennent la forme d'expressions régulières.
 * 
 */
 
 //Symboles reserve
 /*SYMBOLES : ['[' | ']' | '(' | ')' | ';' | '_'] ;*/
 
 //Mots reserves
 
  //Identificateurs
 IDENT : [a-z A-Z] [a-zA-Z0-9]* ;
 
 //Constantes numeriques 
 NUM : '-' ?[0-9]+ ;
 
 //Caracteres separateurs 
 SPACE : [ \t\r\n]+ ->skip ;