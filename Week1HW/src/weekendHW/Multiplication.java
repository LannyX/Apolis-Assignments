package weekendHW;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2, b = 3;
		System.out.println("The result for " + a +" times "+ b + " is "+ multiple(a, b));
		
	}
	
	public static int multiple(int x, int y) {
		if(x == 0 || y == 0) {
			return 0;
		}else if(y > 0){
			return x + multiple(x, y-1);
		}
		else{
			return -9999;	
		}

		
	}

}
