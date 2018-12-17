package weekendHW;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1331;
		System.out.println("Q: Is " + n + " a Palindrome Number?");
		System.out.println("A: "+ isPalindrome(n));

	}

	public static boolean isPalindrome(int n){
		int original = n, reverse = 0;
		
		while(n != 0){
			int remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n /= 10;
		}
		
		return original == reverse;
	}
	
}
