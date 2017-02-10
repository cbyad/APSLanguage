grammar APSgrammar0;

@header {
	package antlr4;
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
	
	: statement=stat (';'? cmds+=cmd)*												#Statement
	| declaration=dec ';' ( cmds+=cmd )+											#Declaration
	;
	 
//declaration
dec : 
	  'VAR' IDENT typ=type   														 #VariableDec
	| 'CONST' IDENT arg=expr typ=type 							  		 			 #ConstantDec
	;
	
//statement
stat :
	'SET' IDENT arg=expr 															#VariableAssign
	| 'IF' condition=expr consequence=prog alternant=prog    						#Alternative
	| 'WHILE' condition=expr body=prog												#While
	;
	 
 //type
 type : 'int' 																		#Int
 	  | 'bool' 																		#bool
 	  ;
 	   
//expressions
expr: 
	'true'																			#ConsTrue
	|'false'																		#ConstFalse
	|constNum=NUM																	#ConstNumeric
	|'(' op='not' arg=expr ')'														#Unary
	|'(' op=('and' | 'or' | 'and')  arg1=expr arg2=expr ')'  						#Binary
	|'(' op=('add' | 'mul' | 'sub'| 'div'| 'lt' |'eq' ) arg1=expr arg2=expr ')'  	#Binary
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
 IDENT : [a-z A-Z][a-zA-Z0-9]* ;
 
 //Constantes numeriques 
 NUM : '-' ?[0-9]+ ;
 
 //Caracteres separateurs 
 SPACE : [ \t\r\n]+ ->skip ;