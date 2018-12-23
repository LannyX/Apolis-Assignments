package week2HW;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Lannyly";
		System.out.println(removeDup(input));

	}
	
	static String removeDup(String s) 
	{         
	   int i;
	   int j;
	   String res = "";

	   for (i = 0; i< s.length(); i++) {
	       int count = 1;

	       for (j = i+1; j < s.length(); j++) {
	           if (s.charAt(i) == s.charAt(j)) {
	                count++;
	           }
	       }
	       if (count == 1){
	           res += s.charAt(i);
	       }
	   } 
	   return res;
	}
}
