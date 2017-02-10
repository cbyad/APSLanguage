package com.aps0.interfaces;


public interface IASTvisitor<Result, Data, Anomaly extends Throwable> {
    Result visit(IASTbinaryOperation iast, Data data) throws Anomaly;
    Result visit(IASTboolean iast, Data data) throws Anomaly;
    Result visit(IASTnumeric iast, Data data) throws Anomaly;
    Result visit(IASToperator iast, Data data) throws Anomaly;
    Result visit(IASTunaryOperation iast, Data data) throws Anomaly;
    Result visit(IASTwhile iast, Data data) throws Anomaly;
    Result visit(IASTalternative iast, Data data) throws Anomaly;
    Result visit(IASTassignment iast, Data data) throws Anomaly;
    Result visit(IASTvariable iast, Data data) throws Anomaly;
    //Result visit(IASTconstant iast, Data data) throws Anomaly;
    Result visit(IASTdeclaration iast, Data data) throws Anomaly;
    Result visit(IASTstatement iast, Data data) throws Anomaly;
   // Result visit(IASTcommands iast, Data data) throws Anomaly;
    Result visit(IASTexpression iast, Data data) throws Anomaly;
    Result visit(IASTprogram iast, Data data) throws Anomaly;
    Result visit(IASTtype iast, Data data) throws Anomaly;
}
