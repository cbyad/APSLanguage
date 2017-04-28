package com.aps0.interpreter;

import java.util.HashMap;

public class Memoire { //Adre--->valeurs


	private HashMap<Adresse, Object> mem;

	public  Memoire() {
		mem= new HashMap<Adresse, Object>();
	}

	public HashMap<Adresse, Object> getMem(){
		return mem ;
	}

	public void alloc (Adresse a){	
		mem.put(a,null);
	}

	public void modif(Adresse a , Object v){
		if(mem.containsKey(a)){
			
			System.out.println(a +" \t " +v);
			mem.put(a, v);
			System.out.println(a +" \t " +v+"\n");
			if(v==null) System.out.println(a +" \t " +v);
		}
		else  throw new Error("error memory");
	}

	//Flush env by unset variables
	public void restriction(Environnement env) {
		for (Adresse adresse : mem.keySet()) {
			if (!(env.getEnv().containsValue(adresse)))
			{
				mem.remove(adresse);
			}
		}

	}

	@Override
	public String toString() {
		return "Memoire---->"+ mem ;
	}


}
