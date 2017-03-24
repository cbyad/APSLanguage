package com.aps0.interpreter;

public interface Statement {

	public void eval(Environnement env , Memoire mem); // r,m -->m'
}
