grammar APSgrammar1;

//import de la grammaire precedente pour question de compatibilite
import APSgrammar0 ;


//Structure general d'un programme APS0
prog returns [com.aps0.interfaces.IASTprogram node]
	: '['listcmds+=cmds']'															#Programm
	;

//commandes
cmds returns [com.aps0.interfaces.IASTcommands node]
	:statement=stat (';' commandes+=cmds)*											#StatCmds
	|declaration=dec ';' commandes+=cmds											#DecCmds
	;																				//#Commandes
	

//declaration
dec  returns [com.aps0.interfaces.IASTdeclaration node]
	:'VAR' ident=IDENT typ=type   													#VariableDec
	|'CONST' ident=IDENT typ=type arg=expr 					  		 				#ConstantDec
	;
	
//statement
stat returns [com.aps0.interfaces.IASTstatement node]
	:'SET' ident=IDENT arg=expr 													#VariableAssign
	|'IF' condition=expr '['consequence+=cmds']' '['alternant+=cmds']'    			#Alternative
	|'WHILE' condition=expr '['body+=cmds']'	/* equivalent to body=prog*/		#While
	;
	
	   
//type enrichie
type returns [com.aps0.interfaces.IASTtype node]
	:'int' 																			#TypeInt
	|'bool' 																		#TypeBool
	
	//ajout pour aps1
	| '(' typs+=types  '->' typ=type ')'											#TypeFonctionnel
 	;
 	   
//expressions enrichies 
expr returns [com.aps0.interfaces.IASTexpression node]
	:'true'																			#ConsTrue
	|'false'																		#ConstFalse
	|constNum=NUM		 															#ConstNumeric
	|ident=IDENT                      												#IdentExpr
	|'(' op='not' arg=expr ')'														#Unary
	|'(' op=('and' | 'or' )  arg1=expr arg2=expr ')'  								#Binary
	|'(' op=('add' | 'mul' | 'sub'| 'div'| 'lt' |'eq' ) arg1=expr arg2=expr ')'  	#Binary
	
	//ajout pour aps1
	| '[' abs+=args ']' exp=expr  													#AbstractionExpr
	| '(' app+=exprs ')' 															#ApplicationExpr
	
	;


args returns [com.aps1.interfaces.IASTabstraction node]
	: ident=IDENT ':' typ=type	(',' arg+=args)*								    
	;

exprs returns [com.aps1.interfaces.IASTapplication node] //expressions
	: exp=expr (exps+=exprs)*															
	;

 	
//ajouts types pour aps1

types returns [com.aps1.interfaces.IASTtypes node]
	: typ=type ('*' typs+=types	)*												
	;

