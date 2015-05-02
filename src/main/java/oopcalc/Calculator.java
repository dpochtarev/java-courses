package oopcalc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList(args));
        Calculator calc = new Calculator();
        System.out.println(calc.getResult(list));
    }

    public String getResult(List<String> list) {
        if(list.size()>4){
        if (!"*".equals(list.get(3)) && !"/".equals(list.get(3))) {
            list.set(2, new Operation(new String[]{list.get(0), list.get(1), list.get(2)}).getResult());
            list = list.subList(2, list.size());
        } else {
            getResult(list.subList(2, list.size()));
        }
        }

     return new Operation(new String[]{list.get(0), list.get(1), list.get(2)}).getResult();
    }
}

