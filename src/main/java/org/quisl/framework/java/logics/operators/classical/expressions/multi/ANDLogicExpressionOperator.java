package org.quisl.framework.java.logics.operators.classical.expressions.multi;

import org.quisl.framework.java.logics.operators.classical.ClassicalLogicExpressionOperator;

public class ANDLogicExpressionOperator extends ClassicalLogicExpressionOperator {

    private Boolean inputNum1;

    private Boolean inputNum2;

    private Boolean output;

    public ANDLogicExpressionOperator() {

    }

    public ANDLogicExpressionOperator(Boolean inputNum1, Boolean inputNum2) {

        this.inputNum1 = inputNum1;
        this.inputNum2 = inputNum2;

        this.output = ( this.inputNum1 && this.inputNum2 );

    }

    public ANDLogicExpressionOperator(Integer inputNum1, Integer inputNum2) throws Exception {

        if(inputNum1 == 1) {

            this.inputNum1 = true;

        }
        else if(inputNum1 == 0) {

            this.inputNum1 = false;

        }
        else {

            throw new Exception();

        }

        if(inputNum2 == 1) {

            this.inputNum2 = true;

        }
        else if(inputNum2 == 0) {

            this.inputNum2 = false;

        }
        else {

            throw new Exception();

        }

        this.output = ( this.inputNum1 && this.inputNum2 );

    }

    public Boolean getInputNum1() {

        return this.inputNum1;

    }

    public Boolean getInputNum2() {

        return this.inputNum2;

    }

    public Boolean getOutput() {

        return this.output;

    }

    public static String[] getLabelsANDTruthTable() {

        return new String[] { "Input #1", "Input #2", "Output" };

    }

    public static Integer[][] getIntegerANDTruthTable() {

        return new Integer[][]
                {
                        new Integer[] { 0 , 0 , 0 },
                        new Integer[] { 0 , 1 , 0 },
                        new Integer[] { 1 , 0 , 0 },
                        new Integer[] { 1 , 1 , 1 },
                };

    }

    public static Boolean[][] getBooleanANDTruthTable() {

        return new Boolean[][]
                {
                        new Boolean[] { false , false , false },
                        new Boolean[] { false , true , false },
                        new Boolean[] { true , false , false },
                        new Boolean[] { true , true , true }
                };

    }

}
