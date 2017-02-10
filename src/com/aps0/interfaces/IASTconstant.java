
package com.aps0.interfaces;

public abstract interface IASTconstant extends IASTdeclaration,Inamed {
	/** The accurate description of the constant */
    String getDescription();
    /** The constant as an accurate Java value */
    Object getValue ();
}
