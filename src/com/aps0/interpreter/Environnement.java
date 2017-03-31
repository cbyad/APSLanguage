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
		
	HashMap< String, Object> map  = (HashMap<String, Object>) this.env.clone() ;

	Environnement cloneEnv = new Environnement() ;
	cloneEnv.getEnv().putAll(map); 
	
	return (Environnement)cloneEnv ;
		
	}

	@Override
	public String toString() {
		
		StringBuilder str = new StringBuilder();
		str.append("Environnement---->\n");
		str.append(env);
		 return str.toString();
		
	}
	
	

}
