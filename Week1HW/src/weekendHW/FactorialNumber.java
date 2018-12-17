package weekendHW;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
		System.out.println("The factorial number of "+  n + " is "+ FactorialNum(n));
		
	}
	
	public static int FactorialNum(int n){
		if (n == 0) {
			return 1;
		}
		return n * FactorialNum(n-1);
	}

}
