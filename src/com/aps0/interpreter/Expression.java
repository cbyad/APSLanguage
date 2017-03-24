package com.aps0.interpreter;

public interface Expression {
	//TODO change object ----> Value (int , bool)
	public Object eval(Environnement env , Memoire mem); // r,m --> v
}
