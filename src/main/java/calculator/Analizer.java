package calculator;

import java.util.ArrayList;


class Analizer{

    public static  ArrayList<String> analyze(String s) {

        ArrayList<String> variables = new ArrayList<String>();
        String variable="";

        boolean b = s.matches("\\d+([\\+*-^/]?+\\d+)+");
        if(b) {
        for(char c:s.toCharArray()) {
            if(c!='^' && c!='+' && c!='-' && c!='*' && c!='/')
                variable = variable + c;
            else
            {
                variables.add(variable);
                variable=String.valueOf(c);
                variables.add(variable);
                variable="";
            }
        }
        variables.add(variable);
        System.out.println(variables);
         return variables;
    }
        return null;
    }

}
