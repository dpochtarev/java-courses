import java.util.Scanner;

/**
 ����� ��� ������� ������������. ������������ ���� ������������.
 */
public class InteractRunner {

    public static void main(String[] arg) {
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String exit = "no";
            String first = null;
            boolean result = false;
            while (!"y".equals(exit)) {
                if(result) {
                    first = String.valueOf(calc.getResult());
                    System.out.println(first);
                }
                else {
                    System.out.println("Enter first arg : ");
                    first = reader.next();
                    calc.cleanResult();
                }

                System.out.println("Enter Operation : ");
                String operation = reader.next();
                System.out.println("Enter second arg : ");
                String second = reader.next();

                if("+".equals(operation)) calc.add(Integer.valueOf(first), Integer.valueOf(second));
                if("-".equals(operation)) calc.sub(Integer.valueOf(first), Integer.valueOf(second));
                if("*".equals(operation)) calc.mult(Integer.valueOf(first), Integer.valueOf(second));
                if("/".equals(operation)) calc.div(Integer.valueOf(first), Integer.valueOf(second));

                System.out.println("Result : " + calc.getResult());
                System.out.println("Continue with result ? : y/n");
                if("y".equals(reader.next())) result=true;

                else   {
                    System.out.println("Exit : y/n ");
                    exit = reader.next();
                    calc.cleanResult();
                }
            }
        } finally {
            reader.close();
        }
    }
}