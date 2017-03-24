package com.aps0.interpreter;

import java.util.HashMap;

public class Memoire { //Adre--->valeurs


	private HashMap<Adresse, Object> mem;

	public  Memoire() {
		mem= new HashMap<Adresse, Object>() ;
	}



	public HashMap<Adresse, Object> getMem(){
		return mem ;
	}



	public void alloc (){	
		mem.put(new Adresse(),null);	
	}

	public void modif(Adresse a , Object v){
		if(mem.containsKey(a)){
			mem.put(a, v);
		}
		else  throw new Error("error memory");
	}
	
	
	public void desalloc(){
		//TODO
	}


}
