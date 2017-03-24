package com.aps0.interpreter;

import java.util.HashMap;


public class Environnement implements Cloneable{ // ident-->val+add(object)

	//addresse memoires ou valeurs 

	private HashMap<String, Object> env;

	

	public Environnement() {
		env= new HashMap<String, Object>() ;

	}

	public HashMap<String,Object> getEnv(){
		return env ;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return this.env.clone() ;
		
	}


	

}
