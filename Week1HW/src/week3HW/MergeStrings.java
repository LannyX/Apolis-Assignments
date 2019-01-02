package week3HW;

public class MergeStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Lanny"; 
        String s2 = "gotthis"; 
        System.out.println(merge(s1, s2)); 
	}

	private static String merge(String s1, String s2) {
		// TODO Auto-generated method stub
		StringBuilder res = new StringBuilder();
		
		int i = 0, j = 0;
		
		while (i < s1.length() && j < s2.length()) {
			res.append(s1.charAt(i++));
			res.append(s2.charAt(j++));
		}
		
		if(i != s1.length()){
			res.append(s1.substring(i));
		}
		if(j != s2.length()){
			res.append(s2.substring(j));
		}
		
		return res.toString();
	}

}
