/**
	����� ��������� �����������.
*/
public class Calculator {
	/**
		��������� ����������.
	*/
	private int result;
	
	/**
		��������� ���������.
		@param params ��������� ������������.
	*/
	public void add(int ... params) {
		for (Integer param : params) {
			this.result += param;
		}	
	}

    public void sub(int ... params) {
        int lenght = params.length;
        for(Integer param : params) {
                if(lenght==params.length) {
                    this.result = param;
                    lenght--;
                } else this.result -=param;
            }
        }


    public void mult(int ... params) {
        int length = params.length;
        for (Integer param : params) {
            if(length==params.length){
                this.result = param;
                length--;
            }else this.result *= param;
        }
    }

    public void div(int ... params) {
        int length = params.length;
        for (Integer param : params) {
            if(length==params.length){
                this.result = param;
                length--;
            }else this.result /= param;
        }
    }

	/**
		�������� ���������.
		@return ��������� ����������.
	*/
	public int getResult() {
		return this.result;
	}

	/**
		�������� ��������� ����������.
	*/
	public void cleanResult() {
		this.result = 0;
	}
}