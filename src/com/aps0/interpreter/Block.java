package com.aps0.interpreter;

public interface Block {
	
	/**
	 * r,m --> m' (produit une nvle memoire mais ne modifie pas l'environnement en sortie de bloc)
	 * @param env
	 * @param mem
	 */
	public void eval(Environnement env , Memoire mem); 
}
