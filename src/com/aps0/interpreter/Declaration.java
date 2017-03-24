package com.aps0.interpreter;

public interface Declaration {

	public void eval(Environnement env , Memoire mem); //r,m--> r',m'
}
