package weekendHW;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n = 153;
		System.out.println("Is "+ n + " a Amstrong Number?  " +isAmstrong(n));

	}
	
	public static boolean isAmstrong(int n) {
		int remainder, original1 = n, original2 = n, result = 0, length = 0;
		
		while(original1 != 0){
			original1 /= 10;
			length++;
		}

		while(original2 != 0){
			remainder = original2 % 10;
			result += Math.pow(remainder, length);
			original2 /= 10;
		}
		
		return result == n;
		
		
	}

}
