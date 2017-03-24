/*
G est le contexte de typage
*/

%Contexte

%Constantes
type(G,true,bool).
type(G,false,bool).
type(G,X,int):- integer(X).


%booleens
type(G,not(E),bool):- type(G,E,bool).
type(G,and(E1,E2),bool):- type(G,E1,bool),type(G,E2,bool).
type(G,or(E1,E2),bool):- type(G,E1,bool),type(G,E2,bool).

%comparaisons
type(G,eq(E1,E2),bool):- type(G,E1,int),type(G,E2,int).
type(G,lt(E1,E2),bool):- type(G,E1,int),type(G,E2,int).

%Nombres
type(G,add(E1,E2),int):- type(G,E1,int),type(G,E2,int).
type(G,sub(E1,E2),int):- type(G,E1,int),type(G,E2,int).
type(G,mul(E1,E2),int):- type(G,E1,int),type(G,E2,int).
type(G,div(E1,E2),int):- type(G,E1,int),type(G,E2,int).

%Variable
type(G,var(X,T),void).

/*
verifier existence du couple (X,T) dans G?
*/
type(G,X,T) :- memberchk((X,T),G).

%Instructions

type(G,set(X,E),void) :- type(G,X,T),type(G,E,T).

type(G,if(E,B1,B2),void):- type(G,E,bool),type(G,B1,void), type(G,B2,void).
type(G,while(E,B),void) :- type(G,E,bool),type(G,B,void).

%SuiteDeCommandes
type(G,[S|CS],void) :- type(G,S,void), type(G,CS,void).
type(G,[D|CS],void) :- D=const(X,T,E), type(G,E,T), type([(X,T)|G],CS,void).
type(G,[D|CS],void) :- D=var(X,T), type([(X,T)|G],CS,void).
type(G,[],void).

type(G,prog(CS),void). :- type(G,CS,void).


%OuvertureFichier
typeFile(F) :-   open(F,read,IC),  read(IC,T), type([],T,void).
