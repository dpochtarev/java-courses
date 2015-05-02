package oopcalc;


class Operation {
    private boolean add, sub, mult, div;
    private int result;
    private int firstValue, secondValue;

    /**
     *
     * @param params
     */
    Operation(String params[]) {
        firstValue = Integer.valueOf(params[0]);
        secondValue = Integer.valueOf(params[2]);
        switch (params[1]) {
            case "+": add = true;
                break;
            case "-": sub = true;
                break;
            case "*": mult = true;
                break;
            case "/": div = true;
                break;
        }
    }

    /**
     *
     * @return  Calculated value;
     */
    public String getResult(){
        if (add) result = firstValue + secondValue;
        if (sub) result = firstValue - secondValue;
        if (mult) result = firstValue * secondValue;
        if (div && secondValue!=0) result = firstValue / secondValue;
        return String.valueOf(result);
    }

}
