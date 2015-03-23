package action;

/**
	����� ��� ���������� ����� ���� �����. ����� �������� �� �������� �������.
*/
public class Calculate {

	public static void main(String[] arg) {
		System.out.println("action.Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int sum = first + second;
		System.out.println("Sum : " + sum);
	}

}