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
	: '['listcmds+=cmds']'													#Programm
	;



//commandes
cmds returns [com.aps0.interfaces.IASTcommands node]
	:statement=stat (';' commandes+=cmds)*											#StatCmds
	|declaration=dec ';' commandes+=cmds											#DecCmds
	;																				//#Commandes
	
 

/*cmd returns [com.aps0.interfaces.IASTcommand node]
	: declaration=dec ';' listcmds=cmds												#DecCmds
	| statement=stat (';'listcmds=cmds)?											#StatCmds	
	;
*/
	  
//declaration
dec  returns [com.aps0.interfaces.IASTdeclaration node]
	:'VAR' ident=IDENT typ=type   												#VariableDec
	|'CONST' ident=IDENT typ=type arg=expr 					  		 			#ConstantDec
	;
	
//statement
stat returns [com.aps0.interfaces.IASTstatement node]
	:'SET' ident=IDENT arg=expr 													#VariableAssign
	|'IF' condition=expr '['consequence+=cmds']' '['alternant+=cmds']'    						#Alternative
	|'WHILE' condition=expr '['body+=cmds']'	/* equivalent to body=prog*/		#While
	;
	   
//type 
type returns [com.aps0.interfaces.IASTtype node]
	:'int' 																		#TypeInt
	|'bool' 																		#TypeBool
 	;
 	   
//expressions
expr returns [com.aps0.interfaces.IASTexpression node]
	:'true'																			#ConsTrue
	|'false'																		#ConstFalse
	|constNum=NUM		 															#ConstNumeric
	|'(' op='not' arg=expr ')'														#Unary
	|'(' op=('and' | 'or' )  arg1=expr arg2=expr ')'  								#Binary
	|'(' op=('add' | 'mul' | 'sub'| 'div'| 'lt' |'eq' ) arg1=expr arg2=expr ')'  	#Binary
	;

/*
 * Regles lexicales 
 * ANTLR impose que le nom des règles lexicales commencent par
 * une majuscule. 
 * Ces règles prennent la forme d'expressions régulières.
 * 
 */
 

  //Identificateurs
 IDENT : [a-zA-Z_] [a-zA-Z0-9_]* ; 
 
 //Constantes numeriques 
 NUM : '-'?[0-9]+ ;
 //Caracteres separateurs 
 SPACE : [ \t\r\n]+ ->skip ;
  
ESC : '\\' [\\nrt"];

// Commentaires
LINE_COMMENT : '//' (~[\r\n])* -> skip;
COMMENT : '/*' ('*' ~[/] | ~[*])* '*/' -> skip; 