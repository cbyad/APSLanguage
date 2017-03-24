package com.aps0.interpreter;

public class Adresse {

	public static int COUNT =0 ;
	
	
	public Adresse() {
		COUNT++;
	}
	
	@Override
	public String toString(){
		return "AD"+COUNT ;
	}
}
