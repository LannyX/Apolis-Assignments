package weekendHW;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = new int[] {1, 2, 3, 3, 4, 4};
		removeDupicate(A);
	}
	
	static String removeDupicate(int[] array) {
		int size = 0;
		
		if(array == null || array.length < 1) {
			System.out.println(array);
		}

		for(int i = 0; i < array.length; i++) {
			if(array[i] != array[size]) {
				size++;
				array[size] = array[i];	
			}
		}
		int res = size + 1;
		return "Total unique number is: " + res;
	}
}
