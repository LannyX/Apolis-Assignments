package week2HW;

public class FirstUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "lannyly";
		System.out.println("The input string is: " + s);
		System.out.println("The first none repeated charactor is: " + firstUniqChar(s));


	}
	
	public static char firstUniqChar(String str) {
        if (str == null || str.length() == 0) {
            return '0';
        }
        
        for (int i = 0; i < str.length(); i++) {
            boolean hasDuplicate = false;
            for (int j = 0; j < str.length(); j++) {
                if (j == i) {
                    continue;
                }
                if (str.charAt(i) == str.charAt(j)) {
                    hasDuplicate = true;
                    break;
                }
            }
            if (hasDuplicate == false) {
                return str.charAt(i);
            }
        }
        return '0';
    }

}
