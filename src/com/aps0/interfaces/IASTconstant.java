
package com.aps0.interfaces;

public abstract interface IASTconstant extends IASTexpression,Inamed {
    String getDescription();
    Object getValue ();
}
