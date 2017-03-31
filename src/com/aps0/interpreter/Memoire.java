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
			mem.put(a, v);
		}
		else  throw new Error("error memory");
	}
	
	public void restriction(Environnement env) {
		for (Adresse adresse : mem.keySet()) {
			if (!(env.getEnv().containsValue(adresse)))
			{
				mem.remove(adresse);
			}
		}
		
		System.out.println(this.mem);
		
	}

	@Override
	public String toString() {
		
		StringBuilder str = new StringBuilder();
		str.append("Memoire---->\n");
		str.append(mem+"\n \n");
		 return str.toString();
		
		
	}
	
	
	

}
