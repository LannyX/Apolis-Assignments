package weekendHW;


public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{1, 2, 3, 4, 5};
		
		System.out.println(binarySearch(arr, 4));

	}
	
	public static int binarySearch(int[] arr, int target){
		if (arr == null || arr.length == 0) {
			return -1;
		}
		
		int left = 0;
		int right = arr.length - 1;
		
		while(left <= right){
			int mid = left + (right - left) / 2;
			if (arr[mid] == target){
				return mid;
			}else if (arr[mid] < target) {
				left = mid + 1;
			}else {
				right = mid - 1;
			}
		}
		return -1;
	}

}
