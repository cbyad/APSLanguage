package com.aps0.interfaces;

import com.aps0.interpreter.Block;

public abstract interface IASTprogram extends IAST, Block{
	IASTcommands[] getListCmds() ;
}
