package week2HW;

public class StringOnlyDigits {

	public static void main(String[] args) {
		
		String s = "1";
		
		if (s.matches("\\d*")) {
			System.out.println("String only contains digits!");
		}else {
			System.out.println("String contains letters.");
		}
	}
	
	public static boolean isOnlyDigits(String s){
		
		if (s.matches("\\d*")) {
			return true;
		}else {
			return false;
		}
		
	}

}
