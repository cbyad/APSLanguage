package com.aps1.ast;

import com.aps0.ast.ASTtype;
import com.aps1.interfaces.IASTtypeFonctionnel;
import com.aps1.interfaces.IASTtypes;

public class ASTtypeFonctionnel extends ASTtype implements IASTtypeFonctionnel{
		
	
	protected IASTtypes[] types ;

	
	public ASTtypeFonctionnel(String name, IASTtypes[] types) {
		super(name);
		this.types = types;
	}


}
