package com.aps0.interpreter;

public interface Block {
	
	public void eval(Environnement env , Memoire mem); // r,m --> m'
}
