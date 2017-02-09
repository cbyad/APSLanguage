/* *****************************************************************
 * ILP9 - Implantation d'un langage de programmation.
 * by Christian.Queinnec@paracamplus.com
 * See http://mooc.paracamplus.com/ilp9
 * GPL version 3
 ***************************************************************** */
package com.aps0.interfaces;

public interface IASTvisitor<Result, Data, Anomaly extends Throwable> {
    Result visit(IASTalternative iast, Data data) throws Anomaly;
    Result visit(IASTbinaryOperation iast, Data data) throws Anomaly;
    Result visit(IASTblock iast, Data data) throws Anomaly;
    Result visit(IASTboolean iast, Data data) throws Anomaly;
    Result visit(IASTinteger iast, Data data) throws Anomaly;
    Result visit(IASToperator iast, Data data) throws Anomaly;
    Result visit(IASTsequence iast, Data data) throws Anomaly;
    Result visit(IASTunaryOperation iast, Data data) throws Anomaly;
    Result visit(IASTvariable iast, Data data) throws Anomaly;
}
