package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 ����� ��� ������� ������������. ������������ ���� ������������.
 */
public class InteractRunner {

    public static void main(String[] arg) {
        Scanner reader = new Scanner(System.in);
//        try {
//            src.main.java.calculator.Calculator calc = new src.main.java.calculator.Calculator();
//            String exit = "no";
//            String first = null;
//            boolean result = false;
//            while (!"y".equals(exit)) {
//                if (result) {
//                    first = String.valueOf(calc.getResult());
//                    System.out.println(first);
//                } else {
//                    System.out.println("Enter first arg : ");
//                    first = reader.next();
//                    calc.cleanResult();
//                }
//
//                System.out.println("Enter Operation : ");
//                String  = reader.next();
//                System.out.println("Enter second arg : ");
//                String second = reader.next();
//
//                if ("+".equals()) calc.add(Integer.valueOf(first), Integer.valueOf(second));
//                if ("-".equals()) calc.sub(Integer.valueOf(first), Integer.valueOf(second));
//                if ("*".equals()) calc.mult(Integer.valueOf(first), Integer.valueOf(second));
//                if ("/".equals()) calc.div(Integer.valueOf(first), Integer.valueOf(second));
//
//                System.out.println("Result : " + calc.getResult());
//                System.out.println("Continue with result ? : y/n");
//                if ("y".equals(reader.next())) result = true;
//
//                else {
//                    System.out.println("Exit : y/n ");
//                    exit = reader.next();
//                    calc.cleanResult();
//                }
//            }
//        } finally {
//            reader.close();
//        }
        String zapros = reader.nextLine();
        reader.close();
        ArrayList<String> parsed = Analizer.analyze(zapros);
        System.out.println("Result : " +action(parsed));
    }

    private static int getResult(ArrayList<String> list) {
        int result = Integer.valueOf(list.get(0));
        Calculator calc = new Calculator();
        ArrayList<String> current = list;
        int element = 1;

        while (current.size() != 1) {


            if (current.get(element).equals("*")) {
                calc.mult(result, Integer.valueOf(current.get(element+1)));
                result = calc.getResult();
                calc.cleanResult();
                current.set(0, String.valueOf(result));
                current.remove(element);
                current.remove(element);

            }
            if (current.get(element).equals("/")) {
                calc.div(result, Integer.valueOf(current.get(element+1)));
                result = calc.getResult();
                calc.cleanResult();
                current.set(0, String.valueOf(result));
                current.remove(element);
                current.remove(element);

            }
            if (current.get(element).equals("+") && current.size()!=3) {

                if (!((current.get(element+2)).equals("*")) || !((current.get(element +2)).equals("/"))) {
                    calc.add(result, Integer.valueOf(current.get(element + 1)));
                    result = calc.getResult();
                    calc.cleanResult();
                    current.set(0, String.valueOf(result));
                    current.remove(element);
                    current.remove(element);

                }
                else {
                    element = element + 2;

                }
            }
            else {  if(current.get(element).equals("+")) {
                calc.add(result, Integer.valueOf(current.get(element + 1)));
                result = calc.getResult();
                calc.cleanResult();
                current.set(0, String.valueOf(result));
                current.remove(element);
                current.remove(element);

            }
            }
            if (current.get(element).equals("-") && current.size()!=3) {
                if (!((current.get(element+2)).equals("*")) || !((current.get(element +2)).equals("/"))) {
                    calc.sub(result, Integer.valueOf(current.get(element+1)));
                    result = calc.getResult();
                    calc.cleanResult();
                    current.set(0, String.valueOf(result));
                    current.remove(element);
                    current.remove(element);

                }
                else {
                    element = element + 2;

                }
            }
            else {  if(current.get(element).equals("-")) {
                calc.sub(result, Integer.valueOf(current.get(element+1)));
                result = calc.getResult();
                calc.cleanResult();
                current.set(0, String.valueOf(result));
                current.remove(element);
                current.remove(element);

            }
            }


            if (element>=current.size()-2) element=1;
        }


        return result;
    }

    /**Calculates expression parsed from analyzer
     * @param collection of
     * @return   Calculation result
     */
    public static int action(List<String> collection) {
        int result = 0;
        Calculator calc = new Calculator();
        List<String> list = collection;
        try {
            while (list.size() != 1) {

                if (list.size() != 1 && "*".equals(list.get(1))) {
                    calc.mult(Integer.valueOf(list.get(0)), Integer.valueOf(list.get(2)));
                    list = remove(list, String.valueOf(calc.getResult()));
                    calc.cleanResult();

                }
                if (list.size() != 1 && "/".equals(list.get(1))) {
                    calc.div(Integer.valueOf(list.get(0)), Integer.valueOf(list.get(2)));
                    list = remove(list, String.valueOf(calc.getResult()));
                    calc.cleanResult();
                }
                if (list.size() != 1 && "+".equals(list.get(1)) && list.size() != 3) {
                    if ("*".equals(list.get(3)) || "/".equals(list.get(3))) {
                        List<String> sublist = list.subList(2, list.size());
                        calc.add(Integer.valueOf(list.get(0)), action(sublist));
                        list = remove(list, String.valueOf(calc.getResult()));

                    } else {
                        calc.add(Integer.valueOf(list.get(0)), Integer.valueOf(list.get(2)));
                        list = remove(list, String.valueOf(calc.getResult()));
                        calc.cleanResult();
                    }
                }
                if (list.size() != 1 && "-".equals(list.get(1)) && list.size() != 3) {
                    if ("*".equals(list.get(3)) || "/".equals(list.get(3))) {
                        List<String> sublist = list.subList(2, list.size());
                        calc.sub(Integer.valueOf(list.get(0)), action(sublist));
                        list = remove(list, String.valueOf(calc.getResult()));

                    } else
                        calc.sub(Integer.valueOf(list.get(0)), Integer.valueOf(list.get(2)));
                    list = remove(list, String.valueOf(calc.getResult()));
                    calc.cleanResult();
                }
               for(String s:list) {
                   switch (s) {
                       case "*":
                   }
               }

            }
            if (list.size() == 1) result = Integer.valueOf(list.get(0));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }

    /**
     *  Sets value into first element and removes second and third
     * @param list
     * @param value
     * @return
     */
    public static List<String> remove(List<String> list, String value){
        if(list.size()!=1) {
            list.set(0, value);
            list.remove(1);
            list.remove(1);
        }
        return list;
    }



}

