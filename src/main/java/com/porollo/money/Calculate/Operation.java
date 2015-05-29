package com.porollo.money.Calculate;

/**
 * Created by Dmitriy S. Porollo on 29.05.2015.
 */

public interface Operation {
    long operate(long op1, long op2);
    String getOpsName();
}
