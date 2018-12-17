package weekendHW;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = new int[] {1, 2, 3, 3, 4, 4};
		System.out.println(removeDuplicates(A));
		
	}
	
    public static int removeDuplicates(int[] A) {
        
        int size = 0;
        if (A == null || A.length == 0) {
            return 0;
        }
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] != A[size]) {
                A[++size] = A[i];
            }
        }
        
        return size + 1;
    }

}
