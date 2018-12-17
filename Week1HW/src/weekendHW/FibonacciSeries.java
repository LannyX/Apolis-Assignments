package weekendHW;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fiboNum(6));

	}
	
	public static int fiboNum(int n) {
		
		if (n == 0) {
			return 0;
		}else if (n == 1) {
			return 1;
		}else {
			return fiboNum(n-1) + fiboNum(n-2);
		}
	}

}
