package com.porollo.money.Calculate;

/**
 * Created by Dmitriy S. Porollo on 27.05.2015.
 */

public class Calculate {

    public Calculate(){
    }

    public static void main(String[] args) {
        Calculate calc = new Calculate();
        calc.execute(args);
    }

    private void showResult(String result) {
        System.out.println(result);
    }

    private long operate(long op1, long op2) {
        return op1 + op2;
    }

    private String getOpsName() {
        return " plus ";
    }

    public void execute(String [] args){
        long op1 = Long.parseLong(args[0]);
        long op2 = Long.parseLong(args[1]);
        showResult("The result of " + op1 +
        getOpsName() + op2 + " is " + operate(op1, op2) + "!");

    }


}
