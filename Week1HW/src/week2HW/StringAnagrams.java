package week2HW;

import java.util.Arrays;

public class StringAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isAnagram("abba", "aabb"));

	}
	
	public static boolean isAnagram(String s1, String s2) {
	     char[] w1 = s1.replaceAll("[\\s]", "").toCharArray();
	     char[] w2 = s2.replaceAll("[\\s]", "").toCharArray();
	     Arrays.sort(w1);
	     Arrays.sort(w2);
	     return Arrays.equals(w1, w2);
	}

}
