package weekendHW;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{1, 2, 3, 4, 5};
		
		System.out.println(linearSearch(arr, 4));
	}
	public static int linearSearch(int[] arr, int target){
		if (arr == null || arr.length == 0) {
			return -1;
		}
		
		for (int i = 0; i < arr.length; i++){
			if (arr[i] == target) {
				return i;
			}
		}
		
		return -1;
	}
}
