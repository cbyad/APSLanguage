
package com.aps0.interfaces;

public interface IASTvisitable {
    <Result, Data, Anomaly extends Throwable> 
    Result accept(IASTvisitor<Result, Data, Anomaly> visitor,
                  Data data) throws Anomaly;
}
