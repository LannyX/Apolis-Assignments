package week2HW;

public class StringNumPalindrome {

	public static void main(String[] args) {
		
		String s = "12321";
		int i = 12321;
		
		System.out.println(isPalindrome(i, s));
		
		
	}
	
	public static boolean isPalindrome(int n, String target){
		int temp = Integer.parseInt(target);
		int reverse = 0;
		
		while(n != 0){
			int remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n /= 10;
		}
		
		return temp == reverse;
	}

}
