/*

*/
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
